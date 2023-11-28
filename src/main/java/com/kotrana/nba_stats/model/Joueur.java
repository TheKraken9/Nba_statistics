package com.kotrana.nba_stats.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.sql.Date;
import java.time.LocalDateTime;


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

    public Joueur() {
    }

    public Joueur(String id, String nom, String prenom, int age, double taille, double poids, String poste, int numero, String equipe, long salaire, LocalDateTime dateNaissance, String villeNaissance, String paysNaissance, String universite, int draft, int nbSelectionsAllStar, String urlPhoto) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.taille = taille;
        this.poids = poids;
        this.poste = poste;
        this.numero = numero;
        this.equipe = equipe;
        this.salaire = salaire;
        this.dateNaissance = dateNaissance;
        this.villeNaissance = villeNaissance;
        this.paysNaissance = paysNaissance;
        this.universite = universite;
        this.draft = draft;
        this.nbSelectionsAllStar = nbSelectionsAllStar;
        this.urlPhoto = urlPhoto;
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

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEquipe() {
        return equipe;
    }

    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }

    public long getSalaire() {
        return salaire;
    }

    public void setSalaire(long salaire) {
        this.salaire = salaire;
    }

    public LocalDateTime getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(LocalDateTime dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getVilleNaissance() {
        return villeNaissance;
    }

    public void setVilleNaissance(String villeNaissance) {
        this.villeNaissance = villeNaissance;
    }

    public String getPaysNaissance() {
        return paysNaissance;
    }

    public void setPaysNaissance(String paysNaissance) {
        this.paysNaissance = paysNaissance;
    }

    public String getUniversite() {
        return universite;
    }

    public void setUniversite(String universite) {
        this.universite = universite;
    }

    public int getDraft() {
        return draft;
    }

    public void setDraft(int draft) {
        this.draft = draft;
    }

    public int getNbSelectionsAllStar() {
        return nbSelectionsAllStar;
    }

    public void setNbSelectionsAllStar(int nbSelectionsAllStar) {
        this.nbSelectionsAllStar = nbSelectionsAllStar;
    }

    public String getUrlPhoto() {
        return urlPhoto;
    }

    public void setUrlPhoto(String urlPhoto) {
        this.urlPhoto = urlPhoto;
    }
}
