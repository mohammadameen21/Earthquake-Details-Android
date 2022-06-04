package com.example.android.earthquake;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static final String LOG_TAG = MainActivity.class.getName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Create a fake list of earthquake locations.
        ArrayList<Earthquake> earthquakes = new ArrayList<>();
        earthquakes.add(new Earthquake("7.2", "San Francisco", "Feb 2011"));
        earthquakes.add( new Earthquake("2.4", "London", "Jan 2021"));
        earthquakes.add(new Earthquake("6.7","Tokyo", "Jun 8.9"));
        earthquakes.add(new Earthquake("6.7","Tokyo", "Jun 8.9"));
        earthquakes.add(new Earthquake("6.7","Tokyo", "Jun 8.9"));
        earthquakes.add(new Earthquake("6.7","Tokyo", "Jun 8.9"));
        earthquakes.add(new Earthquake("6.7","Tokyo", "Jun 8.9"));

        // Find a reference to the {@link ListView} in the layout
        ListView earthquakeListView = (ListView) findViewById(R.id.list);

        // Create a new {@link ArrayAdapter} of earthquakes
        EarthquakeAdapter adapter = new EarthquakeAdapter(this, earthquakes);

        // Set the adapter on the {@link ListView}
        // so the list can be populated in the user interface
        earthquakeListView.setAdapter(adapter);
    }
}