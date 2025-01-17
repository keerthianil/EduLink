package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import ui.DonorRole.DonorDashboardJPanel;
import ui.DonorRole.FundRequestsScreenJPanel;

import javax.swing.JPanel;

public class DonorRole extends Role {

    @Override
    public void performDuties() {
        // Simulate actions a Donor would perform
        System.out.println("Donor is funding resource requests.");
    }
    
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        DonorDashboardJPanel DonorDashboardJPanel = new DonorDashboardJPanel(userProcessContainer, account, organization, enterprise, business);
        //FundRequestsScreenJPanel FundRequestsScreenJPanel = new FundRequestsScreenJPanel(userProcessContainer, business, account);
        userProcessContainer.add("DonorDashboardJPanel", DonorDashboardJPanel);
        return DonorDashboardJPanel;

    }
}
