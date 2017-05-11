public class HIndex{
  public int hIndex(int[] citations) {
        int len = citations.length;
        if(citations.length == 0) return 0;
        int[] c = new int[len+1];

        for(int i=0;i<len;i++){
            if(citations[i] > len){
                c[len] += 1;
            }
            else{
                c[citations[i]] += 1;
            }
        }
        int total = 0;
        for(int i=len;i>=0;i--){
            total += c[i];
            if(total>=i){
                System.out.println(i);
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
      HIndex h = new HIndex();
      int[] ar = {1,0,3,5,6};
      h.hIndex(ar);
    }
}
