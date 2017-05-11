public class countandSay
{
  public String solution(int n)
  {
    String s = Integer.toString(n);
            String mystr = "";
            int count = 1;
            for(int i=0;i<s.length()-1;i++)
            {
                if(s.charAt(i) == s.charAt(i+1))
                {
                    count += 1;
                }
                else
                {

                  mystr = mystr + count + s.charAt(i);
                  count = 1;
                }
            }
            mystr = mystr + count + s.charAt(s.length()-1);
            System.out.println(mystr);
            return mystr;
  }

  public static void main(String[] args) {

    countandSay c = new countandSay();
    c.solution(1233);
  }
}
