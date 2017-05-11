public class IntegerBreak
{
  public int solution(int n)
  {
    int res = 1;
    if(n==2 || n==3)
    {
      return n-1;
    }
    while(n>4)
    {
      n = n -3;
      res = res * 3;
    }
    System.out.println(n*res);
    return n * res;
  }

  public static void main(String[] args) {

  IntegerBreak i = new IntegerBreak();
  i.solution(10);
}
}
