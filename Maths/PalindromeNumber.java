package Maths;

public class PalindromeNumber {

    public boolean solution(int n)
    {
        if(n<0 || (n != 0 && n%10==0)) return false;
        int rev = 0;

        while(n>rev)
        {
            rev = rev*10 + n%10;
            n = n/10;
        }

        if(n==rev || n==rev/10)
        {
            System.out.println("It is palindrome number");
        }
        return (n==rev || n==rev/10);
    }

    public static void main(String[] args) {
        PalindromeNumber p = new PalindromeNumber();
        p.solution(1991);
    }
}
