/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.DonorRole;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.CardLayout;
import java.awt.Component;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.FundRequest;
import ui.DonorRole.FundRequestsScreenJPanel;

/**
 *
 * @author keerthiareddy
 */
public class FundRequestsDialogJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount donorAccount;
    private FundRequest fundRequest;


    /**
     * Creates new form FundRequestsModelJPanel
     */
    public FundRequestsDialogJPanel(JPanel userProcessContainer, EcoSystem system, UserAccount donorAccount, FundRequest fundRequest) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.donorAccount = donorAccount;
        this.fundRequest = fundRequest;

        populateDetails();
    }

    private void populateDetails() {
        jTextArea1.setText(fundRequest.getType()); // Request Type
        jTextArea2.setText(fundRequest.getRequester().getEmployee().getName()); // Beneficiary Name
        jTextArea3.setText(String.valueOf(fundRequest.getPrice())); // Amount Needed
        jTextField1.setText(""); // Clear funding amount input
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jLabel1.setText("Request Type:");

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 15)); // NOI18N
        jLabel2.setText("Fund Requests");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel3.setText("Beneficiary:");

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jLabel4.setText("Amount Needed:");

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        jLabel5.setText("Funding Amount:");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setText("Confirm Funding");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Cancel Funding");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(361, 361, 361))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1)
                                .addGap(298, 298, 298))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(209, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addContainerGap(288, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    //     String input = jTextField1.getText().trim();
    // if (input.isEmpty()) {
    //     JOptionPane.showMessageDialog(this, "Please enter a funding amount.", "Validation Error", JOptionPane.ERROR_MESSAGE);
    //     return;
    // }

    // try {
    //     double amount = Double.parseDouble(input);
    //     if (amount <= 0 || amount > (fundRequest.getPrice() - fundRequest.getAmountFunded())) {
    //         JOptionPane.showMessageDialog(this, "Invalid funding amount. Please enter a valid amount.", "Validation Error", JOptionPane.ERROR_MESSAGE);
    //         return;
    //     }

    //     // Update funding details
    //     fundRequest.setAmountFunded(fundRequest.getAmountFunded() + amount);
    //     if (fundRequest.getAmountFunded() == fundRequest.getPrice()) {
    //         fundRequest.setStatus("Fully Funded");
    //     } else {
    //         fundRequest.setStatus("Partially Funded");
    //     }

    //     JOptionPane.showMessageDialog(this, "Thank you for your contribution!", "Success", JOptionPane.INFORMATION_MESSAGE);

    //     // Navigate back to FundRequestsScreenJPanel
    //     userProcessContainer.remove(this);
    //     CardLayout layout = (CardLayout) userProcessContainer.getLayout();
    //     layout.previous(userProcessContainer);

    // } catch (NumberFormatException e) {
    //     JOptionPane.showMessageDialog(this, "Invalid input! Please enter a numeric value.", "Error", JOptionPane.ERROR_MESSAGE);
    // } 
String input = jTextField1.getText().trim(); // Get funding amount
    if (input.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter a funding amount.", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
        double amount = Double.parseDouble(input);
        if (amount <= 0 || amount > (fundRequest.getPrice() - fundRequest.getAmountFunded())) {
            JOptionPane.showMessageDialog(this, "Invalid funding amount. Please enter a valid amount.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Dynamically update the funding amount
        fundRequest.setAmountFunded(fundRequest.getAmountFunded() + amount);
        if (fundRequest.getAmountFunded() >= fundRequest.getPrice()) {
            fundRequest.setStatus("Fully Funded");
        } else {
            fundRequest.setStatus("Partially Funded");
        }

        // Provide confirmation
        JOptionPane.showMessageDialog(this, "Thank you for your contribution!", "Success", JOptionPane.INFORMATION_MESSAGE);

        // Refresh the previous screen (FundRequestsScreenJPanel)
        userProcessContainer.remove(this);
        Component[] components = userProcessContainer.getComponents();
        for (Component component : components) {
            if (component instanceof FundRequestsScreenJPanel) {
                FundRequestsScreenJPanel panel = (FundRequestsScreenJPanel) component;
                panel.populateFundRequestsTable(); // Refresh table
            }
        }

        // Navigate back to previous screen
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Invalid input! Please enter a numeric value.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}