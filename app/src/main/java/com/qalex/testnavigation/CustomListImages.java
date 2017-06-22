package com.qalex.testnavigation;

/**
 * Created by m7mD on 5/22/2017.
 */


import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomListImages extends ArrayAdapter<String>{

    private final Activity context;
    private final String[] web;
    private final Integer[] imageId;
    public CustomListImages(Activity context,
                      String[] web, Integer[] imageId) {
        super(context, R.layout.list_images, web);
        this.context = context;
        this.web = web;
        this.imageId = imageId;

    }
    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView= inflater.inflate(R.layout.list_images, null, true);
      /*  TextView txtTitle = (TextView) rowView.findViewById(R.id.txt);

        ImageView imageView = (ImageView) rowView.findViewById(R.id.img);
        txtTitle.setText(web[position]);

        imageView.setImageResource(imageId[position]);*/
        return rowView;
    }
}