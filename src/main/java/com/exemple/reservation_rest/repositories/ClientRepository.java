package com.exemple.reservation_rest.repositories;

import com.exemple.reservation_rest.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {

}
