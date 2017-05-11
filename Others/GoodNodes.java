package Others;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by varun on 10/28/16.
 */
public class GoodNodes {


    public void solution(int[] points_to)
    {
        int count = 0;
        List<Integer> goodnodes = new ArrayList<>();
        goodnodes.add(1);


        for(int i=1;i<points_to.length;i++)
        {
            if(points_to[i] == 1)
            {
                goodnodes.add(i+1);
            }
        }
        for(int i=1;i<points_to.length;i++)
        {
            if((!goodnodes.contains(points_to[i])))
            {
               count = count + 1;
                goodnodes.add(points_to[i]);
            }
            else
            {
                goodnodes.add(i+1);
            }
        }
        System.out.println(count);
    }


    public static void main(String[] args) {
        GoodNodes g = new GoodNodes();
        int[] points_to = {1,1,2,3};
        g.solution(points_to);
    }
}
