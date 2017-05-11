public class AnagramStrings
{

  public boolean solution(String s1, String s2)
  {
    int[] result = new int[26];
    for(int i=0;i<s1.length();i++)
    {
      result[s1.charAt(i) - 'a']++;
    }
    for(int i=0;i<s2.length();i++)
    {
      result[s2.charAt(i) - 'a']--;
    }
    for(int i : result)
    {
      if(i != 0)
      {
        System.out.println("this is not anagram");
        return false;
      }
    }
    System.out.println("this is anagram");
    return true;
  }

  public static void main(String[] args) {
    AnagramStrings a = new AnagramStrings();
    String s1 = "anagram";
    String s2 = "naagram";
    a.solution(s1,s2);
  }
}
