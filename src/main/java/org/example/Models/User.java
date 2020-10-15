package org.example.Models;

import java.util.UUID;

public class User {
    private String name;
    private UUID calendarUUID;

    public User(String name, UUID id) {
        this.name = name;
        this.calendarUUID = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getCalendarUUID() {
        return calendarUUID;
    }

    public void setCalendarUUID(UUID calendarUUID) {
        this.calendarUUID = calendarUUID;
    }
}
