package progremmereginner.datetime;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class TimeZoneTest {
    @Test
    void create() {
        TimeZone timeZoneDefulte=TimeZone.getDefault();
        System.out.println(timeZoneDefulte);

        TimeZone timeZoneGMT=TimeZone.getTimeZone("GMT");
        System.out.println(timeZoneGMT);

        String [] availableID = TimeZone.getAvailableIDs();
        Arrays.asList(availableID).forEach(zonaID -> System.out.println(zonaID));
    }

    @Test
    void date() {
        var date=new Date();
        System.out.println(date.toString());
        System.out.println(date.toGMTString());
    }

    @Test
    void calender() {
        Calendar calenderjakarta=Calendar.getInstance(TimeZone.getTimeZone("Asia/Jayapura"));
        Calendar calenderGmt=Calendar.getInstance(TimeZone.getTimeZone("GMT"));

        System.out.println(calenderjakarta.get(Calendar.HOUR_OF_DAY));
        System.out.println(calenderGmt.get(Calendar.HOUR_OF_DAY));

        calenderjakarta.setTimeZone(TimeZone.getTimeZone("GMT"));
        System.out.println(calenderjakarta.get(Calendar.HOUR_OF_DAY));


    }
}
