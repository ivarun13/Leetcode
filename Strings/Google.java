import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.*;

public class Google{

  public int solution(int n)
  {
    String s = Integer.toString(n);
    ArrayList<Integer> result = new ArrayList<Integer>();
    for(int i=0; i<s.length()-1; i++)
    {
      String str = "";
      if(s.charAt(i) < s.charAt(i+1))
      {
        str = str + s.substring(0,i) + s.charAt(i+1) + s.substring(i+2, s.length());
        Integer x = Integer.valueOf(str);
        result.add(x);
      }
    }

   System.out.println(Collections.min(result));
    return Collections.min(result);
  }


  public static void main(String[] args) {

    Google g = new Google();
    g.solution(233614);
  }
}
