package com.kotrana.nba_stats.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.ArrayList;

public class MatchJoue {
    private String date;
    private String adversaire;
    private ArrayList<PlusInfo> plus_info;

    public MatchJoue() {
    }

    public MatchJoue(String date, String adversaire, ArrayList<PlusInfo> plus_info) {
        this.date = date;
        this.adversaire = adversaire;
        this.plus_info = plus_info;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAdversaire() {
        return adversaire;
    }

    public void setAdversaire(String adversaire) {
        this.adversaire = adversaire;
    }

    public ArrayList<PlusInfo> getPlus_info() {
        return plus_info;
    }

    public void setPlus_info(ArrayList<PlusInfo> plus_info) {
        this.plus_info = plus_info;
    }
}
