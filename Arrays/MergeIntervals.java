package Arrays;
import java.util.*;

/**
 * Created by varun on 3/22/17.
 */
public class MergeIntervals {

    public static void solution(List<Interval> intervalList){
        List<Interval> result = new ArrayList<>();
        Collections.sort(intervalList, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start - o2.start;
            }
        });
        int s = intervalList.get(0).start;
        int e = intervalList.get(0).end;

        for(int i=0;i<intervalList.size()-1;i++){
            if(e >= intervalList.get(i+1).start){
                e = Math.max(intervalList.get(i+1).end,e);
                System.out.println(e);
            }
            else {
                result.add(new Interval(s,e));
                s = intervalList.get(i+1).start;
                e = intervalList.get(i+1).end;
            }
        }
        result.add(new Interval(s,e));
        for(Interval i : result){
            System.out.println(i.start+"and"+i.end);
        }
    }

    public static void main(String[] args) {
        Interval i1 = new Interval(2,3);
        Interval i2 = new Interval(4,5);
        Interval i3 = new Interval(6,7);
        Interval i4 = new Interval(8,9);
        Interval i5 = new Interval(1,10);
        List<Interval> list = new ArrayList<>();
        list.addAll(Arrays.asList(i1,i2,i3,i4,i5));
        solution(list);
    }
}

class Interval {
    int start;
    int end;
    Interval() { start = 0; end = 0; }
    Interval(int s, int e) { start = s; end = e; }
  }

