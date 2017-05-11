public class ExcelColNum
{
  public int solution(String s)
  {
    int length = s.length();
    int count  = 0;
    for(int i=0; i<length; i++)
    {
      count += ((s.charAt(i) - 'A' + 1) * Math.pow(26,length-1-i));
    }
    System.out.println(count);
    return count;
  }

  public static void main(String[] args) {
    ExcelColNum e = new ExcelColNum();
    e.solution("BG");
  }
}
