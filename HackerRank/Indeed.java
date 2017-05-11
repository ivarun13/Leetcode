package HackerRank;

/**
 * Created by varun on 3/9/17.
 */

import com.sun.corba.se.impl.orbutil.graph.Graph;

import java.util.*;

public class Indeed {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Map<Integer,Integer> map = new HashMap<>();
        Map<Integer,List<Integer>> ParentMap = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            map.put(i,a);
            List<Integer> list = ParentMap.get(b);
            if(list == null){
                list = new ArrayList<>();
                ParentMap.put(b,list);
            }
            list.add(i);
        }

        Queue<Integer> q = new LinkedList();
        q.add(0);
        while(!q.isEmpty()){
            int current = q.remove();
            if(ParentMap.get(current) != null){
            for(int i : ParentMap.get(current)){
                q.add(i);
                if(map.get(i) > map.get(current)) {
                    map.put(i, map.get(current));
                }
            }}
        }
        int sum = 0;
        for (Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            sum += entry.getValue();
        }
        System.out.println(sum);
    }
}
