public class OneBitCount
{
  public int count(int n)
  {
    int ones = 0;
    while(n != 0)
    {
      ones += n & 1;
      n = n >>> 1;
    }
    System.out.print(ones);
    return ones;
  }

  public static void main(String[] args) {
    OneBitCount b = new OneBitCount();
    b.count(2048);
  }
}
