/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import Business.Organization.OrganizationDirectory;
import Business.Role.Role;
import Business.Role.CorporateRole;
import java.util.ArrayList;

public class CorporateEnterprise extends Enterprise {

    public CorporateEnterprise(String name) {
        super(name, EnterpriseType.Corporate); // Pass parameters to the Enterprise constructor
    }

    @Override
    public void enterpriseOperations() {
        System.out.println("Corporate Enterprise manages sponsorships and workshops.");
    }

    public void manageOrganization() {
        System.out.println("Managing Corporate Enterprise...");
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new CorporateRole()); // Add the CorporateRole
        return roles;
    }
}




