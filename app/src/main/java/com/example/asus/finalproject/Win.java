package com.example.asus.finalproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by ASUS on 12/21/2017.
 */

public class Win extends Activity {
    public Button OK;

    public void init(){
        OK = (Button)findViewById(R.id.OK);
        OK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Win.this, Menu.class);
                startActivity(myIntent);
            }

        });
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.win);
        init();
    }
}


