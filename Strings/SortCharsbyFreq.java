//package Strings;
import java.util.*;
import java.util.Map;

/**
 * Created by varun on 11/2/16.
 */
public class SortCharsbyFreq {

    public void solution(String s)
    {
        char[] chararray = s.toCharArray();
        HashMap < Character,Integer> unsortMap = new HashMap<Character, Integer>();
        StringBuffer sb = new StringBuffer();
        for(int i = 0;i <chararray.length; i++ ){
            if(unsortMap.containsKey(chararray[i])){
                unsortMap.put(chararray[i], unsortMap.get(chararray[i])+1);
            }else{
                unsortMap.put(chararray[i],1);
            }
        }
        // 1. Convert Map to List of Map
        List<Map.Entry<Character,Integer>> list =
                new LinkedList<Map.Entry<Character,Integer>>(unsortMap.entrySet());

        // 2. Sort list with Collections.sort(), provide a custom Comparator
        //    Try switch the o1 o2 position for a different order
        Collections.sort(list, new Comparator<Map.Entry<Character,Integer>>() {
            public int compare(Map.Entry<Character,Integer> o1,
                               Map.Entry<Character,Integer> o2) {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });



        // 3. Loop the sorted list and append it into a StringBuffer
        for (Map.Entry<Character,Integer> entry : list) {
            int count = entry.getValue();
            while(count >= 1){
                sb.append(entry.getKey());
                count -- ;
            }
        }

        System.out.println(sb.toString());
    }




    public static void main(String[] args) {
        SortCharsbyFreq s = new SortCharsbyFreq();
        s.solution("tree");
    }

}
