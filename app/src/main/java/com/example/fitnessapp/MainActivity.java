package com.example.fitnessapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button next_screen_btn;
    Button next_timer_btn;
    Button next_workout_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        next_screen_btn = findViewById(R.id.water_button);
        next_screen_btn.setOnClickListener(this);

        next_timer_btn = findViewById(R.id.timer_button);
        next_timer_btn.setOnClickListener(this);

        next_workout_btn = findViewById(R.id.workout_button);
        next_workout_btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.water_button) {
            switchActivity();
        }
        else if (v.getId() == R.id.timer_button) {
            switchActivity1();
        }
        else if (v.getId() == R.id.workout_button){
            switchActivity2();
        }
    }

    public void switchActivity() {
        Intent intent = new Intent(this, water_screen.class);
        startActivity(intent);
    }

    public void switchActivity1() {
        Intent intent = new Intent(this, timerScreen.class);
        startActivity(intent);
    }

    public void switchActivity2() {
        Intent intent = new Intent(this, workout_screen.class);
        startActivity(intent);
    }
}
