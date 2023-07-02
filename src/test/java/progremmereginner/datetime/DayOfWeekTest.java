package progremmereginner.datetime;

import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;

public class DayOfWeekTest {
    @Test
    void Create() {
        DayOfWeek dayOfWeek1=DayOfWeek.SUNDAY;
        DayOfWeek dayOfWeek2=dayOfWeek1.plus(2);
        DayOfWeek dayOfWeek3=dayOfWeek2.minus(2);

        System.out.println(dayOfWeek1);
        System.out.println(dayOfWeek2);
        System.out.println(dayOfWeek3   );
    }
}
