/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.SystemAdminRole.SystemAdminWorkAreaJPanel;

public class AdminRole extends Role {

    public void workArea() {
        System.out.println("Admin manages system-level configurations and resources.");
    }

    @Override
    public String toString() {
        return "Admin Role";
    }

    @Override
    public void performDuties() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
