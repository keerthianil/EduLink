package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

public class OrganizationDirectory {

    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        this.organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    // Add a new organization to the directory
    public void addOrganization(Organization organization) {
        if (organization != null) {
            organizationList.add(organization);
        } else {
            System.out.println("Cannot add a null organization.");
        }
    }

    // Get all organizations in the directory
    public ArrayList<Organization> getOrganizations() {
        return organizationList;
    }

    // Create a new organization and return it with necessary parameters
    public Organization createOrganization(Type type, String name, String location, String contactInfo, String missionStatement) {
        Organization organization = null;

        // Create NGO Organization with additional parameters
        if (type == Type.NGO) {
            organization = new NGOOrganization(name, location, contactInfo, missionStatement);
        }
        // Create School Organization with additional parameters
        else if (type == Type.School) {
            organization = new SchoolOrganization(name, location, contactInfo); // Adding location and contactInfo for School
        }
        // Create Training Institute Organization with additional parameters
        else if (type == Type.Training) {
            organization = new TrainingInstituteOrganization(name, location, contactInfo, missionStatement); // Added location, contactInfo, and missionStatement
        }
        // Create Logistics Organization with additional parameters
        else if (type == Type.Logistics) {
            organization = new LogisticsOrganization(name, location, contactInfo, missionStatement); // Added location, contactInfo, and missionStatement
        }

        if (organization != null) {
            addOrganization(organization); // Reuse the addOrganization method
        }
        return organization;
    }
}
