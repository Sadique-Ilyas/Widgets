package com.example.widgets;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;

import androidx.appcompat.app.AppCompatActivity;

public class Text_Switcher extends AppCompatActivity {
    TextSwitcher tsw1;
    Button prev, next;

    String[] lists = {"THIS", "IS", "A", "TEXT", "SWITCHER"};
    int poaition = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text__switcher);

        tsw1 = findViewById(R.id.tsw1);
        prev = findViewById(R.id.prev);
        next = findViewById(R.id.next1);

        tsw1.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                TextView textView = new TextView(getApplicationContext());
                textView.setTextSize(20);
                textView.setTextColor(getResources().getColor(R.color.colorAccent));
                textView.setGravity(Gravity.CENTER);
                return textView;
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (poaition < lists.length - 1) {
                    poaition = poaition + 1;
                    tsw1.setText(lists[poaition]);
                }
            }
        });

        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (poaition > 0) {
                    poaition = poaition - 1;
                    tsw1.setText(lists[poaition]);
                }
            }
        });
    }
}
