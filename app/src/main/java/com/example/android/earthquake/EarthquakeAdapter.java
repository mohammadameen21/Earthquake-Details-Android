package com.example.android.earthquake;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;


public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    public EarthquakeAdapter(Context context, List<Earthquake> earthquakes){
        super(context,0, earthquakes);

    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        View listItemView = convertView;
        if(listItemView==null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.earthquake_list_item, parent, false);
        }

        Earthquake correntEarthquake = getItem(position);

        TextView maginitudeView = (TextView) listItemView.findViewById(R.id.magnitude);
        maginitudeView.setText(correntEarthquake.getMagnitude());


        TextView dateView = (TextView) listItemView.findViewById(R.id.date);
        dateView.setText(correntEarthquake.getDate());

        TextView locationView = (TextView) listItemView.findViewById(R.id.location);
        locationView.setText(correntEarthquake.getLocation());


        return listItemView;

    }
}
