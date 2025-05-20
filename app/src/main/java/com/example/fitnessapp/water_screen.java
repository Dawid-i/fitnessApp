package com.example.fitnessapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class water_screen extends AppCompatActivity implements View.OnClickListener {
    Button previous_screen_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.water_screen);

        previous_screen_btn = findViewById(R.id.back_button);
        previous_screen_btn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        finish();
    }
}