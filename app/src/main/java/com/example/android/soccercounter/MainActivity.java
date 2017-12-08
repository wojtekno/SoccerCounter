package com.example.android.soccercounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int shotsTeamA = 0;
    int shotsTeamB = 0;
    int foulsTeamA = 0;
    int foulsTeamB = 0;
    int offsidesTeamA = 0;
    int offsidesTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
    displays score of Team A
     */
    private void displayScoreTeamA(int score) {
        TextView scoreTeam = (TextView) findViewById(R.id.team_a_score);
        scoreTeam.setText(String.valueOf(score));
    }

    /*
    displays score of Team B
     */
    private void displayScoreTeamB(int score) {
        TextView scoreTeam = (TextView) findViewById(R.id.team_b_score);
        scoreTeam.setText(String.valueOf(score));
    }

    /*
    adds goal for Team A - when Goal button clicked
     */
    public void addGoalA(View view) {
        scoreTeamA++;
        displayScoreTeamA(scoreTeamA);
    }

    /*
    adds goal for Team B - when Goal button clicked
     */
    public void addGoalB(View view) {
        scoreTeamB++;
        displayScoreTeamB(scoreTeamB);
    }

    /*
    displays number of shots of Team A
     */
    private void displayShotsTeamA(int fouls) {
        TextView foulsTeam = (TextView) findViewById(R.id.team_a_shots);
        foulsTeam.setText(String.valueOf(fouls));
    }

    /*
    displays number of shots of Team B
     */
    private void displayShotsTeamB(int fouls) {
        TextView foulsTeam = (TextView) findViewById(R.id.team_b_shots);
        foulsTeam.setText(String.valueOf(fouls));
    }

    /*
    adds shot for Team A
     */
    public void addShotA(View view) {
        shotsTeamA++;
        displayShotsTeamA(shotsTeamA);
    }

    /*
    adds shot for Team B
    */
    public void addShotB(View view) {
        shotsTeamB++;
        displayShotsTeamB(shotsTeamB);
    }

    /*
    displays number of offside of Team A
     */
    private void displayOffsidesTeamA(int offsides) {
        TextView offsidesTeam = (TextView) findViewById(R.id.team_a_offsides);
        offsidesTeam.setText(String.valueOf(offsides));
    }

    /*
    displays number of offside of Team B
     */
    private void displayOffsidesTeamB(int offsides) {
        TextView offsidesTeam = (TextView) findViewById(R.id.team_b_offsides);
        offsidesTeam.setText(String.valueOf(offsides));
    }

    /*
    adds offsides for Team A
     */
    public void addOffsideA(View view) {
        offsidesTeamA++;
        displayOffsidesTeamA(offsidesTeamA);
    }

    /*
    adds offsides for Team B
    */
    public void addOffsidesB(View view) {
        offsidesTeamB++;
        displayOffsidesTeamB(offsidesTeamB);
    }

    /*
    displays number of offside of Team A
     */
    private void displayFoulsTeamA(int fouls) {
        TextView foulsTeam = (TextView) findViewById(R.id.team_a_fouls);
        foulsTeam.setText(String.valueOf(fouls));
    }

    /*
    displays number of offside of Team B
     */
    private void displayFoulsTeamB(int fouls) {
        TextView foulsTeam = (TextView) findViewById(R.id.team_b_fouls);
        foulsTeam.setText(String.valueOf(fouls));
    }

    /*
    adds foul for Team A
     */
    public void addFoulA(View view) {
        foulsTeamA++;
        displayFoulsTeamA(foulsTeamA);
    }

    /*
    adds foul for Team B
    */
    public void addFoulB(View view) {
        foulsTeamB++;
        displayFoulsTeamB(foulsTeamB);
    }
}
