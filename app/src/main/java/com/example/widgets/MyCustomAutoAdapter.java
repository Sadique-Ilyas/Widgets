package com.example.widgets;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class MyCustomAutoAdapter extends ArrayAdapter<String> {
    private Activity context;
    private String[] values;
    private Integer[] img_values;


    public MyCustomAutoAdapter(Activity context, String[] values, Integer[] img_values) {
        super(context, R.layout.custom_auto_images, values);
        this.context = context;
        this.values = values;
        this.img_values = img_values;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.custom_auto_images, null, true);
        TextView textView = rowView.findViewById(R.id.text_view);
        ImageView imageView = rowView.findViewById(R.id.image_view);
        textView.setText(values[position]);
        imageView.setImageResource(img_values[position]);
        return rowView;
    }
}
