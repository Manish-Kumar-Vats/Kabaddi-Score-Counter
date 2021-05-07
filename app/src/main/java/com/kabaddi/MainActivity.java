package com.kabaddi;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

public class MainActivity extends AppCompatActivity {

    private TextView scoreTeamATT,scoreTeamBTT;

    private GameViewModel viewModel;

//    private Button teamAZero,teamAOne,teamATwo,teamAThree,teamAFour,teamAFive,teamASix,teamASeven,teamAEight,teamANine,teamBZero,teamBOne,teamBTwo,teamBThree,teamBFour,teamBFive,teamBSix,teamBSeven,teamBEight,teamBNine;
//    private Button resetButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewModel = ViewModelProviders.of(this).get(GameViewModel.class);

        scoreTeamATT=findViewById(R.id.scoreTeamA);
        displayScoreA(""+viewModel.getTeamAScore());
        scoreTeamBTT=findViewById(R.id.scoreTeamB);
        displayScoreB(""+viewModel.getTeamBScore());

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
                viewModel.incTeamAScore(1);
                break;
            case R.id.teamATwo:
                viewModel.incTeamAScore(2);
                break;
            case R.id.teamAThree:
                viewModel.incTeamAScore(3);
                break;
            case R.id.teamAFour:
                viewModel.incTeamAScore(4);
                break;
            case R.id.teamAFive:
                viewModel.incTeamAScore(5);
                break;
            case R.id.teamASix:
                viewModel.incTeamAScore(6);
                break;
            case R.id.teamASeven:
                viewModel.incTeamAScore(7);
                break;
            case R.id.teamAEight:
                viewModel.incTeamAScore(8);
                break;
            case R.id.teamANine:
                viewModel.incTeamAScore(9);
                break;
            case R.id.teamBZero:
                break;
            case R.id.teamBOne:
                viewModel.incTeamBScore(1);
                break;
            case R.id.teamBTwo:
                viewModel.incTeamBScore(2);
                break;
            case R.id.teamBThree:
                viewModel.incTeamBScore(3);
                break;
            case R.id.teamBFour:
                viewModel.incTeamBScore(4);
                break;
            case R.id.teamBFive:
                viewModel.incTeamBScore(5);
                break;
            case R.id.teamBSix:
                viewModel.incTeamBScore(6);
                break;
            case R.id.teamBSeven:
                viewModel.incTeamBScore(7);
                break;
            case R.id.teamBEight:
                viewModel.incTeamBScore(8);
                break;
            case R.id.teamBNine:
                viewModel.incTeamBScore(9);

                break;
             case R.id.reset: {
                 viewModel.setTeamAScore(0);
                 viewModel.setTeamBScore(0);
             }
                break;

            default:
                throw new RuntimeException("Unknow button ID");
        }
        displayScoreA(""+viewModel.getTeamAScore());
        displayScoreB(""+viewModel.getTeamBScore());
    }


}
