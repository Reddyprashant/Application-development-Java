/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SignUp;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.Enterprise.EnterpriseType;
import Business.Network.CountryNetwork;
import Business.Network.StateNetwork;
import Business.SignUp.SignUpRequestEnterprise;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import utility.Validator;

/**
 *
 * @author pooji
 */
public class SignUpJPanelEnterprise extends javax.swing.JPanel {

    /**
     * Creates new form SignUpJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    private BufferedImage file;
    private JFileChooser openFile;
     private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    public SignUpJPanelEnterprise(JPanel userProcessContainer, EcoSystem business) {
        initComponents();
        this.system = business;
        this.userProcessContainer = userProcessContainer;
        openFile = new JFileChooser();
        populateComboBox();
        
    }
    
    public void populateComboBox() {
        comboCountry.removeAllItems();
        if (!system.getNetworkList().isEmpty()) {
            for (CountryNetwork countryNetwork : system.getNetworkList()) {
                comboCountry.addItem(countryNetwork);
            }
            comboEnterprise.addItem(Enterprise.EnterpriseType.Beneficiary);
            comboEnterprise.addItem(Enterprise.EnterpriseType.Entity);
            comboEnterprise.addItem(Enterprise.EnterpriseType.Government);
            comboEnterprise.addItem(Enterprise.EnterpriseType.Logistic);
        } else {
            comboEnterprise.setEnabled(false);
            comboCountry.setEnabled(false);
            comboState.setEnabled(false);
            txtName.setEnabled(false);
            txtUserName.setEnabled(false);
            txtEmail.setEnabled(false);
            txtImage.setEnabled(false);
            txtPassword.setEnabled(false);
            btnFile.setEnabled(false);
            btnCreateState.setEnabled(false);
//            JOptionPane.showMessageDialog(null, "System is not available for the country, please contact the system administrator");
            lblWarning.setText("*System is not available for the country, please contact the system administrator");
        }
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        comboCountry = new javax.swing.JComboBox();
        txtImage = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        btnFile = new javax.swing.JButton();
        btnCreateState = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        comboEnterprise = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        comboState = new javax.swing.JComboBox();
        lblEmail = new javax.swing.JLabel();
        lblName1 = new javax.swing.JLabel();
        lblUserName1 = new javax.swing.JLabel();
        lblAcceptedUserName = new javax.swing.JLabel();
        lblWarning = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(71, 79, 112));
        jLabel1.setText("Register An Enterprise");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 370, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(71, 79, 112));
        jLabel3.setText("State:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(71, 79, 112));
        jLabel4.setText("Country:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 80, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(71, 79, 112));
        jLabel5.setText("User Name :");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, -1, -1));

        txtUserName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUserNameFocusLost(evt);
            }
        });
        add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 170, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(71, 79, 112));
        jLabel6.setText("Email Id :");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, -1, -1));

        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });
        add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, 170, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(71, 79, 112));
        jLabel7.setText("Password:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, -1, -1));

        txtPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPasswordFocusLost(evt);
            }
        });
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, 170, -1));

        comboCountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCountryActionPerformed(evt);
            }
        });
        add(comboCountry, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 310, 170, -1));

        txtImage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtImageKeyPressed(evt);
            }
        });
        add(txtImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 390, 170, -1));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(71, 79, 112));
        jLabel14.setText("Documents :");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, 100, -1));

        btnFile.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnFile.setForeground(new java.awt.Color(71, 79, 112));
        btnFile.setText("Choose File");
        btnFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFileActionPerformed(evt);
            }
        });
        add(btnFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 390, -1, -1));

        btnCreateState.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnCreateState.setForeground(new java.awt.Color(71, 79, 112));
        btnCreateState.setText("Register");
        btnCreateState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateStateActionPerformed(evt);
            }
        });
        add(btnCreateState, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 470, 120, 40));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(71, 79, 112));
        jLabel11.setText("Enterprise :");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 110, -1));

        comboEnterprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEnterpriseActionPerformed(evt);
            }
        });
        add(comboEnterprise, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 170, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(71, 79, 112));
        jLabel8.setText("Name :");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, -1, -1));

        txtName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNameFocusLost(evt);
            }
        });
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 170, -1));

        add(comboState, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, 170, -1));

        lblEmail.setForeground(new java.awt.Color(255, 0, 0));
        add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 270, -1, -1));

        lblName1.setForeground(new java.awt.Color(255, 0, 0));
        add(lblName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 150, -1, -1));

        lblUserName1.setForeground(new java.awt.Color(255, 0, 0));
        add(lblUserName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 190, -1, -1));

        lblAcceptedUserName.setForeground(new java.awt.Color(0, 204, 51));
        add(lblAcceptedUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 190, -1, -1));

        lblWarning.setForeground(new java.awt.Color(255, 51, 0));
        add(lblWarning, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 550, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtImageKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtImageKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtImageKeyPressed

    private void btnFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFileActionPerformed
        // TODO add your handling code here:
        openFile.setCurrentDirectory(new File("c:\\temp"));
        int value = openFile.showOpenDialog(btnFile);
        if (value == JFileChooser.APPROVE_OPTION) {
            try {
                file = ImageIO.read(openFile.getSelectedFile());
                //person.setImage(file);
//                 Image smallImage = person.getImage().getScaledInstance(250, 250,Image.SCALE_SMOOTH);
//       ImageIcon imgIcon=new ImageIcon(smallImage);
//       imageLabel.setIcon(imgIcon);
                txtImage.setText(openFile.getSelectedFile().getPath());
                JOptionPane.showMessageDialog(null, "Image Loaded Successfully");
            } catch (IOException ioe) {
                JOptionPane.showMessageDialog(null, "Image load unsuccessfull");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No file");
        }
    }//GEN-LAST:event_btnFileActionPerformed

    private void btnCreateStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateStateActionPerformed
        // TODO add your handling code here:
        try {
           // for (CountryNetwork country : system.getNetworkList()) {
              //  for (StateNetwork state : country.getStateList()) {
              StateNetwork states= (StateNetwork) comboState.getSelectedItem();
                    for (Enterprise enterprise : states.getEnterpriseDirectory().getEnterpriseList()) {
                        if ((EnterpriseType) comboEnterprise.getSelectedItem() == enterprise.getEnterpriseType()) {
                            JOptionPane.showMessageDialog(null, "Enterprise Already Present");
                            return;
                        }
                    }
               // }
           // }
            
            for (UserAccount userAccount : system.getUserAccountDirectory().getUserAccountList()) {
                for (WorkRequest workReq : userAccount.getWorkQueue().getWorkRequestList()) {
                    if (workReq instanceof SignUpRequestEnterprise) {
                        if (((SignUpRequestEnterprise) workReq).getEnterprise() == (EnterpriseType) comboEnterprise.getSelectedItem() && (workReq.getStatus().equalsIgnoreCase("pending") || workReq.getStatus().equalsIgnoreCase("Requested"))) {
                            JOptionPane.showMessageDialog(null, "Request Already Raised for the Enterprise");
                            return;
                        }
                    }
                }
            }
            
            String password = String.valueOf(txtPassword.getPassword());
            if (!txtUserName.getText().isEmpty()) {
                if (!password.isEmpty()) {
                    if (!txtName.getText().isEmpty()) {
                        if (!txtEmail.getText().isEmpty()) {
                            if (!txtImage.getText().isEmpty()) {
                                CountryNetwork country = (CountryNetwork) comboCountry.getSelectedItem();
                                StateNetwork state = (StateNetwork) comboState.getSelectedItem();
                                SignUpRequestEnterprise enterpriseRequest = new SignUpRequestEnterprise();
                                enterpriseRequest.setName(txtName.getText());
                                enterpriseRequest.setUserName(txtUserName.getText());
                                enterpriseRequest.setPassword(password);
                                enterpriseRequest.setEmail(txtEmail.getText());
                                enterpriseRequest.setCountry(country);
                                enterpriseRequest.setState(state);
                                enterpriseRequest.setStatus("Requested");
                                enterpriseRequest.setEnterprise((Enterprise.EnterpriseType) comboEnterprise.getSelectedItem());
                                enterpriseRequest.setImage(file);
                                
                                for (UserAccount userAccount : system.getUserAccountDirectory().getUserAccountList()) {
                                    if (country.getName().equalsIgnoreCase(userAccount.getUsername())) {
                                        userAccount.getWorkQueue().getWorkRequestList().add(enterpriseRequest);
                                    }
                                }

                                //business.getWorkQueue().getWorkRequestList().add(stateRequest);
                                JOptionPane.showMessageDialog(null, "Request raised successfully");
                                 dB4OUtil.storeSystem(system);
                                txtName.setText("");
                                txtImage.setText("");
                                txtEmail.setText("");
                                txtPassword.setText("");
                                txtUserName.setText("");
                                lblAcceptedUserName.setText("");
                                
                            } else {
                                JOptionPane.showMessageDialog(null, "Please Upload an Image");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Please enter Email");
                        }
                        
                    } else {
                        JOptionPane.showMessageDialog(null, "Please enter Name");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Please enter value for password");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please enter User Name");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Enter integer for Salary", "Warning", JOptionPane.WARNING_MESSAGE);
        } catch (Exception ex) {
            
            JOptionPane.showMessageDialog(null, "Sorry for the inconvinence. Technical team is working on it", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnCreateStateActionPerformed

    private void comboCountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCountryActionPerformed
        // TODO add your handling code here:
        comboState.removeAllItems();
        
        CountryNetwork c = (CountryNetwork) comboCountry.getSelectedItem();
        if (!c.getStateList().isEmpty()) {
            lblWarning.setText("");
            for (StateNetwork state : c.getStateList()) {
                comboState.addItem(state);
            }
            comboEnterprise.setEnabled(true);
            comboState.setEnabled(true);
            txtName.setEnabled(true);
            txtUserName.setEnabled(true);
            txtEmail.setEnabled(true);
            txtImage.setEnabled(true);
            txtPassword.setEnabled(true);
            btnFile.setEnabled(true);
            btnCreateState.setEnabled(true);
        } else {
            comboState.removeAllItems();
            comboEnterprise.setEnabled(false);
            comboState.setEnabled(false);
            txtName.setEnabled(false);
            txtUserName.setEnabled(false);
            txtEmail.setEnabled(false);
            txtImage.setEnabled(false);
            txtPassword.setEnabled(false);
            btnFile.setEnabled(false);
            btnCreateState.setEnabled(false);
            lblWarning.setText("*System is not available for the state, please raise a request to create a state first");
        }
    }//GEN-LAST:event_comboCountryActionPerformed

    private void txtNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNameFocusLost
        // TODO add your handling code here:
        if (!txtName.getText().isEmpty()) {
            if (!Validator.validateName(txtName.getText())) {
                lblName1.setText("*Only Alphabets and Spaces are allowed");
                txtName.setText("");
            } else {
                lblName1.setText("");
            }
        }
    }//GEN-LAST:event_txtNameFocusLost

    private void txtUserNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserNameFocusLost
        // TODO add your handling code here:
        String userName = txtUserName.getText();
        if (!txtUserName.getText().isEmpty()) {
            if (!Validator.validateUserName(txtUserName.getText())) {
                lblUserName1.setText("*Only AlphaNumeric Characters and '_' and '.' are allowed");
                txtUserName.setText("");
            } else if (!EcoSystem.checkIfUsernameIsUnique(txtUserName.getText())) {
                lblUserName1.setText("*" + userName + " " + "is already taken please enter new username");
                txtUserName.setText("");
            } else {
                
                lblUserName1.setText("");
                lblAcceptedUserName.setText(userName + " " + "is available");
            }
        }

    }//GEN-LAST:event_txtUserNameFocusLost

    private void txtPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusLost
        // TODO add your handling code here:

        String password = String.valueOf(txtPassword.getPassword());
        if (!password.isEmpty()) {
            if (!Validator.validatePassword(password)) {
                JOptionPane.showMessageDialog(null, "Password should Contain \n"
                        + "       # At least one digit\n"
                        + "       # At least one lower case letter\n"
                        + "       # At least one upper case letter\n"
                        + "       # At least one special character(!@#$%^&+=~|?)\n"
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

    private void comboEnterpriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEnterpriseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboEnterpriseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateState;
    private javax.swing.JButton btnFile;
    private javax.swing.JComboBox comboCountry;
    private javax.swing.JComboBox comboEnterprise;
    private javax.swing.JComboBox comboState;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblAcceptedUserName;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblName1;
    private javax.swing.JLabel lblUserName1;
    private javax.swing.JLabel lblWarning;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtImage;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
