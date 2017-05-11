package DP;


public class HouseRobber {

    public int solution(int[] nums)
    {
        int rob = 0;
        int notrob = 0;

        for(int n : nums)
        {
            int current = notrob + n;
            notrob = Math.max(notrob,rob);
            rob = current;
        }
        return  Math.max(rob,notrob);
    }

    public static void main(String[] args) {
        HouseRobber h = new HouseRobber();
        int[] nums = {5,3,4,9,10};
        System.out.println(h.solution(nums));
    }
}
