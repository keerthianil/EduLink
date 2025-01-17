/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import Business.Role.Role;
import Business.Role.NGORole;
import java.util.ArrayList;

public class NGOEnterprise extends Enterprise {
    public NGOEnterprise(String name) {
        super(name, EnterpriseType.NGO);
    }

    @Override
    public void enterpriseOperations() {
        System.out.println("Managing community welfare programs.");
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new NGORole()); // Example role specific to NGO
        return roles;
    }
}




