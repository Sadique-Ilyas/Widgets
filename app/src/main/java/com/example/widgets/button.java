package com.example.widgets;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class button extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Button btn1;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);

        btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(button.this, "This is a Button", Toast.LENGTH_LONG).show();
            }
        });
    }
}
