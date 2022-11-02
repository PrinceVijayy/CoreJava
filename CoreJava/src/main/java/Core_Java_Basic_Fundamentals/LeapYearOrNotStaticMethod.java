package flowcontroldemo;
import java.util.Scanner;
/**
 * 
 * @author sv22044
 *LeapYearOrNotStaticMethod
 *
 *
 */
public class LeapYearOrNotStaticMethod 
{

	public static void main(String[] args)
	{
		long year;
	Scanner sc=new Scanner(System.in);
System.out.println("enter any clander year");
year=sc.nextLong();
     leapOrNot(year);
     sc.close();
}
	static void leapOrNot(long year)
	{
		if(year!=0)
		{
			if(year%400==0)
				System.out.println(year+" is a leap year");
			else if(year%100==0)
				System.out.println(year+" is not a leap year");
			else if(year%4==0)
				System.out.println(year+" is a leap year");
			else
				System.out.println(year+" is not a leap year");
		}
		else
			System.out.println("year zero does not exist");
	
	}

}
