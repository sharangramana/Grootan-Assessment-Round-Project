package com.grootan.project.conferences;

import java.text.SimpleDateFormat;
import java.util.*;

import com.grootan.project.configs.configs;
import com.grootan.project.events.event;
import com.grootan.project.events.slot;

// class to schedule all the events for the estimated number of days
public class scheduleConference {

    // updated scheduled events
    public static void updatedscheduleEvents(List<event> eventNames) {

        // gives the required time stamp
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm a");


        int sumMorning = configs.MORNING_DURATION;  // 180
        int sumAfternoon = configs.AFTERNOON_DURATION; // 240

        String sessionTime; // holds the event name along with the time it's scheduled
        String SessionTitle; // indicates the day in which it's perfomed

        int eventCountIndex = 0;

        int i = 0, j = 0;
        for (i = 0; i < eventNames.size(); i++) {

            System.out.println("Day "+(i+1));
            System.out.println();
            System.out.println();

            Calendar cal = new GregorianCalendar();
            cal.set(Calendar.HOUR, 9);
            cal.set(Calendar.MINUTE, 0);
            cal.set(Calendar.AM_PM, Calendar.AM);

            slot morningSlot = new slot();
            fillSlot(morningSlot, cal, sumMorning, eventNames);

            for(int itr=0; itr<morningSlot.getEvents().size(); itr++) {
                sessionTime = sdf.format(cal.getTime()) + " " + morningSlot.getEvents().get(itr).getName() + " " +
                        morningSlot.getEvents().get(itr).getMinutes() + "min";

                morningSlot.getEvents().get(itr).setName(sessionTime);
                cal.add(Calendar.MINUTE, morningSlot.getEvents().get(itr).getMinutes());
                SessionTitle = "Day" + " " + (eventCountIndex + 1);
                morningSlot.getEvents().get(itr).setDays(SessionTitle);

                System.out.println(morningSlot.getEvents().get(itr).getName());
            }

            sessionTime = "12:00 PM" + " " + "Lunch 60min";
            System.out.println(sessionTime);
            cal.add(Calendar.MINUTE, 60);


            slot afternoonSlot = new slot();
            fillSlot(afternoonSlot, cal, sumAfternoon, eventNames);

            for(int itr=0; itr<afternoonSlot.getEvents().size(); itr++) {
                sessionTime = sdf.format(cal.getTime()) + " " + afternoonSlot.getEvents().get(itr).getName() + " " +
                        afternoonSlot.getEvents().get(itr).getMinutes() + "min";

                afternoonSlot.getEvents().get(itr).setName(sessionTime);
                cal.add(Calendar.MINUTE, afternoonSlot.getEvents().get(itr).getMinutes());
                SessionTitle = "Day" + " " + (eventCountIndex + 1);
                afternoonSlot.getEvents().get(itr).setDays(SessionTitle);

                System.out.println(afternoonSlot.getEvents().get(itr).getName());
            }

            System.out.println(sdf.format(cal.getTime())+ " networking time");
            cal.add(Calendar.MINUTE, 0);

            System.out.println();
        }
    }

    // it chooses the best event for morning and afternoon session
    private static void fillSlot(slot slot, Calendar cal, int totalTime, List<event> eventNames) {
        for (Iterator<event> eventsIterator = eventNames.iterator(); eventsIterator.hasNext(); ) {
            event event = eventsIterator.next();
            if (totalTime >= event.getMinutes()) {
                // add an event to the slot at the currentStartTime calculated.
                slot.addEvent(event);
                totalTime = totalTime - event.getMinutes();

                // remove the event from the list. This means that the event has been scheduled in the conference.
                eventsIterator.remove();
            }
        }
    }
}
