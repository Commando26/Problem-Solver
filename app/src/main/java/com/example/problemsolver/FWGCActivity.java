package com.example.problemsolver;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class FWGCActivity extends AppCompatActivity {
    private Button button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);



        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        button3 =(Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                solveFarmerButton();
            }
        });
    }


    public void solveFarmerButton() {
        Intent intent = new Intent(this, FWGCSolverActivity.class);
        startActivity(intent);
    }}
