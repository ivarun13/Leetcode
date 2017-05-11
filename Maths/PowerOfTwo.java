public class PowerOfTwo
{
  public boolean solution(int n)
  {
    if(n == 0) return false;
    while(n % 2 == 0)
    {
      n = n/2;
    }
    if(n == 1)
    {
     System.out.print("This is power of two.");
     return true;
    }
    else
    {
     return false;
   }
  }

  public static void main(String[] args) {
    PowerOfTwo p = new PowerOfTwo();
    p.solution(16);
  }
}
