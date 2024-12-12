package com.exemple.reservation_rest.repositories;

import com.exemple.reservation_rest.entities.Chambre;
import com.exemple.reservation_rest.entities.Client;
import com.exemple.reservation_rest.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface ReservationRepository extends JpaRepository<Reservation, Integer> {

    List<Reservation> findByClient(Client client);
    List<Reservation> findByChambre(Chambre chambre);
    List<Reservation> findByDateDebutBeforeAndDateFinAfter(Date startDate, Date endDate);
}

