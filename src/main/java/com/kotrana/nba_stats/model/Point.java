package com.kotrana.nba_stats.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;


public class Point {
    private String heure;
    private int points;

    public Point() {
    }

    public Point(String heure, int points) {
        this.heure = heure;
        this.points = points;
    }

    public String getHeure() {
        return heure;
    }

    public void setHeure(String heure) {
        this.heure = heure;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
