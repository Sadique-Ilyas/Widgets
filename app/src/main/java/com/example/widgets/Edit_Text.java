package com.example.widgets;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Edit_Text extends AppCompatActivity {
    EditText editText2;
    TextView textView4;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit__text);
        editText2 = findViewById(R.id.editText2);
        textView4 = findViewById(R.id.textView4);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView4.setText(editText2.getText());
            }
        });

    }
}
