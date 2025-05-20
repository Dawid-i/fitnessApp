package com.example.fitnessapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button next_screen_btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        next_screen_btn = findViewById(R.id.water_button);

        next_screen_btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switchActivity();
    }

    public void switchActivity(){
        Intent switchActivityIntent = new Intent(this, water_screen.class);
        startActivity(switchActivityIntent);
    }
}