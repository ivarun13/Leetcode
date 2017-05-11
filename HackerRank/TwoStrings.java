package HackerRank;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.*;
import java.util.Scanner;

/**
 * Created by varun on 3/13/17.
 */
public class TwoStrings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            String a = sc.next();
            String b = sc.next();
            if(isShareSubString(a,b)) System.out.println("YES");
            else{
                System.out.println("NO");
            }
        }
    }

    public static boolean isShareSubString(String a, String b){
        Set<Character> first = new HashSet<>();
        for(char c : a.toCharArray()){
            first.add(c);
        }
        for(char c : b.toCharArray()){
            if(first.contains(c)){
                return true;
            }
        }
        return false;
    }
}
