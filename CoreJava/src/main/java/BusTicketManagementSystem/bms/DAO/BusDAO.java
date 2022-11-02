package BusTicketManagementSystem.bms.DAO;

import BusTicketManagementSystem.bms.model.Bus;

import java.util.List;
import java.util.Set;

interface BusDAO {
    //methods for Bus
    void addBus();
    void deleteBus(int busId);
    void updateBus(int busId);
    Bus viewBus(int busId);
    List<Bus> viewAllBuses();
    void bookTicket();
    //methods for Admin
    void addAdmin();
    void deleteAdmin(int adminId);
    void updateAdmin(int adminId);
    Bus viewAdmin(int adminId);
    List<Bus> viewAllAdmins();
    boolean adminValidate(String adUsername, String adPassword);
    //methods for Root Admin
    boolean rootValidate();
    //methods for Customer
    void customerDetails();
    Set<Bus> customerList();
    //methods for back
    void back();

}
