package HackerRank;

/**
 * Created by varun on 11/4/16.
 */
public class xValue {

    public static void main(String[] args) {
        int x = 1;
        int y = 1;

        while (x<25)
        {
           int z = x;
            x = x+y;
            y = z;

        }
        System.out.println(x);
    }
}

