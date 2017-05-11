package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by varun on 3/14/17.
 */
public class Finbonacci {

    public static int[] solution(int n){
        int a = 0;
        int b = 1;
        int c;
       int[] list = new int[n];

        list[0] = 0;
        list[1] = 1;
        for(int i=2;i<n;i++){
            c = a+b;
            System.out.println(c);
            list[i] = c;
            a=b;
            b=c;

        }
        System.out.println(Arrays.toString(list));
        return list;
    }

    public static void main(String[] args) {
        solution(10);
    }
}
