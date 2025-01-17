package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.NGOOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.NGORole.CreateWorkshopsJPanel;
import ui.NGORole.NGOWorkAreaJPanel;

public class NGORole extends Role {

    @Override
    public String toString() {
        return RoleType.NGO.getValue();
    }

    @Override
    public void performDuties() {
        System.out.println("NGO Role: Managing community resources and outreach programs.");
    }
    
    /**
     * This method is called when the NGO user logs in and needs to see their work area.
     * @param userProcessContainer the container to hold the work area panel
     * @param account the logged-in user account
     * @param organization the organization the user belongs to
     * @param enterprise the enterprise the organization belongs to
     * @param business the EcoSystem instance
     * @return a JPanel representing the work area of the NGO user
     */
public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
    // Casting the organization to NGOOrganization to access NGO-specific resources
    NGOOrganization ngoOrganization = (NGOOrganization) organization;

    // Creating the work area panel for the NGO role
    NGOWorkAreaJPanel NGOWorkAreaJPanel = new NGOWorkAreaJPanel(userProcessContainer, account, ngoOrganization, enterprise, business);

    // Adding the work area panel to the container
    userProcessContainer.add("NGOWorkAreaJPanel", NGOWorkAreaJPanel);
    return NGOWorkAreaJPanel;
}

}
