package Arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by varun on 3/12/17.
 */
public class MinimumTimeDiff2 {

    public static void main(String[] args) {
        List<String> timePoints = new ArrayList<>();
        timePoints.add("08:45");
        timePoints.add("00:00");
        timePoints.add("16:50");
        timePoints.add("23:59");
        boolean[] minutes = new boolean[1440];
        for(String s : timePoints){
            int min = Integer.parseInt(s.split(":")[0]) * 60 + Integer.parseInt(s.split(":")[1]);
            if(minutes[min]) System.out.println("0");
            minutes[min] = true;
        }

        Integer first = null;
        Integer prev = null;
        int min = Integer.MAX_VALUE;

        for(int i=0;i<1440;i++){
            if(!minutes[i]) continue;
            else if(first == null){
                first = i;
                prev = i;
            }
            else{
                min = Math.min(min,Math.min(i - prev,1440-i+prev));
                prev = i;
            }
        }
        min = Math.min(min,Math.min(prev-first,1440-prev+first));
        System.out.println(min);


    }
}
