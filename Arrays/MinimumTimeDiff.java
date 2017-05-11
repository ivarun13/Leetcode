package Arrays;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by varun on 3/12/17.
 */
public class MinimumTimeDiff {

    public static void main(String[] args) {
        List<String> timePoints = new ArrayList<>();
        timePoints.add("00:00");
        timePoints.add("00:01");
        timePoints.add("16:50");
        timePoints.add("23:59");
        Collections.sort(timePoints);
        System.out.println(timePoints);
        int min = Integer.MAX_VALUE;
        String prev = timePoints.get(timePoints.size()-1);
        for(String i : timePoints){
            String[] s1 = prev.split(":");
               String[] s2 = i.split(":");
               int hourDiff = (Integer.valueOf(s1[0]) - Integer.valueOf(s2[0]));
                int minuteDiff = (Integer.valueOf(s1[1]) - Integer.valueOf(s2[1]));
                int diff = hourDiff*60 + minuteDiff;
            if(diff < 0) diff += 1440;
            min = Math.min(min,Math.min(diff,1440-diff));
            prev = i;
        }
        System.out.println(min);

    }
}
