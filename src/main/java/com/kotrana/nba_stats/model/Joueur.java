package com.kotrana.nba_stats.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.sql.Date;
import java.time.LocalDateTime;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "joueur")
public class Joueur {
    @Id
    private String id;
    private String nom;
    private String prenom;
    private int age;
    private double taille;
    private double poids;
    private String poste;
    private int numero;
    private String equipe;
    private long salaire;
    private LocalDateTime dateNaissance;
    private String villeNaissance;
    private String paysNaissance;
    private String universite;
    private int draft;
    private int nbSelectionsAllStar;
    private String urlPhoto;
}
