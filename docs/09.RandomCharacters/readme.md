# Java Project: RandomCharacters

**Description:** Print random characters of all sorts.

**Netbeans** > file > new project > project > java application > next > Project Name: RandomCharacters > finish

## Code
```java
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
```
## Output
```txt
  465  187   51  737  953  408  407  255  828  747
  613  625  597  225  854  799  116  325  215  782
  721  612  232   68  216  399  898  883  343  870
  936  189  945  966  532  146  631  191   91  104
  853  356  274  135   96  959   63  255  383  320
  789  705  279  146  263  136  904  795  381  642
  781  622  668   78  241  727  328  332  212  402
  245  811  702  592  979  643  178  335  368  712
  267  140  103  199  309  576    6  712  154  268
  533  928  693  779  418  682  363  195   90  194

0110000110
0010110101
0011111000
1100010001
1111011001
0111010000
1111110100
0111100011
1000111110
0100110110

Hd0Ja7Qj1Am5Ya6Eg1Wi7An5Pm0Qr1
Po6Ec7Ls6Rh1Ja2Ny2Jw6Hr5Aq5Xy5
Jg8Kj5Tg6Gk8Tq4Ig1Jm5Jq0Eg4Lr6
Lb5Ml3Wu4Ef4Da7Ab2Wi0Cx8Uu3Fi4
Vj0At8Bf7Cu6Go8Ea7Xo1Ss4La7Hv0
Ha1Yx5Sr2Cy1Mi5Da5Qw5Hv6Ll1Tq0
Uf4Vx6Wj1Rg8Ia1Ry8Jp7Qv1Un8Ty5
Qx1Hx6Fr6Bv7Pl2Iq8Fi6El7Vv3Pc5
Xp6Iu3Af0Qb5Rv3Cg0Rf8Yw0Hs7Al7
Cr7Ab7Mq2Ub4Vw0He0Ep6Qm7In0Ds5
```