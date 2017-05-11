package Strings;

/**
 * Created by varun on 10/2/16.
 */
public class ZigZagConversion {

    public void solution(String s, int numRows)
    {
        int len = s.length();
        char[] c = s.toCharArray();
        StringBuffer[] sb = new StringBuffer[numRows];
        for(int i=0;i<sb.length;i++)
        {
            sb[i] = new StringBuffer();
        }
        int i = 0;
        while(i<len)
        {
            for(int j=0;j<numRows && i<len;j++)
            {
                sb[j].append(c[i]);
                i++;
            }
            for(int j=numRows-2;j>=1 && i<len;j--)
            {
                sb[j].append(c[i]);
                i++;
            }

        }

        for(int id=1;id<sb.length;id++)
        {
            sb[0].append(sb[id]);
        }
        System.out.println(sb[0].toString());

    }


    public static void main(String[] args) {
        ZigZagConversion z = new ZigZagConversion();
        z.solution("paypalishiring",3);
    }
}
