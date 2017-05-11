package HackerRank;
import java.util.*;
/**
 * Created by varun on 4/6/17.
 */
public class BFSShortest {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        for(int i=1;i<=q;i++){
            int n = sc.nextInt();
            Node[] nodes = new Node[n];
            for(int j=0;j<n;j++){
                nodes[j] = new Node(j);
            }
            int e = sc.nextInt();
            for(int k=0;k<e;k++){
                int u = sc.nextInt() - 1;
                int v = sc.nextInt() - 1;

                nodes[u].adjacents.add(nodes[v]);
                nodes[v].adjacents.add((nodes[u]));
            }
            int s = sc.nextInt()-1;
            BFS(s,nodes);
            for (Node nd : nodes){
                if(nd.id == s) continue;
                System.out.print(nd.distance+"\t");
                System.out.println();
            }
        }
        sc.close();
    }

    static void BFS(int s, Node[] nodes){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(s);
        nodes[s].distance = 0;
        while(!queue.isEmpty()){
            int t = queue.poll();
            for(Node n : nodes[t].adjacents){
                if(n.distance < 0){
                    n.distance = nodes[t].distance + 6;
                    queue.add(n.id);
                }
            }
        }
    }
}

class Node{
    int id;
    int distance = -1;
    List<Node> adjacents = new ArrayList<>();
    public Node(int id) {
        this.id = id;
    }
}