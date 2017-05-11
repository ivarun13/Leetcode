package Maths;

/**
 * Created by varun on 3/24/17.
 */
public class NthDigit {

    public static void solution(int n){
        int start = 1;
        int count = 9;
        int len = 1;

        while(n > len*count){
            n -= len*count;
            len++;
            count *= 10;
            start *= 10;
        }

        start += (n-1)/len;
        String s = String.valueOf(start);
        System.out.println(Character.getNumericValue(s.charAt((n-1)%len)));
    }

    public static void main(String[] args) {
        solution(15);
    }
}
