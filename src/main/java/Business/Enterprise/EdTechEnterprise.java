/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import Business.Role.Role;
import Business.Role.TeacherRole;
import java.util.ArrayList;

public class EdTechEnterprise extends Enterprise {
    public EdTechEnterprise(String name) {
        super(name, EnterpriseType.EdTech);
    }

    @Override
    public void enterpriseOperations() {
        System.out.println("Providing educational resources.");
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new TeacherRole()); // Example role specific to EdTech
        return roles;
    }
}



