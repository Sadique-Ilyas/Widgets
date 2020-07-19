package com.example.widgets;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckedTextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Checked_Text_View extends AppCompatActivity {
    CheckedTextView checkedTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checked__text__view);

        checkedTextView = findViewById(R.id.checkedTextView);

        checkedTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkedTextView.toggle();
                if (checkedTextView.isChecked()) {
                    Toast.makeText(getApplicationContext(), "   Checked !!!!   ", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(), "   Unchecked !!!   ", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
