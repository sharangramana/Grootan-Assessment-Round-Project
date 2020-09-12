package com.grootan.project.events;

import java.util.Comparator;

public class eventsCompare implements Comparator<event> {

    @Override
    public int compare(event t1, event t2) {
        if(t1.getMinutes() < t2.getMinutes()){
            return 1;
        } else {
            return -1;
        }
    }
}
