package BitManipulation;

/**
 * Created by varun on 3/6/17.
 */
public class NumberCompliment {

    public static void solution(int num){

        double i=0;
        int j=0;

        while (i < num){
            i = i + Math.pow(2,j);
            j++;
        }
        System.out.println(i - num);
    }

    public static void main(String[] args) {
        solution(5);
    }
}
