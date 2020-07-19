package com.example.widgets;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Progress_Bar extends AppCompatActivity {
    ProgressBar progressBar;
    TextView textView8;
    Button button3;
    Handler handler;
    int progress = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress__bar);

        progressBar = findViewById(R.id.progressBar);
        textView8 = findViewById(R.id.textView8);
        button3 = findViewById(R.id.button3);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (progressBar.getProgress() < 100) {
                            progressBar.setProgress(progress);
                            progress++;
                            handler.postDelayed(this, 100);
                            textView8.setText("Loading...");
                        } else {
                            textView8.setText("Loading Complete");
                        }
                    }
                }, 100);
            }
        });
    }
}
