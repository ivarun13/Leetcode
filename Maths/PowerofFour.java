public class PowerofFour
{
  public boolean solution(int n)
  {
    return Integer.toBinaryString(n).matches("1(00)*");
  }

  public static void main(String[] args) {
    PowerofFour p = new PowerofFour();
    if(p.solution(16))
    {
      System.out.println("power of four");
    }
  }
}
