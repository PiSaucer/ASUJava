package asu.multiplicationtables;
public class MultiplicationTables {

    public static void main(String[] args) {
        int n = 20;
        int maxDigits = ("" + n*n).length();
        System.out.format("%" + (maxDigits + 1) + "s", " ");
        for(int i = 1; i <= n; i++){
            System.out.format("%" + (maxDigits + 1) + "d", i);
        }
        System.out.println("");
        for (int j = 1; j <= n; j++){
            System.out.format("%" + (maxDigits + 1) + "d", j);
            for (int i = 1; i <= n; i++){
                System.out.format("%" + (maxDigits + 1) + "d", i*j);
            }
            System.out.println("");
        }
    }
} 