package com.kotrana.nba_stats.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.sql.Date;
import java.util.ArrayList;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "joueur")
public class Nba {
    @Id
    private String id;
    private String nom;
    private String prenom;
    private int age;
    private double taille;
    private double poids;
    private String poste;
    private String equipe;
    private String numero;
    private String nationalite;
    private String date_naissance;
    private ArrayList<Statistique> statistiques;
}
