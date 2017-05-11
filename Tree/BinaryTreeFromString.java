package Tree;

import java.util.Stack;

/**
 * Created by varun on 3/12/17.
 */


public class BinaryTreeFromString {

    public static void solution(String s){
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 =  new Stack<>();
        char[] chars = s.toCharArray();

        for(char c : chars){
            if(c == '(') {
                stack1.push(')');
            }

        }
    }
    public static void main(String[] args) {
        solution("4(2(3)(1))(6(5))");
    }
}
