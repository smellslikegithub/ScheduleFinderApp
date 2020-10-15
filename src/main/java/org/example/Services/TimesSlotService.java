package org.example.Services;

import org.example.Models.Calendar;
import org.example.Models.Timeslot;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TimesSlotService {
    List<Timeslot> retrieveAllTimeSlots(Calendar c, Date start, Date end) {
        List<Timeslot> timeSlots = c.getTimeslots();
        List<Timeslot> totalTimeSlots = new ArrayList<>();

        searchTimeSlots(start, end, timeSlots, totalTimeSlots);
        return totalTimeSlots;
    }

    private void searchTimeSlots(Date start, Date end, List<Timeslot> timeSlots, List<Timeslot> totalTimeSlots) {
        for (Timeslot t : timeSlots) {
            if (t.getStart().after(start) && t.getEnd().before(end)) {
                totalTimeSlots.add(t);
            }

        }
    }

}
