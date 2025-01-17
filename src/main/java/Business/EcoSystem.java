package Business;

import Business.Employee.EmployeeDirectory;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.AdminRole;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import Business.WorkQueue.WorkRequest;
import Business.Workshops.WorkshopDirectory;

import java.util.ArrayList;

public class EcoSystem extends Organization {

    private static EcoSystem business;
    private ArrayList<Network> networkList;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private WorkQueue workQueue;
    private WorkshopDirectory workshopDirectory;

    // Singleton pattern for EcoSystem instance
    public static EcoSystem getInstance() {
        if (business == null) {
            business = new EcoSystem();
        }
        return business;
    }

    private EcoSystem() {
        super("Ecosystem", Type.EcoSystem); // Initialize with parent class
        networkList = new ArrayList<>();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        workQueue = new WorkQueue();
        workshopDirectory = new WorkshopDirectory();
    }

    // Method to add networks to EcoSystem
    public void addNetwork(Network network) {
        networkList.add(network);
    }

    // Method to create and add a new network
    public Network createAndAddNetwork(String name) {
        Network network = new Network(name);
        addNetwork(network);
        return network;
    }

    // Overridden methods for roles and directories
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(new AdminRole()); // You can add more roles here if needed
        return roleList;
    }

    // Getter methods for accessing data
    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public WorkshopDirectory getWorkshopDirectory() {
        return workshopDirectory;
    }

    @Override
    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    @Override
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    @Override
    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    // Method for managing organization (e.g., managing work requests)
    public void manageOrganization() {
        // Add debug logs here to print current state of EcoSystem
        System.out.println("Managing the EcoSystem...");
        for (WorkRequest request : workQueue.getWorkRequestList()) {
            System.out.println("Request ID: " + request.getId() + ", Type: " + request.getType() + ", Status: " + request.getStatus());
        }
    }


    public void printAllRequests() {
        for (WorkRequest req : workQueue.getWorkRequestList()) {
            System.out.println("ID: " + req.getId() + ", Type: " + req.getType() +
                ", Requester: " + req.getRequester().getUsername() +
                ", Status: " + req.getStatus());
        }
    }
}
