package _04Assignment;

public class CurrentAccount {
	 Account ac = new Account("123456789","eshwar","8019845075",5000.00);

	    double interstRatePerMonth = 10,res;
	    public void InterstRate(){
	         res = (ac.amont*interstRatePerMonth)/100;
	    }

	    public void AddInterst(){
	        InterstRate();
	        System.out.println("Added Interst Amont is:"+res);
	        res += ac.amont;
	        System.out.println("Total amont is:"+res); 
	    }
}
