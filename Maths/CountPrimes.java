package Maths;


public class CountPrimes {

    public void solution(int n)
    {
        int count = 0;
        boolean[] primes = new boolean[n];
        for(int i=2; i<n; i++)
        {
            if(primes[i] == false) count++;
            for(int j=2; i*j<n; j++)
            {
                primes[i*j] = true;
            }
        }
        System.out.println(count);
    }


    public static void main(String[] args) {
        CountPrimes c = new CountPrimes();
        c.solution(100);
    }
}
