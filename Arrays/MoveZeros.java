
import java.util.*;

public class MoveZeros
{
 public void solution(int[] nums)
 {
   int count = 0;
      for(int i=0; i<nums.length; i++)
        {
            if(nums[i] == 0)
            {
                count++;
            }
            else
            {
                nums[i-count] = nums[i];
            }
        }

        while(count>0)
        {
            nums[nums.length - count] = 0;
            count--;
        }
        System.out.println(Arrays.toString(nums));
 }

  public static void main(String[] args) {
    MoveZeros m = new MoveZeros();
    int[] nums={0,1,3,5,0,3,0,8};
    m.solution(nums);
  }
}
