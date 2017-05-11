import java.awt.datatransfer.Clipboard;
import java.util.*;

public class Test
{

    int a=5;

    public Test(){
        a = a + 1;
    }

  public static void main(String[] args) {

        Test one = new Test();
      System.out.println(one.a);
      Test one2 = new Test();
      System.out.println(one2.a);

      Date d1 = new Date();
      Date d2 = new Date(d1.getTime());

      try {
          int a = 3/0;
      }
      catch (ArithmeticException e){
          System.out.println("got an exception");
      }
      finally {
          System.out.println("this block should be executed");
      }


  }
}
