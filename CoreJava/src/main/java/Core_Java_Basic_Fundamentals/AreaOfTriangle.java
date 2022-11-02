package flowcontroldemo;
/**
 * 
 * @author sv22044
 *AreaOfCircleTriangle
 *
 *
 */
import java.util.Scanner;
public class AreaOfTriangle {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the side of the Triangle:");
	double a=sc.nextDouble();
	double area=(Math.sqrt(3)/4)*(a*a);
	System.out.println("Area of Triangle is:" +area);
	sc.close();
	}
}

