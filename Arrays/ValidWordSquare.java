package Arrays;

/**
 * Created by varun on 10/15/16.
 */
public class ValidWordSquare {

    public boolean solution(String[] words)
    {

        for(int i=0; i<words.length; i++)
        {
            int count=0;
            while(count<words[i].length()) {
                if (words[i].charAt(count) != words[count].charAt(i)) {
                    System.out.println("false");
                    return false;
                }
                if(words[count].length()-1 <= i) return false;
                count++;

            }
        }
        return true;
    }

    public static void main(String[] args) {
        ValidWordSquare v = new ValidWordSquare();
        String[] words= {"ball","asee","le","le"};
        if(!v.solution(words)) System.out.println("falseasd");
        else System.out.println("true");
    }
}
