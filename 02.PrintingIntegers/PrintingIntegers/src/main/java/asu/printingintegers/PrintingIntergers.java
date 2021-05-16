package asu.printingintegers;

import java.util.Scanner;

public class PrintingIntergers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a value of n:");
        int n = input.nextInt();
        String nString = "" + n; //length of n treated as string
        int maxDigits = nString.length();
        System.out.println("How many intergers per line?");
        int p = input.nextInt();
        System.out.println("Which digit, and its multoples, to skip?");
        int m = input.nextInt();
        for (int i = 1; i < n; i++){
            if( ((i%m) == 0) || hasM(i,m) ){
                int iLength = ("" + i).length();
                String stars = getStars(iLength);
                System.out.format("%" + (maxDigits + 1) + "s", stars);
            } else {
                System.out.format("%" + (maxDigits + 1) + "d", i);
            }
            if (i % p == 0){
                System.out.println("");
            }
        }
        System.out.println("");
        System.out.println("");
    }
    
    public static String getStars(int p){
        String stars = "";
        for(int k = 0; k < p; k++){
            stars += "*";
        }
        return stars;
    }
    
    public static boolean hasM(int i, int m){
        char c = String.format("%s", m).charAt(0);
        String x = "" + i;
        return x.indexOf(c) >= 0;
    }

}
