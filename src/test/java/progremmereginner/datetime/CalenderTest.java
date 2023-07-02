package progremmereginner.datetime;

import org.junit.jupiter.api.Test;

import java.util.Calendar;

public class CalenderTest {
    @Test
    void create() {
        var calender =Calendar.getInstance();
        var date=calender.getTime();


        System.out.println(date);
    }
    @Test
    void modifyCalender() {
        var calender =Calendar.getInstance();
        calender.set(Calendar.YEAR,1980);
        calender.set(Calendar.MONTH,Calendar.JANUARY);
        calender.set(Calendar.HOUR_OF_DAY,11);
        calender.set(Calendar.HOUR,10);
        calender.set(Calendar.MINUTE,54);
        calender.set(Calendar.MILLISECOND,6666);


        var date=calender.getTime();
        System.out.println(date);
        System.out.println(date.getTime());
    }
    @Test
    void getCalender() {
        var calender =Calendar.getInstance();


        System.out.println(calender.get(Calendar.YEAR));
        System.out.println(calender.get(Calendar.MONTH));
        System.out.println(calender.get(Calendar.WEEK_OF_YEAR));
        System.out.println(calender.get(Calendar.DAY_OF_YEAR));
        System.out.println(calender.get(Calendar.WEEK_OF_MONTH));
        System.out.println(calender.get(Calendar.HOUR));
        System.out.println(calender.get(Calendar.HOUR_OF_DAY));
        System.out.println(calender.get(Calendar.MINUTE));
        System.out.println(calender.get(Calendar.MILLISECOND));
    }
}
