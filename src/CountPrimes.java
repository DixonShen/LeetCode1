/**
 * Created by DixonShen on 2016/3/16.
 * This program count the number of prime numbers less than a non-negative number, n.
 */

public class CountPrimes{

    public static void main(String[] args){

        int c = countPrimes(100);
        System.out.println(c);

    }

    public static int countPrimes(int n){
        int count = 0;

        boolean[] isPrime = new boolean[n];
        for(int i=1;i<n;i++){
            isPrime[i] = true;
        }

        for(int i=2;i*i<n;i++){
            if(!isPrime[i]) continue;
            for(int j=i*i;j<n;j += i){
                isPrime[j] = false;
            }
        }

        for (int i=2;i<n;i++){
            if(isPrime[i]) count++;
        }

        return count;
    }


}
