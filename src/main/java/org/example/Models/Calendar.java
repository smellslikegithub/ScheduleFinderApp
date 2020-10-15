package org.example.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
import java.util.UUID;

//The Calendar Model
@JsonIgnoreProperties(value = "patient_meta")// This is being ommited as word-document does not talk about it!
public class Calendar {
    @JsonIgnore
    UUID calendarId;
    List<Appointment> appointments; // list of booked appointments
    List<Timeslot> timeslots; // List of planned available time slots
    List<TimeSlotType> timeslottypes; // Types of Time slots, Not mandatory to implement

    public UUID getCalendarId() {
        return calendarId;
    }

    public void setCalendarId(UUID calendarId) {
        this.calendarId = calendarId;
    }

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

    public List<TimeSlotType> getTimeslottypes() {
        return timeslottypes;
    }

    public void setTimeslottypes(List<TimeSlotType> timeslottypes) {
        this.timeslottypes = timeslottypes;
    }
}
