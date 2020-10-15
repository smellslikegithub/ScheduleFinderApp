package org.example.Services;

import org.example.Models.User;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public final class UserService {
    private final List<User> users = new ArrayList<>();

    public UserService() {
        users.add(new User("Danny boy", UUID.fromString("48cadf26-975e-11e5-b9c2-c8e0eb18c1e9")));
        users.add(new User("Joanna Hef", UUID.fromString("48644c7a-975e-11e5-a090-c8e0eb18c1e9")));
        users.add(new User("Emma Win", UUID.fromString("452dccfc-975e-11e5-bfa5-c8e0eb18c1e9")));

    }

    public List<User> allUsersInRepo() {
        return users;
    }

    public List<UUID> getAllUUIDOfUsers() {
        List<UUID> allUUID = new ArrayList<>();
        for (User u : users) {
            allUUID.add(u.getCalendarUUID());
        }
        return allUUID;
    }

    public UUID getUUIDByName(String name) {
        for (User u : users) {
            if (u.getName().equals(name)) {
                return u.getCalendarUUID();
            }
        }
        return null;
    }
}
