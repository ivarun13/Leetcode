public class MaxSubArray
{
  public int solution(int[] n)
  {
    int res = 0;
    int result = Integer.MIN_VALUE;
    for(int i=0;i<n.length;i++)
    {
       res += n[i];
       result = Math.max(result,res);
       if(res<0) res = 0;
    }
    System.out.print(result);
    return result;
  }

  public static void main(String[] args) {

    MaxSubArray m = new MaxSubArray();
    int[] n = {-2,4,1,-1};
    m.solution(n);
  }
}
