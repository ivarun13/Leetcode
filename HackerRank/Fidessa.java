package HackerRank;
import java.util.*;

/**
 * Created by varun on 12/1/16.
 */
public class Fidessa {

    public void solution(int[] arrivals,int[] departures,int flights)
    {
        Map<Integer,String> map = new TreeMap<>();

        for(int i=0;i<arrivals.length;i++)
        {

            map.put(arrivals[i],"A"+i);
        }
        for(int i=0;i<departures.length;i++)
        {
            map.put(departures[i],"D"+i);
        }
        System.out.println(map.size());
        printMap(map);

        int count = Integer.MIN_VALUE;
        int max = 0;
        for(String s : map.values())
        {
            if(s.startsWith("A"))
            {
                max++;
            }
            else {
                max--;
            }
            count = Math.max(max,count);
        }
        System.out.println(count);
    }

    public static <K, V> void printMap(Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println("Key : " + entry.getKey()
                    + " Value : " + entry.getValue());
        }
    }


    public static void main(String[] args) {
        Fidessa f = new Fidessa();
        int[] arrivals = {900,910,920};
        int[] departures = {915,1230,1330};
        f.solution(arrivals,departures,6);
    }
}
