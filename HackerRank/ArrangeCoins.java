package HackerRank;

/**
 * Created by varun on 11/2/16.
 */
public class ArrangeCoins {

    public void solution(long[] coins)
    {
        for(int i=0;i<coins.length;i++)
        {
            long j=1;
            int count = 0;
            while(coins[i]>0)
            {
                coins[i] = coins[i] - j;
                j++;
                if(coins[i] >= 0) count++;
            }
            System.out.println(count);
        }
    }

    // Another solution by wuadratic equations.....
  // return (int) ((Math.sqrt(1 + 8.0 * n) - 1) / 2);
    public static void main(String[] args) {
        ArrangeCoins a = new ArrangeCoins();
        long[] coins = {2,5,8,3};
        a.solution(coins);
    }
}
