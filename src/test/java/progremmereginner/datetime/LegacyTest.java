package progremmereginner.datetime;

import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class LegacyTest {
    @Test
    void create() {
        Date date=new Date();
        System.out.println(date);
        Instant instant=date.toInstant();
        System.out.println(instant);

        Calendar calendar=Calendar.getInstance();
        System.out.println(calendar);
        Instant instant1=calendar.toInstant();
        System.out.println(instant);

        TimeZone timeZone=TimeZone.getDefault();
        System.out.println(timeZone);
        ZoneId zoneId=timeZone.toZoneId();
        System.out.println(zoneId);
    }

    @Test
    void toLegacy() {
        ZonedDateTime zonedDateTime=ZonedDateTime.now();
        Date date=Date.from(zonedDateTime.toInstant());
        System.out.println(date);

        Calendar calendar= GregorianCalendar.from(zonedDateTime);
        System.out.println(calendar);

        ZoneId zoneId=ZoneId.systemDefault();
        TimeZone timeZone=TimeZone.getTimeZone(zoneId);
        System.out.println(timeZone);
    }
}
