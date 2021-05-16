package asu.gettingstarted4;

public class GettingStarted4 {

    public static void main(String[] args) {
        //area of a circle;
        double radius = 10;
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("area = " + area);
        
        //circumference of a circle
        double c = 2 * Math.PI * radius;
        System.out.println("c = " + c);
        
        //area of a triangle
        double base = 10;
        double height = 3;
        area = 0.5 * base * height;
        System.out.println("area of triangle = " + area);
        
        //f to c;
        double f;
        for(f = 0.0; f <= 212; f = f +1){
            double celsius = 5.0/9.0 * (f - 32);
            System.out.println("f = " + (int)f + " c = " + (int)celsius);
        }
        
        for(int i = 4000; i < 4128; i++){
            System.out.println((char)i);
        }
    }
}
