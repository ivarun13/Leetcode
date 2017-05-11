import java.util.*;

public class IsomorphicStrings
{

  public boolean solution(String s, String t)
  {
    HashMap<Character, Character> map = new HashMap<Character, Character>();
      if(s.length() != t.length()) return false;

      for(int i =0; i<s.length();i++)
      {
          if(map.containsKey(s.charAt(i)))
          {
              if(map.get(s.charAt(i)) != t.charAt(i))
              {
                 System.out.print("not isomorphic string");
                  return false;
              }

          }
          else
          {
             if(map.containsValue(t.charAt(i)))
              {
                System.out.print("not isomorphic string");
                  return false;
              }
          }
          map.put(s.charAt(i),t.charAt(i));

      }
      System.out.print("isomorphic string");
      return true;
  }

  public static void main(String[] args) {

  IsomorphicStrings i = new IsomorphicStrings();
  i.solution("adda","eggs");
  }
}
