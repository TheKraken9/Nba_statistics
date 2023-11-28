package com.kotrana.nba_stats.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;


public class PasseDecisif {
    private String heure;

    public PasseDecisif() {
    }

    public PasseDecisif(String heure) {
        this.heure = heure;
    }

    public String getHeure() {
        return heure;
    }

    public void setHeure(String heure) {
        this.heure = heure;
    }
}
