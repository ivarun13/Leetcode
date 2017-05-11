//Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
//You may assume that the array is non-empty and the majority element always exist in the array.
import java.util.*;
public class MajorityElement
{
  public void solution(int[] nums)
  {
     Arrays.sort(nums);
     System.out.println(nums[nums.length/2]);
  }

  public static void main(String[] args) {
    MajorityElement m = new MajorityElement();
    int[] nums = {3,2,1,1,1};
    m.solution(nums);
  }
}
