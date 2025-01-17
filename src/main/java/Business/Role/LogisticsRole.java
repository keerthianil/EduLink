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
import ui.LogisticsRole.LogisticRoleJPanel;

public class LogisticsRole extends Role {

    @Override
    public String toString() {
        return RoleType.Logistics.getValue();
    }

    @Override
    public void performDuties() {
        System.out.println("Logistics Role: Managing transportation and delivery operations.");
    }
    
        public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        LogisticRoleJPanel LogisticRoleJPanel = new LogisticRoleJPanel(business);
        userProcessContainer.add("LogisticRoleJPanel", LogisticRoleJPanel);
        return LogisticRoleJPanel;
    }
}



