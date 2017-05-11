import java.util.*;
import java.util.HashMap;
public class HackerCoursera2
{

  public String[] solution(String[] names)
  {
     Arrays.sort(names);

     for(int i=0; i<names.length-1;i++)
     {
       String[] parts = names[i].split("\\s+");
       String[] parts2 = names[i+1].split("\\s+");
       if(parts[0].equals(parts2[0]))
       {
          if(RomanToInt(parts[1]) > RomanToInt(parts2[1]))
          {
            String temp = names[i];
            names[i] = names[i+1];
            names[i+1] = temp;
          }
       }

     }
     System.out.println(Arrays.toString(names));
     return names;
  }


 public int RomanToInt(String s)
   {
     int sum = 0;
     HashMap<Character,Integer> map = new HashMap<Character,Integer>();
     map.put('I',1);
     map.put('V',5);
     map.put('X',10);
     map.put('L',50);
     map.put('M',1000);
     map.put('D',500);
     map.put('C',100);
     for(int i=0; i<s.length(); i++)
     {
       if(i < s.length()-1 && map.get(s.charAt(i)) < map.get(s.charAt(i+1)))
       {
         sum -= map.get(s.charAt(i));
       }
       else
       {
        sum += map.get(s.charAt(i));
       }
     }

     return sum;
   }



  public static void main(String[] args) {
    HackerCoursera2 h = new HackerCoursera2();
    String[] names = {"Philip III", "Philip II","Abcd XX","Abcd X"};
    h.solution(names);
  }
}
