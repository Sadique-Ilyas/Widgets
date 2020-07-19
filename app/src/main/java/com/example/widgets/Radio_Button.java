package com.example.widgets;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Radio_Button extends AppCompatActivity {
    RadioButton radioButton3;
    RadioButton radioButton4;
    RadioGroup rg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio__button);
        radioButton3 = findViewById(R.id.radioButton3);
        radioButton4 = findViewById(R.id.radioButton4);
        rg = findViewById(R.id.rg);

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.radioButton3:
                        Toast.makeText(getApplicationContext(), "HEY HANDSOME !!!", Toast.LENGTH_LONG).show();
                        break;
                    case R.id.radioButton4:
                        Toast.makeText(getApplicationContext(), "HEY SEXY !!!", Toast.LENGTH_LONG).show();
                        break;
                }
            }
        });

    }
}
