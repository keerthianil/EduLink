
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.Component;
import javax.swing.JPanel;


public abstract class Role {

//    public Component createWorkArea(JPanel container, UserAccount userAccount, Organization inOrganization, Enterprise inEnterprise, EcoSystem system) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }

    public enum RoleType {
        NGO("NGO Representative"),
        Teacher("Teacher"),
        Student("Student"),
        Corporate("Corporate Representative"),
        Trainer("Trainer"),
        Logistics("Logistics Manager"),
        Advisor("Advisor"),
        SystemAdmin("System Administrator"),
        Parent("Parent");

        private String value;

        RoleType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    /**
     * Abstract method to define duties for each role.
     * Must be implemented in all subclasses.
     */
    public abstract void performDuties();

public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
}

