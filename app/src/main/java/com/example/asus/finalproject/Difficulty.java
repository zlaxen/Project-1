package com.example.asus.finalproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by ASUS on 12/22/2017.
 */

public class Difficulty extends Activity  {
    public Button Easy;
    public Button Medium;
    public Button Hard;

    public void init(){
        Easy = (Button)findViewById(R.id.Easy);
        Easy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Difficulty.this, MainActivity.class);
                startActivity(myIntent);
            }

        });
    }

    public void init1(){
        Medium = (Button)findViewById(R.id.Medium);
        Medium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Difficulty.this, Medium.class);
                startActivity(myIntent);
            }

        });
    }

    public void init2(){
        Hard = (Button)findViewById(R.id.Hard);
        Hard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Difficulty.this, Hard.class);
                startActivity(myIntent);
            }

        });
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.difficulty);
        init();
        init1();
        init2();
    }
}

