package com.example.android.soccercounter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

import static com.example.android.soccercounter.R.id.autoCompleteTextViewA;

public class MainActivity extends AppCompatActivity {

    /** First try for Global Team names - disabled*/
    //public static final String EXTRA_MESSAGEA = "com.example.android.soccercounter.MESSAGEA";
    //public static final String EXTRA_MESSAGEB = "com.example.android.soccercounter.MESSAGEB";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**Get a reference to the AutoCompleteTextView in the layout | A for Team A and B for Team B*/
        AutoCompleteTextView textViewA = (AutoCompleteTextView) findViewById(autoCompleteTextViewA);
        AutoCompleteTextView textViewB = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextViewB);
        /** Get the string array with all Strings for the First German League*/
        String[] german_league = getResources().getStringArray(R.array.first_german_league);
        /** Create the adapter */
        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, german_league);
        /** Set the Adapter to the AutoCompleteTextView A and B */
        textViewA.setAdapter(adapter);
        textViewB.setAdapter(adapter);
    }

    /** Send the user by clicking the Start-Button to to the main counter screen*/
    public void startGame(View view){
        Intent intent = new Intent(getBaseContext(), MainScreen.class);
        /**TextView TeamAString = (TextView) findViewById(R.id.autoCompleteTextViewA);
        TextView TeamBString = (TextView) findViewById(R.id.autoCompleteTextViewB);
        String TeamA = TeamAString.getText().toString();
        String TeamB = TeamBString.getText().toString();
        intent.putExtra(EXTRA_MESSAGEA,TeamA);
        intent.putExtra(EXTRA_MESSAGEB,TeamB);*/

        /** Set Initial Teamnames, choosen by the User, with if-else check for empty namespace (but not working)*/

        TextView TeamAString = (TextView) findViewById(R.id.autoCompleteTextViewA);
        TextView TeamBString = (TextView) findViewById(R.id.autoCompleteTextViewB);
        String TeamA = TeamAString.getText().toString();
        String TeamB = TeamBString.getText().toString();
        if (TeamA == "" && TeamB == ""){
            TeamA = "Home Team";
            TeamB = "Away Team";
            TeamNames teamNamesClass = (TeamNames) getApplicationContext();
            teamNamesClass.setTeamA(TeamA);
            teamNamesClass.setTeamB(TeamB);
            startActivity(intent);
        } else {
            if (TeamA == "") {
                TeamA = "Home Team";
                TeamNames teamNamesClass = (TeamNames) getApplicationContext();
                teamNamesClass.setTeamA(TeamA);
                teamNamesClass.setTeamB(TeamB);
                startActivity(intent);
            } else {
                if (TeamB == "") {
                    TeamB = "Away Team";
                    TeamNames teamNamesClass = (TeamNames) getApplicationContext();
                    teamNamesClass.setTeamA(TeamA);
                    teamNamesClass.setTeamB(TeamB);
                    startActivity(intent);
                }else{
                    TeamNames teamNamesClass = (TeamNames) getApplicationContext();
                    teamNamesClass.setTeamA(TeamA);
                    teamNamesClass.setTeamB(TeamB);
                    startActivity(intent);
                }
            }
        }

    }

}
