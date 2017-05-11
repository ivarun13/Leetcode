package Strings;

/**
 * Created by varun on 11/6/16.
 */
// Add two string without converting it to integer..
public class AddStrings {

    public String solution(String s1, String s2)
    {
        StringBuilder s = new StringBuilder();
        int carry = 0;
        for(int i=s1.length()-1,j=s2.length()-1;i>=0 || j>=0 || carry==1;i--,j--)
        {
            int x = i<0 ? 0 : s1.charAt(i) - '0';
            int y = j<0 ? 0 : s2.charAt(j) - '0';
            s.append((x+y+carry) % 10);
            carry = (x+y+carry) / 10;
        }
        return s.reverse().toString();

    }

    public static void main(String[] args) {
        AddStrings a = new AddStrings();
        System.out.println(a.solution("101","1010"));
    }
}
