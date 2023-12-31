package progremmereginner.datetime;

import org.junit.jupiter.api.Test;

import java.time.*;

public class InstentTest {
    @Test
    void create() {
        Instant instant=Instant.now();
        System.out.println(instant);

        Instant instant1=Instant.ofEpochMilli(0);
        System.out.println(instant1);
    }

    @Test
    void change() {
        Instant instant=Instant.now();
        Instant instant1=instant.plusMillis(1000);
        Instant instant2=instant.minusMillis(1000);

        System.out.println(instant);
        System.out.println(instant1);
        System.out.println(instant2);
    }

    @Test
    void get() {
        Instant instant=Instant.now();

        System.out.println(instant.toEpochMilli());
        System.out.println(instant.getEpochSecond());
        System.out.println(instant.getNano());
    }

    @Test
    void fromInstent() {
        Instant instant=Instant.now();
        System.out.println(instant);

        ZoneId zoneId=ZoneId.of("Asia/Jakarta");
        LocalTime localTime=LocalTime.ofInstant(instant,zoneId);
        System.out.println(localTime);

        LocalDateTime localDateTime=LocalDateTime.ofInstant(instant,zoneId);
        System.out.println(localDateTime);

        ZonedDateTime zonedDateTime=ZonedDateTime.ofInstant(instant,zoneId);
        System.out.println(zonedDateTime);

        OffsetDateTime offsetDateTime=OffsetDateTime.ofInstant(instant,zoneId);
        System.out.println(offsetDateTime);
    }

    @Test
    void toInstent() {

        Instant instant=LocalDateTime.now().toInstant(ZoneOffset.ofHours(7));
        System.out.println(instant);

        Instant instant1=ZonedDateTime.now().toInstant();
        System.out.println(instant1);
    }
}
