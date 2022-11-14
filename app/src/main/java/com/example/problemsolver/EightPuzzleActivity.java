package com.example.problemsolver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EightPuzzleActivity extends AppCompatActivity {
    private Button button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puzzle);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        button3 =(Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                solvePuzzleButton();
            }
        });
    }


    public void solvePuzzleButton() {
        Intent intent = new Intent(this, EightPuzzleSolverActivity.class);
        startActivity(intent);
    }
    }
