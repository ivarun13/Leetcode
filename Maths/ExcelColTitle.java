package Maths;

/**
 * Created by varun on 10/22/16.
 */
public class ExcelColTitle {

    public void solution(int n)
    {
        StringBuilder str = new StringBuilder();
        while(n>0)
        {
            n--;
            str.insert(0,(char) ('A' + n%26));
            n /= 26;
        }
        System.out.println(str.toString());
        System.out.println((char) ('A' + 1));

    }

    public static void main(String[] args) {
        ExcelColTitle e = new ExcelColTitle();
        e.solution(62);
    }
}
