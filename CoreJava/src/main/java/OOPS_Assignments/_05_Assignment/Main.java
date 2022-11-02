package assignment_5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Fare fare = new Fare();
		SeasonalPass sp = new SeasonalPass();
		OneTime ot = new OneTime();
		FreePass free = new FreePass();
		StudentSeasonalPass ssp = new StudentSeasonalPass();
		ChildPass cp = new ChildPass();
		AdultPass  ap = new AdultPass ();
		PhisicallyHandicapped php = new PhisicallyHandicapped();
		SeniorsPass sep = new SeniorsPass();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Choice:");
		System.out.println(" 1: Fare:");
		System.out.println(" 2 : SeasonalPass:");
		System.out.println(" 3 : OneTimePass:");
		System.out.println(" 4 :FreePass:");
		System.out.println(" 5 : StudentSeasonalPass:");
		System.out.println(" 6 : ChildPass:");
		System.out.println(" 7 : FreePass:");
		System.out.println(" 8 : AdultPass:");
		System.out.println(" 9 : PhysicallyHandicappedPass:");
		System.out.println(" 10 : SeniorsPass:");
		 
		int n = sc.nextInt();
		
		
			switch(n){
			case 1:fare.PrintFare();
					break;
			case 2:sp.printSeaonalPass();
					break;
			case 3:ot.printOneTimePass();
					break;
			case 4:free.printFreePass();
					break;
			case 5:ssp.printStudentSeasonalPass();
					break;
			case 6:cp.printChildPass();
					break;
			case 7:free.printFreePass();
					break;
			case 8:ap.printAdultPass();
					break;
			case 9:php.printPhysicallyHandicappedPass();
					break;
			case 10:sep.printSeniorsPass();
					break;
			default:System.out.println("please enter the valid number");
			}
		
	}

}
