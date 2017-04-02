package com.example.android.soccercounter;

import android.app.Application;

/**
 * Created by Björn on 02.04.2017.
 */

public class TeamNames extends Application {
    public String TeamNameA ="Home Team";
    public String TeamNameB ="Away Team";
    public String GoalTeamA = "0";
    public String GoalTeamB = "0";
    public String ThrowInTeamA = "0";
    public String ThrowInTeamB = "0";
    public String CornerTeamA = "0";
    public String CornerTeamB = "0";
    public String FoulTeamA = "0";
    public String FoulTeamB = "0";
    public String CardTeamA = "0";
    public String CardTeamB = "0";

    public String getTeamA() {
        return TeamNameA;
    }

    public void setTeamA(String aName) {
        TeamNameA = aName;
    }

    public String getTeamB() {
        return TeamNameB;
    }

    public void setTeamB(String bName) {
        TeamNameB = bName;
    }
    public String getGoalA() {
        return GoalTeamA;
    }

    public void setGoalA(String aName) {
        GoalTeamA = aName;
    }

    public String getGoalB() {
        return GoalTeamB;
    }

    public void setGoalB(String bName) {
        GoalTeamB = bName;
    }
    public String getThrowInA() {
        return ThrowInTeamA;
    }

    public void setThrowInA(String aName) {
        ThrowInTeamA = aName;
    }

    public String getThrowInB() {
        return ThrowInTeamB;
    }

    public void setThrowInB(String bName) {
        ThrowInTeamB = bName;
    }
    public String getCornerA() {
        return CornerTeamA;
    }

    public void setCornerA(String aName) {
        CornerTeamA = aName;
    }

    public String getCornerB() {
        return CornerTeamB;
    }

    public void setCornerB(String bName) {
        CornerTeamB = bName;
    }
    public String getFoulA() {
        return FoulTeamA;
    }

    public void setFoulA(String aName) {
        FoulTeamA = aName;
    }

    public String getFoulB() {
        return FoulTeamB;
    }

    public void setFoulB(String bName) {
        FoulTeamB = bName;
    }
    public String getCardA() {
        return CardTeamA;
    }

    public void setCardA(String aName) {
        CardTeamA = aName;
    }

    public String getCardB() {
        return CardTeamB;
    }

    public void setCardB(String bName) {
        CardTeamB = bName;
    }
}
