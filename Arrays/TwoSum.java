package Arrays;

import java.util.*;
//Given nums = [2, 7, 11, 15], target = 9, Because nums[0] + nums[1] = 2 + 7 = 9,
     //   return [0, 1].
public class TwoSum {

    public void solution(int[] nums, int target)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] result = new int[2];

        for(int i=0; i<nums.length; i++)
        {
            if(map.containsKey(target - nums[i]))
            {
                result[0] = map.get(target-nums[i]);
                result[1] = i;
            }
            map.put(nums[i],i);
        }
        System.out.println(Arrays.toString(result));
    }

    public static void main(String[] args) {
        TwoSum t = new TwoSum();
        int[] nums = {2,22,3,7,11,13};
        t.solution(nums,9);
    }
}
