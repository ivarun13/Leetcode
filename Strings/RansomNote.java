public class RansomNote
{
  public boolean solution(String ransomNote, String magazine)
  {
    int[] chars = new int[256];
       int[] chars2 = new int[256];
       for(int i=0;i<magazine.length();i++)
       {
           chars[magazine.charAt(i)]++;
       }
       for(int i=0;i<ransomNote.length();i++)
       {
           chars2[ransomNote.charAt(i)]++;
       }
       for(int i=0;i<ransomNote.length();i++)
       {
           if(chars[ransomNote.charAt(i)] == 0) return false;
           if(chars2[ransomNote.charAt(i)] > chars[ransomNote.charAt(i)])
           {
               System.out.println("false");
               return false;
           }
       }
       System.out.println("true");
       return true;
  }
  public static void main(String[] args) {
    RansomNote r = new RansomNote();
    r.solution("aaa","aabsa");
  }
}
