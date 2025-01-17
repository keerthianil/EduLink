package Business.Organization;

import Business.Role.Role;
import Business.Role.TrainerRole;
import Business.Workshops.Workshop;
import Business.Workshops.WorkshopDirectory;
import java.util.ArrayList;

public class CorporateOrganization extends Organization {
    private String location;
    private String contactInfo;
    private String missionStatement;
    private WorkshopDirectory workshopDirectory;

    public CorporateOrganization(String name, String location, String contactInfo, String missionStatement) {
        super(name, Type.Corporate);
        this.location = location;
        this.contactInfo = contactInfo;
        this.missionStatement = missionStatement;
        this.workshopDirectory = new WorkshopDirectory(); // Initialize the Workshop Directory
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new TrainerRole()); // Trainers will be a part of this organization
        return roles;
    }

    // Getters and Setters for attributes
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public String getMissionStatement() {
        return missionStatement;
    }

    public void setMissionStatement(String missionStatement) {
        this.missionStatement = missionStatement;
    }

    // Method to add a workshop to the directory
    public void addWorkshop(Workshop workshop) {
        workshopDirectory.addWorkshop(workshop);
    }

    // Get the workshop directory for the Corporate Organization
    public WorkshopDirectory getWorkshopDirectory() {
        return workshopDirectory;
    }
}
