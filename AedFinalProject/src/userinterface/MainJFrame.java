/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import Business.EcoSystem;
import Business.ConfigureASystem;
import Business.DB4OUtil.DB4OUtil;
import Business.Enterprise.Enterprise;
import Business.Network.CountryNetwork;
import Business.Network.StateNetwork;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import com.sun.glass.events.KeyEvent;
import java.awt.CardLayout;
import javafx.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import userinterface.SignUp.SignUpWelcome;
import userinterface.googleApi.DistanceJPanel;

/**
 *
 * @author Administrator
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();

    public MainJFrame() {
        initComponents();
        system = dB4OUtil.retrieveSystem();
        EcoSystem.setInstance(system);
        setExtendedState(getExtendedState()| JFrame.MAXIMIZED_BOTH);
//        VaccineDirectory v= new VaccineDirectory();
//        DiseaseDirectory d= new DiseaseDirectory();
//        system.setDiseaseList(d);
//        system.setVaccineList(v);
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
        btnSignUp = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnHomeless = new javax.swing.JButton();
        lblWelcome = new javax.swing.JLabel();
        container = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setDividerSize(10);

        jPanel1.setBackground(new java.awt.Color(71, 79, 112));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginJButton.setBackground(new java.awt.Color(0, 0, 0));
        loginJButton.setForeground(new java.awt.Color(255, 255, 255));
        loginJButton.setText("Login");
        loginJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(loginJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 100, -1));
        jPanel1.add(userNameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 118, -1));

        passwordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordFieldKeyPressed(evt);
            }
        });
        jPanel1.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 118, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("User Name");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));
        jPanel1.add(loginJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, -1, -1));

        logoutJButton.setText("Logout");
        logoutJButton.setEnabled(false);
        logoutJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(logoutJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 100, -1));

        btnSignUp.setText("Sign Up");
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });
        jPanel1.add(btnSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 100, -1));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, -1));

        btnHomeless.setText("Homeless Found");
        btnHomeless.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomelessActionPerformed(evt);
            }
        });
        jPanel1.add(btnHomeless, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, 110, 50));

        lblWelcome.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lblWelcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 80, 40));

        jSplitPane1.setLeftComponent(jPanel1);

        container.setBackground(new java.awt.Color(255, 255, 255));
        container.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(container);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginJButtonActionPerformed
        // Get user name
        System.out.println("event"+evt);
        String userName = userNameJTextField.getText();
        // Get Password
        char[] passwordCharArray = passwordField.getPassword();
        
        String password = String.valueOf(passwordCharArray);

        //Step1: Check in the system user account directory if you have the user
        
        UserAccount userAccount = system.getUserAccountDirectory().authenticateUser(userName, password);
        
        Enterprise inEnterprise = null;
        Organization inOrganization = null;
        StateNetwork inNetwork= null;
        CountryNetwork outNetwork=null;
        if (userAccount == null) {
            //Step2: Go inside each network to check each enterprise
            for (CountryNetwork cnetwork : system.getNetworkList()) {
            for (StateNetwork network : cnetwork.getStateList()) {
                //Step 2-a: Check against each enterprise
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                    userAccount = enterprise.getUserAccountDirectory().authenticateUser(userName, password);
                    if (userAccount == null) {
                        //Step3: Check against each organization inside that enterprise
                        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                            userAccount = organization.getUserAccountDirectory().authenticateUser(userName, password);
                            
                            if (userAccount != null) {
                            //    System.out.println("organi"+ organization.getName());
                                inEnterprise = enterprise;
                                inOrganization = organization;
                                inNetwork= network;
                                outNetwork=cnetwork;
                                break;
                            }
                        }
                    } else {
                        inNetwork= network;
                        inEnterprise = enterprise;
                        outNetwork=cnetwork;
                        break;
                    }
                    if (inOrganization != null) {
                        break;
                    }
                }
                if (inEnterprise != null) {
                    break;
                }
            }
        }
        }
        else{
            for (CountryNetwork countryNetwork : system.getNetworkList()) {
                if(countryNetwork.getName().equalsIgnoreCase(userName)){
                    outNetwork=countryNetwork;
                }
            }
        }
    
        if (userAccount == null) {
            JOptionPane.showMessageDialog(null, "Invalid Credentails!");
            return;
        } else {
            CardLayout layout = (CardLayout) container.getLayout();
            container.add("workArea", userAccount.getRole().createWorkArea(container, userAccount, inOrganization, inEnterprise, inNetwork, outNetwork, system));
            layout.next(container);
            lblWelcome.setText("Welcome"+userAccount.getEmployee().getName());
        }
         loginJButton.setEnabled(false);
         btnSignUp.setEnabled(false);
        logoutJButton.setEnabled(true);
        userNameJTextField.setEnabled(false);
        passwordField.setEnabled(false);
        
    }//GEN-LAST:event_loginJButtonActionPerformed

    private void logoutJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutJButtonActionPerformed
        logoutJButton.setEnabled(false);
        userNameJTextField.setEnabled(true);
        passwordField.setEnabled(true);
        loginJButton.setEnabled(true);
        btnSignUp.setEnabled(true);
        userNameJTextField.setText("");
        passwordField.setText("");

        container.removeAll();
        JPanel blankJP = new JPanel();
        container.add("blank", blankJP);
        CardLayout crdLyt = (CardLayout) container.getLayout();
        crdLyt.next(container);
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_logoutJButtonActionPerformed

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        // TODO add your handling code here:
        
                    SignUpWelcome panel = new SignUpWelcome(container,system);
                    container.add("SignUpWelcome", panel);
                    CardLayout layout = (CardLayout) container.getLayout();
                    layout.next(container);   
        
    }//GEN-LAST:event_btnSignUpActionPerformed

    private void passwordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordFieldKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
        //loginJButtonActionPerformed(evt)  ;
        
            String userName = userNameJTextField.getText();
        // Get Password
        char[] passwordCharArray = passwordField.getPassword();
        
        String password = String.valueOf(passwordCharArray);

        //Step1: Check in the system user account directory if you have the user
        
        UserAccount userAccount = system.getUserAccountDirectory().authenticateUser(userName, password);
        
        Enterprise inEnterprise = null;
        Organization inOrganization = null;
        StateNetwork inNetwork= null;
        CountryNetwork outNetwork=null;
        if (userAccount == null) {
            //Step2: Go inside each network to check each enterprise
            for (CountryNetwork cnetwork : system.getNetworkList()) {
            for (StateNetwork network : cnetwork.getStateList()) {
                //Step 2-a: Check against each enterprise
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                    userAccount = enterprise.getUserAccountDirectory().authenticateUser(userName, password);
                    if (userAccount == null) {
                        //Step3: Check against each organization inside that enterprise
                        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                            userAccount = organization.getUserAccountDirectory().authenticateUser(userName, password);
                            
                            if (userAccount != null) {
                            //    System.out.println("organi"+ organization.getName());
                                inEnterprise = enterprise;
                                inOrganization = organization;
                                inNetwork= network;
                                outNetwork=cnetwork;
                                break;
                            }
                        }
                    } else {
                        inNetwork= network;
                        inEnterprise = enterprise;
                        outNetwork=cnetwork;
                        break;
                    }
                    if (inOrganization != null) {
                        break;
                    }
                }
                if (inEnterprise != null) {
                    break;
                }
            }
        }
        }
        else{
            for (CountryNetwork countryNetwork : system.getNetworkList()) {
                if(countryNetwork.getName().equalsIgnoreCase(userName)){
                    outNetwork=countryNetwork;
                }
            }
        }
    
        if (userAccount == null) {
            JOptionPane.showMessageDialog(null, "Invalid Credentails!");
            return;
        } else {
            CardLayout layout = (CardLayout) container.getLayout();
            container.add("workArea", userAccount.getRole().createWorkArea(container, userAccount, inOrganization, inEnterprise, inNetwork, outNetwork, system));
            layout.next(container);
        }
         loginJButton.setEnabled(false);
         btnSignUp.setEnabled(false);
        logoutJButton.setEnabled(true);
        userNameJTextField.setEnabled(false);
        passwordField.setEnabled(false);
        }
    }//GEN-LAST:event_passwordFieldKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         DistanceJPanel manageOrganizationJPanel = new DistanceJPanel(container);
        container.add("DistanceJPanel", manageOrganizationJPanel);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnHomelessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomelessActionPerformed
        // TODO add your handling code here:
         DistanceJPanel manageOrganizationJPanel = new DistanceJPanel(container);
        container.add("DistanceJPanel", manageOrganizationJPanel);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_btnHomelessActionPerformed

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
    private javax.swing.JButton btnHomeless;
    private javax.swing.JButton btnSignUp;
    private javax.swing.JPanel container;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JButton loginJButton;
    private javax.swing.JLabel loginJLabel;
    private javax.swing.JButton logoutJButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField userNameJTextField;
    // End of variables declaration//GEN-END:variables
}
