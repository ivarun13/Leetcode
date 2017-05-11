package Arrays;

import java.util.Arrays;

/**
 * Created by varun on 3/26/17.
 */
public class MergeSortedArray {

    public static void solution(int[] nums1, int m, int[] nums2, int n){
        int i=m-1,j=n-1,k=m+n-1;
        while(i>=0 && j>=0){
            nums1[k--] = nums1[i] > nums2[j] ? nums1[i--] : nums2[j--];
        }
        while(j>=0){
            nums1[k--] = nums2[j--];
        }
        System.out.println(Arrays.toString(nums1));
    }

    public static void main(String[] args) {
        int[] nums1 = {1,4,5,0,0,0};
        int[] nums2 = {2,3,6};
        solution(nums1,3,nums2,3);
    }
}
