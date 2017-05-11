package Maths;

// Ugly numbers are positive numbers whose prime factors only include 2, 3, 5.
//         For example, 6, 8 are ugly while 14 is not ugly since it includes another prime factor 7.
public class UglyNumber {

    public boolean solution(int n)
    {
        if(n <= 1) return false;
        while(n%2 == 0) n = n/2;
        while(n%3 == 0) n = n/3;
        while(n%5 == 0) n = n/5;
        return n == 1;
    }

    public static void main(String[] args) {
        UglyNumber u = new UglyNumber();
        if(u.solution(8))
        {
            System.out.println("This is ugly number!!");
        }
        else
        {
            System.out.println("It is not a ugly number...");
        }
    }
}
