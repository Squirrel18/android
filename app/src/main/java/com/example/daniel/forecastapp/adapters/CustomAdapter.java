package com.example.daniel.forecastapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.daniel.forecastapp.HourConditions;
import com.example.daniel.forecastapp.R;

import java.util.List;

/**
 * Created by daniel on 29/01/18.
 */

public class CustomAdapter extends ArrayAdapter<HourConditions> {

    private int resView;

    public CustomAdapter(Context context, int textViewResourceId) {
        super(context, textViewResourceId);
    }

    public CustomAdapter(Context context, int resource, List<HourConditions> items) {
        super(context, resource, items);
        resView = resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;

        if (v == null) {
            LayoutInflater vi;
            vi = LayoutInflater.from(getContext());
            v = vi.inflate(resView, null);
        }

        HourConditions p = getItem(position);

        if (p != null) {
            TextView tt = v.findViewById(R.id.text);
            TextView tt1 = v.findViewById(R.id.text1);

            if (tt1 != null) {
                tt.setText(p.getSummary());
                tt1.setText(String.valueOf(p.getTime()));
            }
        }

        return v;
    }
}
