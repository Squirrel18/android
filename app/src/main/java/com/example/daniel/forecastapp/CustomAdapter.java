package com.example.daniel.forecastapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by daniel on 29/01/18.
 */

public class CustomAdapter extends ArrayAdapter<HourConditions> {

    public CustomAdapter(Context context, int textViewResourceId) {
        super(context, textViewResourceId);
    }

    public CustomAdapter(Context context, int resource, List<HourConditions> items) {
        super(context, resource, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;

        if (v == null) {
            LayoutInflater vi;
            vi = LayoutInflater.from(getContext());
            v = vi.inflate(R.layout.activity_main, null);
        }

        HourConditions p = getItem(position);

        if (p != null) {
            TextView tt1 = (TextView) v.findViewById(R.id.cheese_name);

            if (tt1 != null) {
                tt1.setText(p.getSummary());
            }
        }

        return v;
    }
}
