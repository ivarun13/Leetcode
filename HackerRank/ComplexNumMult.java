package HackerRank;

import java.util.Arrays;

/**
 * Created by varun on 3/25/17.
 */
public class ComplexNumMult {

    public static void solution(String a, String b){
        String[] str = a.split("\\+|i");
        String[] str2 = b.split("\\+|i");
        //String[] temp = a.split(str[0]);
       System.out.println(Arrays.toString(str));
        System.out.println(Arrays.toString(str2));
        int first = Integer.parseInt(str[0]) * Integer.parseInt(str2[0]) - Integer.parseInt(str[1]) * Integer.parseInt(str2[1]);
        int second = Integer.parseInt(str[0]) * Integer.parseInt(str2[1]) + Integer.parseInt(str[1]) * Integer.parseInt(str2[0]);
        System.out.println(first +"and"+ second);
        System.out.println(first+"+"+second+"i");

    }

    public static void main(String[] args) {
        solution("78+-76i","-86+72i");
    }
}
