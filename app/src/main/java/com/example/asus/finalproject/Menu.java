package com.example.asus.finalproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by ASUS on 1/13/2018.
 */

public class Menu extends Activity {

    public Button Play;
    public Button How;

    public void init(){
        Play = (Button)findViewById(R.id.Play);
        Play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Menu.this, Difficulty.class);
                startActivity(myIntent);
            }

        });
    }

    public void init1(){
        How = (Button)findViewById(R.id.How);
        How.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Menu.this, How.class);
                startActivity(myIntent);
            }

        });
    }

    /** Called when the activity is first created. */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.awal);
        init();
        init1();
    }
}
