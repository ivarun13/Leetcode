package BitManipulation;

/**
 * Created by varun on 10/15/16.
 */
public class MaximumXOR {

    public void solution(int[] nums)
    {
        int ans = 0;
        for(int i=0; i<nums.length; i++)
        {
            for(int j=0; j<nums.length; j++)
            {
                int curr = nums[i] ^ nums[j];
                ans = Math.max(curr,ans);
            }
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        MaximumXOR m = new MaximumXOR();
        int[] nums = {3,8,2,5,25,10,22,30,13,21,6,20,4};
        m.solution(nums);
    }
}
