/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.CorporateEnterprise;
import Business.Enterprise.Enterprise;
import Business.Enterprise.NGOEnterprise;
import Business.Organization.CorporateOrganization;
import Business.Organization.NGOOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.Workshops.Workshop;
import java.util.ArrayList;
import javax.swing.JPanel;
import ui.StudentRole.StudentWorkAreaJPanel;

public class StudentRole extends Role {

    @Override
    public String toString() {
        return RoleType.Student.getValue();
    }

    @Override
    public void performDuties() {
        System.out.println("Student Role: Accessing resources and submitting requests.");
    }
    
    
// In StudentRole.java
@Override
public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
    // Retrieve the list of workshops from the relevant organization or enterprise
    ArrayList<Workshop> workshopList = getWorkshopsFromEnterprise(enterprise);

    // Pass workshops to the StudentWorkAreaJPanel constructor
    return new StudentWorkAreaJPanel(userProcessContainer, account, organization, enterprise, business, workshopList);
}

private ArrayList<Workshop> getWorkshopsFromEnterprise(Enterprise enterprise) {
    // Logic to fetch workshops from the relevant enterprise or organization
    // For example, if the workshops are stored in the NGO or Corporate organization:
    
    ArrayList<Workshop> workshopList = new ArrayList<>();
    
    if (enterprise instanceof NGOEnterprise) {
        NGOOrganization ngoOrg = (NGOOrganization) enterprise.getOrganizationDirectory().getOrganizations().get(0);
        workshopList = ngoOrg.getWorkshopDirectory().getWorkshopList();
    }
    
    if (enterprise instanceof CorporateEnterprise) {
        CorporateOrganization corporateOrg = (CorporateOrganization) enterprise.getOrganizationDirectory().getOrganizations().get(0);
        workshopList = corporateOrg.getWorkshopDirectory().getWorkshopList();
    }
    
    return workshopList;
}

}


