package progremmereginner.datetime;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateTest {
    @Test
    void create() {
        var local1=LocalDate.now();
        var local2=LocalDate.of(1980, Month.APRIL,11);
        var local3=LocalDate.parse("1999-12-11");

        System.out.println(local1);
        System.out.println(local2);
        System.out.println(local3);
    }

    @Test
    void with() {
        LocalDate local1=LocalDate.now();
        LocalDate local2=local1.withYear(1980);
        LocalDate local3=local1.withYear(1980).withMonth(1);

        System.out.println(local1);
        System.out.println(local2);
        System.out.println(local3);
    }
    @Test
    void modify() {
        LocalDate local1=LocalDate.now();
        LocalDate local2=local1.plusYears(10);
        LocalDate local3=local1.minusDays(10);

        System.out.println(local1);
        System.out.println(local2);
        System.out.println(local3);
    }
    @Test
    void get() {
        LocalDate local1=LocalDate.now();

        System.out.println(local1.getYear());
        System.out.println(local1.getMonth());
        System.out.println(local1.getMonthValue());
        System.out.println(local1.getDayOfMonth());
        System.out.println(local1.getDayOfWeek());
        System.out.println(local1.getDayOfYear());
    }
}
