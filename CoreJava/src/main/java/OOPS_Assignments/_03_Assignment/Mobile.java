package assignment_3;

import java.util.Scanner;

interface IMobile {
	public void dial();
}

interface ITelephone extends IMobile{
	public void dial();
}

public class Mobile implements ITelephone {

	public void dial() {
		System.out.println("number dailing");
		
	}
	
	public static void main(String[] args) {
		Samsung ssg=new Samsung(566,true,"quad core","airtel",12564875);
		Nokia nok=new Nokia(55356363,false,"quad core","jio",1234667);
		IPhone ip=new IPhone(77347474,true,"quad core","idea",76555676);
		SamsungS5 ssg5=new SamsungS5(777555666,false,"quad core","bsnl",72736735);
		NokiaLumia625 nl=new NokiaLumia625(666367373,true,"quad core","jio",653536636);
		System.out.println("-----------------------");
		System.out.println("1.samsung");
		System.out.println("2.nokia");
		System.out.println("3.iphone");
		System.out.println("4.samsungS5");
		System.out.println("5.NokiaLumia625");
		System.out.println("------------------------");
		
		System.out.println("enter your choice");
		Scanner s=new Scanner(System.in);
		int choice=s.nextInt();
		switch(choice){
		case 1:System.out.println("samsung details:");
		       System.out.println("iemi code:"+ssg.iemiCode);
		       System.out.println("is single sim"+ssg.isSingleSIM);
		       System.out.println("processor"+ssg.processor);
		       System.out.println("sim card:"+ssg.simCard);
               System.out.println("mobile no:"+ssg.mobileNo);
               ssg.connectBlueTooth();
               ssg.dial();
               ssg.getWIFIConnection();
               ssg.getIEMICode();
               ssg.receive();
               ssg.sendMessage();   
               break;
		case 2:System.out.println("nokia details:");
	           System.out.println("iemi code:"+nok.iemiCode);
	           System.out.println("is single sim"+nok.isSingleSIM);
	           System.out.println("processor"+nok.processor);
	           System.out.println("sim card:"+nok.simCard);
               System.out.println("mobile no:"+nok.mobileNo);
               nok.connectBlueTooth();
               nok.dial();
               nok.getWIFIConnection();
               nok.getIEMICode();
               nok.receive();
               nok.sendMessage();
               break;
		case 3:System.out.println("iphone details:");
                System.out.println("iemi code:"+ip.iemiCode);
                System.out.println("is single sim"+ip.isSingleSIM);
                System.out.println("processor"+ip.processor);
                System.out.println("sim card:"+ip.simCard);
                System.out.println("mobile no:"+ip.mobileNo);
                ip.connectBlueTooth();
                ip.dial();
                ip.getWIFIConnection();
                ip.getIEMICode();
                ip.receive();
                ip.sendMessage();
                break;
		case 4:System.out.println("samsung s5 details:");
        		System.out.println("iemi code:"+ssg5.iemiCode);
        		System.out.println("is single sim"+ssg5.isSingleSIM);
        		System.out.println("processor"+ssg5.processor);
        		System.out.println("sim card:"+ssg5.simCard);
        		System.out.println("mobile no:"+ssg5.mobileNo);
        		ssg5.connectBlueTooth();
        		ssg5.dial();
        		ssg5.getWIFIConnection();
        		ssg5.getIEMICode();
        		ssg5.receive();
        		ssg5.sendMessage();
        		break;
		case 5:System.out.println("nokialumia625 details:");
		       System.out.println("iemi code:"+nl.iemiCode);
		       System.out.println("is single sim"+nl.isSingleSIM);
		       System.out.println("processor"+nl.processor);
		       System.out.println("sim card:"+nl.simCard);
		       System.out.println("mobile no:"+nl.mobileNo);
		       nl.connectBlueTooth();
		       nl.dial();
		       nl.getWIFIConnection();
		       nl.getIEMICode();
		       nl.receive();
		       nl.sendMessage();
		       break;
		default:System.out.println("enter valid choice");

		}
	}

}
