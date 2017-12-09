/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SignUp;

import Business.EcoSystem;
import Business.Network.CountryNetwork;
import Business.SignUp.SignUpRequestCountry;
import Business.WorkQueue.WorkRequest;
import java.awt.image.BufferedImage;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import utility.Validator;

/**
 *
 * @author pooji
 */
public class SignUpJPanelCountry extends javax.swing.JPanel {

    /**
     * Creates new form SignUpJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    private BufferedImage file;
    private JFileChooser openFile;

    public SignUpJPanelCountry(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.system = system;
        this.userProcessContainer = userProcessContainer;
        txtUserName.setEnabled(false);
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
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();
        txtUserName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        lblName = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(71, 79, 112));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(71, 79, 112));
        jLabel1.setText("Register Country");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 210, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(71, 79, 112));
        jLabel3.setText("Name :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, -1, -1));

        txtName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNameFocusLost(evt);
            }
        });
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 170, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(71, 79, 112));
        jLabel5.setText("User Name :");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, -1, -1));

        btnCreate.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnCreate.setForeground(new java.awt.Color(71, 79, 112));
        btnCreate.setText("Register");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, 160, 40));
        add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 170, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(71, 79, 112));
        jLabel6.setText("Email Id :");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, -1, -1));

        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });
        add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, 170, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(71, 79, 112));
        jLabel7.setText("Password:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, -1, -1));

        txtPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPasswordFocusLost(evt);
            }
        });
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 170, -1));

        lblName.setForeground(new java.awt.Color(255, 0, 0));
        add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 110, -1, -1));

        lblEmail.setForeground(new java.awt.Color(255, 0, 0));
        add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 230, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        try {
            for (WorkRequest workReq : system.getWorkQueue().getWorkRequestList()) {
                if (workReq instanceof SignUpRequestCountry) {
                    if (((SignUpRequestCountry) workReq).getName().equals(txtName.getText())) {
                        JOptionPane.showMessageDialog(null, "Request Already raised for this country");
                        return;
                    }
                }
            }

            for (CountryNetwork cN : system.getNetworkList()) {
                if (txtName.getText().equals(cN.getName())) {
                    JOptionPane.showMessageDialog(null, "Country Already exists please enter a new country");
                    return;
                }
            }

            String password = String.valueOf(txtPassword.getPassword());
            if (!txtUserName.getText().isEmpty()) {
                if (!txtName.getText().isEmpty()) {
                    if (!password.isEmpty()) {
                        if (txtUserName.getText().equalsIgnoreCase(txtName.getText())) {

                                SignUpRequestCountry countryRequest = new SignUpRequestCountry();
                                countryRequest.setUserName(txtUserName.getText());
                                countryRequest.setName(txtName.getText());
                                countryRequest.setPassword(password);
                                countryRequest.setEmail(txtEmail.getText());
                                countryRequest.setStatus("Requested");
                                system.getWorkQueue().getWorkRequestList().add(countryRequest);

                                JOptionPane.showMessageDialog(null, "Request raised Successfully");
                                txtEmail.setText("");
                                txtPassword.setText("");
                                txtName.setText("");
                                txtUserName.setText("");

                        } else {
                            JOptionPane.showMessageDialog(null, "Username and Country name should be same");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Please enter value for password ");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Name cannot be empty");
                }

            } else {
                JOptionPane.showMessageDialog(null, "Please enter User Name");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Sorry for the inconvinence. Technical team is working on it", "Warning", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btnCreateActionPerformed

    private void txtNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNameFocusLost
        // TODO add your handling code here:
        if (!txtName.getText().isEmpty()) {
            if (!Validator.validateName(txtName.getText())) {
                lblName.setText("*Only Alphabets and Spaces are allowed");
                txtName.setText("");
            } else {
                lblName.setText("");
                txtUserName.setText(txtName.getText());
            }
        }
    }//GEN-LAST:event_txtNameFocusLost

    private void txtPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusLost
        // TODO add your handling code here:
        String password = String.valueOf(txtPassword.getPassword());
        if (!password.isEmpty()) {
            if (!Validator.validatePassword(password)) {
                JOptionPane.showMessageDialog(null, "Password should Contain \n"
                        + "       # At least one digit\n"
                        + "       # At least one lower case letter\n"
                        + "       # At least one upper case letter\n"
                        + "       # At least one special character\n"
                        + "       # no whitespace allowed in the entire string\n"
                        + "       # at least eight characters");
                txtPassword.setText("");
            }
        }
    }//GEN-LAST:event_txtPasswordFocusLost

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
        // TODO add your handling code here:
        if (!txtEmail.getText().isEmpty()) {
            if (!Validator.validateEmail(txtEmail.getText())) {
                lblEmail.setText("*Enter a Valid Email");
                txtEmail.setText("");
            } else {
                lblEmail.setText("");
            }
        }
    }//GEN-LAST:event_txtEmailFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblName;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
