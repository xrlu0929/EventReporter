package com.example.annaxlu.eventreporter;

/**
 * Created by annaxlu on 9/25/17.
 */

public class Event {
    /**
     * All data for a event.
     */
    private String title;
    //private String thumbnail; 这件事的关键在于EventAdapter；
    private String address;
    private String description;

    /**
     * Constructor
     */
    public Event(String title, String address, String description) {

        this.title = title;
        this.address = address;
        this.description = description;
    }

    /**
     * Getters for private attributes of Event class.
     */
    public String getTitle() { return this.title; }
    public String getAddress() { return this.address; }
    public String getDescription() { return this.description; }

}

