package com.example.sportify.Model;

import java.sql.Timestamp;

public class Event {
    private int eventId;
    private String eventname;
    private String eventDescripton;
    private Timestamp eventDate;

    public Event(int eventId, String eventname, String eventDescripton, Timestamp eventDate) {
        this.eventId = eventId;
        this.eventname = eventname;
        this.eventDescripton = eventDescripton;
        this.eventDate = eventDate;
    }

    public Event(String eventId, String eventName, String eventDescription) {
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public String getEventname() {
        return eventname;
    }

    public void setEventname(String eventname) {
        this.eventname = eventname;
    }

    public String getEventDescripton() {
        return eventDescripton;
    }

    public void setEventDescripton(String eventDescripton) {
        this.eventDescripton = eventDescripton;
    }

    public Timestamp getEventDate() {
        return eventDate;
    }

    public void setEventDate(Timestamp eventDate) {
        this.eventDate = eventDate;
    }
}
