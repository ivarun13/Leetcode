import java.util.*;
public class MissingNumber
{
  public int solution(int[] nums)
  {
   Arrays.sort(nums);
   int i = 0;
   for(i = 0;i<nums.length;i++)  
   {
     if(nums[i] != i)
     {
       System.out.print(i);
       return i;

     }
   }
   System.out.println(i);
   return i;
  }

  public static void main(String[] args) {

  MissingNumber m = new MissingNumber();
  int[] nums = {3,4,5,2,0,6,7,1};
  m.solution(nums);
  }
}
