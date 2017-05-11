
import java.util.*;
public class ContainsDuplicate1
{

  public boolean solution(int[] nums)
  {
        Arrays.sort(nums);
        for(int i=1; i<nums.length; i++)
        {
            if(nums[i-1] == nums[i])
            {
              System.out.println("This array has duplicate elements");
                return true;
            }
        }
        return false;
  }

  public static void main(String[] args) {
    ContainsDuplicate1 c = new ContainsDuplicate1();
    int[] nums = {1,2,3,2};
    c.solution(nums);
  }
}
