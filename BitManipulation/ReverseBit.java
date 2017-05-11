public class ReverseBit
{
  public int reverseBits(int n) {
        int result  = 0;
        for(int i=0; i<32; i++)
        {
            result += n & 1;
            n = n >>> 1;
            if(i<31) result <<= 1;
         }
         System.out.println(result);
         return result;

    }

    public static void main(String[] args) {
      ReverseBit r = new ReverseBit();
      r.reverseBits(43261596);
    }
}
