package HackerRank;
import java.util.*;

/**
 * Created by varun on 11/4/16.
 */
public class GemStones {

    public void solution(String[] rocks) {
        int length = rocks.length;
        int k = 0;
        List<Character> list1 = new ArrayList<>();
        List<Character> list2 = new ArrayList<>();



        while (length > 0) {
            list2.clear();
            char[] rock = rocks[k].toCharArray();

            for (int i = 0; i < rock.length; i++) {
                if(!list2.contains(rock[i])) {
                    list2.add(rock[i]);
                }
            }
            if(k == 0)
            {
                list1.addAll(list2);
            }
            else {
                list1.retainAll(list2);
            }
            k++;
            --length;
        }

        System.out.println(list1.size());
    }

    public static void main(String[] args) {
        GemStones g = new GemStones();
        String[] rocks = {"aabddxd","xbafb","xcabfc"};
        g.solution(rocks);
    }

}
