package Strings;

//Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
public class LengthOfLastword {

    public void solution(String s)
    {
        s = s.trim();
        int count = 0;
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i) != ' ')
            {
                count++;
            }
            else break;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        LengthOfLastword l = new LengthOfLastword();
        l.solution("Hello World Hi!");
    }
}
