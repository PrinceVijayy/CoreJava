package flowcontroldemo;

import java.util.Scanner;

public class Factorial {
	static int n,fact=1;
    public static void main(String[] args){
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter a number");
    	n=sc.nextInt();
        System.out.println(fact(n));
        sc.close();
    }
    public static int fact(int n) {
    	
    	for(int i=n;i>=1;i--) {
    		fact=fact*i;
    	}
    	return fact;
    }
}
