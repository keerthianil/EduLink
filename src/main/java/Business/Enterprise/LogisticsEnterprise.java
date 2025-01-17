/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import Business.Role.Role;
import Business.Role.LogisticsRole;
import java.util.ArrayList;

public class LogisticsEnterprise extends Enterprise {

    public LogisticsEnterprise(String name) {
        super(name, EnterpriseType.Logistics);
    }

    @Override
    public void enterpriseOperations() {
        System.out.println("Managing logistics and transportation operations.");
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new LogisticsRole()); // Example role specific to Logistics
        return roles;
    }
}


