import java.util.*;
public class KillingDragons{

  private void minimumFlight(ArrayList<Integer> canyon){
       ArrayList<Integer> flights = new ArrayList<Integer>();
       int lastFlight = 0, currentFlight = 0, selectedIndex = 0;
       int i;
       for(i=0;i<canyon.size();i++){
           if(i > currentFlight) // if the index is beyond current flight then just break out
               break;
           if(i > lastFlight){
               lastFlight = currentFlight;  // update last flight
               flights.add(selectedIndex);
           }
           int sum = i + canyon.get(i);
           if(sum > currentFlight && !isDragon(canyon,sum))
               selectedIndex = i;
           currentFlight = Math.max(currentFlight, sum);           // update current flight
       }
       // if i crosses the last flight and flights are present then add the last selected index
       if((i > lastFlight) && (flights.size() > 0) && flights.get(flights.size()-1) != selectedIndex){
           flights.add(selectedIndex);
       }

       // if last flight index was greater than or equal to last index of array then flight is possible
       if(lastFlight >= canyon.size()-1 && flights.size() != 0){
           for(Integer x : flights)
               System.out.print(x+", ");
           System.out.println("out");
       }
       else
           System.out.println("failure");

   }

   //Function finds if a dragon is present at the location given the array. Basically it checks if the location is 0 or not.
   private boolean isDragon(List<Integer> array, int index) {
     if (index >= array.size() - 1)
        return false;
     return array.get(index) == 0;
   }

   //Function checks if there are any negative numbers in the arraylist.
   private boolean containsNegative(ArrayList<Integer> a){
       for(Integer x: a){
           if(x < 0)
               return true;
       }
       return false;
   }

   public static void main(String args[] ) throws Exception {
       /* Enter your code here. Read input from STDIN. Print output to STDOUT */
       Scanner ip = new Scanner(System.in);
       System.out.println("hello");

//       while(ip.hasNextInt())
//           input.add(ip.nextInt());
//      KillingDragons s = new KillingDragons();
//       if(input.size() == 0)
//           System.out.println("failure");
//       else if(s.containsNegative(input))
//           System.out.println("failure");
//       else
//           s.minimumFlight(input);
       KillingDragons s = new KillingDragons();
       Integer[] temp = {5,6,0,4,2,4,1,0,0,4};
        ArrayList<Integer> input = new ArrayList<>();
       input.addAll(Arrays.asList(temp));
       s.minimumFlight(input);



   }
}
