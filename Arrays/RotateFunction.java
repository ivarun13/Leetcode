//package Arrays;

/**
 * Created by varun on 10/24/16.
 */
public class RotateFunction {

    public int maxRotateFunction(int[] A) {
        if(A.length == 0) return 0;
        int length = A.length;
        int sum = 0;
        int Rtotal = 0;
        for(int i=0;i<length;i++)
        {
            sum += A[i];
            Rtotal += i*A[i];
        }
        int max = Rtotal;

        for(int j=1;j<length;j++)
        {
            Rtotal = Rtotal - sum + A[j-1]*length;
            max = Math.max(max,Rtotal);
        }
        System.out.println(max);
        return max;
    }




    public static void main(String[] args) {
        RotateFunction r = new RotateFunction();
        int[] A = {4,3,2,6};
        r.maxRotateFunction(A);
    }
}
