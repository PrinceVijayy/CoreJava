package BusTicketManagementSystem.bms.model;

//Encapsulation = Data Hiding+ Data Abstraction
public class Bus {
    /**
     * Data Hiding
     * ===========
     */
    //Variables for Bus
    private int busId;
    private String busName;
    private String route;
    private int seats;
    private float price;
   //Variables for Root Admin
    private String rootUsername;
    private String rootPassword;
    //Variables for Admin
    private int adminId;
    private String adminUsername;
    private String adminPassword;
    //Variables for Customer
    private int customerId;
    private String customerName;
    private String customerMobileNumber;
    private String customerEmail;
    private String customerAge;

    /**
     * default constructor
     * ===================
     */
    public Bus(){};

    /**
     * parameterized constructor
     * =========================
     */
    //bus parameterized constructor
    public Bus(int busId, String busName, String route, int seats, float price) {
        this.busId = busId;
        this.busName = busName;
        this.route = route;
        this.seats = seats;
        this.price = price;
    }
   //root admin parameterized constructor
    public Bus(String rootUsername, String password) {
        this.rootUsername = rootUsername;
        this.rootPassword = password;

    }

    // admin parameterized constructor
    public Bus(int adminId, String adminUsername, String adminPassword) {
        this.adminId = adminId;
        this.adminUsername = adminUsername;
        this.adminPassword = adminPassword;
    }

    //customer parameterized constructor
    public Bus(int customerId, String customerName,String customerAge, String customerMobileNumber, String customerEmail) {
        this.customerId=customerId;
        this.customerName = customerName;
        this.customerAge = customerAge;
        this.customerMobileNumber = customerMobileNumber;
        this.customerEmail = customerEmail;

    }

    /**
     *  getters and setters methods
     * =================================
     */
    // getters and setters methods for Bus
    public int getBusId() {
        return busId;
    }

    public void setBusId(int busId) {
        this.busId = busId;
    }

    public String getBusName() {
        return busName;
    }

    public void setBusName(String busName) {
        this.busName = busName;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    // getters and setters methods for Root Admin
    public String getRootUsername() {
        return rootUsername;
    }

    public String getRootPassword() {
        return rootPassword;
    }
    // getters and setters methods for Admin
    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public String getAdminUsername() {
        return adminUsername;
    }

    public void setAdminUsername(String adminUsername) {
        this.adminUsername = adminUsername;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }
    // getters and setters methods for Customers

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerMobileNumber() {
        return customerMobileNumber;
    }

    public void setCustomerMobileNumber(String customerMobileNumber) {
        this.customerMobileNumber = customerMobileNumber;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerAge() {
        return customerAge;
    }

    public void setCustomerAge(String customerAge) {
        this.customerAge = customerAge;
    }

    //overrided to string method for Bus
    public String toString() {
        return  busId +"\t"+ busName + "\t" + route + "\t" + seats +"\t" + price;
    }
    // print method for admin
    public String toStringAdmin() {
        return  adminId +"\t"+"\t"+ adminUsername + "\t" +"\t"+ adminPassword;
    }
    // print method for customer
    public String toStringCustomer(){return  customerId+ "\t"+customerName+"\t"+customerAge+"\t"+customerMobileNumber+"\t"+customerEmail;}

}
