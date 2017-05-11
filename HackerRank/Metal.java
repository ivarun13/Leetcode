import java.util.*;
public class Metal
{

  public int solution(int unit_price, int cut_cost, int[] lengths)
  {
    Arrays.sort(lengths);
    int max = lengths[lengths.length-1];
    int max_profit = 0;

    for(int i=1; i<=max;i++)
    {
      int sum = 0;
      int total_rods = 0;
      int total_cuts = 0;

      for(int length : lengths)
      {
        total_rods += length/i;
        total_cuts += (length-1) / i;
      }
      sum = unit_price * total_rods * i - total_cuts * cut_cost;

      max_profit = Math.max(max_profit,sum);

      }
      System.out.println(max_profit);
      return max_profit;
  }

  public static void main(String[] args) {
    Metal m = new Metal();
    int[] lengths= {26,103,59};
    m.solution(10,1,lengths);
  }
}
