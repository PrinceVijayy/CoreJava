package BusTicketManagementSystem.bms.Menu;

import BusTicketManagementSystem.bms.DAO.BusDAOImp;
import BusTicketManagementSystem.bms.model.Bus;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class BusDetails {
    static Scanner sc = new Scanner(System.in);
    static BusDAOImp obj = new BusDAOImp();
    static int count=0;
    public static void dataDemo(){
        count++;
        if(count==1){
        obj.dataBase();
        }
    }
    public static void rootAdminMainMenu(){
        System.out.println("---------------------------");
        System.out.println("|   ROOT ADMIN MAIN MENU  |");
        System.out.println("---------------------------");
        System.out.println("|   1. ADD ADMIN          |");
        System.out.println("|   2. VIEW ADMIN         |");
        System.out.println("|   3. VIEW ALL ADMINS    |");
        System.out.println("|   4. UPDATE ADMIN       |");
        System.out.println("|   5. DELETE ADMIN       |");
        System.out.println("|   6. BACK               |");
        System.out.println("---------------------------");
        System.out.println("Enter Your Choice ?");
        int choice1 = sc.nextInt();
        switch (choice1) {
            case 1:
                obj.addAdmin();
                rootAdminMainMenu();
                break;
            case 2:
                System.out.println("enter Admin ID");
                Bus searchAdmin = obj.viewAdmin(sc.nextInt());
                if(searchAdmin!= null) {
                    System.out.println("--------------------------------------------------------------");
                    System.out.println("AdminID" + "\t" + "AdminUsername" + "\t" + "AdminPassword");
                    System.out.println("--------------------------------------------------------------");
                    System.out.println(searchAdmin.toStringAdmin());
                }
                else
                    System.out.println("Admin not found");
                rootAdminMainMenu();
                break;
            case 3:
                List<Bus> admins = obj.viewAllAdmins();
                System.out.println("--------------------------------------------------------------");
                System.out.println("AdminID" + "\t" + "AdminUsername" + "\t" +"AdminPassword");
                System.out.println("--------------------------------------------------------------");
                for (Bus viewAllAdmins : admins) {
                    System.out.println(viewAllAdmins.toStringAdmin());
                }
                rootAdminMainMenu();
                break;
            case 4:
                System.out.println("Enter Admin id you want to update");
                obj.updateAdmin(sc.nextInt());
                rootAdminMainMenu();
                break;
            case 5:
                System.out.println("Enter Admin id you want to delete");
                obj.deleteAdmin(sc.nextInt());
                rootAdminMainMenu();
                break;
            case 6:
                obj.back();
            default:
                System.out.println("Enter choice in the given range 1to6");
        }
    }
    public static void adminMainMenu() {
        System.out.println("--------------------------");
        System.out.println("|    ADMIN MAIN MENU     |");
        System.out.println("--------------------------");
        System.out.println("|   1. ADD BUS           |");
        System.out.println("|   2. VIEW BUS          |");
        System.out.println("|   3. VIEW ALL BUSES    |");
        System.out.println("|   4. UPDATE BUS        |");
        System.out.println("|   5. DELETE BUS        |");
        System.out.println("|   6. CUSTOMER DETAILS  |");
        System.out.println("|   7. BACK              |");
        System.out.println("--------------------------");
        System.out.println("Enter Your Choice ?");
        int choice2 = sc.nextInt();
        switch (choice2) {
            case 1:
                obj.addBus();
                adminMainMenu();
                break;
            case 2:
                System.out.println("enter bus ID");
                Bus searchBus = obj.viewBus(sc.nextInt());
                if(searchBus!=null){
                System.out.println("--------------------------------------------------------------");
                System.out.println("BusID" + "\t" + "BusNAME" + "\t" +"ROUTE"+"\t"+ "SEATS" + "\t" + "PRICE");
                System.out.println("--------------------------------------------------------------");
                System.out.println(searchBus);
                }
                else System.out.println("Bus not found");
                adminMainMenu();
                break;
            case 3:
                List<Bus> Buses = obj.viewAllBuses();
                System.out.println("--------------------------------------------------------------");
                System.out.println("BusID" + "\t" + "BusNAME" + "\t" +"ROUTE"+"\t"+ "SEATS" + "\t" + "PRICE");
                System.out.println("--------------------------------------------------------------");
                for (Bus viewAllBuses : Buses) {
                    System.out.println(viewAllBuses);
                }
                adminMainMenu();
                break;
            case 4:
                System.out.println("Enter bus id you want to update");
                obj.updateBus(sc.nextInt());
                adminMainMenu();
                break;
            case 5:
                System.out.println("Enter bus id you want to delete");
                obj.deleteBus(sc.nextInt());
                adminMainMenu();
                break;
            case 6:
                Set<Bus> customers = obj.customerList();
                System.out.println("--------------------------------------------------------------");
                System.out.println("ID" + "\t" + "NAME" + "\t" +"AGE"+"\t"+ "MOBILE" + "\t" + "EMAIL");
                System.out.println("--------------------------------------------------------------");
                for (Bus viewAllCustomers : customers) {
                    System.out.println(viewAllCustomers.toStringCustomer());
                }
                adminMainMenu();
                break;
            case 7:
                obj.back();
            default:
                System.out.println("Enter choice in the given range 1to6");
        }

    }

    public static void customerMainMenu() {
            obj.customerDetails();
        System.out.println("---------------------------");
        System.out.println("|  CUSTOMER MAIN MENU     |");
        System.out.println("---------------------------");
        System.out.println("|   1. VIEW BUS           |");
        System.out.println("|   2. VIEW ALL BUS       |");
        System.out.println("|   3. BOOK TICKET        |");
        System.out.println("|   4. BACK               |");
        System.out.println("---------------------------");
        System.out.println("Enter Your Choice ?");
        int choice3 = sc.nextInt();
        switch (choice3) {

            case 1:
                System.out.println("Enter Search Bus Id ?");
                Bus searchBus = obj.viewBus(sc.nextInt());
                System.out.println("--------------------------------------------------------------");
                System.out.println("BusID" + "\t" + "BusNAME" + "\t" +"ROUTE"+"\t"+ "SEATS" + "\t" + "PRICE");
                System.out.println("--------------------------------------------------------------");
                System.out.println(searchBus);
                customerMainMenu();
                break;
            case 2:
                List<Bus> Buses = obj.viewAllBuses();
                System.out.println("--------------------------------------------------------------");
                System.out.println("BusID" + "\t" + "BusNAME" + "\t" +"\t"+"ROUTE"+"\t"+"SEATS" + "\t" + "PRICE");
                System.out.println("--------------------------------------------------------------");
                for (Bus viewBus : Buses) {
                    System.out.println(viewBus);
                }
                customerMainMenu();
                break;
            case 3:
                obj.bookTicket();
                customerMainMenu();
                break;
            case 4:
                obj.back();
                break;
            default:
                System.out.println("Please select your choice range 1-4 only");
        }

    }
    public static boolean valid(){
        System.out.println("Enter Admin Username");
        String userName=sc.next();
        System.out.println("Enter Admin Password");
        String password=sc.next();
        boolean valid = obj.adminValidate(userName,password);
        if(obj.adminValidate(userName,password)){
            System.out.println("Welcome To Admin Main Menu");
        } else if (!obj.adminValidate(userName,password)) {
            System.out.println("Enter valid username and password");
        }
        return valid;
    }
    public static void exit(){
    System.exit(0);
    }

}
