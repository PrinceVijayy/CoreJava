package _04Assignment;

public class CheckingAccount {
	 int NoOfFreeTransactions = 3;
	    Account ac = new Account("123456789","eshwar","8019845075",5000.00);
	    {
		    for(int i=0;i<=5;i++) {
		        if(i>=2) {
		            ac.amont = 50-ac.amont;
		        }else if(i>=5) {
		            ac.amont = 100-ac.amont;
		        }
		    }
	    }
}
