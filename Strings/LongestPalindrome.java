public class LongestPalindrome
{
  int max_length = 0;
  int first;
  public String solution(String s)
  {
    if(s.length() < 2) return s;

    for(int i=0; i<s.length()-1; i++)
    {
      getPalindrome(s,i,i);
      getPalindrome(s,i,i+1);
    }

   System.out.println(s.substring(first, first+max_length));
   return s.substring(first, first+max_length);
  }

   public void getPalindrome(String s, int j, int k)
   {
      while(j>=0 && k<s.length() && s.charAt(j) == s.charAt(k))
      {
        j--;
        k++;
      }
      if(max_length < k-j-1)
      {
        first = j+1;
        max_length = k-j-1;
      }
   }


  public static void main(String[] args) {
    LongestPalindrome l = new LongestPalindrome();
    l.solution("abcdcbefgfd");
  }
}
