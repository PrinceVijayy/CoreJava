package BusTicketManagementSystem.bms.DAO;

import BusTicketManagementSystem.bms.model.Bus;
import BusTicketManagementSystem.main.BusTicketManagementSystem;

import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class BusDAOImp implements BusDAO {
    //created a Scanner class
    Scanner sc = new Scanner(System.in);

    //Creating Original and Temporary List for bus
    List<Bus> busOriginalList = new ArrayList<Bus>();
    List<Bus> busTemporaryList = new ArrayList<Bus>();

    //Creating Predefined DataBase using Parameterized Constructor
    Bus data_1 = new Bus(1, "Kaveri Travels", "Nellore ", 70, 1000);
    Bus data_2 = new Bus(2, "SRS Travels   ", "Nizambad", 70, 800);
    Bus data_3 = new Bus(3, "Orange Travels", "Warangal", 70, 750);
    Bus data_4 = new Bus(4, "Neeta Travels ", "Kammam  ", 70, 900);
    Bus data_5 = new Bus(5, "Hans Travels ", "Adilabad ", 70, 920);
    Bus data_6 = new Bus(6, "KPN Travels  ", "Vizag    ", 70, 670);

    //Creating Original and Temporary List for Admin
    List<Bus> adminOriginalList = new ArrayList<Bus>();

    List<Bus> adminTemporaryList = new ArrayList<Bus>();
    //Creating Predefined DataBase using Parameterized Constructor
    Bus log1 = new Bus(1, "aaaa", "aaaa");
    Bus log2 = new Bus(2, "bbbb", "bbbb");
    //Creating Customer Orginal List
    Set<Bus> customerOriginalList=new LinkedHashSet<>();
    //Creating Predefined DataBase using Parameterized Constructor
    Bus cdata1=new Bus(44,"VijayMohan","24","+917842179688","kondavijayy123@gmail.com");

    //Adding objects created by using Parameterized Constructor to the Original List
    public void dataBase() {
        //Bus Pre defined data
        busOriginalList.add(data_1);
        busOriginalList.add(data_2);
        busOriginalList.add(data_3);
        busOriginalList.add(data_4);
        busOriginalList.add(data_5);
        busOriginalList.add(data_6);
        //Admin Pre defined data
        adminOriginalList.add(log1);
        adminOriginalList.add(log2);
        //Customer Pre defined data
        customerOriginalList.add(cdata1);
    }

    //Creating a object bus to access it later
    Bus bus = null;

    //Method to add a Bus
    public void addBus() {
        int n = 1;
        while (n == 1) {
            bus = new Bus();
            System.out.println("Enter Bus Id");
            bus.setBusId(sc.nextInt());
            System.out.println("Enter Bus Name");
            bus.setBusName(sc.next());
            System.out.println("Enter Bus Route");
            bus.setRoute(sc.next());
            System.out.println("Enter no.of Seats");
            bus.setSeats(sc.nextInt());
            System.out.println("Enter Ticket Price");
            bus.setPrice(sc.nextFloat());
            busOriginalList.add(bus);
            System.out.println("If you want to add more press 1 else press any number");
            n = sc.nextInt();
        }
        System.out.println("Successfully added..............");
    }

    //Method to delete a bus
    public void deleteBus(int busId) {
        busTemporaryList = new ArrayList<Bus>();
        //using filter method
        busTemporaryList = busOriginalList.stream().filter(update->update.getBusId()!=busId).collect(Collectors.toList());
//        for (Bus update : orginalList) {
//            if (update.getBusId() != busId) {
//                tempList.add(update);
//            }
//        }
        busOriginalList = new ArrayList<Bus>();
        //using map method
        busOriginalList = busTemporaryList.stream().map(updated->updated).collect(Collectors.toList());
//        for (Bus deletedBus : tempList) {
//            orginalList.add(deletedBus);
//        }
        System.out.println("Successfully deleted");
    }

    //Method to update bus
    public void updateBus(int busId) {
        busTemporaryList = new ArrayList<Bus>();
        for (Bus updateBus : busOriginalList) {
            if (updateBus.getBusId() == busId) {
                System.out.println("Enter your choice  ");
                System.out.println("1. Bus ID          ");
                System.out.println("2. Bus Name        ");
                System.out.println("3. Bus Route       ");
                System.out.println("4. No.of Seats     ");
                System.out.println("5. Ticket price    ");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Set ID");
                        updateBus.setBusId(sc.nextInt());
                        break;
                    case 2:
                        System.out.println("Set Name");
                        updateBus.setBusName(sc.next());
                        break;
                    case 3:
                        System.out.println("Set Route");
                        updateBus.setRoute(sc.next());
                        break;
                    case 4:
                        System.out.println("Set Seats");
                        updateBus.setSeats(sc.nextInt());
                        break;
                    case 5:
                        System.out.println("Set Price");
                        updateBus.setPrice(sc.nextFloat());
                        break;
                }
            }
            busTemporaryList.add(updateBus);
        }
        busOriginalList = new ArrayList<Bus>();
        //using map method
        busOriginalList = busTemporaryList.stream().map(updated->updated).collect(Collectors.toList());
//        for (Bus updatedBus : tempList) {
//            orginalList.add(updatedBus);
//        }
    }
    //Method to view bus
    public Bus viewBus(int busId) {
        for (Bus searchBus : busOriginalList) {
            if (searchBus.getBusId() == busId) {
                bus = searchBus;
                break;
            }
        }
            return bus;

    }
    //Method to view all buses
    public List<Bus> viewAllBuses() {
        return busOriginalList;
    }
    //Method to book bus ticket
    public void bookTicket() {
        Bus selectedSeat = new Bus();
        //using forEach method
        busOriginalList.stream().forEach(System.out::println);
//        for (Bus availableSeats : orginalList) {
//            System.out.println(availableSeats);
//        }
        System.out.println("Which bus do you want");
        selectedSeat.setBusId(sc.nextInt());
        System.out.println("How many seats do you want");
        selectedSeat.setSeats(sc.nextInt());
        for (Bus availablebus : busOriginalList) {
            if (availablebus.getBusId() == selectedSeat.getBusId()) {
                System.out.println("---------------------------------------------");
                System.out.println("|                  Bill                     |");
                System.out.println("---------------------------------------------");
                System.out.println("   Bus Id        :   " + selectedSeat.getBusId());
                System.out.println("   Bus Name      :   " + availablebus.getBusName());
                System.out.println("   Bus Route     :   " + availablebus.getRoute());
                System.out.println("   Bus Seats     :   " + selectedSeat.getSeats());
                System.out.println("   Bus Price     :   " + availablebus.getPrice());
                System.out.println("----------------------------------------------");
                System.out.println("   Total Amount      :   " + (selectedSeat.getSeats() * availablebus.getPrice()));
                System.out.println("----------------------------------------------");
                availablebus.setSeats(availablebus.getSeats() - selectedSeat.getSeats());
                busTemporaryList.add(availablebus);
            } else
                busTemporaryList.add(availablebus);

        }
        busOriginalList = new ArrayList<Bus>();
        //using collect method
        busOriginalList = busTemporaryList.stream().collect(Collectors.toList());
//        for (Bus updatedlist : tempList) {
//            orginalList.add(updatedlist);
//        }
        System.out.println("thank you visit once again............");
    }

    /**
     * Root Admin Methods Implementations
     * ==================================
     */

    //Predefined root admin login credentials using parameterized constructor
    Bus rootAdmin = new Bus("root", "root");
    //root admin login Validation Method
    public boolean rootValidate() {
        String username, password;
        System.out.println("Enter Root User Name");
        username = sc.nextLine();
        System.out.println("Enter Root Password");
        password = sc.nextLine();
        if (rootAdmin.getRootUsername().equals(username)) {
            if (rootAdmin.getRootPassword().equals(password)) {
                return true;
            } else {
                System.out.println("Invalid Credentials");
                return false;
            }
        } else {
            System.out.println("Invalid Credentials");
            return false;
        }
    }

    /**
     *  Admin Methods Implementations
     *  =============================
     */
    //Creating a object bus to access it later
    Bus admin = null;
    //Method to add Admin
    public void addAdmin() {
        int n = 1;
        while (n == 1) {
            admin = new Bus();
            System.out.println("Enter Admin Id");
            admin.setAdminId(sc.nextInt());
            System.out.println("Enter Admin Username");
            admin.setAdminUsername(sc.next());
            //Regular Expression
            /**
             * The username can contain letters from A-Z,a-z,0-9
             * The lenght of the username should be min size 7 and max size 29
             */
            while(! Pattern.matches("[A-Z a-z 0-9 _]{7,29}$",admin.getAdminUsername())){
                System.out.println("Enter a valid Username");
                admin.setAdminUsername(sc.next());
            }
            System.out.println("Enter Admin Password");

            admin.setAdminPassword(sc.next());
            //Regular Expression
            /**
             * The password must contain any number from 0-9
             * The password must contain any letter from a-z
             * The password must contain any letter from A-Z
             * The password must contain any special character from @#$%^&-+=
             * The password must not contain any white spaces
             * The lenght of the password should be min size 8 and max size 20
             */
            while(! Pattern.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=])(?=\\S+$).{8,20}$", admin.getAdminPassword())){
                System.out.println("Enter a valid password");
                admin.setAdminPassword(sc.next());
            }
            adminOriginalList.add(admin);
            System.out.println("If you want to add more press 1 else press any number");
            n = sc.nextInt();
        }
        System.out.println("Successfully added.......");
    }
    //Method to delete Admin

    public void deleteAdmin(int adminId) {
        adminTemporaryList = new ArrayList<Bus>();
        for (Bus update : adminOriginalList) {
            if (update.getAdminId() != adminId) {
                adminTemporaryList.add(update);
            }
        }
        adminOriginalList = new ArrayList<Bus>();
        for (Bus deletedAdmin : adminTemporaryList) {
            adminOriginalList.add(deletedAdmin);
        }
        System.out.println("Successfully deleted........");
    }
    //Method to update Admin

    public void updateAdmin(int adminId) {
        adminTemporaryList = new ArrayList<Bus>();
        for (Bus updateAdmin : adminOriginalList) {
            if (updateAdmin.getAdminId() == adminId) {
                System.out.println("Enter your choice  ");
                System.out.println("1. Admin ID        ");
                System.out.println("2. Admin Username  ");
                System.out.println("3. Admin Password  ");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Set Admin ID ");
                        updateAdmin.setAdminId(sc.nextInt());
                        break;
                    case 2:
                        System.out.println("Set Admin Username");
                        updateAdmin.setAdminUsername(sc.next());
                        break;
                    case 3:
                        System.out.println("Set Admin Password ");
                        updateAdmin.setAdminPassword(sc.next());
                        break;
                }
            }
            adminTemporaryList.add(updateAdmin);
        }
        adminOriginalList = new ArrayList<Bus>();
        for (Bus updatedAdmin : adminTemporaryList) {
            adminOriginalList.add(updatedAdmin);
        }
    }
    //Method to view Admin
    public Bus viewAdmin(int adminId) {

        for (Bus searchAdmin : adminOriginalList) {
            if (searchAdmin.getAdminId() == adminId) {
                admin = searchAdmin;
                break;
            }
        }
        return bus;
    }
    //Method to view All Admins
    public List<Bus> viewAllAdmins() {
        return adminOriginalList;
    }
    //Method to admin Validate

    public boolean adminValidate(String adUsername, String adPassword)
    {
        boolean b = false;
        for (Bus av : adminOriginalList)
        {
            if (av.getAdminUsername().equals(adUsername)&&av.getAdminPassword().equals(adPassword))
                {
                    return b=true;
                }
        }
        return b;
    }
    //creating a customer object
        Bus customer=null;
        int count=0;
