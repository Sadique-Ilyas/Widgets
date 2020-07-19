package com.example.widgets;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.MultiAutoCompleteTextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;

public class Multi_Auto_Complete_Text_View extends AppCompatActivity {
    final String lists[] = {"Car", "Bus", "Jeep", "Case", "Builder"};
    MultiAutoCompleteTextView mactv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multi__auto__complete__text__view);

        mactv1 = findViewById(R.id.mactv1);

        ArrayAdapter arrayAdapter = new ArrayAdapter(Multi_Auto_Complete_Text_View.this, android.R.layout.simple_spinner_dropdown_item, Arrays.asList(lists));
        mactv1.setAdapter(arrayAdapter);
        mactv1.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
    }
}
