package com.kabaddi;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private int teamAScore=0, teamBScore=0;
    private TextView scoreTeamATT,scoreTeamBTT;

//    private Button teamAZero,teamAOne,teamATwo,teamAThree,teamAFour,teamAFive,teamASix,teamASeven,teamAEight,teamANine,teamBZero,teamBOne,teamBTwo,teamBThree,teamBFour,teamBFive,teamBSix,teamBSeven,teamBEight,teamBNine;
//    private Button resetButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scoreTeamATT=findViewById(R.id.scoreTeamA);
        scoreTeamBTT=findViewById(R.id.scoreTeamB);

//        teamAZero=findViewById(R.id.teamAZero);
//        teamAOne=findViewById(R.id.teamAOne);
//        teamATwo=findViewById(R.id.teamATwo);
//        teamAThree=findViewById(R.id.teamAThree);
//        teamAFour=findViewById(R.id.teamAFour);
//        teamAFive=findViewById(R.id.teamAFive);
//        teamASix=findViewById(R.id.teamASix);
//        teamASeven=findViewById(R.id.teamASeven);
//        teamAEight=findViewById(R.id.teamAEight);
//        teamANine=findViewById(R.id.teamANine);
//        teamBZero=findViewById(R.id.teamBZero);
//        teamBOne=findViewById(R.id.teamBOne);
//        teamBTwo=findViewById(R.id.teamBTwo);
//        teamBThree=findViewById(R.id.teamBThree);
//        teamBFour=findViewById(R.id.teamBFour);
//        teamBFive=findViewById(R.id.teamBFive);
//        teamBSix=findViewById(R.id.teamBSix);
//        teamBSeven=findViewById(R.id.teamBSeven);
//        teamBEight=findViewById(R.id.teamBEight);
//        teamBNine=findViewById(R.id.teamBNine);
//
//

    }

    void displayScoreA(String str) {
        scoreTeamATT.setText(str);
    }
    void displayScoreB(String str) {
        scoreTeamBTT.setText(str);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.teamAZero:
                break;
            case R.id.teamAOne:
                teamAScore = teamAScore + 1;
                break;
            case R.id.teamATwo:
                teamAScore = teamAScore + 2;
                break;
            case R.id.teamAThree:
                teamAScore = teamAScore + 3;
                break;
            case R.id.teamAFour:
                teamAScore = teamAScore + 4;
                break;
            case R.id.teamAFive:
                teamAScore = teamAScore + 5;
                break;
            case R.id.teamASix:
                teamAScore = teamAScore + 6;
                break;
            case R.id.teamASeven:
                teamAScore = teamAScore + 7;
                break;
            case R.id.teamAEight:
                teamAScore = teamAScore + 8;
                break;
            case R.id.teamANine:
                teamAScore = teamAScore + 9;
                break;
            case R.id.teamBZero:
                break;
            case R.id.teamBOne:
                teamBScore = teamBScore + 1;
                break;
            case R.id.teamBTwo:
                teamBScore = teamBScore + 2;
                break;
            case R.id.teamBThree:
                teamBScore = teamBScore + 3;
                break;
            case R.id.teamBFour:
                teamBScore = teamBScore + 4;
                break;
            case R.id.teamBFive:
                teamBScore = teamBScore + 5;
                break;
            case R.id.teamBSix:
                teamBScore = teamBScore + 6;
                break;
            case R.id.teamBSeven:
                teamBScore = teamBScore + 7;
                break;
            case R.id.teamBEight:
                teamBScore = teamBScore + 8;
                break;
            case R.id.teamBNine:
                teamBScore = teamBScore + 9;

                break;
             case R.id.reset:
                teamAScore = 0;
                teamBScore = 0;

                break;

            default:
                throw new RuntimeException("Unknow button ID");
        }
        displayScoreA(""+teamAScore);
        displayScoreB(""+teamBScore);
    }


}
