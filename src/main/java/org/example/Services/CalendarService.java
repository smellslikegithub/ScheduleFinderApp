package org.example.Services;

import org.example.Models.Appointment;
import org.example.Models.Calendar;
import org.example.Models.Timeslot;

import java.util.*;

public class CalendarService {
    HashSet<Integer> validAppointmentTimeInMinutes;
    TimesSlotService timesSlotService;
    AppointmentService appointmentService;

    public CalendarService() {
        this.validAppointmentTimeInMinutes = new HashSet<>(Arrays.asList(30, 15));
        this.timesSlotService = new TimesSlotService();
        this.appointmentService = new AppointmentService();
    }

    public void findAvailableTime(List<Calendar> calendars, Integer duration, Date startDate, Date endDate) {
        if (validAppointmentTimeInMinutes.contains(duration)) {
            List<Timeslot> allTimeSlot = new ArrayList<>();
            List<Appointment> conflictingAppointments = new ArrayList<>();
            for (Calendar c : calendars) {
                allTimeSlot = timesSlotService.retrieveAllTimeSlots(c, startDate, endDate);
                conflictingAppointments = appointmentService.retrieveAllApointmentsInCalendar(c, startDate, endDate);
                generateAvailableTimeSlotReportForCalendar(filterConflicts(allTimeSlot, conflictingAppointments));
            }

        } else {
            System.out.println("The Duration should be 15 or 30 minutes");
        }
    }

    public List<Timeslot> filterConflicts(List<Timeslot> allTimeSlot, List<Appointment> conflictingAppointments) {
        List<Timeslot> temp = new ArrayList<>(allTimeSlot);
        for (Appointment a : conflictingAppointments) {
            temp.removeIf(timeslot -> timeslot.getStart().equals(a.getStart()) && timeslot.getEnd().equals(a.getEnd()));
        }
        return temp;
    }

    public void generateAvailableTimeSlotReportForCalendar(List<Timeslot> freeTimeSlots) {
        if (freeTimeSlots != null) {
            System.out.println("===========The Report For Calendar Id: " + freeTimeSlots.get(0).getCalendar_id());
            for (Timeslot t : freeTimeSlots) {
                System.out.println(t.toString());
            }
        } else {
            System.out.println("Error Printing The Report!");
        }
    }
}
