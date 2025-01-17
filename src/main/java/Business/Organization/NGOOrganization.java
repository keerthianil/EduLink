/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.NGORole;
import Business.Workshops.Workshop;
import Business.Workshops.WorkshopDirectory;
import java.util.ArrayList;

public class NGOOrganization extends Organization {

    private String name;
    private String location;
    private String contactInfo; // You can add more fields like this
    private String missionStatement; // Another example of additional attributes
    private WorkshopDirectory workshopDirectory;
    
    // Constructor to initialize the organization with basic details
    public NGOOrganization(String name, String location, String contactInfo, String missionStatement) {
        super(name, Type.NGO);
        this.name = name;
        this.location = location;
        this.contactInfo = contactInfo;
        this.missionStatement = missionStatement;
        this.workshopDirectory = new WorkshopDirectory();
    }

    // Getter and Setter for the name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for the location
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    // Getter and Setter for the contact info
    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    // Getter and Setter for the mission statement
    public String getMissionStatement() {
        return missionStatement;
    }

    public void setMissionStatement(String missionStatement) {
        this.missionStatement = missionStatement;
    }
    
    public WorkshopDirectory getWorkshopDirectory() {
        return workshopDirectory;
    }

    public void addWorkshop(Workshop workshop) {
        workshopDirectory.addWorkshop(workshop);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new NGORole());
        return roles;
    }
}







