package com.example.widgets;

import android.app.ActionBar;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

import androidx.appcompat.app.AppCompatActivity;

public class Image_Switcher extends AppCompatActivity {
    ImageSwitcher imsw;
    Button prev1, next1;

    int[] images = {R.drawable.pic1, R.drawable.pic2, R.drawable.pic3,
            R.drawable.pic4, R.drawable.pic5};
    int position = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image__switcher);

        imsw = findViewById(R.id.imsw);
        prev1 = findViewById(R.id.prev);
        next1 = findViewById(R.id.next1);

        imsw.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView imageView = new ImageView(getApplicationContext());
                imageView.setLayoutParams(new ImageSwitcher.LayoutParams(ActionBar.LayoutParams.WRAP_CONTENT, ActionBar.LayoutParams.WRAP_CONTENT));
                return imageView;
            }
        });
        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position < images.length - 1) {
                    position = position + 1;
                    imsw.setBackgroundResource(images[position]);
                }
            }
        });
        prev1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position > 0) {
                    position = position - 1;
                    imsw.setBackgroundResource(images[position]);
                }
            }
        });
    }
}
