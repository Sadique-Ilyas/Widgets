package com.example.widgets;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.lv);

        final String values[] = {" Button", " TextView", " EditText", " ImageButton", " RadioButton",
                " CheckBox", " ToggleButton", " Switch", " ProgressBar", " SeekBar",
                " RatingBar", " Spinner", " AutoCompleteTextView", " MultiAutoCompleteTextView",
                " CheckedTextView", " ImageView", " TextSwitcher", " ImageSwitcher", " AdapterViewFlipper"};

        ArrayAdapter arrayAdapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1, Arrays.asList(values));
        lv.setAdapter(arrayAdapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent intent = new Intent(MainActivity.this, button.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(MainActivity.this, Text_View.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(MainActivity.this, Edit_Text.class);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(MainActivity.this, Image_Button.class);
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4 = new Intent(MainActivity.this, Radio_Button.class);
                        startActivity(intent4);
                        break;
                    case 5:
                        Intent intent5 = new Intent(MainActivity.this, Check_Box.class);
                        startActivity(intent5);
                        break;
                    case 6:
                        Intent intent6 = new Intent(MainActivity.this, Toggle_Button.class);
                        startActivity(intent6);
                        break;
                    case 7:
                        Intent intent7 = new Intent(MainActivity.this, Switch1.class);
                        startActivity(intent7);
                        break;
                    case 8:
                        Intent intent8 = new Intent(MainActivity.this, Progress_Bar.class);
                        startActivity(intent8);
                        break;
                    case 9:
                        Intent intent9 = new Intent(MainActivity.this, Seek_Baar.class);
                        startActivity(intent9);
                        break;
                    case 10:
                        Intent intent10 = new Intent(MainActivity.this, Rating_Bar.class);
                        startActivity(intent10);
                        break;
                    case 11:
                        Intent intent11 = new Intent(MainActivity.this, spinner.class);
                        startActivity(intent11);
                        break;
                    case 12:
                        Intent intent12 = new Intent(MainActivity.this, Auto_Complete_Text_View.class);
                        startActivity(intent12);
                        break;
                    case 13:
                        Intent intent13 = new Intent(MainActivity.this, Multi_Auto_Complete_Text_View.class);
                        startActivity(intent13);
                        break;
                    case 14:
                        Intent intent14 = new Intent(MainActivity.this, Checked_Text_View.class);
                        startActivity(intent14);
                        break;
                    case 15:
                        Intent intent15 = new Intent(MainActivity.this, Image_View.class);
                        startActivity(intent15);
                        break;
                    case 16:
                        Intent intent16 = new Intent(MainActivity.this, Text_Switcher.class);
                        startActivity(intent16);
                        break;
                    case 17:
                        Intent intent18 = new Intent(MainActivity.this, Image_Switcher.class);
                        startActivity(intent18);
                        break;
                    case 18:
                        Intent intent19 = new Intent(MainActivity.this, Adapter_View_Flipper.class);
                        startActivity(intent19);
                        break;
                }
            }

        });
    }
}
