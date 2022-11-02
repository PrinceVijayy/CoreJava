package flowcontroldemo;
import java.util.Scanner;
/**
 * 
 * @author sv22044
 * XStar
 *
 *
 */

public class XStar {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number :");
	int num=sc.nextInt();
	System.out.println("Enter symbol :");
	char c=sc.next().charAt(0);
	int k=num*2-1;
	for(int i=1;i<=k;i++) {
	for(int j=1;j<=k;j++) {
	if(j==i || j==k-i+1)
	System.out.print(c);
	System.out.print(" ");
	}
	System.out.println();
	}
	sc.close();
	}}


