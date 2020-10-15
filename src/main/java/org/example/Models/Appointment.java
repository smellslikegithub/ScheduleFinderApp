package org.example.Models;

import java.util.Date;
import java.util.UUID;

public class Appointment {
    private UUID id;
    private UUID patient_id;
    private UUID calendar_id;
    private Date start;
    private Date end;
    private String patient_comment;
    private String note;
    private UUID time_slot_type_id;
    private UUID type_id;
    private Integer State;
    private String out_of_office_location;
    private Boolean out_of_office;
    private Boolean completed;
    private Boolean is_scheduled;

    public String getPatient_comment() {
        return patient_comment;
    }

    public void setPatient_comment(String patient_comment) {
        this.patient_comment = patient_comment;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public UUID getTime_slot_type_id() {
        return time_slot_type_id;
    }

    public void setTime_slot_type_id(UUID time_slot_type_id) {
        this.time_slot_type_id = time_slot_type_id;
    }

    public UUID getType_id() {
        return type_id;
    }

    public void setType_id(UUID type_id) {
        this.type_id = type_id;
    }

    public Integer getState() {
        return State;
    }

    public void setState(Integer state) {
        State = state;
    }

    public String getOut_of_office_location() {
        return out_of_office_location;
    }

    public void setOut_of_office_location(String out_of_office_location) {
        this.out_of_office_location = out_of_office_location;
    }

    public Boolean getOut_of_office() {
        return out_of_office;
    }

    public void setOut_of_office(Boolean out_of_office) {
        this.out_of_office = out_of_office;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    public Boolean getIs_scheduled() {
        return is_scheduled;
    }

    public void setIs_scheduled(Boolean is_scheduled) {
        this.is_scheduled = is_scheduled;
    }

    public Appointment() { // exclusively stating public constructor

    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(UUID patient_id) {
        this.patient_id = patient_id;
    }

    public UUID getCalendar_id() {
        return calendar_id;
    }

    public void setCalendar_id(UUID calendar_id) {
        this.calendar_id = calendar_id;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "Appointment Contains => " +
                "id= " + id +
                ", patient_id= " + patient_id +
                ", calendar_id= " + calendar_id +
                ", start= " + start +
                ", end= " + end;
    }

}