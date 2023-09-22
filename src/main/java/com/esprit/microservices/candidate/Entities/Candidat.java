package com.esprit.microservices.candidate.Entities;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Candidat implements Serializable {
    private  static final long serialVersionUID=6;
    @Id
    @GeneratedValue
    private int id;
    private String nom,prenom,email;


    public Candidat(String nom, String prenom, String email) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
    }
}
