package Arrays;
import java.util.*;

/**
 * Created by varun on 12/13/16.
 */
public class InterSectionOfArrayII {

    public static void main(String[] args) {
        InterSectionOfArrayII i = new InterSectionOfArrayII();
        int[] nums1 = { };
        int[] nums2 = {1};
        i.solution(nums1,nums2);
    }

    public void solution(int[] nums1, int[] nums2)
    {
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();


        for(int i : nums1)
        {
            if(map.containsKey(i))
                map.put(i,map.get(i)+1);
            else
                map.put(i,1);

        }
        for(int i : nums2)
        {
            if(map.containsKey(i) && map.get(i) > 0)
            {
                map.put(i,map.get(i)-1);
                list.add(i);
            }
        }

        int[] res = new int[list.size()];

        for(int i=0;i<res.length;i++)
        {
            res[i] = list.get(i);
        }
        System.out.println(Arrays.toString(res));

    }
}
