// Given an array of integers and an integer k, find out whether there are two distinct indices i
//and j in the array such that nums[i] = nums[j] and the difference between i and j is at most k.

//Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array
// such that nums[i] = nums[j] and the difference between i and j is at most k.
package Arrays;
import java.util.*;

public class ContainsDuplicate2
{

  public boolean solution(int[] nums, int k)
  {
    HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
    for(int i=0; i<nums.length; i++)
    {
      if(map.containsKey(nums[i]))
      {
        if(i - map.get(nums[i]) <= k)
        {
          System.out.println("this is true");
          return true;
        }
      }
      map.put(nums[i],i);
    }
    return false;
  }

  public static void main(String[] args) {

    ContainsDuplicate2 c = new ContainsDuplicate2();
    int[] nums = {1,2,1};
    c.solution(nums,2);
  }
}
