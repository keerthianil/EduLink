/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import ui.CorporateRole.CorporateSponsorWorkAreaJPanel;
import ui.DonorRole.DonorDashboardJPanel;

import javax.swing.JPanel;
import java.awt.CardLayout;

public class CorporateRole extends Role {

    @Override
    public void performDuties() {
        System.out.println("Corporate role handles sponsorships, partnerships, and outreach activities.");
        
    
    }

    @Override
    public String toString() {
        return "CorporateRole";
    }
    

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {

        CorporateSponsorWorkAreaJPanel CorporateSponsorWorkAreaJPanel = new CorporateSponsorWorkAreaJPanel(business, account);
        //FundRequestsScreenJPanel FundRequestsScreenJPanel = new FundRequestsScreenJPanel(userProcessContainer, business, account);
        userProcessContainer.add("CorporateSponsorWorkAreaJPanel", CorporateSponsorWorkAreaJPanel);
        return CorporateSponsorWorkAreaJPanel;
    }
}


