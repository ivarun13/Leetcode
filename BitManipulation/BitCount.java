import java.util.*;
public class BitCount {

  public int[] count(int num)
  {
    int[] result = new int[num+1];
    int pow = 1;
    result[0] = 0;
    for(int i=1, t=0; i<=num; i++, t++)
    {
      if(pow == i)
      {
        pow *= 2;
        t = 0;
      }
      result[i] = result[t] + 1;
    }
    System.out.print(Arrays.toString(result));
    return result;
  }

  public static void main(String[] args) {
    BitCount b = new BitCount();
    b.count(16);
  }
}
