package com.kotrana.nba_stats.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;


public class PlusInfo {
    private ArrayList<Point> points;
    private ArrayList<Rebond> rebonds;
    private ArrayList<PasseDecisif> passes_decisifs;
    private ArrayList<Minutes> minutes_jouees;
    private ArrayList<FailedGoal> failed;
    private ArrayList<ThreePoint> three_points;
    private ArrayList<LaunchedFran> lancers_francs;

    public PlusInfo() {
    }

    public PlusInfo(ArrayList<Point> points, ArrayList<Rebond> rebonds, ArrayList<PasseDecisif> passes_decisifs, ArrayList<Minutes> minutes_jouees, ArrayList<FailedGoal> failed, ArrayList<ThreePoint> three_points, ArrayList<LaunchedFran> lancers_francs) {
        this.points = points;
        this.rebonds = rebonds;
        this.passes_decisifs = passes_decisifs;
        this.minutes_jouees = minutes_jouees;
        this.failed = failed;
        this.three_points = three_points;
        this.lancers_francs = lancers_francs;
    }

    public ArrayList<Point> getPoints() {
        return points;
    }

    public void setPoints(ArrayList<Point> points) {
        this.points = points;
    }

    public ArrayList<Rebond> getRebonds() {
        return rebonds;
    }

    public void setRebonds(ArrayList<Rebond> rebonds) {
        this.rebonds = rebonds;
    }

    public ArrayList<PasseDecisif> getPasses_decisifs() {
        return passes_decisifs;
    }

    public void setPasses_decisifs(ArrayList<PasseDecisif> passes_decisifs) {
        this.passes_decisifs = passes_decisifs;
    }

    public ArrayList<Minutes> getMinutes_jouees() {
        return minutes_jouees;
    }

    public void setMinutes_jouees(ArrayList<Minutes> minutes_jouees) {
        this.minutes_jouees = minutes_jouees;
    }

    public ArrayList<FailedGoal> getFailed() {
        return failed;
    }

    public void setFailed(ArrayList<FailedGoal> failed) {
        this.failed = failed;
    }

    public ArrayList<ThreePoint> getThree_points() {
        return three_points;
    }

    public void setThree_points(ArrayList<ThreePoint> three_points) {
        this.three_points = three_points;
    }

    public ArrayList<LaunchedFran> getLancers_francs() {
        return lancers_francs;
    }

    public void setLancers_francs(ArrayList<LaunchedFran> lancers_francs) {
        this.lancers_francs = lancers_francs;
    }
}
