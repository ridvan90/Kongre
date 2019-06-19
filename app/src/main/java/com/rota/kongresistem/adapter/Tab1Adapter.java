package com.rota.kongresistem.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.rota.kongresistem.R;

public class Tab1Adapter extends ArrayAdapter<String> {


    private final Activity context;
    private final String[] maintitle;
    private final String[] subtitle;

    public Tab1Adapter(Activity context, String[] maintitle,String[] subtitle) {
        super(context, R.layout.custom_list, maintitle);
        // TODO Auto-generated constructor stub

        this.context=context;
        this.maintitle=maintitle;
        this.subtitle=subtitle;

    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.custom_list, null,true);

        TextView titleText = (TextView) rowView.findViewById(R.id.tab1_clock);
        TextView subtitleText = (TextView) rowView.findViewById(R.id.tab1_title);

        titleText.setText(maintitle[position]);
        subtitleText.setText(subtitle[position]);

        return rowView;

    };


}