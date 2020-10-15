package org.example.Models;

import java.util.List;

public class Appointments { // similar to the collection in JSON, the class acts as a collection of appointments

    private List<Appointment> appointments;
    private List<Timeslot> timeslots;
    private List<TimeSlotType> timeSlotTypes;

    public List<Appointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(List<Appointment> appointments) {
        this.appointments = appointments;
    }

    public List<Timeslot> getTimeslots() {
        return timeslots;
    }

    public void setTimeslots(List<Timeslot> timeslots) {
        this.timeslots = timeslots;
    }

    public List<TimeSlotType> getTimeSlotTypes() {
        return timeSlotTypes;
    }

    public void setTimeSlotTypes(List<TimeSlotType> timeSlotTypes) {
        this.timeSlotTypes = timeSlotTypes;
    }

    @Override
    public String toString() {
        return "Appointments => " +
                "appointments=" + appointments +
                ", timeslots=" + timeslots +
                ", timeslottypes=" + timeSlotTypes;
    }
}
