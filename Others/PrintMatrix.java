package Others;

/**
 * Created by varun on 12/11/16.
 */
public class PrintMatrix {

    public void solution()
    {
        int j = 0;
        while(j<4) {
            for (int i = 1; i < 5; i++) {
                int k = i+j;
                if(k > 4) k -= 4;
                System.out.print(k+" ");
            }
            System.out.println();
            j++;
        }
    }

    public static void main(String[] args) {
        PrintMatrix p = new PrintMatrix();
        p.solution();
    }
}
