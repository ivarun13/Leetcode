package HackerRank;

import java.util.*;

/**
 * Created by varun on 3/14/17.
 */
public class HacklandElection {

    public static void solution(String[] votes){
        Map<String,Integer> map = new HashMap<>();
        for(String s : votes){
            if(map.containsKey(s)){
                map.put(s,map.get(s)+1);
            }
            else{
                map.put(s,1);
            }
        }

        int highestVotes = Collections.max(map.values());
        List<String> result = new ArrayList<>();
        String temp = null;
        for(String s : map.keySet()) {
            if (map.get(s) == highestVotes) {
                if (temp == null) {
                    temp = s;
                } else {
                    int n = temp.compareTo(s);
                    System.out.println(n);
                    if (n < 0) {
                        temp = s;
                    }
                }
            }
        }
        System.out.println(temp);
    }

    public static void main(String[] args) {
        String[] votes = {"Alex","Micheal","Harry","Dave","Micheal","Victor","Harry","Alex","Mary","Mary"};
        solution(votes);
    }
}
