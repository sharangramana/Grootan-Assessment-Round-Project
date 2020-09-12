package com.grootan.project.conferences;

import com.grootan.project.events.event;
import com.grootan.project.events.eventsCompare;
import com.grootan.project.configs.configs;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// class to read the input file and parse to collect the required information
// to print the event list generated

public class conferenceMain {

    List<event> eventNames; // to store all the events

    int totalDuration; // total duration in minutes
    int countEventDays; // estimated number of days
    int countEvents; // total number of events present in the file

    public conferenceMain(){
        this.eventNames = new ArrayList();
    }

    // getter and setters
    public int getTotalDuration() {
        return totalDuration;
    }
    public void setTotalDuration(int totalTrackMinutes) {
        this.totalDuration = totalTrackMinutes;
    }
    public int getCountEventDays() {
        return countEventDays;
    }
    public void setCountEventDays(int countTrack) {
        this.countEventDays = countTrack;
    }
    public int getCountEvents() {
        return countEvents;
    }
    public void setCountEvents(int countEvents) {
        this.countEvents = countEvents;
    }
    public List<event> getEventNames() {
        return eventNames;
    }
    public void setEventNames(List<event> eventNames) {
        this.eventNames = eventNames;
    }

    // function to read the input from the file
    // creating event list
    // finding the number of days
    // total time taken by all the events

    public void fileRead(String filename) {
        FileInputStream file = null; // initializing file input stream
        try {
            file = new FileInputStream(filename);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(file)); // reading from the file using buffered reader
        String Line;

        int index = 0;
        int noOfDays = 0;

        int currMinutes = 0; // duration for a particular event
        int totalMinutes = 0; // total duration that takes

        System.out.println("Input : \n");

        try {
            while ((Line = br.readLine()) != null) { // reads every line of the file until it reaches the end

                index = index +1 ; // assigning index to each event

                System.out.println(Line);

                String eventName = Line.substring(0, Line.lastIndexOf(" ")); // returns the event name
                String duration = Line.substring(Line.lastIndexOf(" ") + 1); // returns the duration of the event
                String minutes = Line.replaceAll("\\D+", ""); // returns the minute value

                if("lightning".equals(duration))
                {
                    currMinutes = 5;

                    totalMinutes = totalMinutes + currMinutes;
                }else
                {
                    currMinutes = Integer.parseInt(minutes);
                    totalMinutes = totalMinutes + currMinutes;
                }

                // Create a event object, that holds the parsed values from the input line
                event currEvent = new event( index, eventName, currMinutes, false);

                // Add every event in the list
                eventNames.add(currEvent);

            }
        }catch (IOException e) {
            e.printStackTrace();
        }

        // setting the total number of events
        this.setCountEvents(index);

        // setting the total number of minutes
        this.setTotalDuration(totalMinutes);

//        System.out.println("-------------------------------------");
//        Double totalMinutesInDouble =  totalMinutes*1.0; // total minutes
//        // System.out.println("totalMinutesInDouble -->"+totalMinutesInDouble);
//
//        Double numberOfDays =  totalMinutesInDouble/configs.TOTAL_EVENT_TIME; // gets the number of days
//        // System.out.println("numberOfDays -->"+numberOfDays);
//
//        double fractionalPart = numberOfDays % 1;
//        // System.out.println("fractionalPart -->"+fractionalPart);
//
//        double integralPart = numberOfDays - fractionalPart;
//        // System.out.println("integralPart -->"+integralPart);
//
//        int leftMinutes = totalMinutes - (int)integralPart*configs.TOTAL_EVENT_TIME.intValue(); // the remaining time after calculation
//
//        // System.out.println("leftMinutes -->"+leftMinutes);
//        // System.out.println("-------------------------------------");
//
//        if (leftMinutes > 0) {    // ceiling the value
//            noOfDays = (int) integralPart + 1;
//        }else
//        {
//            noOfDays = (int) integralPart;
//        }

//        int perDayMinTime = 6 * 60;
//        int totalTalksTime = getTotalTalksTime(talksList);
//        int totalPossibleDays = totalTalksTime/perDayMinTime

        this.setCountEventDays(noOfDays);

        // custom comparator function to sort in descending
        Collections.sort(eventNames, new eventsCompare());

        //Close the input stream
        try {
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("");
        System.out.println("");

    }
}


