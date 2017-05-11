package Strings;

/**
 * Created by varun on 4/5/17.
 */
public class RemoveDupLetters {

    public static void solution(String s){
        long count = s.chars().distinct().count();
        
    }

    public static void main(String[] args) {
        solution("cbacdcbc");
    }
}
