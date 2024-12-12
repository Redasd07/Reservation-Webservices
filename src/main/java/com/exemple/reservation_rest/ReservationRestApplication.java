package com.exemple.reservation_rest;

import com.exemple.reservation_rest.entities.Chambre;
import com.exemple.reservation_rest.entities.Client;
import com.exemple.reservation_rest.entities.TypeChambre;
import com.exemple.reservation_rest.repositories.ChambreRepository;
import com.exemple.reservation_rest.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class ReservationRestApplication  implements CommandLineRunner {
    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private ChambreRepository chambreRepository;

    @Override
    public void run(String... args) throws Exception {
        // Create test clients
        List<Client> clients = Arrays.asList(
                new Client("John", "Doe", "john.doe@example.com", "1234567890"),
                new Client("Jane", "Smith", "jane.smith@example.com", "2345678901"),
                new Client("Alice", "Johnson", "alice.johnson@example.com", "3456789012"),
                new Client("Bob", "Brown", "bob.brown@example.com", "4567890123"),
                new Client("Charlie", "Williams", "charlie.williams@example.com", "5678901234"),
                new Client("David", "Jones", "david.jones@example.com", "6789012345"),
                new Client("Eva", "Miller", "eva.miller@example.com", "7890123456"),
                new Client("Frank", "Wilson", "frank.wilson@example.com", "8901234567"),
                new Client("Grace", "Moore", "grace.moore@example.com", "9012345678"),
                new Client("Hannah", "Taylor", "hannah.taylor@example.com", "0123456789")
        );

        // Save clients to the database
        clientRepository.saveAll(clients);

        // Create test chambres
        List<Chambre> chambres = Arrays.asList(
                new Chambre(TypeChambre.SINGLE, 50.0, true),
                new Chambre(TypeChambre.SINGLE, 55.0, true),
                new Chambre(TypeChambre.DOUBLE, 75.0, true),
                new Chambre(TypeChambre.DOUBLE, 80.0, true),
                new Chambre(TypeChambre.SUITE, 150.0, true),
                new Chambre(TypeChambre.SUITE, 160.0, true),
                new Chambre(TypeChambre.SINGLE, 50.0, false),
                new Chambre(TypeChambre.DOUBLE, 70.0, false),
                new Chambre(TypeChambre.SUITE, 140.0, false),
                new Chambre(TypeChambre.SUITE, 170.0, false)
        );

        // Save chambres to the database
        chambreRepository.saveAll(chambres);

        System.out.println("Test data (Clients and Chambres) created successfully!");
    }

    public static void main(String[] args) {
        SpringApplication.run(ReservationRestApplication.class, args);
    }
}
