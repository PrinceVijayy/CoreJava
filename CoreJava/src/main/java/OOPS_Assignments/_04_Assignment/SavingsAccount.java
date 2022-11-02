package _04Assignment;

public class SavingsAccount{

	Account ac = new Account("123456789","eshwar","8019845075",5000.0);

	    double interstRatePerMonth = 5,res;
	    public void InterstRate(){
	        res = (ac.amont*interstRatePerMonth)/100;
	        //System.out.println("is"+res);
	    }

	    public void AddInterst(){
	        InterstRate();
	        System.out.println("Added Interst Amont is:"+res);
	        res += ac.amont;
	        System.out.println("Total amont is:"+res); 
	    }
}
