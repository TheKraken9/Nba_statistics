package com.kotrana.nba_stats.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

public class FailedGoal {
    private String minutes;
    private int points;

    public FailedGoal() {
    }

    public FailedGoal(String minutes, int points) {
        this.minutes = minutes;
        this.points = points;
    }

    public String getMinutes() {
        return minutes;
    }

    public void setMinutes(String minutes) {
        this.minutes = minutes;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
