package flowcontroldemo;
import java.util.Scanner;
/**
 * 
 * @author sv22044
 *ReverseNumber
 *
 *
 */
public class ReverseNumber {
public static void main(String[] args) {
	int result=0,remainder;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter any number ...");
	int num=sc.nextInt();
	while(num!=0) {
	remainder=num%10;
	result=(result*10)+remainder;
	num=num/10;
	}
	System.out.println("Reverse of a number is :"+result);
	sc.close();
	}}


