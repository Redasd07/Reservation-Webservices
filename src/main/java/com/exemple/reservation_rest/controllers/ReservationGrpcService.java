package com.exemple.reservation_rest.controllers;

import com.exemple.reservation_rest.services.ReservationServiceImpl;
import com.exemple.reservation_rest.stubs.*;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.SimpleDateFormat;

@GrpcService
public class ReservationGrpcService extends ReservationServiceGrpc.ReservationServiceImplBase {

    @Autowired
    private ReservationServiceImpl reservationServiceImpl;

    @Override
    public void createReservation(CreateReservationRequest request, StreamObserver<Reservation> responseObserver) {
        com.exemple.reservation_rest.entities.Reservation reservation = null;
        try {
            reservation = reservationServiceImpl.createReservation(
                    request.getClientId(),
                    request.getChambreId(),
                    new SimpleDateFormat("yyyy-MM-dd").parse(request.getDateDebut()),
                    new SimpleDateFormat("yyyy-MM-dd").parse(request.getDateFin()),
                    request.getPreferences()
            );
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        responseObserver.onNext(convertToGrpcReservation(reservation));
        responseObserver.onCompleted();
    }

    @Override
    public void getReservation(ReservationIdRequest request, StreamObserver<Reservation> responseObserver) {
        com.exemple.reservation_rest.entities.Reservation reservation = null;
        try {
            reservation = reservationServiceImpl.getReservationById(request.getId());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        responseObserver.onNext(convertToGrpcReservation(reservation));
        responseObserver.onCompleted();
    }

    @Override
    public void updateReservation(UpdateReservationRequest request, StreamObserver<Reservation> responseObserver) {
        com.exemple.reservation_rest.entities.Reservation reservation = null;
        try {
            reservation = reservationServiceImpl.updateReservation(
                    request.getId(),
                    request.getClientId(),
                    request.getChambreId(),
                    new SimpleDateFormat("yyyy-MM-dd").parse(request.getDateDebut()),
                    new SimpleDateFormat("yyyy-MM-dd").parse(request.getDateFin()),
                    request.getPreferences()
            );
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        responseObserver.onNext(convertToGrpcReservation(reservation));
        responseObserver.onCompleted();
    }

    @Override
    public void deleteReservation(ReservationIdRequest request, StreamObserver<Empty> responseObserver) {
        try {
            reservationServiceImpl.deleteReservation(request.getId());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        responseObserver.onNext(Empty.newBuilder().build());
        responseObserver.onCompleted();
    }

    private Reservation convertToGrpcReservation(com.exemple.reservation_rest.entities.Reservation reservation) {
        return Reservation.newBuilder()
                .setId(reservation.getId())
                .setClientId(reservation.getClient().getId())
                .setChambreId(reservation.getChambre().getId())
                .setDateDebut(reservation.getDateDebut().toString())
                .setDateFin(reservation.getDateFin().toString())
                .setPreferences(reservation.getPreferences())
                .build();
    }
}