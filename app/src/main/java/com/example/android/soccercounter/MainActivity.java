package com.example.android.soccercounter;

import android.os.Bundle;
import android.os.CountDownTimer;
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
    int shotsOnTargetTeamA = 0;
    int shotsOnTargetTeamB = 0;


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
    display Goal for Team A
     */
    private void displayGoalForA(final int score) {
        final TextView scoreTeam = (TextView) findViewById(R.id.team_a_score);
        new CountDownTimer(1000, 500) {

            public void onTick(long millisUntilFinished) {
                scoreTeam.setText("Goal!!!");
            }

            public void onFinish() {
                scoreTeam.setText(String.valueOf(score));
            }
        }.start();
    }

    /*
    display Goal for Team B
     */
    private void displayGoalForB(final int score) {
        final TextView scoreTeam = (TextView) findViewById(R.id.team_b_score);
        new CountDownTimer(1000, 500) {

            public void onTick(long millisUntilFinished) {
                scoreTeam.setText("Goal!!!");
            }

            public void onFinish() {
                scoreTeam.setText(String.valueOf(score));
            }
        }.start();
    }

    /*
    adds goal for Team A - when Goal button clicked
    adds also shots and shots on target
     */
    public void addGoalA(View view) {
        scoreTeamA++;
        addShotOnTargetA(view);
        displayGoalForA(scoreTeamA);
    }

    /*
    adds goal for Team B - when Goal button clicked
    adds also shots and shots on target
     */
    public void addGoalB(View view) {
        scoreTeamB++;
        addShotOnTargetB(view);
        displayGoalForB(scoreTeamB);
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
    displays number of shotsOnTarget of Team A
     */
    private void displayShotsOnTargetTeamA(int shotsOnTarget) {
        TextView shotsOnTargetTV = (TextView) findViewById(R.id.team_a_shots_on_target);
        shotsOnTargetTV.setText(String.valueOf(shotsOnTarget));
    }

    /*
    displays number of shotsOnTarget of Team B
     */
    private void displayShotsOnTargetTeamB(int shotsOnTarget) {
        TextView shotsOnTargetTV = (TextView) findViewById(R.id.team_b_shots_on_target);
        shotsOnTargetTV.setText(String.valueOf(shotsOnTargetTeamB));
    }

    /*
    adds shotsOnTarget and shots for Team A
     */
    public void addShotOnTargetA(View view) {
        shotsOnTargetTeamA++;
        shotsTeamA++;
        displayShotsTeamA(shotsTeamA);
        displayShotsOnTargetTeamA(shotsOnTargetTeamA);
    }

    /*
    adds shotsOnTarget and shots  for Team B
    */
    public void addShotOnTargetB(View view) {
        shotsOnTargetTeamB++;
        shotsTeamB++;
        displayShotsTeamB(shotsTeamB);
        displayShotsOnTargetTeamB(shotsOnTargetTeamB);
    }

    /*
    displays number of fouls of Team A
     */
    private void displayFoulsTeamA(int fouls) {
        TextView foulsTeam = (TextView) findViewById(R.id.team_a_fouls);
        foulsTeam.setText(String.valueOf(fouls));
    }

    /*
    displays number of fouls of Team B
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

    /*
    Resets all statistics.
     */
    public void resetAllStats(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        shotsTeamA = 0;
        shotsTeamB = 0;
        foulsTeamA = 0;
        foulsTeamB = 0;
        shotsOnTargetTeamA = 0;
        shotsOnTargetTeamB = 0;

        displayScoreTeamA(scoreTeamA);
        displayScoreTeamB(scoreTeamB);
        displayShotsTeamA(shotsTeamA);
        displayShotsTeamB(shotsTeamB);
        displayShotsOnTargetTeamA(shotsOnTargetTeamA);
        displayShotsOnTargetTeamB(shotsOnTargetTeamB);
        displayFoulsTeamA(foulsTeamA);
        displayFoulsTeamB(foulsTeamB);

    }
}
