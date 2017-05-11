package Arrays;
import java.util.*;

public class ArrayplusOne
{
  public int[] solution(int[] n)
  {
    int carry = 1;
    int[] result = new int[n.length];
    for(int i=n.length-1; i>=0; i--)
    {
      int val = n[i] + carry;
      result[i] = val % 10;
      carry = val / 10;

    }
    if (carry == 1) {
        result = new int[n.length + 1];
        result[0] = 1;
    }
    System.out.print(Arrays.toString(result));
    return result;
  }

  public static void main(String[] args) {

    ArrayplusOne a= new ArrayplusOne();
    int[] n = {9,9};
    a.solution(n);
  }
}
