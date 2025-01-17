/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.TeacherRole;
import Business.Role.StudentRole;
import java.util.ArrayList;

public class SchoolOrganization extends Organization {
    private String location;
    private String contactInfo;

    public SchoolOrganization(String name, String location, String contactInfo) { 
        super(name, Type.School);
        this.location = location;
        this.contactInfo = contactInfo;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new TeacherRole());
        roles.add(new StudentRole());
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
    
}




