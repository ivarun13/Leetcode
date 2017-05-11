package HackerRank;
import java.util.*;

/**
 * Created by varun on 3/21/17.
 */
public class Feedzai {

    public static void solution(String[] input){
        if (input == null || input.length == 0) return;
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        Arrays.sort(input);
        for (String s : input) {
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String keyStr = String.valueOf(ca);
            if (!map.containsKey(keyStr)) map.put(keyStr, new ArrayList<String>());
            map.get(keyStr).add(s);
        }
        List<String> list = new ArrayList<>();
        for(List<String> l : map.values()){
            StringBuilder sb = new StringBuilder();
            if(l.size() == 1) continue;
            else{
                Collections.sort(l);
                for(String s : l){
                    sb = sb.append(s);
                    sb = sb.append(" ");
                }
                list.add(sb.toString());
            }
        }
        Collections.sort(list);
        String[] result = new String[list.size()];
        result = list.toArray(result);
        System.out.println(Arrays.toString(result));
    }

    public static void main(String[] args) {
        String[] str = {"car","cheating","cheating","dale","deal","lead","listen","silent","teaching"};
        solution(str);
    }
}
