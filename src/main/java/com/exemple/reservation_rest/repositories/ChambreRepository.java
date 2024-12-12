package com.exemple.reservation_rest.repositories;

import com.exemple.reservation_rest.entities.Chambre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChambreRepository extends JpaRepository<Chambre, Integer> {
}
