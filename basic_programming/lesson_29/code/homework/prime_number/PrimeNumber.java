package homework.prime_number;

public class PrimeNumber {

    public boolean isPrime(int n) {
        boolean isPrime = true;
        int div = 2;
        while (div < n/2){
            if(n % div == 0) {
                isPrime = false;
                return isPrime;
            }
            div++;
        }
        return isPrime;
    }
}
