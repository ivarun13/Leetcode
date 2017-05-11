public class TimeInterval
{
  public String interval(String s1, String s2)
  {
    int m = 12;
    int d = 30;
    int diffY, diffM, diffD;
    String[] date1 = s1.split("-");
    String[] date2 = s2.split("-");
    diffY = Integer.parseInt(date2[0]) - Integer.parseInt(date1[0]);
    diffM = Integer.parseInt(date2[1]) - Integer.parseInt(date1[1]);
    diffD = Integer.parseInt(date2[2]) - Integer.parseInt(date1[2]);
    if(Integer.parseInt(date2[1]) < Integer.parseInt(date1[1]))
    {
      diffY--;
      diffM = 12 + diffM;
    }
    if(Integer.parseInt(date2[2]) < Integer.parseInt(date1[2]))
    {
      diffM--;
      diffD = 30 + diffD;
    }

    System.out.println(diffY+"Years,"+diffM+"months,"+diffD+"days.");
    return null;
  }
  public static void main(String[] args) {
    TimeInterval t = new TimeInterval();
    t.interval("1978-09-13", "2010-09-13");
  }

// @Test
// public void TestInterval()
// {
//   String result = TimeInterval.interval("1978-09-13", "2010-09-13");
//   Assert.equals("32Years,0months,0days",result);
// }
}
