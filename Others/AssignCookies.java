package Others;

import java.util.Arrays;

/**
 * Created by varun on 12/10/16.
 * Assume you are an awesome parent and want to give your children some cookies.
 * But, you should give each child at most one cookie. Each child i has a greed factor gi, which is the minimum size of a
 * cookie that the child will be content with; and each cookie j has a size sj. If sj >= gi, we can assign the cookie j to the child i,
 * and the child i will be content. Your goal is to maximize the number of your content children and output the maximum number.
 */
public class AssignCookies {

    public static int solution(int[] g,int[] s)
    {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0;

        for(int j=0;i<g.length && j<s.length; j++)
        {
            if(g[i] <= s[j]) i++;
        }
        System.out.println(i);
        return i;
    }

    public static void main(String[] args) {
        int[] g = {1,2};
        int[] s = {1,2,3};
        solution(g,s);
    }
}
