package HackerRank;

/**
 * Created by varun on 12/8/16.
 */
public class TrianglePoints {


    public int solution(int x1,int y1,int x2,int y2,int x3,int y3,int p1,int q1,int p2,int q2)
    {
        double A = area (x1, y1, x2, y2, x3, y3);
        double A1 = area (p1,q1, x2, y2, x3, y3);
        double A2 = area (x1, y1, p1,q1, x3, y3);
        double A3 = area (x1, y1, x2, y2,p1,q1);

        double B = area (x1, y1, x2, y2, x3, y3);
        double B1 = area (p2,q2, x2, y2, x3, y3);
        double B2 = area (x1, y1, p2,q2, x3, y3);
        double B3 = area (x1, y1, x2, y2,p2,q2);


        if(A == 0) return 0;
        if((A == A1 + A2 + A3) && (B == B1 + B2 + B3))
        {
            return 3;
        }
        else if((A == A1 + A2 + A3))
        {
            return 1;
        }
        else if((B == B1 + B2 + B3))
        {
            return 2;
        }
        else
        {
            return 4;
        }
    }

    double area(int x1, int y1, int x2, int y2, int x3, int y3)
    {
        return Math.abs((x1*(y2-y3) + x2*(y3-y1)+ x3*(y1-y2))/2.0);
    }

    public static void main(String[] args) {
        TrianglePoints t = new TrianglePoints();
        int result = t.solution(0,0,2,0,4,0,2,2,6,3);
        System.out.println(result);
    }
}
