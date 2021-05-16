package asu.ascii;

public class ASCII {

    public static void main(String[] args) {
        //note: Greek upper case: 945 --> 937
        //  Greek lower case: 945 --> 969
        int start = 0;   // start should equal 0 or 9728
        int stop = 128;    // stop should equal 128 or 9839
        int maxDigits = ("" + stop).length() + 1;
        int maxBinaryDigits = convertToBinary(stop).length() + 1;
        for(int i = start; i <= stop; i++){
            System.out.format("%3s", (char)i);
            System.out.format("%" + maxDigits + "s", i);
            System.out.format("%" + maxBinaryDigits + "s", convertToBinary(i));
            System.out.println("");
        }
        System.out.format("%3s", (char)9728);
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
