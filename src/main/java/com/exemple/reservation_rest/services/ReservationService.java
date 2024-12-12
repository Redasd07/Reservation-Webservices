package com.exemple.reservation_rest.services;

import com.exemple.reservation_rest.entities.Reservation;

import java.util.Date;
import java.util.List;

public interface ReservationService {
    public Reservation createReservation(int clientId, int chambreId, Date dateDebut, Date dateFin, String preferences) throws Exception;
    public Reservation getReservationById(int id) throws Exception;
    public List<Reservation> getAllReservations();
    public List<Reservation> getReservationsByClient(int clientId) throws Exception;
    public List<Reservation> getReservationsByChambre(int chambreId) throws Exception;
    public Reservation updateReservation(int id, int clientId, int chambreId, Date dateDebut, Date dateFin, String preferences) throws Exception;
    public void deleteReservation(int id) throws Exception;

}
