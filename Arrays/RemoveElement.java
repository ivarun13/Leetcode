package Arrays;

//Given input array nums = [3,2,2,3], val = 3
//Your function should return length = 2, with the first two elements of nums being 2.

public class RemoveElement {


    public int solution(int[] nums, int n)
    {
        int length = 0;

        for(int i=0; i<nums.length; i++)
        {
            if(nums[i] != n)
            {
                nums[length] = nums[i];
                length++;
            }
        }
        return length;
    }

    public static void main(String[] args) {
        RemoveElement r = new RemoveElement();
        int[] nums = {2,3,3,2};
        System.out.println(r.solution(nums,3));
    }
}
