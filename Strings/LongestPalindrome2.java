package Strings;

/**
 * Created by varun on 11/6/16.
 */
public class LongestPalindrome2 {

    public void solution(String s)
    {
        int count = 0;
        int[] result = new int[256];
        for(int i=0;i<s.length();i++)
        {
            if(result[s.charAt(i)] == 1)
            {
                result[s.charAt(i)]--;
                count += 2;
            }
            else result[s.charAt(i)]++;
        }

        for(int i=0;i<s.length();i++)
        {
            if(result[s.charAt(i)] == 1)
            {
                count++;
                break;
            }

        }
        System.out.println(count);
    }


    public static void main(String[] args) {
        LongestPalindrome2 l = new LongestPalindrome2();
        l.solution("ccd");
    }
}
