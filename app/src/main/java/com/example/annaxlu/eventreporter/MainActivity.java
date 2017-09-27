package com.example.annaxlu.eventreporter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import static com.example.annaxlu.eventreporter.R.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);

        // Get ListView object from xml.
        ListView eventListView = (ListView) findViewById(id.event_list);
        ImageView thumbnail0 = (ImageView) findViewById(id.event_thumbnail0);
        // Initialize an adapter.
        /*ArrayAdapter<String> adapters = new ArrayAdapter<String>(
                this,
                R.layout.event_item,
                R.id.event_name,
                getEventNames());
        */

        EventAdapter adapter = new EventAdapter(this);

        // Assign adapter to ListView.
        eventListView.setAdapter(adapter);


    }


    /**
     * A dummy function to get fake event names.
     *
     * @return an array of fake event names.
     */
    /*private String[] getEventNames() {
        String[] names = {
                "Event1", "Event2", "Event3",
                "Event4", "Event5", "Event6",
                "Event7", "Event8", "Event9",
                "Event10", "Event11", "Event12"};
        return names;
    }
    */



}
