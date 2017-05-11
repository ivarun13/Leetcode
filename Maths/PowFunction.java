public class PowFunction
{

  public int solution(int x, int n)
  {
     if(n == 0 ) return 1;
      if(n < 0)
      {
        x = 1/x;
        n = -n;
      }
      int result = solution(x,n/2);
      if(n%2 == 0) return result*result;
      else return x * result * result;
  }

  public static void main(String[] args) {
    PowFunction p = new PowFunction();
    System.out.print(p.solution(2,11));
  }
}
