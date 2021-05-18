package asu.randomcharacters;
import java.util.Random;
public class RandomCharacters {

    public static void main(String[] args) {
        Random r = new Random();
        int n = 10;
        int p = 1000;
        int maxDigits = ("" + p).length();
        //print nXn block of random integers
        for (int j = 1; j <= n; j++){
            for (int i = 1; i <= n; i++){
                System.out.format("%" + (maxDigits + 1) + "d", r.nextInt(p));
            }
            System.out.println("");
        }
        System.out.println("");
        
        int out;
        
        //print an nxn block of binary bits
        for (int j = 1; j <= n; j++){
            for (int i = 1; i <= n; i++){
                if(r.nextBoolean()){
                    out = 1;
                } else {
                    out = 0;
                }
                System.out.format("%d", out);
            }
            System.out.println("");
        }
        System.out.println("");
        
        //print an nxn block of random letters and digits
        for (int j = 1; j <= n; j++){
            for (int i = 1; i <= n; i++){
                System.out.format("%c", getRandomChar(r, 'A', 'Z'));
                System.out.format("%c", getRandomChar(r, 'a', 'z'));
                System.out.format("%c", getRandomChar(r, '0', '9'));
            }
            System.out.println("");
        }
        System.out.println("");
    }
    
    public static char getRandomChar(Random r, char from, char to) {
        int k = r.nextInt((int)to - (int)from);
        char c = (char) (k + from);
        return c;
    }

}
