package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

public abstract class Organization {

    private String name;
    private Type type;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;

    public enum Type {
        Admin("Admin Organization"),
        School("School Organization"),
        NGO("NGO Organization"),
        Logistics("Logistics Organization"),
        Training("Training Organization"),
        Enterprise("Enterprise"),
        Corporate("Corporate"),
        EcoSystem("EcoSystem");

        private final String value;

        Type(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public Organization(String name, Type type) {
        this.name = name;
        this.type = type;
        this.workQueue = new WorkQueue();
        this.employeeDirectory = new EmployeeDirectory();
        this.userAccountDirectory = new UserAccountDirectory();
    }

    public abstract ArrayList<Role> getSupportedRole();

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    @Override
    public String toString() {
        return name;
    }
}
