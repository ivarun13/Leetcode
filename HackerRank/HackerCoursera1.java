import java.util.*;

import java.util.ArrayList;
public class HackerCoursera1
{

   public int solution(int[] first, int[] second)
   {
     int count = 0;

     for(int i=0; i<first.length; i++)
     {
       int k = first[i];
       int v = second[i];
       count += 1;
       for(int j=0; j<first.length; j++)
       {
         if((k < first[j]) && (v < second[j]))
         {
           count--;
           break;
         }

       }
     }
     System.out.println(count);
     return count;
   }

   public static void main(String[] args) {
     HackerCoursera1 h = new HackerCoursera1();
     int[] first = {6,3,8,7,2};
     int[] second = {6,2,4,9,3};
     h.solution(first,second);
   }
}
