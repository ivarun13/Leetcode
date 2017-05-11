package Strings;

/**
 * Created by varun on 3/11/17.
 */
public class ReverseStringII {


    public static void solution(String s,int k){
        StringBuilder sb = new StringBuilder();
        int i = 0,j=0;
        while(i < s.length()){
           j = i+k <= s.length() ? i+k : s.length();
            sb.append(new StringBuilder(s.substring(i,j)).reverse());
            if(j >= s.length()) break;

            i = j;
            j = i+k <= s.length() ? i+k : s.length();
            sb.append(new StringBuilder(s.substring(i,j)));
            i = j;
        }
        System.out.println(sb);

    }

    public static void main(String[] args) {
        ReverseStringII r = new ReverseStringII();
        r.solution("abcdefabcd",3);
    }
}
