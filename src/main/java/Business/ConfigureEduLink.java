package Business;

import Business.DB4OUtil.DB4OUtil;
import Business.Enterprise.EdTechEnterprise;
import Business.Enterprise.CorporateEnterprise;
import Business.Enterprise.NGOEnterprise;
import Business.Enterprise.LogisticsEnterprise;
import Business.Network.Network;
import Business.Organization.OrganizationDirectory;
import Business.Organization.SchoolOrganization;
import Business.Organization.TrainingInstituteOrganization;
import Business.Organization.NGOOrganization;
import Business.Organization.LogisticsOrganization;
import Business.Employee.Employee;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.Role.*;
import Business.Workshops.Workshop;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConfigureEduLink {

    public static EcoSystem configure() {
        // Step 1: Get the EcoSystem instance 
        EcoSystem system = EcoSystem.getInstance();

        // Step 2: Create and Add Network
        Network network = new Network("Global Education Network");
        system.addNetwork(network); // Add the network to the EcoSystem

        // Step 3: Create Enterprises
        EdTechEnterprise edTechEnterprise = new EdTechEnterprise("Skill Builders Inc.");
        CorporateEnterprise corporateEnterprise = new CorporateEnterprise("TechCorp CSR");
        NGOEnterprise ngoEnterprise = new NGOEnterprise("Global NGO Network");
        LogisticsEnterprise logisticsEnterprise = new LogisticsEnterprise("Fast Logistics");

        // Add enterprises to the network
        network.addEnterprise(edTechEnterprise);
        network.addEnterprise(corporateEnterprise);
        network.addEnterprise(ngoEnterprise);
        network.addEnterprise(logisticsEnterprise);

        // Step 4: Add Organizations to Enterprises
        OrganizationDirectory edTechDirectory = edTechEnterprise.getOrganizationDirectory();
        edTechDirectory.createOrganization(Organization.Type.School, "Community School", "New York", "info@school.com", "Educating future leaders");

        OrganizationDirectory corporateDirectory = corporateEnterprise.getOrganizationDirectory();
        corporateDirectory.createOrganization(Organization.Type.Training, "Tech Training Center", "San Francisco", "training@techcorp.com", "Skills for Tomorrow");

        OrganizationDirectory ngoDirectory = ngoEnterprise.getOrganizationDirectory();
        ngoDirectory.createOrganization(Organization.Type.NGO, "Global NGO Network", "London", "contact@globalngo.com", "Supporting education worldwide");
        ngoDirectory.createOrganization(Organization.Type.NGO, "Education for All", "Mumbai", "contact@mumbaingo.com", "Promoting education in Mumbai");

        OrganizationDirectory logisticsDirectory = logisticsEnterprise.getOrganizationDirectory();
        logisticsDirectory.createOrganization(Organization.Type.Logistics, "Logistics Support", "Los Angeles", "logistics@fastlogistics.com", "Ensuring timely delivery of resources");

        // Step 5: Add Employees and User Accounts, and link them to organizations
        Employee sysAdmin = edTechEnterprise.getEmployeeDirectory().createEmployee("System Admin");
        edTechEnterprise.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", sysAdmin, new SystemAdminRole());




        // craete a corporate employee 
        Employee corporateEmployee = corporateDirectory.getOrganizations().get(0).getEmployeeDirectory().createEmployee("Corporate Employee");
        corporateDirectory.getOrganizations().get(0).getUserAccountDirectory().createUserAccount("corporate", "corporate", corporateEmployee, new CorporateRole());



        // Add Teachers to EdTech and create admin user
        SchoolOrganization schoolOrg = (SchoolOrganization) edTechDirectory.getOrganizations().get(0);

// Create Employee and UserAccount for the teacher


// Create Employee and UserAccount for the teacher
Employee teacher = schoolOrg.getEmployeeDirectory().createEmployee("Teacher John");
UserAccount teacherAccount = schoolOrg.getUserAccountDirectory().createUserAccount("teacher", "123", teacher, new TeacherRole());

// Add the teacher's UserAccount to the EcoSystem's UserAccountDirectory
system.getUserAccountDirectory().addUserAccount(teacherAccount);

        // Create a Student Employee and UserAccount
        Employee student = schoolOrg.getEmployeeDirectory().createEmployee("Student");
        UserAccount studentAccount = system.getUserAccountDirectory().createUserAccount("student", "123", student, new StudentRole());
        schoolOrg.getUserAccountDirectory().addUserAccount(studentAccount);

        // Create Admin for EdTech
        Employee admin = schoolOrg.getEmployeeDirectory().createEmployee("Admin Mary");
        schoolOrg.getUserAccountDirectory().createUserAccount("admin1", "123", admin, new AdminRole());

        // Add Trainers to Corporate Enterprise and create admin user
        TrainingInstituteOrganization trainingOrg = (TrainingInstituteOrganization) corporateDirectory.getOrganizations().get(0);
        Employee trainer = trainingOrg.getEmployeeDirectory().createEmployee("Trainer Anna");
        trainingOrg.getUserAccountDirectory().createUserAccount("trainer", "password", trainer, new TrainerRole());

        // Add NGO Representatives and create admin user
        NGOOrganization ngoOrg1 = (NGOOrganization) ngoDirectory.getOrganizations().get(0);
        Employee ngoRep1 = ngoOrg1.getEmployeeDirectory().createEmployee("NGO Rep Lisa");
        ngoOrg1.getUserAccountDirectory().createUserAccount("ngo1", "123", ngoRep1, new NGORole());

        // Add Donor to the system
        Employee donor = ngoOrg1.getEmployeeDirectory().createEmployee("Donor Mike");
        ngoOrg1.getUserAccountDirectory().createUserAccount("donor1", "123", donor, new DonorRole());

        // Add Students
Employee student1 = schoolOrg.getEmployeeDirectory().createEmployee("Student Alice");
UserAccount studentAccount1 = system.getUserAccountDirectory().createUserAccount("student1", "pass123", student1, new StudentRole());
schoolOrg.getUserAccountDirectory().addUserAccount(studentAccount1);

Employee student2 = schoolOrg.getEmployeeDirectory().createEmployee("Student Bob");
UserAccount studentAccount2 = system.getUserAccountDirectory().createUserAccount("student2", "pass123", student2, new StudentRole());
schoolOrg.getUserAccountDirectory().addUserAccount(studentAccount2);

// Add Advisors
Employee advisor1 = ngoOrg1.getEmployeeDirectory().createEmployee("Advisor John");
UserAccount advisorAccount1 = system.getUserAccountDirectory().createUserAccount("advisor1", "123", advisor1, new AdvisorRole());
ngoOrg1.getUserAccountDirectory().addUserAccount(advisorAccount1);

Employee advisor2 = ngoOrg1.getEmployeeDirectory().createEmployee("Advisor Mary");
UserAccount advisorAccount2 = system.getUserAccountDirectory().createUserAccount("advisor2", "pass123", advisor2, new AdvisorRole());
ngoOrg1.getUserAccountDirectory().addUserAccount(advisorAccount2);

        // Add Logistics Manager and create admin user
        LogisticsOrganization logisticsOrg = (LogisticsOrganization) logisticsDirectory.getOrganizations().get(0);
        Employee logisticsManager = logisticsOrg.getEmployeeDirectory().createEmployee("Logistics Manager Mark");
        logisticsOrg.getUserAccountDirectory().createUserAccount("log", "123", logisticsManager, new LogisticsRole());

        // Step 6: Create Workshops for NGOs, Corporate, and Training Institutes
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date date1 = sdf.parse("10/12/2024");
            Date date2 = sdf.parse("15/12/2024");

            Workshop workshop1 = new Workshop("Tech Training", "San Francisco", "TechCorp CSR", "Advanced programming skills.", date1, "Active", "Students");
            Workshop workshop2 = new Workshop("NGO Education Drive", "London", "Global NGO Network", "Education for underprivileged children.", date2, "Pending", "Students");
            ngoOrg1.getWorkshopDirectory().addWorkshop(workshop1);
            ngoOrg1.getWorkshopDirectory().addWorkshop(workshop2);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Step 7: Save the system to DB
        DB4OUtil.getInstance().storeSystem(system);

        System.out.println("Configuration Complete:");
        return system;
    }

    public static void main(String[] args) {
        EcoSystem ecoSystem = configure();
    }
}