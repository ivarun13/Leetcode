//package HackerRank;

import java.util.*;

/**
 * Created by varun on 3/13/17.
 */
public class ServiceTitan {

    List<Map<Integer, Set<Integer>>> disjointSet = new ArrayList<Map<Integer, Set<Integer>>>();

    public void create_set(int element)
    {
        Map<Integer, Set<Integer>> map = new HashMap<Integer, Set<Integer>>();
        Set<Integer> set = new HashSet<Integer>();
        set.add(element);
        map.put(element, set);
        disjointSet.add(map);
    }

    public void union(int first, int second)
    {
        int first_rep = find_set(first);
        int second_rep = find_set(second);

        Set<Integer> first_set = null;
        Set<Integer> second_set = null;
        for (int index = 0; index < disjointSet.size(); index++)
        {
            Map<Integer, Set<Integer>> map = disjointSet.get(index);
            if (map.containsKey(first_rep))
            {
                first_set = map.get(first_rep);
            } else if (map.containsKey(second_rep))
            {
                second_set = map.get(second_rep);
            }
        }
        if (first_set != null && second_set != null)
            first_set.addAll(second_set);
        for (int index = 0; index < disjointSet.size(); index++)
        {
            Map<Integer, Set<Integer>> map = disjointSet.get(index);
            if (map.containsKey(first_rep))
            {
                map.put(first_rep, first_set);
            } else if (map.containsKey(second_rep))
            {
                map.remove(second_rep);
                disjointSet.remove(index);
            }
        }
        return;
    }

    public int find_set(int element)
    {
        for (int index = 0; index < disjointSet.size(); index++)
        {
            Map<Integer, Set<Integer>> map = disjointSet.get(index);
            Set<Integer> keySet = map.keySet();
            for (Integer key : keySet)
            {
                Set<Integer> set = map.get(key);
                if (set.contains(element))
                {
                    return key;
                }
            }
        }
        return -1;
    }

    public int getNumberofDisjointSets()
    {
        return disjointSet.size();
    }

    public void solution(String[] zombies){


        for(int i=0;i<zombies.length;i++){
            create_set(i);
        }


        for(int i=0;i<zombies.length;i++){
            for(int j=0;j<zombies[i].length();j++){

                if(i == j) continue;
                if(zombies[i].charAt(j) == '1'){
                    union(i,j);

                }
            }
        }


        System.out.println(getNumberofDisjointSets());
    }

    public static void main(String[] args) {
        String[] zombies = {"1000","0100","0010","0001"};
        ServiceTitan s = new ServiceTitan();
        s.solution(zombies);
    }
}
