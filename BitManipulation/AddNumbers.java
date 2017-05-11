public class AddNumbers
{
  public int solution(int a, int b)
  {
     return b == 0 ? a : solution(a^b, (a&b) << 1);
  }

  public static void main(String[] args) {

    AddNumbers a = new AddNumbers();
    System.out.println(a.solution(2,3));
  }
}
