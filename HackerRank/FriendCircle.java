package HackerRank;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by varun on 4/1/17.
 */
public class FriendCircle {

    public void solution(int[][] M){
        int count = 0;
        for(int i=0;i<M.length;i++){
            if(M[i][i] == 1){
                count++;
                BFS(i,M);
            }
        }
        System.out.println(count);
    }

    public void BFS(int id,int[][] M){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(id);
        while(queue.size() > 0){
            for(int i=0;i<queue.size();i++){
                int t = queue.poll();
                M[t][t] = 2;
                for(int j=0;j<M[0].length;j++){
                    if(M[t][j] == 1 && M[j][j] == 1){
                        queue.add(j);
                    }
                }
            }

        }
    }


    public static void main(String[] args) {
        int[][] M = {{1,1,0},
                {1,1,0},
                {0,0,1}};
        FriendCircle f = new FriendCircle();
        f.solution(M);
    }
}
