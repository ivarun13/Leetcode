import java.util.*;
public class InterSectionOfArray
{
  public int[] solution(int[] nums1, int[] nums2)
  {
    Set<Integer> set = new HashSet<Integer>();
            Set<Integer> intersection = new HashSet<Integer>();

            for(int i=0;i<nums1.length;i++)
            {
                set.add(nums1[i]);
            }
            for(int i=0;i<nums2.length;i++)
            {
                if(set.contains(nums2[i]))
                {
                    intersection.add(nums2[i]);
                }
            }
            int[] result = new int[intersection.size()];
            int count = 0;
            for(int i : intersection)
            {
                result[count] = i;
                count++;
            }
            System.out.println(Arrays.toString(result));
            return result;
  }

  public static void main(String[] args) {

    InterSectionOfArray i = new InterSectionOfArray();
    int[] nums1 = {1,2,2,1,3};
    int[] nums2 = {2,2,3};
    i.solution(nums1,nums2);
  }
}
