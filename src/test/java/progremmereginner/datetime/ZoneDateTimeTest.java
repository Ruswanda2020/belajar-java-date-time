package progremmereginner.datetime;

import org.junit.jupiter.api.Test;

import java.time.*;

public class ZoneDateTimeTest {
    @Test
    void Create() {
        ZonedDateTime zonedDateTime=ZonedDateTime.now();
        ZonedDateTime zonedDateTime1=ZonedDateTime.of(LocalDateTime.now(),ZoneId.of("Asia/Jakarta"));
        ZonedDateTime zonedDateTime2=ZonedDateTime.now(ZoneId.of("GMT"));
        ZonedDateTime zonedDateTime3=ZonedDateTime.now(ZoneOffset.ofHours(5));

        System.out.println(zonedDateTime);
        System.out.println(zonedDateTime1);
        System.out.println(zonedDateTime2);
        System.out.println(zonedDateTime3);
    }

    @Test
    void parsing() {
        ZonedDateTime zonedDateTime=ZonedDateTime.parse("2002-12-12T10:10:11+08:00[Asia/Jakarta]");
        ZonedDateTime zonedDateTime1=ZonedDateTime.parse("2002-12-12T10:10:11+05:00[Asia/Jakarta]");

        System.out.println(zonedDateTime);
        System.out.println(zonedDateTime1);
    }

    @Test
    void changZoneId() {
        ZonedDateTime zonedDateTime=ZonedDateTime.now();
        System.out.println(zonedDateTime);

        ZonedDateTime zonedDateTime1 =zonedDateTime.withZoneSameLocal(ZoneId.of("GMT"));
        ZonedDateTime zonedDateTime2=zonedDateTime.withZoneSameInstant(ZoneId.of("GMT"));

        System.out.println(zonedDateTime1);
        System.out.println(zonedDateTime2);
    }

    @Test
    void toLocalTime() {
        LocalTime  localTime=LocalTime.now();
        System.out.println(localTime);

        OffsetTime offsetTime=localTime.atOffset(ZoneOffset.ofHours(7));
        System.out.println(offsetTime);

        LocalTime localTime1=offsetTime.toLocalTime();
        System.out.println(localTime1);
    }

    @Test
    void toLocaleDateTime() {
        LocalDateTime localDateTime=LocalDateTime.now();
        System.out.println(localDateTime);

        OffsetDateTime offsetDateTime=localDateTime.atOffset(ZoneOffset.ofHours(7));
        System.out.println(offsetDateTime);

        LocalDateTime localDateTime1=offsetDateTime.toLocalDateTime();
        System.out.println(localDateTime1);
    }
}
