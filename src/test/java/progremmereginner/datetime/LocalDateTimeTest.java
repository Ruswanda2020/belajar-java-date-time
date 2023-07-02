package progremmereginner.datetime;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest {
    @Test
    void create() {
        LocalDateTime localDateTime=LocalDateTime.now();
        LocalDateTime localDateTime1=LocalDateTime.of(1980, Month.DECEMBER,19,20,10,54,444400000);
        LocalDateTime localDateTime2=LocalDateTime.parse("1999-01-08T19:10:10.444400000");

        System.out.println(localDateTime);
        System.out.println(localDateTime1);
        System.out.println(localDateTime2);
    }

    @Test
    void with() {
        LocalDateTime localDateTime=LocalDateTime.now();
        LocalDateTime localDateTime1=localDateTime.withYear(2023).withMonth(1);
        LocalDateTime localDateTime2=localDateTime.withYear(1980).withMonth(1).withDayOfMonth(23).withHour(10).withMinute(10).withSecond(12);

        System.out.println(localDateTime);
        System.out.println(localDateTime1);
        System.out.println(localDateTime2);
    }

    @Test
    void modify() {
        LocalDateTime localDateTime=LocalDateTime.now();
        LocalDateTime localDateTime1=localDateTime.plusYears(5).minusMinutes(10);
        LocalDateTime localDateTime2=localDateTime.minusYears(5).plusHours(1);

        System.out.println(localDateTime);
        System.out.println(localDateTime1);
        System.out.println(localDateTime2);
    }

    @Test
    void get() {
        LocalDateTime localDateTime=LocalDateTime.now();

        System.out.println(localDateTime.getYear());
        System.out.println(localDateTime.getMonth());
        System.out.println(localDateTime.getDayOfMonth());
        System.out.println(localDateTime.getDayOfWeek());
        System.out.println(localDateTime.getHour());
        System.out.println(localDateTime.getMinute());
        System.out.println(localDateTime.getSecond());
        System.out.println(localDateTime.getNano());
    }

    @Test
    void date() {
        LocalDateTime localDateTime=LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDate localDate=localDateTime.toLocalDate();
        System.out.println(localDate);

        LocalDateTime result=localDate.atTime(10,10,10,10);
        System.out.println(result);
    }

    @Test
    void time() {
        LocalDateTime localDateTime=LocalDateTime.now();
        System.out.println(localDateTime);

        LocalTime localTime=localDateTime.toLocalTime();
        System.out.println(localTime);

        LocalDateTime localDateTime1=localTime.atDate(LocalDate.now());
        System.out.println(localDateTime1);

    }
}
