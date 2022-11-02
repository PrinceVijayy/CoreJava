package flowcontroldemo;

import java.lang.Math;
import java.util.Scanner;
public class AreaOfCircle {
    public static void main(String[] args){
        int radius;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        radius= sc.nextInt();
        System.out.println("The area of circle is= "+Math.PI*radius*radius);
        sc.close();
    }
}
