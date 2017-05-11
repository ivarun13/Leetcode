package Others;

import java.util.Scanner;

/**
 * Created by varun on 10/2/16.
 */
public class PlaneIntersection {

    public int determinant(int[][] result, int rows, int cols)
    {
        int determinant1 = 0, determinant2 = 0;
        for (int i = 0; i < rows; i++) {
            int temp = 1, temp2 = 1;
            for (int j = 0; j < cols; j++) {
                temp *= result[(i + j) % cols][j];
                temp2 *= result[(i + j) % cols][rows - 1 - j];
            }

            determinant1 += temp;
            determinant2 += temp2;
        }

        return determinant1 - determinant2;
    }

    public static void main(String[] args) {
        PlaneIntersection p = new PlaneIntersection();

        Scanner in = new Scanner(System.in);
        System.out.println("Enter value a,b,c,d values for first plane");
        int a1 = in.nextInt();
        int b1 = in.nextInt();
        int c1 = in.nextInt();
        int d1 = in.nextInt();
        System.out.println("Enter value a,b,c,d values for Second plane");
        int a2 = in.nextInt();
        int b2 = in.nextInt();
        int c2 = in.nextInt();
        int d2 = in.nextInt();
        System.out.println("Enter value a,b,c,d values for Third plane");
        int a3 = in.nextInt();
        int b3 = in.nextInt();
        int c3 = in.nextInt();
        int d3 = in.nextInt();

        int[][] xNum = {
                {d1,b1,c1},
                {d2,b2,c2},
                {d3,b3,c3}
        };
        int[][] yNum = {
                {a1,d1,c1},
                {a2,d2,c2},
                {a3,d3,c3}
        };
        int[][] zNum = {
                {a1,b1,d1},
                {a2,b2,d2},
                {a3,b3,d3}
        };
        int[][] Denom = {
                {a1,b1,c1},
                {a2,b2,c2},
                {a3,b3,c3}
        };

        int x = p.determinant(xNum,3,3)/p.determinant(Denom,3,3);
        int y = p.determinant(yNum,3,3)/p.determinant(Denom,3,3);
        int z = p.determinant(zNum,3,3)/p.determinant(Denom,3,3);

        System.out.println("Intersection of Three planes is :-  "+"("+x+","+y+","+z+")");
    }
}
