package progremmereginner.datetime;

import org.junit.jupiter.api.Test;

import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Set;

public class ZoneTest {
    @Test
    void createZonaId() {

        ZoneId zoneId=ZoneId.systemDefault();
        System.out.println(zoneId);

        ZoneId zoneId1=ZoneId.of("GMT");
        System.out.println(zoneId1);

        Set<String> avaliableZonaId=ZoneId.getAvailableZoneIds();
        avaliableZonaId.forEach(idzona-> System.out.println(idzona));
    }

    @Test
    void creatZonaOffSet() {

        ZoneOffset zoneOffset=ZoneOffset.of("+07");
        ZoneOffset zoneOffset1=ZoneOffset.ofHours(-7);
        ZoneOffset zoneOffset2=ZoneOffset.ofHoursMinutes(8,34);

        System.out.println(zoneOffset);
        System.out.println(zoneOffset1);
        System.out.println(zoneOffset2);
    }
}
