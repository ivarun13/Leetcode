package Arrays;
import java.util.*;
/**
 * Created by varun on 3/7/17.
 */
public class NextGreaterElement {

    public static void solution(int[] findNums,int[] nums){

        Map<Integer,Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        for(int n : nums){
            while(!stack.isEmpty() && stack.peek() < n){
                map.put(stack.pop(),n);
            }
            stack.push(n);
        }

        for(int i=0;i<findNums.length;i++){

                findNums[i] = map.getOrDefault(findNums[i],-1);
        }

        System.out.println(Arrays.toString(findNums));
    }

    public static void main(String[] args) {
        int[] findNums = {1,3,5,2,4};
        int[] nums = {6,5,4,3,2,1,7};
        solution(findNums,nums);
    }
}
