package asu.primenumbers;
public class PrimeNumbers {

    public static void main(String[] args) {
        int n = 10000;
        int maxDigits = ("" + n).length();
        int p = 10;
        for (int i = 1; i <= n; i++){
            if (isPrime(i)){
                System.out.format("%" + (maxDigits + 1) + "d", i);
            } else {
                System.out.format("%" + (maxDigits + 1) + "s", "*");
            }
            if ( (i % p) == 0) System.out.println("");
        }
    }
    
    public static boolean isPrime(int p){
        boolean value = true;
        if (p == 1) return false;
        for (int i = 2; i <= p / 2; i++){
            if (p % i == 0){
                value = false;
            }
        }
        return value;
    }

}
