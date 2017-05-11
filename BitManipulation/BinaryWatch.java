package BitManipulation;
import java.util.*;
/**
 * Created by varun on 11/5/16.
 */
public class BinaryWatch {

    public void solution(int num)
    {
        List<String> times = new ArrayList<>();
        for (int h=0; h<12; h++)
            for (int m=0; m<60; m++)
                if ((Integer.bitCount(h) + Integer.bitCount(m)) == num)
                    times.add(String.format("%d:%02d", h, m));
        System.out.println(Arrays.toString(times.toArray()));
    }

    public static void main(String[] args) {
        BinaryWatch b = new BinaryWatch();
        b.solution(1);
    }
}
