package progremmereginner.datetime;

import org.junit.jupiter.api.Test;

import java.time.LocalTime;

public class LocalTimeTest {
    @Test
    void create() {
        LocalTime local1 = LocalTime.now();
        var local2=LocalTime.of(10,10,10);
        var local3=LocalTime.of(10,10);
        var local4=LocalTime.parse("23:23");

        System.out.println(local1);
        System.out.println(local2);
        System.out.println(local3);
        System.out.println(local4);
    }

    @Test
    void change() {
        var local1=LocalTime.now();
        var local2=local1.withHour(2);
        var local3=local1.withHour(10).withMinute(15).withSecond(23);

        System.out.println(local1);
        System.out.println(local2);
        System.out.println(local3);
    }

    @Test
    void modify() {
        var local1=LocalTime.now();
        var local2=local1.plusHours(2);
        var local3=local1.plusHours(1).plusMinutes(10).plusSeconds(23);

        System.out.println(local1);
        System.out.println(local2);
        System.out.println(local3);
    }

    @Test
    void get() {
        LocalTime localtime=LocalTime.now();

        System.out.println(localtime.getHour());
        System.out.println(localtime.getMinute());
        System.out.println(localtime.getSecond());
        System.out.println(localtime.getNano());

    }
}
