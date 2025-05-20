package com.example.fitnessapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Timer;
import java.util.TimerTask;

public class timerScreen extends AppCompatActivity implements View.OnClickListener {
    Button back_button;
    Button reset_button;

    TextView timer_txt ;
    Button startstop_button;
    Boolean pause = true;
    int count = 0;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_timer);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        back_button = findViewById(R.id.back_button);
        back_button.setOnClickListener(this);

        reset_button = findViewById(R.id.reset_button);  // Initialize reset button
        reset_button.setOnClickListener(this);  // Set listener for reset button


        timer_txt = findViewById(R.id.timer_text);
        startstop_button = findViewById(R.id.startstop_button);
        startstop_button.setOnClickListener(this);
        start_timer();


    }

    public void start_timer(){
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            public void run() {
                runOnUiThread(new Runnable(){
                    @Override
                    public void run() {
                        if (!pause){
                            count = count+1;
                            timer_txt.setText(Integer.toString(count));
                        }

                    }
                });
            }
        },0,1000);

    }

    @Override
    public void onClick(View view) {
        if (view == back_button) {
            finish(); // Finish the activity when back button is clicked
        } else if (view == startstop_button) {
            // Toggle pause/resume functionality
            pause = !pause;
        } else if (view == reset_button) {
            // Reset the timer when reset button is clicked
            pause = true;  // Ensure the timer is paused
            int count = 0;  // Reset count to 0
            timer_txt.setText(Integer.toString(count));  // Update the UI to reflect reset
        }
    }

}