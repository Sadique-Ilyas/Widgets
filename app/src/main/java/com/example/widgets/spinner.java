package com.example.widgets;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;

public class spinner extends AppCompatActivity {
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        spinner = findViewById(R.id.spinner);

        final String[] spnvalues = {" Button", " TextView", " EditText", " ImageButton", " RadioButton",
                " CheckBox", " ToggleButton", " Switch", " ProgressBar", " SeekBar",
                " RatingBar", " Spinner", " AutoCompleteTextView", " MultiAutoCompleteTextView",
                " CheckedTextView", " ImageView", " TextSwitcher", " ImageSwitcher", " AdapterViewFlipper"};
        ArrayAdapter arrayAdapter = new ArrayAdapter(spinner.this, android.R.layout.simple_spinner_dropdown_item, Arrays.asList(spnvalues));
        spinner.setAdapter(arrayAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "" + spnvalues[position], Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
