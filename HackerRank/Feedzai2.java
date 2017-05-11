package HackerRank;
import  java.util.*;
/**
 * Created by varun on 3/28/17.
 */
public class Feedzai2 {

    public static void solution(String[] input){
        List<List<String>> res = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();

        Arrays.sort(input);
        for (int i = 0; i < input.length; i++) {
            String temp = input[i];
            char[] ch = temp.toCharArray();
            Arrays.sort(ch);
            if (map.containsKey(String.valueOf(ch))) {
                map.get(String.valueOf(ch)).add(input[i]);
            } else {
                List<String> each = new ArrayList<>();
                each.add(input[i]);
                map.put(String.valueOf(ch), each);
            }
        }
        for (List<String> item: map.values()) {
            if(item.size() != 1){
                res.add(item);
            }
        }
        String[] result = new String[res.size()];
        int i = 0;
        for(List<String> s : res){
            String temp = "";
            for(String st : s){
                temp = temp + st + " ";
            }
            result[i] = temp;
            i++;
        }
        Arrays.sort(result);
        for(String s : result){
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        String[] str = {"car","cheating","cheating","deal","dale","lead","listen","silent","teaching"};
        solution(str);
    }
}
