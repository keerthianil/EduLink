package Business.UserAccount;

import Business.Employee.Employee;
import Business.Role.Role;
import Business.WorkQueue.WorkQueue;

/**
 * UserAccount class to manage user details and work queue.
 */
public class UserAccount {

    private String username;
    private String password;
    private Employee employee;
    private Role role;
    private WorkQueue workQueue;
    private String name;
    private String highestEducation;
    private String currentOrganisation;
    private String location;
    private int age;
    private String email;
    private String parentEmail;
    private UserAccount assignedAdvisor;
    

    // Default constructor
    public UserAccount() {
        workQueue = new WorkQueue();
    }

    // Parameterized constructor to initialize UserAccount with username, password, and role
    public UserAccount(String username, String password, Role role, String name, String highestEducation, String currentOrganisation, String location, int age, String email, String parentEmail) {
        this.username = username;
        this.password = password;
        this.role = role;
        this.workQueue = new WorkQueue(); // Initialize the work queue
        this.name = name;
        this.highestEducation = highestEducation;
        this.currentOrganisation = currentOrganisation;
        this.location = location;
        this.age = age;
        this.email = email;
        this.parentEmail = parentEmail;
        
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Employee getEmployee() {
        return employee;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHighestEducation() {
        return highestEducation;
    }

    public void setHighestEducation(String highestEducation) {
        this.highestEducation = highestEducation;
    }

    public String getCurrentOrganisation() {
        return currentOrganisation;
    }

    public void setCurrentOrganisation(String currentOrganisation) {
        this.currentOrganisation = currentOrganisation;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getParentEmail() {
        return parentEmail;
    }

    public void setParentEmail(String parentEmail) {
        this.parentEmail = parentEmail;
    }

    public boolean isTeacher() {
        return this.role instanceof Business.Role.TeacherRole;
    }

    public UserAccount getAssignedAdvisor() {
        return assignedAdvisor;
    }

    public void setAssignedAdvisor(UserAccount assignedAdvisor) {
        this.assignedAdvisor = assignedAdvisor;
    }

    @Override
public String toString() {
    if (this.getEmployee() != null) {
        return this.getEmployee().getName(); // If Employee exists, return the name
    } else {
        return this.name != null ? this.name : this.username; // Fallback to `name` or `username`
    }
}


}
