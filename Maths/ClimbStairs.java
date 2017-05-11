// You are climbing a stair and it takes n steps to reach there
// each time you can either climb 1 or 2 steps. In how many distinct ways you can climb top.
// This program basically follows fibonacci series. But, in this series starting with 1,2 instead 1,1.

public class ClimbStairs
{

  public int solution(int n)
  {
    if(n <= 0) return 0;
    if(n == 1) return 1;
    if(n == 2) return 2;

    int one_step = 2;
    int two_step = 1;
    int result = 0;

    for(int i=2; i<n; i++)
    {
     result = one_step + two_step;
     two_step = one_step;
     one_step = result;
    }
    System.out.println(result);
    return result;
  }

  public static void main(String[] args) {
    ClimbStairs c = new ClimbStairs();
    c.solution(5);
  }
}
