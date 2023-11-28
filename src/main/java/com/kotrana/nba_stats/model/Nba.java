package com.kotrana.nba_stats.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.sql.Date;
import java.util.ArrayList;


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

    public Nba() {
    }

    public Nba(String id, String nom, String prenom, int age, double taille, double poids, String poste, String equipe, String numero, String nationalite, String date_naissance, ArrayList<Statistique> statistiques) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.taille = taille;
        this.poids = poids;
        this.poste = poste;
        this.equipe = equipe;
        this.numero = numero;
        this.nationalite = nationalite;
        this.date_naissance = date_naissance;
        this.statistiques = statistiques;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getTaille() {
        return taille;
    }

    public void setTaille(double taille) {
        this.taille = taille;
    }

    public double getPoids() {
        return poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    public String getPoste() {
        return poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }

    public String getEquipe() {
        return equipe;
    }

    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    public String getDate_naissance() {
        return date_naissance;
    }

    public void setDate_naissance(String date_naissance) {
        this.date_naissance = date_naissance;
    }

    public ArrayList<Statistique> getStatistiques() {
        return statistiques;
    }

    public void setStatistiques(ArrayList<Statistique> statistiques) {
        this.statistiques = statistiques;
    }
}
