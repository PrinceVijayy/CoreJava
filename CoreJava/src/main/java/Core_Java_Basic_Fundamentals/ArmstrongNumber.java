package flowcontroldemo;

import java.util.Scanner;

public class ArmstrongNumber {
	
	static int num;
    public static void main(String[] args) {
    	@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
    	System.out.println("Enter a number");
    	num=sc.nextInt();
    	System.out.println(armStrongNumber(num));
    	if(armStrongNumber(num)==num) {
    		System.out.println("given number is armstrong");
    	}
    	else
    		System.out.println("It is not an amstrong number");
    }
    public static int armStrongNumber(int num) {
    	int sum,a=0;
    	while(num!=0) {
	    	sum=num%10;
	    	a=a+(sum*sum*sum);
	    	num/=10;
    	}
    	return a;
    }
}
