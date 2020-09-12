package com.grootan.project.events;

import java.util.ArrayList;
import java.util.List;

public class slot {
    private List<event> events;

    public List<event> getEvents() {
        return events;
    }

    public void addEvent(event ev) {
        this.events.add(ev);
    }

    public slot(){
        events = new ArrayList<>();
    }

}
