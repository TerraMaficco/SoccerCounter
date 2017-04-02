package com.example.android.soccercounter;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.concurrent.TimeUnit;


public class MainScreen extends AppCompatActivity {


    /** Parse String into Int
     * int number = Integer.parseInt(et.getText().toString());
     */

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int foulTeamA = 0;
    int foulTeamB = 0;
    int throwInTeamA = 0;
    int throwInTeamB = 0;
    int cardTeamA = 0;
    int cardTeamB = 0;
    int cornerTeamA = 0;
    int cornerTeamB = 0;

    /** Global Initials for CountDownTimer*/
    private TextView tv1;
    private Button startBtn;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);

        /** Local Initialising for CountDownTimer and Text-Transport*/
        startBtn = (Button) findViewById(R.id.btnStart);
        tv1 = (TextView) findViewById(R.id.textView1);

        /**Global Teamname with Subclass and Apllication*/
        TextView TeamATV = (TextView) findViewById(R.id.TeamHome);
        TextView TeamBTV = (TextView) findViewById(R.id.TeamAway);

        TeamNames teamNamesClass = (TeamNames) getApplicationContext();

        final String TeamA = teamNamesClass.getTeamA();
        final String TeamB = teamNamesClass.getTeamB();

        TeamATV.setText(TeamA);
        TeamBTV.setText(TeamB);

        /**Set all Values to the actual number, if there had been a Change to the Statistics Screen*/
        final String scoreTeamAString = teamNamesClass.getGoalA();
        scoreTeamA = Integer.parseInt(scoreTeamAString);
        displayForTeamA(scoreTeamA);
        final String scoreTeamBString = teamNamesClass.getGoalB();
        scoreTeamB = Integer.parseInt(scoreTeamBString);
        displayForTeamB(scoreTeamB);
        final String throwInTeamAString = teamNamesClass.getThrowInA();
        throwInTeamA = Integer.parseInt(throwInTeamAString);
        final String throwInTeamBString = teamNamesClass.getThrowInB();
        throwInTeamB = Integer.parseInt(throwInTeamBString);
        final String cornerTeamAString = teamNamesClass.getCornerA();
        cornerTeamA = Integer.parseInt(cornerTeamAString);
        final String cornerTeamBString = teamNamesClass.getCornerB();
        cornerTeamB = Integer.parseInt(cornerTeamBString);
        final String foulTeamAString = teamNamesClass.getFoulA();
        foulTeamA = Integer.parseInt(foulTeamAString);
        final String foulTeamBString = teamNamesClass.getFoulB();
        foulTeamB = Integer.parseInt(foulTeamBString);
        final String cardTeamAString = teamNamesClass.getCardA();
        cardTeamA = Integer.parseInt(cardTeamAString);
        final String cardTeamBString = teamNamesClass.getCardB();
        cardTeamB = Integer.parseInt(cardTeamBString);

        /** Global Teamnames by Intent
        TextView TeamATV = (TextView) findViewById(R.id.TeamHome);
        TextView TeamBTV = (TextView) findViewById(R.id.TeamAway);

        /** TRansport TextView from MainActivity
        Intent i = getIntent();

        String TeamA = i.getStringExtra(EXTRA_MESSAGEA);
        String TeamB = i.getStringExtra(EXTRA_MESSAGEB);

        TeamATV.setText(TeamA);
        TeamBTV.setText(TeamB);*/


        /**Countdown Timer for a 90 Minutes Soccer Game*/
        tv1.setText(R.string.Time);

        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CountDownTimer countDownTimer = new CountDownTimer(5400000, 1000) { // adjust the milli seconds here
                    @Override
                    public void onTick(long millisUntilFinished) {
                        tv1.setText("" + String.format("%d:%d",
                                TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished),
                                TimeUnit.MILLISECONDS.toSeconds(millisUntilFinished) -
                                        TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished))));
                        startBtn.setEnabled(false);
                    }
                    @Override
                    public void onFinish() {
                        tv1.setText(R.string.Over);
                        startBtn.setEnabled(true);
                    }
                }.start();
            }
        });

    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team B.*/

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    /** Team A
     * Add Goal.
     */
    public void addGoalA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
        String scoreTeamAString = Integer.toString(scoreTeamA);
        TeamNames teamNamesClass = (TeamNames) getApplicationContext();
        teamNamesClass.setGoalA(scoreTeamAString);
    }
    /** Team A
     * Add Throw-in.
     */
    public void addThrowInA(View view) {
        throwInTeamA = throwInTeamA + 1;
        String throwInTeamAString = Integer.toString(throwInTeamA);
        TeamNames teamNamesClass = (TeamNames) getApplicationContext();
        teamNamesClass.setThrowInA(throwInTeamAString);
    }

    /** Team A
     * Add Corner.
     */
    public void addCornerA(View view) {
        cornerTeamA = cornerTeamA + 1;
        String cornerTeamAString = Integer.toString(cornerTeamA);
        TeamNames teamNamesClass = (TeamNames) getApplicationContext();
        teamNamesClass.setCornerA(cornerTeamAString);
    }
    /** Team A
     * Add Foul.
     */
    public void addFoulA(View view) {
        foulTeamA = foulTeamA + 1;
        String foulTeamAString = Integer.toString(foulTeamA);
        TeamNames teamNamesClass = (TeamNames) getApplicationContext();
        teamNamesClass.setFoulA(foulTeamAString);
    }
    /** Team A
     * Add Card.
     */
    public void addCardA(View view) {
        cardTeamA = cardTeamA + 1;
        String cardTeamAString = Integer.toString(cardTeamA);
        TeamNames teamNamesClass = (TeamNames) getApplicationContext();
        teamNamesClass.setCardA(cardTeamAString);
    }

    /** Team B
     * Add Goal.
     */
    public void addGoalB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
        String scoreTeamBString = Integer.toString(scoreTeamB);
        TeamNames teamNamesClass = (TeamNames) getApplicationContext();
        teamNamesClass.setGoalB(scoreTeamBString);
    }
    /** Team B
     * Add Throw-in.
     */
    public void addThrowInB(View view) {
        throwInTeamB = throwInTeamB + 1;
        String throwInTeamBString = Integer.toString(throwInTeamB);
        TeamNames teamNamesClass = (TeamNames) getApplicationContext();
        teamNamesClass.setThrowInB(throwInTeamBString);
    }

    /** Team B
     * Add Corner.
     */
    public void addCornerB(View view) {
        cornerTeamB = cornerTeamB + 1;
        String cornerTeamBString = Integer.toString(cornerTeamB);
        TeamNames teamNamesClass = (TeamNames) getApplicationContext();
        teamNamesClass.setCornerB(cornerTeamBString);
    }

    /** Team B
     * Add Foul.
     */
    public void addFoulB(View view) {
        foulTeamB = foulTeamB + 1;
        String foulTeamBString = Integer.toString(foulTeamB);
        TeamNames teamNamesClass = (TeamNames) getApplicationContext();
        teamNamesClass.setFoulB(foulTeamBString);
    }
    /** Team B
     * Add Card.
     */
    public void addCardB(View view) {
        cardTeamB = cardTeamB + 1;
        String cardTeamBString = Integer.toString(cardTeamB);
        TeamNames teamNamesClass = (TeamNames) getApplicationContext();
        teamNamesClass.setCardB(cardTeamBString);
    }

    /**
     * Reset Button - to reset the score
     */
    public void reset(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        scoreTeamA = 0;
        scoreTeamB = 0;
        foulTeamA = 0;
        foulTeamB = 0;
        throwInTeamA = 0;
        throwInTeamB = 0;
        cardTeamA = 0;
        cardTeamB = 0;
        cornerTeamA = 0;
        cornerTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
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

    public void statistics(View view){
        Intent intent = new Intent(this, StatisticScreen.class);
        startActivity(intent);
    }
}
