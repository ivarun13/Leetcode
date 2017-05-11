import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SparseArray {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        HashMap<String,Integer> map = new HashMap<String,Integer>();

        while (s>=0)
            {
            String str = in.nextLine();
            System.out.println(str);
            int freq = 1;
            if(map.containsKey(str))
                {
                int i = map.get(str) + 1;
              //  System.out.println(i);
                map.remove(str);
                map.put(str,i);

            }
            else
                {
            map.put(str,freq);
            }
            s--;
        }
        int q = in.nextInt();
        System.out.println(map.size());
        while(q >= 0)
            {
            String str2 = in.nextLine();
            if(map.containsKey(str2))
                {
               // System.out.println("hi");
                System.out.println(map.get(str2));
            }
            else
                {
                System.out.println("0");
            }
            q--;
        }

    }
}
