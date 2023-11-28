package com.kotrana.nba_stats.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PlusInfo {
    private ArrayList<Point> points;
    private ArrayList<Rebond> rebonds;
    private ArrayList<PasseDecisif> passes_decisifs;
    private ArrayList<Minutes> minutes_jouees;
    private ArrayList<FailedGoal> failed;
    private ArrayList<ThreePoint> three_points;
    private ArrayList<LaunchedFran> lancers_francs;
}
