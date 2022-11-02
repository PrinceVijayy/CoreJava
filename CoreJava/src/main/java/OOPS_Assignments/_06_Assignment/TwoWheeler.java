package assignment_6;

import java.util.Scanner;

public class TwoWheeler extends Vehicle {

	
	public TwoWheeler(String regNumber) {
		super(regNumber);
		
	}

	@Override
	public int getNumberOfWheels() {
		
		return 2;
	}

}
class Bike extends TwoWheeler{

	public Bike(String regNumber) {
		super(regNumber);
		if(regNumber.equals(getRegNumber())){
			System.out.println("no.of wheels for the vehicle"+getNumberOfWheels());	
			System.out.println("registered vehicle is bike");
	}
		else
			System.out.println("enter valid reg number");
		
		
	}
	
	
}