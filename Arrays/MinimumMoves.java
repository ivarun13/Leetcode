package Arrays;

/**
 * Created by varun on 12/12/16.
 */
public class MinimumMoves {

    public void solution(int[] nums)
    {
        int min = Integer.MAX_VALUE;
        for(int i : nums) min = Math.min(min,i);
        int result = 0;
        for(int i : nums) result += i - min;
        System.out.println(result);
    }

    public static void main(String[] args) {
        MinimumMoves m = new MinimumMoves();
        int[] nums = {1,2,3};
        m.solution(nums);
    }
}
