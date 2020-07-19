package com.example.widgets;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Check_Box extends AppCompatActivity {
    CheckBox checkBox;
    CheckBox checkBox2;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check__box);

        checkBox = findViewById(R.id.checkBox);
        checkBox2 = findViewById(R.id.checkBox2);
        button2 = findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkBox.isChecked()) {
                    Toast.makeText(getApplicationContext(), "   SINGLE HI MAREGA  :)   ", Toast.LENGTH_LONG).show();
                } else if (checkBox2.isChecked()) {
                    Toast.makeText(getApplicationContext(), "   TERA BHI KATEGA  :):):)   ", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
