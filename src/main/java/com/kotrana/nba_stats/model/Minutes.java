package com.kotrana.nba_stats.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
import java.sql.Time;


public class Minutes {
    private String minutes_debut;
    private String minutes_fin;

    public Minutes() {
    }

    public Minutes(String minutes_debut, String minutes_fin) {
        this.minutes_debut = minutes_debut;
        this.minutes_fin = minutes_fin;
    }

    public String getMinutes_debut() {
        return minutes_debut;
    }

    public void setMinutes_debut(String minutes_debut) {
        this.minutes_debut = minutes_debut;
    }

    public String getMinutes_fin() {
        return minutes_fin;
    }

    public void setMinutes_fin(String minutes_fin) {
        this.minutes_fin = minutes_fin;
    }
}
