package asu.gettingstarted1;
import java.util.Scanner;

public class GettingStarted1 {

    public static void main(String[] args) {
        System.out.println("Hello World");
        
        System.out.println("1 + 2 + 3");
        System.out.println(1 + 2 + 3);
        System.out.println("1" + 2 + 3);
        System.out.println(1 + "2" + 3);
        System.out.println(1 + 2 + "3");
        System.out.println(1 + 2 + 3);
        
        System.out.println("a"+ "b" + "c");
        
        int a = 89;
        System.out.println(a + "b" + "c");
        
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the length");
        int length = input.nextInt();
        System.out.println("length = " + length);
        System.out.println("max integer = " + Integer.MAX_VALUE);
        System.out.println("max double = " + Double.MAX_VALUE);
        
        String x = "hello";
        x = x + " there";
        System.out.println("x = " + x);
        
        char z = 10036;
        for(int i = 40; i < 128; i++){
            System.out.println("Z = " + (char) i);
        }
    }

}
