package com.grootan.project;

import com.grootan.project.conferences.conferenceMain;
import com.grootan.project.configs.configs;
import com.grootan.project.conferences.scheduleConference;

public class Main {
    public static void main(String[] args) {

        // creating object for conference
        conferenceMain conference = new conferenceMain();

        // function to pass the required input file
        conference.fileRead(configs.INPUT_FILE);

        // scheduling all the events for the estimated number of days
        scheduleConference.updatedscheduleEvents(conference.getEventNames());

    }
}
