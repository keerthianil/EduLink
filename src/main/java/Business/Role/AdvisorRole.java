/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

import ui.AdvisorRole.AdvisorDashboardJPanel;
import ui.DonorRole.DonorDashboardJPanel;
import ui.SystemAdminRole.SystemAdminWorkAreaJPanel;

/**
 *
 * @author harshithachennareddy
 */
public class AdvisorRole extends Role {

    @Override
    public void performDuties() {
        // Implementation of performDuties method
    }


    
    @Override
public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
    return new AdvisorDashboardJPanel(userProcessContainer, business, account);
}
//    
}
