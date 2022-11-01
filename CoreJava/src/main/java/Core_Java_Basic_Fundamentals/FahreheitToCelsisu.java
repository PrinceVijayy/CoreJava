package flowcontroldemo;
/**
 * 
 * @author sv22044
 *FahreheitToCelsisu
 *
 *
 */
import java.util.Scanner;
public class FahreheitToCelsisu {
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Fahrenheit temperature");
		double fah=sc.nextDouble();
		System.out.println("The celsius temperature is :"+celsius(fah));
		sc.close();
		}
		static double celsius(double f) {
		return(f-32)*5/9;
}
}