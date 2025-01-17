package Test;

import Business.DB4OUtil.DB4OUtil;
import Business.ConfigureEduLink;
import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkQueue;
import Business.WorkQueue.WorkRequest;
import Business.Role.StudentRole;
import Business.Role.TeacherRole;
import Business.Role.NGORole;
import Business.Role.DonorRole;

import Business.Employee.EmployeeDirectory;
import Business.UserAccount.UserAccountDirectory;

public class TestEduLink {

    public static void main(String[] args) {
        // Step 1: Retrieve the EcoSystem
        EcoSystem ecoSystem = DB4OUtil.getInstance().retrieveSystem();

        // Check if ecoSystem is null before proceeding
        if (ecoSystem != null) {
            System.out.println("Successfully retrieved EcoSystem.");

            // Get the directories from the retrieved EcoSystem
            UserAccountDirectory userAccountDirectory = ecoSystem.getUserAccountDirectory();
            EmployeeDirectory employeeDirectory = ecoSystem.getEmployeeDirectory();
            WorkQueue workQueue = ecoSystem.getWorkQueue();

            // Verifying Directories
            System.out.println("User Account Directory contains: " + userAccountDirectory.getUserAccountList().size() + " users.");
            System.out.println("Employee Directory contains: " + employeeDirectory.getEmployeeList().size() + " employees.");
            System.out.println("Work Queue contains: " + workQueue.getWorkRequestList().size() + " requests.");

            // Step 2: Create Users for Each Role
            System.out.println("\nCreating Users for Each Role:");
            createUsersForRoles(userAccountDirectory);

            // Step 3: Create Work Requests and Check Work Queue
            System.out.println("\nCreating Work Requests...");
            createWorkRequests(workQueue);

            // Step 4: Perform Role Actions
            performRoleActions(userAccountDirectory, workQueue);

            // Step 5: Verify Work Queue and Directory Changes
            verifyFinalState(userAccountDirectory, employeeDirectory, workQueue);

        } else {
            System.err.println("Error: EcoSystem is null. Cannot proceed.");
        }
    }

    private static void createUsersForRoles(UserAccountDirectory userAccountDirectory) {
        // Create users for each role
        UserAccount student = new UserAccount("student1", "password", new StudentRole());
        userAccountDirectory.addUserAccount(student);
        System.out.println("Created Student Account: " + student.getUsername());

        UserAccount teacher = new UserAccount("teacher1", "password", new TeacherRole());
        userAccountDirectory.addUserAccount(teacher);
        System.out.println("Created Teacher Account: " + teacher.getUsername());

        UserAccount ngo = new UserAccount("ngo1", "password", new NGORole());
        userAccountDirectory.addUserAccount(ngo);
        System.out.println("Created NGO Account: " + ngo.getUsername());

        UserAccount donor = new UserAccount("donor1", "password", new DonorRole());
        userAccountDirectory.addUserAccount(donor);
        System.out.println("Created Donor Account: " + donor.getUsername());


    }

    private static void createWorkRequests(WorkQueue workQueue) {
        WorkRequest tutoringRequest = new WorkRequest("Help with Math", "Tutoring", "Math subject");
        workQueue.addWorkRequest(tutoringRequest);
        System.out.println("Tutoring Request Created: " + tutoringRequest);

        WorkRequest resourceRequest = new WorkRequest("Request for 50 Digital Tablets", "Resource", "50 Tablets");
        workQueue.addWorkRequest(resourceRequest);
        System.out.println("Resource Request Created: " + resourceRequest);
    }

    private static void performRoleActions(UserAccountDirectory userAccountDirectory, WorkQueue workQueue) {
        // Simulate actions for each role
        // Student requests tutoring and resources
        System.out.println("\nStudent performing duties...");
        UserAccount student = userAccountDirectory.getUserAccountList().get(0);
        student.getRole().performDuties();
        System.out.println("Student requested tutoring and resources.");

        // NGO approves requests
        System.out.println("\nNGO performing duties...");
        UserAccount ngo = userAccountDirectory.getUserAccountList().get(2);
        ngo.getRole().performDuties();
        workQueue.updateWorkRequestStatus(workQueue.getWorkRequestList().get(0), "Approved by NGO");
        workQueue.updateWorkRequestStatus(workQueue.getWorkRequestList().get(1), "Approved by NGO");
        System.out.println("NGO approved tutoring and resource requests.");
    }

    private static void verifyFinalState(UserAccountDirectory userAccountDirectory, EmployeeDirectory employeeDirectory, WorkQueue workQueue) {
        System.out.println("\nFinal State:");
        System.out.println("User Account Directory contains: " + userAccountDirectory.getUserAccountList().size() + " users.");
        System.out.println("Employee Directory contains: " + employeeDirectory.getEmployeeList().size() + " employees.");
        System.out.println("Work Queue contains: " + workQueue.getWorkRequestList().size() + " requests.");

        workQueue.getWorkRequestList().forEach(request -> {
            System.out.println("Request ID: " + request.getId() + ", Type: " + request.getType() + ", Status: " + request.getStatus());
        });
    }
}
