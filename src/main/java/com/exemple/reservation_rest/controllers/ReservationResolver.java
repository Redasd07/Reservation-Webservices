package com.exemple.reservation_rest.controllers;

import com.exemple.reservation_rest.entities.Reservation;
import com.exemple.reservation_rest.services.ReservationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.text.SimpleDateFormat;

@Controller
public class ReservationResolver {

    @Autowired
    private ReservationServiceImpl reservationServiceImpl;

    @MutationMapping
    public Reservation createReservation(@Argument int clientId, @Argument int chambreId,
                                         @Argument String dateDebut, @Argument String dateFin,
                                         @Argument String preferences) {
        try {
            return reservationServiceImpl.createReservation(
                    clientId,
                    chambreId,
                    new SimpleDateFormat("yyyy-MM-dd").parse(dateDebut),
                    new SimpleDateFormat("yyyy-MM-dd").parse(dateFin),
                    preferences);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @QueryMapping
    public Reservation getReservationById(@Argument int id) {
        try {
            return reservationServiceImpl.getReservationById(id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @MutationMapping
    public Reservation updateReservation(@Argument int id, @Argument int clientId,
                                         @Argument int chambreId, @Argument String dateDebut,
                                         @Argument String dateFin, @Argument String preferences) {
        try {
            return reservationServiceImpl.updateReservation(
                    id,
                    clientId,
                    chambreId,
                    new SimpleDateFormat("yyyy-MM-dd").parse(dateDebut),
                    new SimpleDateFormat("yyyy-MM-dd").parse(dateFin),
                    preferences
            );
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @MutationMapping
    public boolean deleteReservation(@Argument int id) {
        try {
            reservationServiceImpl.deleteReservation(id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return true;
    }
}