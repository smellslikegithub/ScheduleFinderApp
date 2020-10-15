package org.example.AppointmentMapperUtility;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.Models.Calendar;
import org.example.Models.User;
import org.example.Services.UserService;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class AppointmentMapperUtility {

    private final ObjectMapper objectMapper;
    private Calendar calendar;
    private UserService userService;


    public AppointmentMapperUtility() {
        this.objectMapper = new ObjectMapper().configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
        this.calendar = null;
        this.userService = new UserService();
    }

    public List<Calendar> retrieveAllCalendar() {
        List<User> allUsers = userService.allUsersInRepo();
        List<Calendar> calendarList = new ArrayList<>();
        TypeReference<Calendar> calendarTypeReference = new TypeReference<Calendar>() {
        };

        for (User allUser : allUsers) {
            calendarList.add(getDataOfCalendarFromJson(this.objectMapper, calendarTypeReference, allUser.getName()));
        }

        return calendarList;
    }

    public Calendar getDataOfCalendarFromJson(ObjectMapper objectMapper, TypeReference<Calendar> calendarTypeReference,
                                              String calendarUser) {
        try {

            Path source = Paths.get(Paths.get("") + "src/main/Resources/JsonFiles/" + calendarUser + ".json");
            File file = new File(String.valueOf(source));
            calendar = objectMapper.readValue(file, calendarTypeReference);
            calendar.setCalendarId(getCalendarUUID(calendarUser));
            System.out.println("Calendar retrieved for " + calendarUser);
        } catch (Exception e) {
            System.out.println("Error Opening the json file");
            e.printStackTrace();
        }

        return calendar;

    }

    public UUID getCalendarUUID(String calendarOwner) {

        UUID id = userService.getUUIDByName(calendarOwner);
        if (id != null) {
            return id;
        } else {
            return UUID.fromString(UUID.nameUUIDFromBytes(calendarOwner.getBytes()).toString());
        }

    }

    public List<Calendar> getCalendarsByExistingUUIDInRepo(List<Calendar> allRetrievedCalendar) {
        List<Calendar> existingCalendarInRepoByUUID = new ArrayList<>();
        List<UUID> allUUID = userService.getAllUUIDOfUsers();
        for (Calendar c : allRetrievedCalendar) {
            if (allUUID.contains(c.getCalendarId())) {
                existingCalendarInRepoByUUID.add(c);
            }
        }
        return existingCalendarInRepoByUUID;
    }
}
