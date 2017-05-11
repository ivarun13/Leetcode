package Strings;

/**
 * Created by varun on 3/9/17.
 */
public class DetectCapital {

    public static boolean solution(String word) {

        if(word.equals(word.toUpperCase())) {
            return true;
        }
        else if(word.equals(word.toLowerCase())){
            return true;
        }
        else if(Character.isUpperCase(word.charAt(0))){
            if(word.substring(1).equals(word.substring(1).toLowerCase())) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        solution("FlaF");
        solution("fLaf");
        System.out.println(solution("Leetcode"));
    }
}
