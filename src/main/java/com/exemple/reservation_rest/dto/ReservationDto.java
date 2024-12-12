package com.exemple.reservation_rest.dto;

import lombok.Data;

import java.util.Date;

@Data
public class ReservationDto {
    private int clientId;
    private int chambreId;
    private Date dateDebut;
    private Date dateFin;
    private String preferences;
}