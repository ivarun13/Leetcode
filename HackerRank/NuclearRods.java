package HackerRank;



/**
 * Created by varun on 11/27/16.
 */
public class NuclearRods {

    public static void main(String[] args) {
        NuclearRods n = new NuclearRods();
        String[] pairs = {"8 1","5 8","7 3","8 6"};

        DisjointUnionSets dus =
                new DisjointUnionSets(8);

        for(String s : pairs)
        {
            String[] parts = s.split(" ");
            dus.union(Integer.parseInt(parts[0]),Integer.parseInt(parts[1]));
        }

        dus.getIt();
    }
}
