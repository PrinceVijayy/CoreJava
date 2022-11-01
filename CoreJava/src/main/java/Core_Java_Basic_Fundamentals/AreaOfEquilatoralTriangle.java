package flowcontroldemo;

import java.util.Scanner;

public class AreaOfEquilatoralTriangle {
    public static void main(String[] args){
    	
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the sides of the circle");
        int sideLength= sc.nextInt();
        System.out.println("The area of the equilateral triangle is"+ Math.sqrt(3)/4*Math.pow(sideLength,2));
        sc.close();
        
    }
}
