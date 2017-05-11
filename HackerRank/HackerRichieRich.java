public class HackerRichieRich
{
  public void solution(int n, int k, String number)
  {

    char[] numbers = number.toCharArray();

       for(int i=0,j=numbers.length-1;i<numbers.length/2;i++,j--)
           {
          // System.out.println(numbers[i] + " " + numbers[j]);
           if(numbers[i] == numbers[j])
               {
              // numbers[i] = numbers[j] + 1;
               continue;
           }
           else
               {
               if(k > 0)
                   {
                   if(k==1)
                    {
                   numbers[j] = numbers[i];
                   k--;
                   }
                   else if(k>1)
                       {
                       numbers[j] = '9';
                       numbers[i] = '9';
                       k = k -2;

                   }
               }
          }
       }
       //System.out.println(numbers[5]);
       System.out.println(String.valueOf(numbers));
  }


  public static void main(String[] args) {
    HackerRichieRich h = new HackerRichieRich();
    h.solution(6,3,"092282");
  }
}
