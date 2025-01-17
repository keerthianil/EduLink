/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import Business.EcoSystem;
import Business.DB4OUtil.DB4OUtil;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import ui.StudentRole.NewStudentLoginJPanel;


public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();

    public MainJFrame() {
        initComponents();
        system = dB4OUtil.retrieveSystem();
        this.setSize(1680, 1050);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        loginJButton = new javax.swing.JButton();
        userNameJTextField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        loginJLabel = new javax.swing.JLabel();
        logoutJButton = new javax.swing.JButton();
        signUpJButton = new javax.swing.JButton();
        container = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(160, 210, 225));
        jPanel1.setPreferredSize(new java.awt.Dimension(170, 429));

        loginJButton.setBackground(new java.awt.Color(237, 252, 255));
        loginJButton.setFont(new java.awt.Font("Sathu", 0, 13)); // NOI18N
        loginJButton.setText("Login");
        loginJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginJButtonActionPerformed(evt);
            }
        });

        userNameJTextField.setBounds(new java.awt.Rectangle(5, 5, 0, 0));

        jLabel1.setFont(new java.awt.Font("Sathu", 0, 12)); // NOI18N
        jLabel1.setText("User Name");

        jLabel2.setFont(new java.awt.Font("Sathu", 0, 13)); // NOI18N
        jLabel2.setText("Password");

        logoutJButton.setFont(new java.awt.Font("Sathu", 0, 13)); // NOI18N
        logoutJButton.setText("Logout");
        logoutJButton.setEnabled(false);
        logoutJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutJButtonActionPerformed(evt);
            }
        });

        signUpJButton.setBackground(new java.awt.Color(255, 240, 240));
        signUpJButton.setFont(new java.awt.Font("Sathu", 0, 12)); // NOI18N
        signUpJButton.setText("Sign Up As A Student");
        signUpJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(loginJLabel))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(signUpJButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logoutJButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(loginJButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(passwordField, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(userNameJTextField, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(loginJButton)
                .addGap(26, 26, 26)
                .addComponent(logoutJButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginJLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addComponent(signUpJButton)
                .addGap(64, 64, 64))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {loginJButton, logoutJButton, signUpJButton});

        jSplitPane1.setLeftComponent(jPanel1);

        container.setBackground(new java.awt.Color(255, 248, 248));
        container.setLayout(new java.awt.CardLayout());

        jLabel3.setFont(new java.awt.Font("Sathu", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Welcome To Edulink! ");
        container.add(jLabel3, "card2");

        jSplitPane1.setRightComponent(container);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginJButtonActionPerformed
String userName = userNameJTextField.getText();
    char[] passwordCharArray = passwordField.getPassword();
    String password = String.valueOf(passwordCharArray);

    // Debug: Log the entered credentials
    System.out.println("Attempting login with Username: " + userName);
    System.out.println("system " + system);

    // Step 1: Check in the system admin user account directory
    UserAccount userAccount = system.getUserAccountDirectory().authenticateUser(userName, password);

    Enterprise inEnterprise = null;
    Organization inOrganization = null;

    if (userAccount == null) {
        // Step 2: Traverse through networks
        for (Network network : system.getNetworkList()) {
            // Step 2a: Check in enterprise user directories
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                userAccount = enterprise.getUserAccountDirectory().authenticateUser(userName, password);
                if (userAccount != null) {
                    inEnterprise = enterprise;
                    break;
                }

                // Step 2b: Check in organization user directories
                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    userAccount = organization.getUserAccountDirectory().authenticateUser(userName, password);
                    if (userAccount != null) {
                        inEnterprise = enterprise;
                        inOrganization = organization;
                        break;
                    }
                }
                if (userAccount != null) {
                    break;
                }
            }
            if (userAccount != null) {
                break;
            }
        }
    }

    if (userAccount == null) {
        JOptionPane.showMessageDialog(null, "Invalid credentials");
        return;
    } else {
        System.out.println("Login successful for user: " + userAccount.getUsername() + ", Role: " + userAccount.getRole());
        
        CardLayout layout = (CardLayout) container.getLayout();
        container.add("workArea", userAccount.getRole().createWorkArea(container, userAccount, inOrganization, inEnterprise, system));
        layout.next(container);
    }

    loginJButton.setEnabled(false);
    logoutJButton.setEnabled(true);
    userNameJTextField.setEnabled(false);
    passwordField.setEnabled(false);

    }//GEN-LAST:event_loginJButtonActionPerformed

    private void logoutJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutJButtonActionPerformed
        logoutJButton.setEnabled(false);
        userNameJTextField.setEnabled(true);
        passwordField.setEnabled(true);
        loginJButton.setEnabled(true);

        userNameJTextField.setText("");
        passwordField.setText("");

        container.removeAll();
        JPanel blankJP = new JPanel();
        container.add("blank", blankJP);
        CardLayout crdLyt = (CardLayout) container.getLayout();
        crdLyt.next(container);
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_logoutJButtonActionPerformed

    private void signUpJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpJButtonActionPerformed


    
        
        CardLayout layout = (CardLayout) container.getLayout();
        // i have a jform called NewStudentLoginJPanel which is a jpanel i think i have to pass the userproceess container to it i basically have to navigate to that jpanel
        container.add("NewStudentLoginJPanel", new NewStudentLoginJPanel(container, system));
        layout.next(container);
       
        
    

    
    }//GEN-LAST:event_signUpJButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel container;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton loginJButton;
    private javax.swing.JLabel loginJLabel;
    private javax.swing.JButton logoutJButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JButton signUpJButton;
    private javax.swing.JTextField userNameJTextField;
    // End of variables declaration//GEN-END:variables
}