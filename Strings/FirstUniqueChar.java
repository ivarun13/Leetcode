public class FirstUniqueChar
{
  public int solution(String s)
  {
    if(s.length() == 0) return -1;
    if(s.length() == 1) return 0;
    int[] chars = new int[256];
    for(int i=0;i<s.length();i++)
    {
      chars[s.charAt(i)]++;
    }
    for(int i=0;i<s.length();i++)
    {
      if(chars[s.charAt(i)] == 1)
      {
        System.out.println(i);
        return i;
      }
    }
   return -1;
  }

  public static void main(String[] args) {
    FirstUniqueChar f = new FirstUniqueChar();
    f.solution("leetcode");
  }
}
