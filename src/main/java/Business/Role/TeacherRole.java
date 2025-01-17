/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import ui.LogisticsRole.LogisticRoleJPanel;
import ui.TeacherRole.TeacherWorkAreaJPanel;

import javax.swing.JPanel;

public class TeacherRole extends Role {

    

    @Override
    public void performDuties() {
        System.out.println("Teacher Role: Managing classes and student learning resources.");
    }
    
    
        public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        TeacherWorkAreaJPanel TeacherWorkAreaJPanel = new TeacherWorkAreaJPanel(account);
        userProcessContainer.add("TeacherWorkAreaJPanel", TeacherWorkAreaJPanel);
        return TeacherWorkAreaJPanel;
            
        
    }
}



