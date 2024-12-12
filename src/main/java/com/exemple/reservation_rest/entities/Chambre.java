package com.exemple.reservation_rest.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private TypeChambre type;
    private double prix;
    private boolean disponible;

    public Chambre(TypeChambre t, double prix, boolean disponible){
        this.disponible = disponible;
        this.prix = prix;
        this.type = t;
    }
}
