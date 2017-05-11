import java.util.*;
public class BullNCow
{

  public String solution(String secret, String guess)
  {
    int a=0,b=0;
    int[] numbers = new int[10];
    for(int i=0; i<secret.length(); i++)
    {
      int s = Character.getNumericValue(secret.charAt(i));
        int g = Character.getNumericValue(guess.charAt(i));
      if(s == g) a++;
      else{
        if(numbers[s] < 0) b++;
        if(numbers[g] > 0) b++;
        numbers[s]++;
        numbers[g]--;
      }
    }
     System.out.print(+a+ "A" +b + "B");
      return +a+ "A" +b + "B";
  }

  public static void main(String[] args) {
    BullNCow b = new BullNCow();
    b.solution("1807","7810");
  }
}
