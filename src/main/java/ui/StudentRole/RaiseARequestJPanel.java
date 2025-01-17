/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.StudentRole;

import Business.EcoSystem;
import Business.WorkQueue.WorkQueue;
import Business.WorkQueue.WorkRequest;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author harshithachennareddy
 */
public class RaiseARequestJPanel extends javax.swing.JPanel {
    private EcoSystem system;
    private UserAccount userAccount;
    private JPanel userProcessContainer;

    /**
     * Creates new form RaiseARequestJPanel
     */
    public RaiseARequestJPanel(JPanel userProcessContainer, EcoSystem system, UserAccount userAccount) {
        initComponents();
        this.system = system;
        this.userAccount = userAccount;
        this.userProcessContainer = userProcessContainer;
        
        RequestTypeComboBox.removeAllItems();
        RequestTypeComboBox.addItem("Class Request");
        RequestTypeComboBox.addItem("Resource Request");

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
        submitRequestbtn = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        acknowledgeCheckBox = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        RequestDescriptionTextArea = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        RequestTypeComboBox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        requestTitleTxt = new javax.swing.JTextField();
        locationtxt = new javax.swing.JTextField();

        setBackground(new java.awt.Color(240, 230, 239));

        jLabel1.setFont(new java.awt.Font("Sathu", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Raise A New Request");

        submitRequestbtn.setBackground(new java.awt.Color(239, 188, 226));
        submitRequestbtn.setText("Submit Request");
        submitRequestbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitRequestbtnActionPerformed(evt);
            }
        });

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        acknowledgeCheckBox.setText(" I confirm that this request is genuine and necessary for my learning.");
        acknowledgeCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acknowledgeCheckBoxActionPerformed(evt);
            }
        });

        jLabel2.setText("Request Title");

        jLabel3.setText("Request Description");

        RequestDescriptionTextArea.setColumns(20);
        RequestDescriptionTextArea.setRows(5);
        jScrollPane1.setViewportView(RequestDescriptionTextArea);

        jLabel4.setText("Location");

        RequestTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setText("Request Type");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(backJButton))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1038, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(363, 363, 363)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(requestTitleTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(321, 321, 321)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel4)
                            .addGap(18, 18, 18)
                            .addComponent(locationtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(358, 358, 358)
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(RequestTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(acknowledgeCheckBox))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(414, 414, 414)
                        .addComponent(submitRequestbtn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(requestTitleTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(RequestTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(locationtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(acknowledgeCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(submitRequestbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(backJButton)
                .addGap(17, 17, 17))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void submitRequestbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitRequestbtnActionPerformed
        // TODO add your handling code here:
        String title = requestTitleTxt.getText().trim();
        String description = RequestDescriptionTextArea.getText().trim();
        String type = (String) RequestTypeComboBox.getSelectedItem();
        String location = locationtxt.getText().trim();
        boolean isAcknowledged = acknowledgeCheckBox.isSelected();
        
        // Validate mandatory fields
        if (title.isEmpty() || description.isEmpty() || location.isEmpty() || type == null) {
            JOptionPane.showMessageDialog(this, "Please fill in all mandatory fields!", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Ensure acknowledgment checkbox is selected
        if (!isAcknowledged) {
            JOptionPane.showMessageDialog(this, "Please acknowledge that the request is genuine!", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        WorkRequest newRequest = new WorkRequest(title, type, description, location, userAccount);
        userAccount.getWorkQueue().addWorkRequest(newRequest);
        
        JOptionPane.showMessageDialog(this, "Request submitted successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);

        // print all the workrequests in the 
        WorkQueue workQueue = userAccount.getWorkQueue();
        for (WorkRequest request : workQueue.getWorkRequestList()) {
            System.out.println("Request ID: " + request.getId() + ", Type: " + request.getType() + ", Status: " + request.getStatus());
        }

        EcoSystem.getInstance().getWorkQueue().addWorkRequest(newRequest);




        // Clear the form fields
        requestTitleTxt.setText("");
        RequestDescriptionTextArea.setText("");
        locationtxt.setText("");
        acknowledgeCheckBox.setSelected(false);
    }//GEN-LAST:event_submitRequestbtnActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        // go back to StudentWorkAreaJPAnel

        StudentWorkAreaJPanel swajp = (StudentWorkAreaJPanel) component;
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_backJButtonActionPerformed

    private void acknowledgeCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acknowledgeCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_acknowledgeCheckBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea RequestDescriptionTextArea;
    private javax.swing.JComboBox<String> RequestTypeComboBox;
    private javax.swing.JCheckBox acknowledgeCheckBox;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField locationtxt;
    private javax.swing.JTextField requestTitleTxt;
    private javax.swing.JButton submitRequestbtn;
    // End of variables declaration//GEN-END:variables
}