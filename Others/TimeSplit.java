package Others;

import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/**
 * Created by varun on 1/3/17.
 */
public class TimeSplit {

    public static void splitTime(int start, int end){
        DateFormat df = new SimpleDateFormat("HH:mm");
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE,1);


        System.out.println(cal.getTime());
        cal.set(Calendar.HOUR_OF_DAY, start);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        int startTime = cal.get(Calendar.HOUR_OF_DAY);
        int day = cal.get(Calendar.DAY_OF_WEEK);
        DateFormatSymbols symbols = new DateFormatSymbols(Locale.getDefault());
        String dayOfMonthStr = symbols.getWeekdays()[day];
        System.out.println(dayOfMonthStr);
        while (cal.get(Calendar.HOUR_OF_DAY) < end) {
            System.out.println(df.format(cal.getTime()));
            cal.add(Calendar.MINUTE, 30);
        }
    }

    public static void setAppointment(){
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY,2);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);


    }

    public static void main(String[] args) {

        splitTime(14,16);
        setAppointment();
    }
}
