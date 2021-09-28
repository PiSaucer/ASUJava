---
description: >-
  This program prompts the user for a score (0 - 100) and then presents the
  associated letter grade.
---

# GettingStarted3

**Description:** GettingStarted3: This program prompts the user for a score \(0 - 100\) and then presents the associated letter grade.

**Create** a new Netbeans Project, name it **GettingStartede**

**Netbeans** &gt; new &gt; project &gt; java application &gt; GettingStarted3

## Type in code:

```java
package asu.gettingstarted3;

import javax.swing.JOptionPane;

public class GettingStarted3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //yesNoExample();
        //dialogWithIf();
        //dialogCircleArea();
        convertScoreToLetter();
    }

    public static void yesNoExample() {
        JOptionPane.showMessageDialog(null, "OK to continue", "Warning", JOptionPane.WARNING_MESSAGE);
    }

    private static void dialogWithIf(){
        String input = JOptionPane.showInputDialog("Type Something");
        System.out.println("Input = " + input);
        int choice = JOptionPane.showConfirmDialog(null, "Make your choice");
        System.out.println("choice = " + choice);
        if (choice == 0) {
            System.out.println("You chose \"Yes\" ");
        }
        if (choice == 1) {
            System.out.println("You chose \"No\" ");
        }
        if (choice == 3) {
            System.out.println("You chose \"Cancel\" ");
        }
    }

    private static void dialogCircleArea() {
        String radius = JOptionPane.showInputDialog("Please enter the circle radius");
        double r = Double.parseDouble(radius);
        System.out.println("You entered a radius of: " + r);
        System.out.println("Area = " + Math.PI * Math.pow(r, 2));
    }

    private static void convertScoreToLetter() {
        int score = Integer.parseInt(JOptionPane.showInputDialog("Please enter a score (0 - 100):"));
        char letter;
        if (score >= 90){
            letter = 'A';
        } else if (score >= 80){
            letter = 'B';
        } else if (score >= 70){
            letter = 'C';
        } else if (score >= 60){
            letter = 'D';
        } else {
            letter = 'F';
        }
        //System.out.println("Your score of " + score + " earned a grade of " + letter);
        JOptionPane.showMessageDialog(null, "Your score of " + score + " earned a grade of " + letter);
    }

}
```

## Sample Output:

[![JavaProjects\_page-0008.jpg](../.gitbook/assets/JavaProjects_page-0008%20%281%29.jpg)](https://github.com/PiSaucer/ASUJava/tree/f942a9d8a05386943e7d1c396d26a881ba1c942d/docs/bookimages/JavaProjects_page-0008.jpg)

