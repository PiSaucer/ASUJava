package asu.factorial;

public class Factorial {

    public static void main(String[] args) {
        int n = 10;
        int factorial = 1;
        
        //first way (without recursion)
        for (int i = 1; i <= n; i++){
            factorial = i * factorial;
        }
        
        System.out.println(n + " factorial (iterative) = " + factorial);
        
        //second way (with recursion)
        factorial = getFactorial(n);
        
        System.out.println(n + " factorial (recursive) = " + factorial);
    }
    
    public static int getFactorial(int n){
        if (n == 0) {
            return 1;
        } 
        return n * getFactorial(n - 1);
    }
}