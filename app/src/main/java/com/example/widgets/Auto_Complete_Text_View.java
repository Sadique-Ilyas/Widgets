package com.example.widgets;

import android.os.Bundle;
import android.widget.AutoCompleteTextView;

import androidx.appcompat.app.AppCompatActivity;

public class Auto_Complete_Text_View extends AppCompatActivity {
    final String[] values = {"INDIA", "AMERICA", "NEW ZEALAND", "ENGLAND", "SPAIN",
            "FRANCE", "ARGENTINA", "BRAZIL", "URUGUAY", "AUSTRALIA"};
    final Integer[] img_values = {R.drawable.india, R.drawable.usa, R.drawable.newzealand, R.drawable.england,
            R.drawable.spain, R.drawable.france, R.drawable.argentina, R.drawable.brazil,
            R.drawable.uruguay, R.drawable.australia};
    AutoCompleteTextView autoCompleteTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto__complete__text__view);

        autoCompleteTextView = findViewById(R.id.autoCompleteTextView);

        MyCustomAutoAdapter adapter = new MyCustomAutoAdapter(Auto_Complete_Text_View.this, values, img_values);
        autoCompleteTextView.setAdapter(adapter);
    }
}
