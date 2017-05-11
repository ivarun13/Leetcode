package HackerRank;

import java.util.List;
import java.util.*;
import java.util.Arrays;

/**
 * Created by varun on 11/23/16.
 */
public class ER {

    public String solution(String rangestring)
    {
        String ans = "";
        rangestring = rangestring.replaceAll("\\s+","");
        String[] result = rangestring.split(",");
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> temp2 = new ArrayList<>();
        for(int i=0;i<result.length;i++)
        {

            String[] temp = result[i].split(":");
            map.put(Integer.parseInt(temp[0]),Integer.parseInt(temp[1]));

        }
        Map<Integer,Integer> treeMap = new TreeMap<>(map);
        for(Map.Entry<Integer,Integer> entry : treeMap.entrySet())
        {
            temp2.add(entry.getKey());
            temp2.add(entry.getValue());
        }
        ans = ans + temp2.get(0) + ":";
        
        for(int i=1;i<temp2.size()-1;i=i+2)
        {
            if(temp2.get(i+1) - temp2.get(i) > 1)
            {
                ans = ans + temp2.get(i) + "," + temp2.get(i+1) + ":" ;
            }
        }
        ans = ans + temp2.get(temp2.size()-1);
        System.out.println(ans);
        return null;
    }



    public static void main(String[] args) {
        ER e = new ER();
        e.solution("2:20,1:10,30:40");
        int a = 300;
        System.out.println((byte) a);
    }
}
