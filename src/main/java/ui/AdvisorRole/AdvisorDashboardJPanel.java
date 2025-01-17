/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.AdvisorRole;

import javax.swing.JPanel;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;

/**
 *
 * @author keerthiareddy
 */
public class AdvisorDashboardJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;
   
    private UserAccount currentAdvisor;

    private String studentNamesString;
    


    /**
     * Creates new form AdvisorDashboardJPanel
     */
    public AdvisorDashboardJPanel(JPanel userProcessContainer, EcoSystem system , UserAccount account) {
        initComponents();


        this.userProcessContainer = userProcessContainer;

        this.system = system;

        currentAdvisor = account;
        
     


        updateDashboard();
    }


    private void updateDashboard() {
    int pendingCount = 0;
    int upcomingSessions = 0;

    // Get the current advisor's account
    

    for (UserAccount student : system.getUserAccountDirectory().getUserAccountList()) {
        // Check if the student is assigned to the current advisor
        if (student.getAssignedAdvisor() != null && student.getAssignedAdvisor().equals(currentAdvisor)) {
            for (WorkRequest request : student.getWorkQueue().getWorkRequestList()) {
                if (request.getType().equals("Class Request")) {
                    if (request.getStatus().equals("Pending")) {
                        pendingCount++;
                    } else if (request.getStatus().equals("In Progress")) {
                        upcomingSessions++;
                    }
                }
            }
        }
    }


    StringBuilder studentNames = new StringBuilder();

    for (UserAccount student : system.getUserAccountDirectory().getUserAccountList()) {
        if (student.getAssignedAdvisor() != null && student.getAssignedAdvisor().equals(currentAdvisor)) {
            studentNames.append(student.getUsername()).append(", ");
        }
    }

    // Remove the trailing comma and space if there are any student names
    if (studentNames.length() > 0) {
        studentNames.setLength(studentNames.length() - 2);
    }

    studentNamesString = studentNames.toString();
    
    PendingRequestsTxt.setText(String.valueOf(pendingCount));
    UpcomingSessionsTxt.setText(String.valueOf(upcomingSessions));
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        UpcomingSessionsTxt = new javax.swing.JTextField();
        PendingRequestsTxt = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 234, 208));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 15)); // NOI18N
        jLabel1.setText("Advisor Dashboard");

        jLabel2.setText("Pending Requests:");

        jLabel3.setText("Upcoming Sessions:");

        jButton1.setText("View Student Requests");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Add Recommendation");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(116, 116, 116)
                                .addComponent(jButton2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(59, 59, 59)
                                .addComponent(PendingRequestsTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(70, 70, 70)
                                .addComponent(UpcomingSessionsTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(269, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(UpcomingSessionsTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(PendingRequestsTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 156, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton1))
                        .addGap(152, 152, 152))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    StudentRequestsJPanel panel = new StudentRequestsJPanel(userProcessContainer, system, currentAdvisor);
    userProcessContainer.add("StudentRequestsJPanel", panel);
    CardLayout layout = (CardLayout) userProcessContainer.getLayout();
    layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    StudentFeedbackDialogJPanel  panel = new StudentFeedbackDialogJPanel(userProcessContainer, system, currentAdvisor);
    userProcessContainer.add("StudentFeedbackDialogJPanel", panel);
    CardLayout layout = (CardLayout) userProcessContainer.getLayout();
    layout.next(userProcessContainer);
    
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField PendingRequestsTxt;
    private javax.swing.JTextField UpcomingSessionsTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
