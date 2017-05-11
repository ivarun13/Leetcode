package Others;

import java.time.*;
import java.util.Calendar;

/**
 * Created by varun on 1/3/17.
 */
public class LocalDateExamples {




    public static void main(String[] args) {
        LocalDate d = LocalDate.now();
        System.out.println(d.getDayOfWeek());
        d.plusDays(1);
        d.atTime(2,0).toLocalTime();
        ZonedDateTime t1 = ZonedDateTime.now();
        System.out.println(t1.getDayOfWeek());
        System.out.println(t1.toLocalDate());
        LocalTime t = LocalTime.of(2,0);
        while(t.getHour() < 4){
            System.out.println(t);
            t = t.plusMinutes(30);

        }

        ZonedDateTime time = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println(time);



    }
}