//Method for customer Details
    public void customerDetails() {
        customer=new Bus();
        count++;
        if(count==1){

        }
        System.out.println("Please Enter Your Id");
        customer.setCustomerId(sc.nextInt());
        System.out.println("Please Enter Your Name");
        customer.setCustomerName(sc.next());
        while(! Pattern.matches("^[A-Za-z][A-Za-z0-9_]{7,29}$",customer.getCustomerName())){
            System.out.println("Enter a valid name");
                customer.setCustomerName(sc.next());
        }
        System.out.println("Please Enter your Age");
        customer.setCustomerAge(sc.next());
        while (!Pattern.matches("^100|[1-9]?\\d$", customer.getCustomerAge())){
            System.out.println("Enter a valid age");
            customer.setCustomerAge(sc.next());
        }
        System.out.println("Please Enter Your Mobile Number");
        customer.setCustomerMobileNumber(sc.next());
        while(Pattern.matches("^[6-9]\\d{9}$", customer.getCustomerMobileNumber())){
            System.out.println("Enter a mobile number");
            customer.setCustomerMobileNumber(sc.next());
        }
        System.out.println("Please Enter Your Email");
        customer.setCustomerEmail(sc.next());
        while (!Pattern.matches("[a-z0-9]+@[a-z]+.[a-z]{2,3}", customer.getCustomerEmail())){
            System.out.println("Enter a valid email");
            customer.setCustomerEmail(sc.next());
        }
        customerOriginalList.add(customer);
    }
    //Method for customer List
    public Set<Bus> customerList(){
        return customerOriginalList;
    }
    //Method for going back to main menu
    public void back() {
        BusTicketManagementSystem.main(null);
    }
}

// if (admin.getAdminUsername().equals(adminUsername)) {
//
//            if (admin.getAdminPassword().equals(adminPassword)) {
//
//            } else {
//                System.out.println("Invalid Credentials");
//                return false;
//            }
//        }
