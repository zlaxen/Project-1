package com.example.asus.finalproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button RB, SB, PB;
    ImageView Mine, Enemies;
    TextView Hp1, Hp2;
    int PlayerLife = 10;
    int EnemyLife = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RB = (Button) findViewById(R.id.RB);
        SB = (Button) findViewById(R.id.SB);
        PB = (Button) findViewById(R.id.PB);

        Mine = (ImageView) findViewById(R.id.Mine);
        Enemies = (ImageView) findViewById(R.id.Enemies);

        Hp1 = (TextView) findViewById(R.id.Hp1);
        Hp2 = (TextView) findViewById(R.id.Hp2);

        PB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Mine.setImageResource(R.drawable.berlindung);
                String message = play_turn("Guard");
                Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
                Hp1.setText("Colleges Health: " + Integer.toString(PlayerLife));
                Hp2.setText("Professor Health: " + Integer.toString(EnemyLife));
            }
        });

        RB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Mine.setImageResource(R.drawable.jurus);
                String message = play_turn("Special");
                Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
                Hp1.setText("Colleges Health: " + Integer.toString(PlayerLife));
                Hp2.setText("Professor Health: " + Integer.toString(EnemyLife));
            }
        });

        SB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Mine.setImageResource(R.drawable.serang);
                String message = play_turn("Attack");
                Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
                Hp1.setText("Colleges Health: " + Integer.toString(PlayerLife));
                Hp2.setText("Professor Health: " + Integer.toString(EnemyLife));
            }
        });
    }

    public String play_turn(String player_choice){
        String computer_choice = "";
        Random r = new Random();

        int computer_choice_number = r.nextInt(3+1);

        if (computer_choice_number == 1){
            computer_choice = "Special";
        }
        else if (computer_choice_number == 2){
            computer_choice = "Attack";
        }
        else if (computer_choice_number == 3){
            computer_choice = "Guard";
        }

        if (computer_choice == "Special"){
            Enemies.setImageResource(R.drawable.jurus);
        }
        if (computer_choice == "Attack"){
            Enemies.setImageResource(R.drawable.serang);
        }
        if (computer_choice == "Guard"){
            Enemies.setImageResource(R.drawable.berlindung);
        }

        if (computer_choice == player_choice){
            return "Draw. No One Attack";
        }
        else if (player_choice == "Special" && computer_choice == "Guard"){
            EnemyLife--;
            return "Wow What An Attack!";
        }
        else if (player_choice  == "Attack" && computer_choice == "Special"){
            EnemyLife--;
            return "Your Turn To Do Damage!";
        }
        else if (player_choice == "Guard" && computer_choice == "Attack"){
            EnemyLife--;
            return "Your Defense Looks Amazing!";
        }
        else if (computer_choice == "Special" && player_choice == "Guard"){
            PlayerLife--;
            return "Wow What An Attack!";
        }
        else if (computer_choice == "Attack" && player_choice == "Special"){
            PlayerLife--;
            return "Your Turn To Do Damage!";
        }
        else if (computer_choice == "Guard" && player_choice == "Attack"){
            PlayerLife--;
            return "Your Defense Looks Amazing!";
        }
        else return "what else";
    }
}
