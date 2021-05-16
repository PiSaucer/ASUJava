# Java Project: GettingStarted2

**Description:** Some simple exercises to get started in Java programming.

**Create** a new Netbeans project, name it **GettinStarted2**

**Netbeans** > new > project > java application > GettingStarted2

**Type in code:**

```java
/////////////////////////////////////////////////////////
package asu.gettingstarted2;

public class GettingStarted2 {

    public static void main(String[] args) {
        //A = pi r ssquared
        System.out.println("area = " + 3.14 * 5.0 * 5.0);
        double r = 5.0;
        double area = Math.PI * r * r;
        System.out.println("area = " + area);
        System.out.println("max integer = " + Integer.MAX_VALUE);
        System.out.println("max double = " + Double.MAX_VALUE);
    }

}
```

**When it's typed in, click the "Run" arrow**

**Sample Output:**

```txt
area = 78.5
area = 78.53981633974483
max integer = 2147483647
max double = 1.7976931348623157E308
```