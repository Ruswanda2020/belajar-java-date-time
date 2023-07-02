package progremmereginner.datetime;

import org.junit.jupiter.api.Test;

import java.time.OffsetTime;
import java.time.ZoneId;
import java.time.ZoneOffset;

public class OffsetTimeTest {
    @Test
    void create() {
        OffsetTime offsetTime=OffsetTime.now();
        System.out.println(offsetTime);

            OffsetTime offsetTime1=OffsetTime.now(ZoneId.of("Asia/Jakarta"));
            OffsetTime offsetTime2=OffsetTime.parse("09:09:09.866+07:00");

        System.out.println(offsetTime1);
        System.out.println(offsetTime2);
    }
}
