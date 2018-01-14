package com.example.asus.finalproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
/**
 * Created by ASUS on 12/21/2017.
 */

public class GameOver extends Activity {
    public Button yes;
    public Button no;

    public void init1(){
        yes = (Button)findViewById(R.id.yes);
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(GameOver.this, MainActivity.class);
                startActivity(myIntent);
            }
        });
    }

    public void init2(){
        no = (Button)findViewById(R.id.no);
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(GameOver.this, Menu.class);
                startActivity(myIntent);
            }

        });
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gameover);
        init1();
        init2();
    }
}
