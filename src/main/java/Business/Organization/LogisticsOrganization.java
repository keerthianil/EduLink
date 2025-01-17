package Business.Organization;

import Business.Role.Role;
import Business.Role.LogisticsRole;
import java.util.ArrayList;

public class LogisticsOrganization extends Organization {
    private String location;
    private String contactInfo;
    private String missionStatement;

    public LogisticsOrganization(String name, String location, String contactInfo, String missionStatement) {
        super(name, Type.Logistics); // Ensure parent constructor is called
        this.location = location;
        this.contactInfo = contactInfo;
        this.missionStatement = missionStatement;

        // Debug initialization
        if (getUserAccountDirectory() == null) {
            System.out.println("Error: UserAccountDirectory not initialized in LogisticsOrganization");
        }
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new LogisticsRole());
        return roles;
    }

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
}
