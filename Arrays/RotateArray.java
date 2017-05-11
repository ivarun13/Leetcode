import java.util.*;
public class RotateArray
{
  public int[] solution(int[] nums, int k)
  {
     k %= nums.length;
     nums = reverse(nums,0,nums.length-1);
//     nums = reverse(nums,0,k-1);
//     nums = reverse(nums,k,nums.length-1);
    // For left rotation
      nums = reverse(nums,0,nums.length - k - 1);
      nums = reverse(nums,nums.length - k,nums.length-1);
     System.out.print(Arrays.toString(nums));
     return nums;
  }

  public int[] reverse(int[] nums, int start, int end)
  {
    while(start<end)
    {
      int temp = nums[start];
      nums[start] = nums[end];
      nums[end] = temp;
      start++;
      end--;
    }
    return nums;
  }
  public static void main(String[] args) {

  RotateArray r = new RotateArray();
  int[] nums = {1,2,3,4,5,6,7};
  r.solution(nums,3);
  }
}
