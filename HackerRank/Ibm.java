package HackerRank;

/**
 * Created by varun on 10/1/16.
 */
public class Ibm {


    public void solution(int n,int p,int q)
    {
        for(int i=1; i<=n; i++)
        {
            if((i%p == 0 || i%q == 0) && (String.valueOf(i/10.0).contains(String.valueOf(p)) || String.valueOf(i/10.0).contains(String.valueOf(q))))
            {
                System.out.print("THINKOUT");
                if(i!=n) System.out.print(",");

            }
            else if(i%p == 0 || i%q == 0)
            {
                System.out.print("OUT");
                if(i!=n) System.out.print(",");
            }
            else if((String.valueOf(i/10.0).contains(String.valueOf(p)) || String.valueOf(i/10.0).contains(String.valueOf(q))))
            {
                System.out.print("THINK");
                if(i!=n) System.out.print(",");
            }
            else
            {
                System.out.print(i);
                if(i!=n) System.out.print(",");
            }
        }
    }

    public static void main(String[] args) {
        Ibm i = new Ibm();
        i.solution(7 ,2,3);
    }
}
