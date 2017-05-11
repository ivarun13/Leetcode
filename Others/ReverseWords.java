package Others;

/**
 * Created by varun on 10/2/16.
 */
public class ReverseWords {

    public String reverse(String s)
    {
        StringBuffer str = new StringBuffer();
        String[] parts = s.split(" ");
        for(int i=parts.length-1; i>=0; i--)
        {
            str.append(parts[i]+" ");
        }
        System.out.println(str);
        return str.toString();
    }

    public static void main(String[] args) {
        ReverseWords r = new ReverseWords();
        r.reverse("my name is varun patel");
    }
}
