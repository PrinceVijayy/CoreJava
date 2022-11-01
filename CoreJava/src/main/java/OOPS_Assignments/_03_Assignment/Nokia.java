package assignment_3;

import java.util.Scanner;

public class Nokia extends Mobile {
	long iemiCode;
	boolean isSingleSIM;
	String processor;
	String simCard;
	long mobileNo;

	public Nokia(long iemiCode, boolean isSingleSIM, String processor, String simCard, long mobileNo) {
		this.iemiCode = iemiCode;
		this.isSingleSIM = isSingleSIM;
		this.processor = processor;
		this.simCard = simCard;
		this.mobileNo = mobileNo;
	
	}
		
	public void connectBlueTooth(){
		System.out.println("bluetooth connected");
	}
	public void dial(){
		System.out.println("number dialing");
	}
	 public void getIEMICode(){
		 System.out.println("iemi code for nokia:"+iemiCode);
	 }
	 public void getWIFIConnection(){
		System.out.println("wifi connected");
	 }
	 public void receive(){
		 System.out.println("message received");
	 }
	
	public void sendMessage(){
		
		 System.out.println("message sent");
		 
	 }
}

