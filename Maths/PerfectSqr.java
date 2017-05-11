public class PerfectSqr
{
  public boolean isperfectSquare(int num)
  {
     int i = 1;
     while(num > 0)
     {
       num -= i;
       i += 2;
     }
     if(num == 0) System.out.print("It is perfect square");
     return num == 0;

  }

  public static void main(String[] args) {

    PerfectSqr p = new PerfectSqr();
    p.isperfectSquare(16);
  }
}
