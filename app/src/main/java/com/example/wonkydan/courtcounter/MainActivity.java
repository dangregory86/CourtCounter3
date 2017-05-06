package com.example.wonkydan.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private int scoreTeam1;
    private int scoreTeam2;



    public void addThreePointsTeam1(View view){
        scoreTeam1 += 3;
        displayScore();
    }
    public void addTwoPointsTeam1(View view){
        scoreTeam1 += 2;
        displayScore();
    }
    public void addOnePointTeam1(View view){
        scoreTeam1 ++;
        displayScore();
    }
    public void addThreePointsTeam2(View view){
        scoreTeam2 += 3;
        displayScore();
    }
    public void addTwoPointsTeam2(View view){
        scoreTeam2 += 2;
        displayScore();
    }
    public void addOnePointTeam2(View view){
        scoreTeam2 ++;
        displayScore();
    }

    public void displayScore(){
        TextView team1 = (TextView) findViewById(R.id.team_1);
        TextView team2 = (TextView) findViewById(R.id.team_2);
        TextView team1Score = (TextView) findViewById(R.id.team_1_score);
        TextView team2Score = (TextView) findViewById(R.id.team_2_score);

        team1Score.setText(String.valueOf(scoreTeam1));
        team2Score.setText(String.valueOf(scoreTeam2));
        if(scoreTeam1>scoreTeam2){
            team1.setText("Team 1\nWINNING!!");
            team2.setText("Team 2");
        }else if(scoreTeam1 == scoreTeam2){
            team1.setText("Team 1");
            team2.setText("Team 2");
        }else {
            team1.setText("Team 1");
            team2.setText("Team 2\nWINNING!!");
        }
    }

    public void reset(View view){
        scoreTeam1 = 0;
        scoreTeam2 = 0;
        displayScore();
    }
}
