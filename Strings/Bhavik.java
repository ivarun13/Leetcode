package Strings;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by varun on 5/1/17.
 */
public class Bhavik {

    public static void solution(String s, int n){
        Map<Integer,String> map = new HashMap<>();
        int count = 1;
        StringBuilder result = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        for(int i=1;i<s.length();i++){
            if(s.charAt(i) == s.charAt(i-1)){
                sb.append(s.charAt(i-1));
            }
            else{
                sb.append(s.charAt(i-1));
                map.put(count++,sb.toString());
                sb.delete(0,sb.length());
            }
        }
        sb.append(s.charAt(s.length()-1));
        map.put(count++,sb.toString());
        sb.delete(0,sb.length());

        for(String str : map.values()){
            if(str.length() > n){
                result.append(str.substring(0,str.length()-n));
            }
            else{
                result.append(str);
            }
        }
        System.out.println(result.toString());
    }

    public static void main(String[] args) {
        solution("aaabbccccd",2);
    }
}
