package com.kotrana.nba_stats.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;


public class Statistique {
    private String annee;
    private String equipe;
    private ArrayList<MatchJoue> matchs_joues;

    public Statistique() {
    }

    public Statistique(String annee, String equipe, ArrayList<MatchJoue> matchs_joues) {
        this.annee = annee;
        this.equipe = equipe;
        this.matchs_joues = matchs_joues;
    }

    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }

    public String getEquipe() {
        return equipe;
    }

    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }

    public ArrayList<MatchJoue> getMatchs_joues() {
        return matchs_joues;
    }

    public void setMatchs_joues(ArrayList<MatchJoue> matchs_joues) {
        this.matchs_joues = matchs_joues;
    }
}
