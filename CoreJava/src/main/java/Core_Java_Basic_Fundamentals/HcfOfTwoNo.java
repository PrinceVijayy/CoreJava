package flowcontroldemo;
import java.util.Scanner;
/**
 * 
 * @author sv22044
 *HcfOfTwoNo
 *
 *
 */
public class HcfOfTwoNo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first value");
		int n1=sc.nextInt();
		System.out.println("enter second value");
		int n2=sc.nextInt();
		int result=hcfCal(n1,n2);
		System.out.println("HCF of "+n1+" and "+n2+" is :"+result);
		sc.close();
		}
		static int hcfCal(int a,int b) {
		int temp;
		if(b>0) {
		temp=b;
		b=a%b;
		a=temp;
		}
		return b;
		}
		}
