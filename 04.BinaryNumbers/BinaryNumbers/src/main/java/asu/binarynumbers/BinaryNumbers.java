package asu.binarynumbers;

public class BinaryNumbers {

    public static void main(String[] args) {
        int n = 2015;
        String nBinary = convertToBinary(n);
        int maxDigits = nBinary.length();
        int p = 10; // numbers per line
        for (int i = 1; i <= n; i++){
            System.out.format("%" + (maxDigits + 1) + "s", convertToBinary(i));
            if((i % p) == 0) {
                System.out.println("");
            }
        }
    }
    
    public static String convertToBinary(int k){
        String binary = "";
        while (k > 0) {
            if (k % 2 == 1){
                binary = 1 + binary;
            } else {
                binary = 0 + binary;
            }
            k = k / 2;
        }
        return binary;
    }

}
