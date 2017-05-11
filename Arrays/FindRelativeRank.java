package Arrays;

import java.util.Arrays;

/**
 * Created by varun on 3/13/17.
 */
public class FindRelativeRank {

    public static void main(String[] args) {
        int[] array = {5,4,3,2,1};
        Arrays.sort(array);
        int count = 3;
        for(int i=array.length-4;i>=0;i--){
                array[i] = count+1;
            count++;
        }
        System.out.println(Arrays.toString(array));
    }
}
