package Arrays;//Given an array of integers, every element appears twice except for one. Find that single one.

public class SingleNumber
{
  public void solution(int[] nums)
  {
     int result = 0;
     for(int n : nums)
     {
       result ^= n;
     }
     System.out.println(result);
  }

  public static void main(String[] args) {
    SingleNumber s = new SingleNumber();
    int[] nums = {1,2,2,1,3,4,3};
    s.solution(nums);
  }
}
