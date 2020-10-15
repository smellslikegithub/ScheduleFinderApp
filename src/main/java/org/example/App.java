package org.example;

import org.example.AppointmentMapperUtility.AppointmentMapperUtility;
import org.example.Models.Calendar;
import org.example.Services.CalendarService;
import org.example.Utility.DateUtils;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

public class App {
    public static void main(String[] args) {
        AppointmentMapperUtility cal = new AppointmentMapperUtility();
        CalendarService cs = new CalendarService();
        List<Calendar> allCalendar = cal.retrieveAllCalendar();
        List<Calendar> allCalendarByUUID = cal.getCalendarsByExistingUUIDInRepo(allCalendar);
        Integer duration = 30; // In mins
        Date startDate = DateUtils.convert(LocalDateTime.of(2019, 4, 8, 0, 0, 0));
        Date endDate = DateUtils.convert(LocalDateTime.of(2019, 5, 20, 0, 0, 0));

        cs.findAvailableTime(allCalendarByUUID, duration, startDate, endDate);

    }


}
