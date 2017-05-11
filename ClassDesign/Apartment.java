package ClassDesign;

/**
 * Created by varun on 12/10/16.
 */
public class Apartment {


        int bed;
        double bath;

        public int getBed() {
            return bed;
        }

        public void setBed(int bed) {
            this.bed = bed;
        }

        public double getBath() {
            return bath;
        }

        public void setBath(int bath) {
            this.bath = bath;
        }

        public Apartment(int bed, double bath){
            this.bed = bed;
            this.bath = bath;
        }


 }

