package Maths;

/**
 * Created by varun on 9/26/16.
 */
public class ReverseInt {

    public void solution(int x)
    {
        long rev= 0;
        while( x != 0){
            rev= rev*10 + x % 10;
            x= x/10;
//            if( rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE)
//                System.out.println("Answer is 0");
        }
        System.out.println((int) rev);
    }

    public static void main(String[] args) {
        ReverseInt r = new ReverseInt();
        r.solution(-123);
    }
}
