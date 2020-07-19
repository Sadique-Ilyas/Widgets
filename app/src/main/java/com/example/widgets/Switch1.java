package com.example.widgets;

import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Switch1 extends AppCompatActivity {
    Switch switch1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switch1);

        switch1 = findViewById(R.id.switch1);

        switch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (switch1.isChecked()) {
                    Toast.makeText(getApplicationContext(), "   OFF KR   !!!   ", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(), "   ON KR   !!!   ", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
