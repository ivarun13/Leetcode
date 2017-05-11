package Arrays;

/**
 * Created by varun on 10/15/16.
 */
public class ThirdMax {

    public int solution(int[] nums)
    {
        int count,small,mid,max;
        small = mid = max = Integer.MIN_VALUE;
        count = 0;

        for(int n : nums)
        {
            if(n == mid || n == max) continue;

            if(n>max)
            {
                small = mid;
                mid = max;
                max = n;
                count++;
            }
            else if(n>mid)
            {
                small = mid;
                mid = n;
                count++;
            }
            else if(n>=small)
            {
                small = n;
                count++;
            }
        }
        if(count>=3) return small;
        else return max;
    }

    public static void main(String[] args) {
        ThirdMax t = new ThirdMax();
        int[] nums = {2,1,2,3,5,5,6};
        System.out.println(t.solution(nums));
    }
}

