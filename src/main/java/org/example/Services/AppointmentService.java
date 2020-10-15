package org.example.Services;

import org.example.Models.Appointment;
import org.example.Models.Calendar;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppointmentService {
    List<Appointment> appointments;

    public AppointmentService() {
        this.appointments = new ArrayList<>();
    }

    public List<Appointment> retrieveAllApointmentsInCalendar(Calendar c, Date start, Date end) {
        for (Appointment a : c.getAppointments()) {
            if (a.getStart().after(start) && a.getEnd().before(end)) {
                appointments.add(a);
            }
        }
        return appointments;
    }
}
