import java.util.*;
public class StringDiff
{
  public char findTheDifference(String s, String t) {

    char[] s1 = s.toCharArray();
    Arrays.sort(s1);
    char[] s2 = t.toCharArray();
    Arrays.sort(s2);
    for(int i=0; i<s2.length-1;i++)
    {
      if(s2[i] != s1[i])
      {
        System.out.println(s2[i]);

        return s2[i];
      }
    }
    System.out.println(s2[s2.length-1]);
    return s2[s2.length-1];
    }

    public static void main(String[] args) {
         StringDiff s = new StringDiff();
         s.findTheDifference("abcd","adcbe");

    }
}
