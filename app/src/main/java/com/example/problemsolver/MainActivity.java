package com.example.problemsolver;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;



import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

private Button button;
    private Button button1;
private Button button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button =(Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFWGC();
            }
        });

        button1 =(Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openpuzzle();
            }
        });


        button2 =(Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open15puzzle();
            }
        });



    }

    public void openpuzzle() {
        Intent intent = new Intent(this, EightPuzzleActivity.class);
        startActivity(intent);
    }



    public void openFWGC() {
        Intent intent = new Intent(this, FWGCActivity.class);
        startActivity(intent);
    }


    public void open15puzzle() {
        Intent intent = new Intent(this, FifteenActivity.class);
        startActivity(intent);
    }



}


