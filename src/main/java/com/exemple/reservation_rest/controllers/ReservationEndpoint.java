package com.exemple.reservation_rest.controllers;

import com.exemple.reservation_rest.dto.ReservationDto;
import com.exemple.reservation_rest.entities.Reservation;
import com.exemple.reservation_rest.services.ReservationServiceImpl;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
// SOAP ENDPOINT
@WebService(serviceName = "ReservationWS")
public class ReservationEndpoint {

    @Autowired
    private ReservationServiceImpl reservationServiceImpl;

    @WebMethod
    public Reservation createReservation(ReservationDto request) {
        try {
            return reservationServiceImpl.createReservation(
                    request.getClientId(),
                    request.getChambreId(),
                    request.getDateDebut(),
                    request.getDateFin(),
                    request.getPreferences()
            );
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @WebMethod
    public Reservation getReservation(@WebParam(name = "id") int id) {
        try {
            return reservationServiceImpl.getReservationById(id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @WebMethod
    public Reservation updateReservation(@WebParam(name = "id") int id, @WebParam(name = "request") ReservationDto request) {
        try {
            return reservationServiceImpl.updateReservation(
                    id, request.getClientId(), request.getChambreId(),
                    request.getDateDebut(), request.getDateFin(), request.getPreferences()
            );
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @WebMethod
    public void deleteReservation(@WebParam(name = "id") int id) {
        try {
            reservationServiceImpl.deleteReservation(id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}