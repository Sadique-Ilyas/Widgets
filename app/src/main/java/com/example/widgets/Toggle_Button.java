package com.example.widgets;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;

public class Toggle_Button extends AppCompatActivity {
    ToggleButton toggleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle__button);

        toggleButton = findViewById(R.id.toggleButton);
        toggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (toggleButton.isChecked()) {
                    Toast.makeText(getApplicationContext(), "   OFF KAR   !!!   ", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(), "   ON KAR   !!!   ", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
