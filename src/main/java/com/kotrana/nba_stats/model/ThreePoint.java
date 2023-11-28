package com.kotrana.nba_stats.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
import java.sql.Time;


public class ThreePoint {
    private String minutes;

    public ThreePoint() {
    }

    public ThreePoint(String minutes) {
        this.minutes = minutes;
    }

    public String getMinutes() {
        return minutes;
    }

    public void setMinutes(String minutes) {
        this.minutes = minutes;
    }
}
