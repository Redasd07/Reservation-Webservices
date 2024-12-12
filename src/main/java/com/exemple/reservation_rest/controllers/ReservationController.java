package com.exemple.reservation_rest.controllers;

import com.exemple.reservation_rest.dto.ReservationDto;
import com.exemple.reservation_rest.entities.Reservation;
import com.exemple.reservation_rest.services.ReservationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
// REST CONTROLLER
@RequestMapping("/api/reservations")
public class ReservationController {

    @Autowired
    private ReservationServiceImpl reservationServiceImpl;

    @PostMapping
    public ResponseEntity<Reservation> createReservation(@RequestBody ReservationDto reservationDTO) {
        Reservation reservation = null;
        try {
            reservation = reservationServiceImpl.createReservation(
                    reservationDTO.getClientId(),
                    reservationDTO.getChambreId(),
                    reservationDTO.getDateDebut(),
                    reservationDTO.getDateFin(),
                    reservationDTO.getPreferences()
            );
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(reservation);
    }

    @GetMapping
    public List<Reservation> getAllReservations() {
        return reservationServiceImpl.getAllReservations();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Reservation> getReservationById(@PathVariable int id) {
        Reservation reservation = null;
        try {
            reservation = reservationServiceImpl.getReservationById(id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return ResponseEntity.ok(reservation);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Reservation> updateReservation(@PathVariable int id, @RequestBody ReservationDto reservationDTO) {
        Reservation updatedReservation = null;
        try {
            updatedReservation = reservationServiceImpl.updateReservation(
                    id, reservationDTO.getClientId(), reservationDTO.getChambreId(),
                    reservationDTO.getDateDebut(), reservationDTO.getDateFin(), reservationDTO.getPreferences()
            );
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return ResponseEntity.ok(updatedReservation);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteReservation(@PathVariable int id) {
        try {
            reservationServiceImpl.deleteReservation(id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return ResponseEntity.noContent().build();
    }
}
