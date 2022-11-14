package com.example.problemsolver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FifteenActivity extends AppCompatActivity {
    private Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifteen);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                solveFifteenButton();
            }
        });
    }

        public void solveFifteenButton () {
            Intent intent = new Intent(this, FifteenSolver.class);
            startActivity(intent);
        }
    }




