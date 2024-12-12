package com.exemple.reservation_rest.services;

import com.exemple.reservation_rest.entities.Chambre;
import com.exemple.reservation_rest.entities.Client;
import com.exemple.reservation_rest.entities.Reservation;
import com.exemple.reservation_rest.repositories.ChambreRepository;
import com.exemple.reservation_rest.repositories.ClientRepository;
import com.exemple.reservation_rest.repositories.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ReservationServiceImpl implements ReservationService{

    @Autowired
    private ReservationRepository reservationRepository;

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private ChambreRepository chambreRepository;

    // Create a new reservation
    public Reservation createReservation(int clientId, int chambreId, Date dateDebut, Date dateFin, String preferences) throws Exception {
        Client client = clientRepository.findById(clientId)
                .orElseThrow(() -> new Exception("Client not found"));

        Chambre chambre = chambreRepository.findById(chambreId)
                .orElseThrow(() -> new Exception("Chambre not found"));

        if (dateDebut.after(dateFin)) {
            throw new Exception("Invalid date range: Start date must be before end date.");
        }

        Reservation reservation = new Reservation();
        reservation.setClient(client);
        reservation.setChambre(chambre);
        reservation.setDateDebut(dateDebut);
        reservation.setDateFin(dateFin);
        reservation.setPreferences(preferences);

        return reservationRepository.save(reservation);
    }

    // Get a reservation by ID
    public Reservation getReservationById(int id) throws Exception {
        return reservationRepository.findById(id).orElseThrow(() -> new Exception("Reservation not found"));
    }

    // Get all reservations
    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }

    // Get reservations by client
    public List<Reservation> getReservationsByClient(int clientId) throws Exception {
        Client client = clientRepository.findById(clientId)
                .orElseThrow(() -> new Exception("Client not found"));
        return reservationRepository.findByClient(client);
    }

    // Get reservations by chambre
    public List<Reservation> getReservationsByChambre(int chambreId) throws Exception {
        Chambre chambre = chambreRepository.findById(chambreId)
                .orElseThrow(() -> new Exception("Chambre not found"));
        return reservationRepository.findByChambre(chambre);
    }

    // Update a reservation
    public Reservation updateReservation(int id, int clientId, int chambreId, Date dateDebut, Date dateFin, String preferences) throws Exception {
        Reservation reservation = reservationRepository.findById(id)
                .orElseThrow(() -> new Exception("Reservation not found"));

        Client client = clientRepository.findById(clientId)
                .orElseThrow(() -> new Exception("Client not found"));

        Chambre chambre = chambreRepository.findById(chambreId)
                .orElseThrow(() -> new Exception("Chambre not found"));

        if (dateDebut.after(dateFin)) {
            throw new Exception("Invalid date range: Start date must be before end date.");
        }

        reservation.setClient(client);
        reservation.setChambre(chambre);
        reservation.setDateDebut(dateDebut);
        reservation.setDateFin(dateFin);
        reservation.setPreferences(preferences);

        return reservationRepository.save(reservation);
    }

    // Delete a reservation
    public void deleteReservation(int id) throws Exception {
        Reservation reservation = reservationRepository.findById(id)
                .orElseThrow(() -> new Exception("Reservation not found"));
        reservationRepository.delete(reservation);
    }
}
