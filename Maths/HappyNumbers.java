package Maths;
import java.util.*;
//12 + 92 = 82 ,82 + 22 = 68 ,62 + 82 = 100 ,12 + 02 + 02 = 1 -> result 1 , so it is happy number.
public class HappyNumbers {

    public boolean solution(int n)
    {
        Set<Integer> set = new HashSet<Integer>();

        while(set.add(n))
        {
            int square = 0;
            while(n>0)
            {
                int temp = n%10;
                square += temp * temp;
                n = n/10;
            }
            if(square == 1) return true;
            else n = square;
        }
        return false;

    }

    public static void main(String[] args) {
        HappyNumbers h = new HappyNumbers();
        if(h.solution(11))
        {
            System.out.println("This is Happy Number!!!");
        }
        else{
            System.out.println("Opps This is not Happy one.");
        }
    }

}
