package Strings;

import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by varun on 3/4/17.
 */
public class KeyboardRow {

    public String[] solution(String[] input){
        Map<Character,Integer> map = new HashMap<>();
        map.put('q',1);
        map.put('w',1);
        map.put('e',1);
        map.put('r',1);
        map.put('t',1);
        map.put('y',1);
        map.put('u',1);
        map.put('i',1);
        map.put('o',1);
        map.put('p',1);
        map.put('a',2);
        map.put('s',2);
        map.put('d',2);
        map.put('f',2);
        map.put('g',2);
        map.put('h',2);
        map.put('j',2);
        map.put('k',2);
        map.put('l',2);
        map.put('z',3);
        map.put('x',3);
        map.put('c',3);
        map.put('v',3);
        map.put('b',3);
        map.put('n',3);
        map.put('m',3);
        List<String> list = new ArrayList<>();
        for(String s : input){
            int temp = map.get(s.toLowerCase().charAt(0));
            for(int i=1;i<s.length();i++){
                if(map.get(s.charAt(i)) != temp) {
                    temp = -1;
                    break;
                }
            }
            if(temp != -1) list.add(s);
        }
        System.out.println(list);
        return list.toArray(new String[list.size()]);
    }

    public static void main(String[] args) {
        KeyboardRow k = new KeyboardRow();

        String[] input = {"Hello", "Alaska", "Dad", "Peace"};
        k.solution(input);
    }
}
