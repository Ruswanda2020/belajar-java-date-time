package progremmereginner.datetime;

import org.junit.jupiter.api.Test;

import java.time.*;

public class ClockTest {
    @Test
    void create() {
        Clock clock1=Clock.systemUTC();
        System.out.println(clock1);

        Clock  clock2= Clock.systemDefaultZone();
        System.out.println(clock2);

        Clock clock3=Clock.system(ZoneId.of("Asia/Jakarta"));
        System.out.println(clock3);
    }

    @Test
    void instant() throws InterruptedException {
        ZoneId zoneId=ZoneId.of("Asia/Jakarta");
        Clock clock=Clock.system(zoneId);

        Instant instant=clock.instant();
        System.out.println(instant);

        Thread.sleep(1_000);

        Instant instant1=clock.instant();
        System.out.println(instant1);

    }

    @Test
    void fromClock() {
        Clock clockJakarta=Clock.system(ZoneId.of("Asia/Jakarta"));

        Year year=Year.now(clockJakarta);
        System.out.println(year);

        YearMonth yearMonth=YearMonth.now(clockJakarta);
        MonthDay monthDay=MonthDay.now(clockJakarta);
        LocalTime localTime=LocalTime.now(clockJakarta);
        LocalDateTime localDateTime=LocalDateTime.now(clockJakarta);
        OffsetTime offsetTime=OffsetTime.now(clockJakarta);
        OffsetDateTime offsetDateTime=OffsetDateTime.now(clockJakarta);
        ZonedDateTime zonedDateTime=ZonedDateTime.now(clockJakarta);

        System.out.println(offsetTime);
        System.out.println(offsetDateTime);
        System.out.println(zonedDateTime);
    }
}
