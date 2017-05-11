package Maths;

/**
 * Created by varun on 10/7/16.
 */
public class IntegerReplace {

    public void solution(int n)
    {
        int count = 0;
        while(n != 1)
        {
           if((n&1) == 0)
           {
                n >>>= 1;
           }
           else if(n==3 || (((n >>> 1) & 1) == 0))
           {
               n--;
           }
           else
           {
               n++;
           }
           count++;

        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        IntegerReplace i = new IntegerReplace();
        i.solution(65535);
    }
}
