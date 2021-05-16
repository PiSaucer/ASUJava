---
layout: default
title: GettingStarted1
parent: 01.GettingStarted
nav_order: 1
has_children: false
---

# Java Project: GettingStarted1

**Description:** Some simple java exercises for getting accustomed to the Netbeans interface and simple java code.

**Create** a new Netbeans Project, name it **GettingStarted1**

**Netbeans** > file > new project > choose project: java application ```<next>``` Project Name: GettingStarted ```<finish>```

**Your screen** will now look something like:

```java
/////////////////////////////////////////////////////////

/*
 * To Change this license header, Project Properties.
 * To Change this template file, choose Tools | Templates
 * and open the template in the editior.
 */
package gettingstarted1;

/**
 *
 *
 * @author wwolfe3
 */
public class GettingStarted1 {

    /**
     * @param args the command line arguments
     */
    public static void main (String[] args) {
        //Your java code goes here
    }
} 
/////////////////////////////////////////////////////////
```

**This code will be delted and replaced with the code on the following page.**

**Delete all the above code, replace it with the follow code:**

## Type in code:

```java
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
```

**After clicking the green "Run" arrow on the menu bar you should get an output that looks like the follow (the computer will prompt you to enter a length → try 10)**

## Sample Output:
```txt
Hello World
1 + 2 + 3
6
123
123
33
6
abc
89bc
Please enter the length
10
length = 10
max integer = 2147483647
max double = 1.7976931348623157E308
x = hello there
Z = (
Z = )
Z = *
Z = +
Z = ,
Z = -
Z = .
Z = /
Z = 0
Z = 1
Z = 2
Z = 3
Z = 4
Z = 5
Z = 6
Z = 7
Z = 8
Z = 9
Z = :
Z = ;
Z = <
Z = =
Z = >
Z = ?
Z = @
Z = A
Z = B
Z = C
Z = D
Z = E
Z = F
Z = G
Z = H
Z = I
Z = J
Z = K
Z = L
Z = M
Z = N
Z = O
Z = P
Z = Q
Z = R
Z = S
Z = T
Z = U
Z = V
Z = W
Z = X
Z = Y
Z = Z
Z = [
Z = \
Z = ]
Z = ^
Z = _
Z = `
Z = a
Z = b
Z = c
Z = d
Z = e
Z = f
Z = g
Z = h
Z = i
Z = j
Z = k
Z = l
Z = m
Z = n
Z = o
Z = p
Z = q
Z = r
Z = s
Z = t
Z = u
Z = v
Z = w
Z = x
Z = y
Z = z
Z = {
Z = |
Z = }
Z = ~
Z = 
```
