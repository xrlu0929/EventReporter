package com.example.annaxlu.eventreporter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by annaxlu on 9/26/17.
 */

public class EventAdapter extends BaseAdapter {
    Context context;
    List<Event> eventData;
    String eventTitle;

    public EventAdapter(Context context) {
        this.context = context;
        eventData = DataService.getEventData();
    }


    @Override
    public int getCount() {
        return eventData.size();
    }

    @Override
    public Event getItem(int position) {
        return eventData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(
                    Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.event_item,
                    parent, false);
        }
        ImageView eventThumbnail = (ImageView) convertView.findViewById(R.id.event_thumbnail0);
        TextView eventTitle = (TextView) convertView.findViewById(
                R.id.event_title);
        TextView eventAddress = (TextView) convertView.findViewById(
                R.id.event_address);
        TextView eventDescription = (TextView) convertView.findViewById(
                R.id.event_description);

        Event r = eventData.get(position);
        /*if (r.getTitle().contains("1")) {
            eventThumbnail.setImageResource(R.drawable.event_thumbnail1);
        } else {
            eventThumbnail.setImageResource(R.drawable.event_thumbnail0);
        }*/ // forget it

        if (position == 0) {
            eventThumbnail.setImageResource(R.drawable.event_thumbnail0);
        } else if (position < 8 && position % 2 == 0) {
            eventThumbnail.setImageResource(R.drawable.event_thumbnail1);
        } else if (position >= 8) {
            eventThumbnail.setImageResource(R.drawable.event_thumbnail2);
        } else {
            eventThumbnail.setImageResource(R.drawable.event_thumbnail3);
        }

        eventTitle.setText(r.getTitle());
        eventAddress.setText(r.getAddress());
        eventDescription.setText(r.getDescription());
        return convertView;
    }

}
