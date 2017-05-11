public class AddDigits
{
  public int solution(int num) {
       int sum = 0;
       while(num>0)
       {
           sum = sum + num%10;

           num = num/10;

           if(num == 0)
           {
             if(sum<10)
             {
               System.out.println(sum);
               return sum;

             }
               num = sum;
               sum = 0;
           }
       }

       return num;
   }
   public static void main(String[] args) {

     AddDigits a = new AddDigits();
     a.solution(555);
   }


}
