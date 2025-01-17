package Business.UserAccount;

import Business.Employee.Employee;
import Business.Role.Role;
import java.util.ArrayList;

public class UserAccountDirectory {

    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList<>();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }

    // Authenticate user by username and password
    public UserAccount authenticateUser(String username, String password) {
        for (UserAccount ua : userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)) {
                return ua;
            }
        return null;
    }

    // Create a new user account and add it to the list
    public UserAccount createUserAccount(String username, String password, Employee employee, Role role) {
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }

    // New method to create a student account (no employee needed)
    public UserAccount createStudentAccount(String username, String password, Role role, String name, String highestEducation, String currentOrganisation, String location, int age, String email, String parentEmail) {
        UserAccount userAccount = new UserAccount(username, password, role, name, highestEducation, currentOrganisation, location, age, email, parentEmail);
        userAccountList.add(userAccount);
        return userAccount;
    }

    // Check if the username is unique
    public boolean checkIfUsernameIsUnique(String username) {
        for (UserAccount ua : userAccountList) {
            if (ua.getUsername().equals(username)) {
                return false;
            }
        }
        return true;
    }

    // New method to add UserAccount to the list
    public void addUserAccount(UserAccount userAccount) {
        userAccountList.add(userAccount);
    }

    public ArrayList<UserAccount> getTeachers() {
        ArrayList<UserAccount> teachers = new ArrayList<>();
        for (UserAccount userAccount : userAccountList) {
            if (userAccount.isTeacher()) {
                teachers.add(userAccount);
            }
        }
        return teachers;
    }

    public UserAccount getUserAccountByUsername (String username) {
        for (UserAccount ua : userAccountList) {
            if (ua.getUsername().equals(username)) {
                return ua;
            }
        }
        return null;
    }














}
