package com.grootan.project.events;

public class event {

    private int minutes;
    private String name;
    private int index;
    private boolean isLunchTime = false;
    private String networking;
    private boolean isNetworkingTIme = false;
    private String eventTime;
    private String lunch;
    // newly added
    private boolean picked_status;

    public boolean isPicked_status() {
        return picked_status;
    }

    public void setPickedStatus(boolean value) {
        this.picked_status = value;
    }

    private String days;


    // constructor
    public event(int index, String name, int minutes, boolean picked_status)
    {
        this.minutes = minutes;
        this.name = name;
        this.index = index;
        this.picked_status = false;
    }

    // getters and setters
    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public boolean isLunchTime() {
        return isLunchTime;
    }

    public void setLunchTime(boolean lunchTime) {
        isLunchTime = lunchTime;
    }

    public String getNetworking() {
        return networking;
    }

    public void setNetworking(String networking) {
        this.networking = networking;
    }

    public boolean isNetworkingTIme() {
        return isNetworkingTIme;
    }

    public void setNetworkingTIme(boolean networkingTIme) {
        isNetworkingTIme = networkingTIme;
    }

    public String getEventTime() {
        return eventTime;
    }

    public void setEventTime(String eventTime) {
        this.eventTime = eventTime;
    }

    public String getLunch() {
        return lunch;
    }

    public void setLunch(String lunch) {
        this.lunch = lunch;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }



}
