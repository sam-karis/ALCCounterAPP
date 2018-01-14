package com.example.android.alccounterapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int penaltyTeamA = 0;
    int penaltyTeamB = 0;
    int playersTeamA = 7;
    int playersTeamB = 7;
    int redCardedPlayersTeamA = 0;
    int redCardedPlayersTeamB = 0;
    int playersTwoMinOutTeamA = 0;
    int playersTwoMinOutTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayScoreForTeamA(scoreTeamA);
        displayScoreForTeamB(scoreTeamB);
        displayPenaltyForTeamA(penaltyTeamA);
        displayPenaltyForTeamB(penaltyTeamB);
        displayPlayersForTeamA(playersTeamA);
        displayPlayersForTeamB(playersTeamB);
        displayRedCardForTeamA(redCardedPlayersTeamA);
        displayRedCardForTeamB(redCardedPlayersTeamB);
        displayTwoMinutesForTeamA(playersTwoMinOutTeamA);
        displayTwoMinutesForTeamB(playersTwoMinOutTeamB);
    }

    // TEAM A CODE

    /**
     * Add Goal scored
     */
    public void goalForTeamA(View V) {
        scoreTeamA = scoreTeamA + 1;
        displayScoreForTeamA(scoreTeamA);
    }

    /**
     * Increase No of penalties and display penalities taken by Team A
     */
    public void penaltyForTeamA(View V) {
        penaltyTeamA = penaltyTeamA + 1;
        displayPenaltyForTeamA(penaltyTeamA);
    }

    /**
     * Adjust the number of players for Beam A
     */
    public void playersForTeamA(View V) {
        displayPlayersForTeamA(playersTeamA);
    }

    /**
     * Adjust the number of Red carded players for Beam A
     */
    public void redCardedPlayersForTeamA(View V) {
        if (playersTeamA > 0) {
            redCardedPlayersTeamA = redCardedPlayersTeamA + 1;
            playersTeamA = playersTeamA - 1;
            displayRedCardForTeamA(redCardedPlayersTeamA);
            displayPlayersForTeamA(playersTeamA);
        }
    }

    /**
     * Track number of players 2 minutes out for Team A
     */
    //Go out due to a foul
    public void StartTwoMinutesOutForTeamA(View V) {
        if (playersTwoMinOutTeamA < 7 & playersTeamA > 0) {
            playersTwoMinOutTeamA = playersTwoMinOutTeamA + 1;
            playersTeamA = playersTeamA - 1;
            displayTwoMinutesForTeamA(playersTwoMinOutTeamA);
            displayPlayersForTeamA(playersTeamA);
        }
    }

    //Get in after Two Minutes

    public void EndTwoMinutesOutForTeamA(View V) {
        if (playersTwoMinOutTeamA > 0 & playersTeamA < 7) {
            playersTwoMinOutTeamA = playersTwoMinOutTeamA - 1;
            playersTeamA = playersTeamA + 1;
            displayTwoMinutesForTeamA(playersTwoMinOutTeamA);
            displayPlayersForTeamA(playersTeamA);
        }
    }

    /**
     * Display Goals for Team A.
     */
    public void displayScoreForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Display No of penalties taken by Team A.
     */
    public void displayPenaltyForTeamA(int penalty) {
        TextView penaltyView = (TextView) findViewById(R.id.team_a_penalty);
        penaltyView.setText(String.valueOf(penalty));
    }

    /**
     * Display No of players in the field for Team A.
     */
    public void displayPlayersForTeamA(int player) {
        TextView playersView = (TextView) findViewById(R.id.team_a_players);
        playersView.setText(String.valueOf(player));
    }

    /**
     * Display No of players red carded for Team A.
     */
    public void displayRedCardForTeamA(int score) {
        TextView redCardView = (TextView) findViewById(R.id.team_a_redCard);
        redCardView.setText(String.valueOf(score));
    }

    /**
     * Display No of players 2 minutes out for Team A.
     */
    public void displayTwoMinutesForTeamA(int playersTwoMinOut) {
        TextView redCardView = (TextView) findViewById(R.id.team_a_minout);
        redCardView.setText(String.valueOf(playersTwoMinOut));
    }


    // TEAM B CODE

    /**
     * Add Goal scored
     */
    public void goalForTeamB(View V) {
        scoreTeamB = scoreTeamB + 1;
        displayScoreForTeamB(scoreTeamB);
    }

    /**
     * Increase No of penalties and display penalities taken by Team B
     */
    public void penaltyForTeamB(View V) {
        penaltyTeamB = penaltyTeamB + 1;
        displayPenaltyForTeamB(penaltyTeamB);
    }


    /**
     * Adjust the number of players for Beam B
     */
    public void playersForTeamB(View V) {
        displayPlayersForTeamB(playersTeamB);
    }

    /**
     * Adjust the number of Red carded players for Beam B
     */
    public void redCardedPlayersForTeamB(View V) {
        if (playersTeamB > 0) {
            redCardedPlayersTeamB = redCardedPlayersTeamB + 1;
            playersTeamB = playersTeamB - 1;
            displayRedCardForTeamB(redCardedPlayersTeamB);
            displayPlayersForTeamB(playersTeamB);
        }
    }

    /**
     * Track number of players 2 minutes out for Team A
     */
    //Go out due to a foul
    public void StartTwoMinutesOutForTeamB(View V) {
        if (playersTwoMinOutTeamB < 7 & playersTeamB > 0) {
            playersTwoMinOutTeamB = playersTwoMinOutTeamB + 1;
            playersTeamB = playersTeamB - 1;
            displayTwoMinutesForTeamB(playersTwoMinOutTeamB);
            displayPlayersForTeamB(playersTeamB);
        }
    }

    //Get in after Two Minutes

    public void EndTwoMinutesOutForTeamB(View V) {
        if (playersTwoMinOutTeamB > 0 & playersTeamB < 7) {
            playersTwoMinOutTeamB = playersTwoMinOutTeamB - 1;
            playersTeamB = playersTeamB + 1;
            displayTwoMinutesForTeamB(playersTwoMinOutTeamB);
            displayPlayersForTeamB(playersTeamB);
        }
    }


    /**
     * Display number of Goals for Team B.
     */
    public void displayScoreForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Display No of penalties taken by Team B.
     */
    public void displayPenaltyForTeamB(int penalty) {
        TextView penaltyView = (TextView) findViewById(R.id.team_b_penalty);
        penaltyView.setText(String.valueOf(penalty));
    }

    /**
     * Display No of players in the field for Team B.
     */
    public void displayPlayersForTeamB(int player) {
        TextView playersView = (TextView) findViewById(R.id.team_b_players);
        playersView.setText(String.valueOf(player));
    }

    /**
     * Display No of players red carded for Team B
     */
    public void displayRedCardForTeamB(int redCard) {
        TextView redCardView = (TextView) findViewById(R.id.team_b_redCard);
        redCardView.setText(String.valueOf(redCard));
    }

    /**
     * Display No of players 2 minutes out for Team B.
     */
    public void displayTwoMinutesForTeamB(int playersTwoMinOut) {
        TextView redCardView = (TextView) findViewById(R.id.team_b_minout);
        redCardView.setText(String.valueOf(playersTwoMinOut));
    }

    /**
     * Reset the app after completion
     */
    public void resetValue(View V) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        penaltyTeamA = 0;
        penaltyTeamB = 0;
        playersTeamA = 7;
        playersTeamB = 7;
        redCardedPlayersTeamA = 0;
        redCardedPlayersTeamB = 0;
        playersTwoMinOutTeamA = 0;
        playersTwoMinOutTeamB = 0;
        displayScoreForTeamA(scoreTeamA);
        displayScoreForTeamB(scoreTeamB);
        displayPenaltyForTeamA(penaltyTeamA);
        displayPenaltyForTeamB(penaltyTeamB);
        displayPlayersForTeamA(playersTeamA);
        displayPlayersForTeamB(playersTeamB);
        displayRedCardForTeamA(redCardedPlayersTeamA);
        displayRedCardForTeamB(redCardedPlayersTeamB);
        displayTwoMinutesForTeamA(playersTwoMinOutTeamA);
        displayTwoMinutesForTeamB(playersTwoMinOutTeamB);
    }

}
