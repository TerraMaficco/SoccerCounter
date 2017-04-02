package com.example.android.soccercounter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class StatisticScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistic_screen);

        /**Global Teamname with Subclass and Apllication*/
        TextView TeamATV = (TextView) findViewById(R.id.TeamHome);
        TextView TeamBTV = (TextView) findViewById(R.id.TeamAway);

        TeamNames teamNamesClass = (TeamNames) getApplicationContext();

        final String TeamA = teamNamesClass.getTeamA();
        final String TeamB = teamNamesClass.getTeamB();

        TeamATV.setText(TeamA);
        TeamBTV.setText(TeamB);

        /**Set all Numbers with actualm count into space*/

        TextView scoreTeamA = (TextView) findViewById(R.id.team_a_score_statistic);
        final String scoreTeamAString = teamNamesClass.getGoalA();
        scoreTeamA.setText(scoreTeamAString);
        TextView scoreTeamB = (TextView) findViewById(R.id.team_b_score_statistic);
        final String scoreTeamBString = teamNamesClass.getGoalB();
        scoreTeamB.setText(scoreTeamBString);
        TextView throwInTeamA = (TextView) findViewById(R.id.team_a_throwIn_statistic);
        final String throwInTeamAString = teamNamesClass.getThrowInA();
        throwInTeamA.setText(throwInTeamAString);
        TextView throwInTeamB = (TextView) findViewById(R.id.team_b_throwIn_statistic);
        final String throwInTeamBString = teamNamesClass.getThrowInB();
        throwInTeamB.setText(throwInTeamBString);
        TextView cornerTeamA = (TextView) findViewById(R.id.team_a_corner_statistic);
        final String cornerTeamAString = teamNamesClass.getCornerA();
        cornerTeamA.setText(cornerTeamAString);
        TextView cornerTeamB = (TextView) findViewById(R.id.team_b_corner_statistic);
        final String cornerTeamBString = teamNamesClass.getCornerB();
        cornerTeamB.setText(cornerTeamBString);
        TextView foulTeamA = (TextView) findViewById(R.id.team_a_foul_statistic);
        final String foulTeamAString = teamNamesClass.getFoulA();
        foulTeamA.setText(foulTeamAString);
        TextView foulTeamB = (TextView) findViewById(R.id.team_b_foul_statistic);
        final String foulTeamBString = teamNamesClass.getFoulB();
        foulTeamB.setText(foulTeamBString);
        TextView cardTeamA = (TextView) findViewById(R.id.team_a_card_statistic);
        final String cardTeamAString = teamNamesClass.getCardA();
        cardTeamA.setText(cardTeamAString);
        TextView cardTeamB = (TextView) findViewById(R.id.team_b_card_statistic);
        final String cardTeamBString = teamNamesClass.getCardB();
        cardTeamB.setText(cardTeamBString);

        /** Transport Team names from MainActivity
        TextView TeamATV = (TextView) findViewById(R.id.TeamHome);
        TextView TeamBTV = (TextView) findViewById(R.id.TeamAway);


        Intent i = getIntent();

        String TeamA = i.getStringExtra(EXTRA_MESSAGEA);
        String TeamB = i.getStringExtra(EXTRA_MESSAGEB);

        TeamATV.setText(TeamA);
        TeamBTV.setText(TeamB);*/

    }

    public void ReturnGameOnClick(View view){
        Intent intent = new Intent(this, MainScreen.class);
        startActivity(intent);
    }

    public void EndGameOnClick(View view){
        Intent intent = new Intent(this, MainActivity.class);
        TeamNames teamNamesClass = (TeamNames) getApplicationContext();
        teamNamesClass.setGoalA("0");
        teamNamesClass.setGoalB("0");
        teamNamesClass.setThrowInA("0");
        teamNamesClass.setThrowInB("0");
        teamNamesClass.setCornerA("0");
        teamNamesClass.setCornerB("0");
        teamNamesClass.setFoulA("0");
        teamNamesClass.setFoulB("0");
        teamNamesClass.setCardA("0");
        teamNamesClass.setCardB("0");
        startActivity(intent);
    }

}
