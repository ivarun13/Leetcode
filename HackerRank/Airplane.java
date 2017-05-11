package HackerRank;

import java.util.Stack;

/**
 * Created by varun on 4/7/17.
 */
public class Airplane {

    public static String solution(String command){

        Stack<Integer> Xstack = new Stack<>();
        Stack<Integer> Ystack = new Stack<>();
        Stack<Character> cstack = new Stack<>();
        Xstack.push(0);
        Ystack.push(0);
       // command=command+"A";
        int x=0,y=0,cur = 1;
        String del ="";
        for(int i=0;i<command.length();i++)
        {
            if(command.charAt(0)=='X')
                continue;
            if(command.charAt(i)>='A' && command.charAt(i)<='Z')
            {
//

                if(command.charAt(i) == 'U') {
                    //y = y + cur;
                    //System.out.println(cur);
                    if(!Character.isDigit(command.charAt(i-1))) return "(999,999)";
                    Ystack.push(cur);
                    cstack.push(command.charAt(i));
                }

                else if(command.charAt(i) == 'D'){
                    //y = y+(-cur);
                    //System.out.println(cur);
                    if(!Character.isDigit(command.charAt(i-1))) return "(999,999)";
                    Ystack.push(-cur);
                    cstack.push(command.charAt(i));
                }

                else if(command.charAt(i) == 'L'){
                    //x = x+(-cur);
                    if(!Character.isDigit(command.charAt(i-1))) return "(999,999)";
                    Xstack.push(-cur);
                    cstack.push(command.charAt(i));
                }

                else if(command.charAt(i) == 'R'){
                    //x = x+cur;
                    if(!Character.isDigit(command.charAt(i-1))) return "(999,999)";
                    Xstack.push(cur);
                    cstack.push(command.charAt(i));
                }

                else if(command.charAt(i) == 'X'){
                    if(cstack.isEmpty()) continue;
                    char temp = cstack.pop();

                    if(temp == 'D' || temp == 'U'){
                        int t = Ystack.pop();
                        System.out.println(t);
                    }
                    else if(temp == 'L' || temp == 'R'){
                        int te = Xstack.pop();
                        System.out.println(te);
                    }
                }
                else
                    return "(999,999)";
                cur=1;
            }
            else
            {
                if(cur!=1)
                {
                    cur=(cur*10)+Character.valueOf(command.charAt(i))-48;
                }
                else
                    cur=Character.valueOf(command.charAt(i))-48;
                //System.out.println(Character.valueOf(command.charAt(i))-48);

            }
        }
        int xt = 0;
        for (int i : Xstack){
            xt += i;
        }
        int yt = 0;
        for (int i : Ystack){
            yt += i;
        }
        return "("+xt+", "+yt+")" ;

    }

    public static void main(String[] args) {
        System.out.println(solution("2DUX"));
    }
}
