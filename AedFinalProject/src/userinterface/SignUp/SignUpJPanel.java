/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SignUp;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.LatLong;
import Business.Network.CountryNetwork;
import Business.Network.StateNetwork;
import Business.Organization.Organization;
import Business.Organization.Organization.Type;
import Business.SignUp.SignUpRequest;
import Business.SignUp.SignUpRequestOrganization;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import userinterface.googleApi.OrganizationLocationJPanel;
import utility.Validator;

/**
 *
 * @author pooji
 */
public class SignUpJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SignUpJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    private BufferedImage file;
    private JFileChooser openFile = new JFileChooser();
    private String type;
    private LatLong latLong;

    public SignUpJPanel(JPanel userProcessContainer, EcoSystem business, SignUpRequest.SignUpType type) {
        initComponents();
        this.system = business;
        this.userProcessContainer = userProcessContainer;
        this.type = type.getValue();
        populateCombo();
    }

    public void populateCombo() {
        if (!system.getNetworkList().isEmpty()) {
            lblWarning.setText("");
            for (CountryNetwork countryNetwork : system.getNetworkList()) {
                comboCountry.addItem(countryNetwork);
            }
        } else {
            comboEnterprise.setEnabled(false);
            comboOrganization.setEnabled(false);
            comboCountry.setEnabled(false);
            comboState.setEnabled(false);
            txtName.setEnabled(false);
            txtUserName.setEnabled(false);
            txtEmail.setEnabled(false);
            txtImage.setEnabled(false);
            txtPassword.setEnabled(false);
            btnFile.setEnabled(false);
            btnCreate.setEnabled(false);
            btnLocation.setEnabled(false);
            txtOrgName.setEnabled(false);
            txtCity.setEnabled(false);
            txtLoc.setEditable(false);
//            JOptionPane.showMessageDialog(null, "System is not available for the country, please contact the system administrator");
            lblWarning.setText("*System is not available for the country, please contact the system administrator");
        }
    }

    public void populateLatLong(LatLong latLong) {
        this.latLong = latLong;
        txtLoc.setText(latLong.getLatitude() + "," + latLong.getLongitude());
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
        txtName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();
        txtUserName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        txtCity = new javax.swing.JTextField();
        comboCountry = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        comboState = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        comboEnterprise = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        comboOrganization = new javax.swing.JComboBox();
        txtOrgName = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtImage = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        btnFile = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtLoc = new javax.swing.JTextField();
        btnLocation = new javax.swing.JButton();
        lblEmail = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        lblAcceptedUserName = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblOrganization = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        lblWarning = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(71, 79, 112));
        jLabel1.setText("Registration Form");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 310, 40));

        txtName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNameFocusLost(evt);
            }
        });
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 170, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(71, 79, 112));
        jLabel4.setText("Country:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, 80, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(71, 79, 112));
        jLabel5.setText("User Name :");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, -1, -1));

        btnCreate.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnCreate.setForeground(new java.awt.Color(71, 79, 112));
        btnCreate.setText("Register");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 750, 140, 50));

        txtUserName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUserNameFocusLost(evt);
            }
        });
        add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 170, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(71, 79, 112));
        jLabel6.setText("Email Id :");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, -1, -1));

        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });
        add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 170, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(71, 79, 112));
        jLabel7.setText("Password:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, -1, -1));

        txtPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPasswordFocusLost(evt);
            }
        });
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 170, -1));

        txtCity.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCityFocusLost(evt);
            }
        });
        add(txtCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 590, 170, -1));

        comboCountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCountryActionPerformed(evt);
            }
        });
        add(comboCountry, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, 170, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(71, 79, 112));
        jLabel9.setText("State :");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 420, 80, -1));

        comboState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboStateActionPerformed(evt);
            }
        });
        add(comboState, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 420, 170, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(71, 79, 112));
        jLabel10.setText("City :");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 590, 50, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(71, 79, 112));
        jLabel11.setText("Enterprise :");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 460, 100, -1));

        comboEnterprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEnterpriseActionPerformed(evt);
            }
        });
        add(comboEnterprise, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 460, 170, -1));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(71, 79, 112));
        jLabel12.setText("Organization :");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 500, 150, -1));

        add(comboOrganization, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 500, 170, -1));

        txtOrgName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtOrgNameFocusLost(evt);
            }
        });
        add(txtOrgName, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 540, 170, -1));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(71, 79, 112));
        jLabel13.setText("Organization Name :");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 540, 170, -1));
        add(txtImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 630, 170, -1));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(71, 79, 112));
        jLabel14.setText("Documents :");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 630, 100, -1));

        btnFile.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnFile.setForeground(new java.awt.Color(71, 79, 112));
        btnFile.setText("Choose File");
        btnFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFileActionPerformed(evt);
            }
        });
        add(btnFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 630, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(71, 79, 112));
        jLabel8.setText("Name :");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, -1, -1));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel15.setText("Personal Details:");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, -1, -1));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel16.setText("Organization Details:");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, -1, 30));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(71, 79, 112));
        jLabel18.setText("Location :");
        add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 690, 100, -1));
        add(txtLoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 690, 170, -1));

        btnLocation.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnLocation.setForeground(new java.awt.Color(71, 79, 112));
        btnLocation.setText("Set Location");
        btnLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocationActionPerformed(evt);
            }
        });
        add(btnLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 690, -1, -1));

        lblEmail.setForeground(new java.awt.Color(255, 0, 0));
        add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, -1, -1));

        lblUserName.setForeground(new java.awt.Color(255, 0, 0));
        add(lblUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, -1, -1));

        lblAcceptedUserName.setForeground(new java.awt.Color(0, 204, 0));
        add(lblAcceptedUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, -1, -1));

        lblName.setForeground(new java.awt.Color(255, 0, 0));
        add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, -1, -1));

        lblOrganization.setForeground(new java.awt.Color(255, 0, 0));
        add(lblOrganization, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 540, -1, -1));

        lblCity.setForeground(new java.awt.Color(255, 0, 0));
        add(lblCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 590, -1, -1));

        lblWarning.setForeground(new java.awt.Color(255, 0, 0));
        add(lblWarning, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 830, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        try {
            CountryNetwork country = (CountryNetwork) comboCountry.getSelectedItem();
            StateNetwork state = (StateNetwork) comboState.getSelectedItem();
            Enterprise e = (Enterprise) comboEnterprise.getSelectedItem();
            Organization.Type type = (Type) comboOrganization.getSelectedItem();
            String password = String.valueOf(txtPassword.getPassword());

            for (CountryNetwork countryNetwork : system.getNetworkList()) {
                for (StateNetwork stateNetwork : countryNetwork.getStateList()) {
                    for (Enterprise enterprise : stateNetwork.getEnterpriseDirectory().getEnterpriseList()) {
                        if (enterprise == e) {
                            for (Organization org : e.getOrganizationDirectory().getOrganizationList()) {
                                if (org.getName().equals(txtOrgName.getText()) && org.getLatLong().getLatitude() == latLong.getLatitude() && org.getLatLong().getLongitude() == latLong.getLongitude()) {
                                    JOptionPane.showMessageDialog(null, "Organization is already present please add new organization");
                                }
                            }

                        }
                    }
                }
            }

            for (CountryNetwork countryNetwork : system.getNetworkList()) {
                for (StateNetwork stateNetwork : countryNetwork.getStateList()) {
                    for (Enterprise enterprise : stateNetwork.getEnterpriseDirectory().getEnterpriseList()) {
                        if (enterprise == e) {
                            for (WorkRequest workReq : e.getWorkQueue().getWorkRequestList()) {
                                if (workReq instanceof SignUpRequestOrganization) {
                                    System.out.println("iifififif" + latLong.getLatitude() + latLong.getLongitude());
                                    if (((SignUpRequestOrganization) workReq).getOrgName().equals(txtOrgName.getText()) && ((SignUpRequestOrganization) workReq).getLatLong().getLatitude() == latLong.getLatitude() && ((SignUpRequestOrganization) workReq).getLatLong().getLongitude() == latLong.getLongitude()) {
                                        JOptionPane.showMessageDialog(null, "Request is already raised for this organization");
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }

            if (!txtUserName.getText().isEmpty()) {
                if (!txtName.getText().isEmpty()) {
                    if (!txtCity.getText().isEmpty()) {
                        if (!password.isEmpty()) {
                            if (!txtLoc.getText().isEmpty()) {

                                SignUpRequestOrganization orgRequest = new SignUpRequestOrganization();
                                orgRequest.setName(txtName.getText());
                                orgRequest.setUserName(txtUserName.getText());
                                orgRequest.setPassword(password);
                                orgRequest.setEmail(txtEmail.getText());
                                orgRequest.setCountry(country);
                                orgRequest.setState(state);
                                orgRequest.setCity(txtCity.getText());
                                orgRequest.setOrgType(type);
                                orgRequest.setStatus("Requested");
                                orgRequest.setOrgName(txtOrgName.getText());
                                orgRequest.setEnterprise(e);
                                orgRequest.setImage(file);
                                orgRequest.setLatLong(latLong);
                                //   orgRequest.setEnterprise((Enterprise.EnterpriseType)comboEnterprise.getSelectedItem());
//                 for (UserAccount userAccount : system.getUserAccountDirectory().getUserAccountList()) {
//                    if(country.getName().equalsIgnoreCase(userAccount.getUsername())){
//                        userAccount.getWorkQueue().getWorkRequestList().add(orgRequest);
//                    }
//                }
                                if (orgRequest.getImage() == (null)) {
                                    JOptionPane.showMessageDialog(null, "Please load the Authorised Organization Document");
                                    return;
                                }
                                for (CountryNetwork countryNetwork : system.getNetworkList()) {
                                    for (StateNetwork stateNetwork : countryNetwork.getStateList()) {
                                        for (Enterprise enterprise : stateNetwork.getEnterpriseDirectory().getEnterpriseList()) {
                                            // System.out.println("enterall"+e.getEnterpriseType()+stateNetwork.getName()+countryNetwork.getName());
                                            if (enterprise == e) {
                                                //   System.out.println("enter"+e.getEnterpriseType()+" "+enterprise);
                                                e.getWorkQueue().getWorkRequestList().add(orgRequest);
                                            }
                                        }
                                    }
                                }

                                JOptionPane.showMessageDialog(null, "Registration successful. Your account will be available in 24 hrs");

                            } else {
                                JOptionPane.showMessageDialog(null, "Please Choose your location");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Please enter value for password");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Please enter value for City");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Please enter the Name of the Organization");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please enter Value for User Name");
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Enter integer for Salary", "Warning", JOptionPane.WARNING_MESSAGE);
        } catch (Exception ex) {
//            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Sorry for the inconvinence. Technical team is working on it", "Warning", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btnCreateActionPerformed

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

    private void comboCountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCountryActionPerformed
        // TODO add your handling code here:
        comboState.removeAllItems();

        CountryNetwork c = (CountryNetwork) comboCountry.getSelectedItem();
        if (c.getStateList().size() > 0) {
            lblWarning.setText("");
            for (StateNetwork state : c.getStateList()) {
                comboState.addItem(state);
            }
            comboEnterprise.setEnabled(true);
            comboOrganization.setEnabled(true);
            comboState.setEnabled(true);
            txtName.setEnabled(true);
            txtUserName.setEnabled(true);
            txtEmail.setEnabled(true);
            txtImage.setEnabled(true);
            txtPassword.setEnabled(true);
            btnFile.setEnabled(true);
            btnCreate.setEnabled(true);
            btnLocation.setEnabled(true);
            txtOrgName.setEnabled(true);
            txtCity.setEnabled(true);
            txtLoc.setEditable(true);
            comboCountry.setEnabled(true);
            lblWarning.setText("");

        } else {
            comboEnterprise.setEnabled(false);
            comboOrganization.setEnabled(false);
            comboState.setEnabled(false);
            txtName.setEnabled(false);
            txtUserName.setEnabled(false);
            txtEmail.setEnabled(false);
            txtImage.setEnabled(false);
            txtPassword.setEnabled(false);
            btnFile.setEnabled(false);
            btnCreate.setEnabled(false);
            btnLocation.setEnabled(false);
            txtOrgName.setEnabled(false);
            txtCity.setEnabled(false);
            txtLoc.setEditable(false);
//            JOptionPane.showMessageDialog(null, "System is not available for the country, please contact the system administrator");
            lblWarning.setText("*System is not available for the State, please contact the system administrator");
            return;
        }
    }//GEN-LAST:event_comboCountryActionPerformed

    private void comboStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboStateActionPerformed
        // TODO add your handling code here:
        comboEnterprise.removeAllItems();
        StateNetwork stateNetwork = (StateNetwork) comboState.getSelectedItem();
        if (stateNetwork != null) {
            if (stateNetwork.getEnterpriseDirectory() != null) {
                if (stateNetwork.getEnterpriseDirectory().getEnterpriseList().size() > 0) {

                    comboEnterprise.setEnabled(true);
                    comboOrganization.setEnabled(true);
                    comboState.setEnabled(true);
                    txtName.setEnabled(true);
                    txtUserName.setEnabled(true);
                    txtEmail.setEnabled(true);
                    txtImage.setEnabled(true);
                    txtPassword.setEnabled(true);
                    btnFile.setEnabled(true);
                    btnCreate.setEnabled(true);
                    btnLocation.setEnabled(true);
                    txtOrgName.setEnabled(true);
                    txtCity.setEnabled(true);
                    txtLoc.setEditable(true);
                    comboCountry.setEnabled(true);
                    lblWarning.setText("");

                    for (Enterprise e : stateNetwork.getEnterpriseDirectory().getEnterpriseList()) {
                        comboEnterprise.addItem(e);
                    }
                } else {
                    comboOrganization.setEnabled(false);
                    comboEnterprise.setEnabled(false);
                    txtName.setEnabled(false);
                    txtUserName.setEnabled(false);
                    txtEmail.setEnabled(false);
                    txtImage.setEnabled(false);
                    txtPassword.setEnabled(false);
                    btnFile.setEnabled(false);
                    btnCreate.setEnabled(false);
                    btnLocation.setEnabled(false);
                    txtOrgName.setEnabled(false);
                    txtCity.setEnabled(false);
                    txtLoc.setEnabled(false);
                    lblWarning.setText("*NO Enterprise is Available for this State");
                    return;
                }
            }
        }


    }//GEN-LAST:event_comboStateActionPerformed

    private void comboEnterpriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEnterpriseActionPerformed
        // TODO add your handling code here:
        comboOrganization.removeAllItems();
        Enterprise e = (Enterprise) comboEnterprise.getSelectedItem();
        if (e != null) {
            comboEnterprise.setEnabled(true);
            comboOrganization.setEnabled(true);
            comboState.setEnabled(true);
            txtName.setEnabled(true);
            txtUserName.setEnabled(true);
            txtEmail.setEnabled(true);
            txtImage.setEnabled(true);
            txtPassword.setEnabled(true);
            btnFile.setEnabled(true);
            btnCreate.setEnabled(true);
            btnLocation.setEnabled(true);
            txtOrgName.setEnabled(true);
            txtCity.setEnabled(true);
            txtLoc.setEnabled(true);
            comboCountry.setEnabled(true);
            lblWarning.setText("");
            for (Organization.Type org : e.getOrganizations()) {
                comboOrganization.addItem(org);
            }
        } else {
            comboOrganization.setEnabled(false);
            comboEnterprise.setEnabled(false);
            txtName.setEnabled(false);
            txtUserName.setEnabled(false);
            txtEmail.setEnabled(false);
            txtImage.setEnabled(false);
            txtPassword.setEnabled(false);
            btnFile.setEnabled(false);
            btnCreate.setEnabled(false);
            btnLocation.setEnabled(false);
            txtOrgName.setEnabled(false);
            txtCity.setEnabled(false);
            txtLoc.setEnabled(false);
//            JOptionPane.showMessageDialog(null, "System is not available for the country, please contact the system administrator");
            lblWarning.setText("*NO Organization is Available for this Enterprise");

        }
    }//GEN-LAST:event_comboEnterpriseActionPerformed

    private void txtUserNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserNameFocusLost
        // TODO add your handling code here:
        String userName = txtUserName.getText();
        if (!txtUserName.getText().isEmpty()) {
            if (!Validator.validateUserName(txtUserName.getText())) {
                lblAcceptedUserName.setText("");
                lblUserName.setText("*Only AlphaNumeric Characters and Spaces are allowed");
                txtUserName.setText("");
            } else if (!EcoSystem.checkIfUsernameIsUnique(txtUserName.getText())) {
                lblUserName.setText("*" + userName + " " + "is already taken please enter new username");
                txtUserName.setText("");
            } else {

                lblUserName.setText("");
                lblAcceptedUserName.setText(userName + " " + "is available");
            }
        }
    }//GEN-LAST:event_txtUserNameFocusLost

    private void btnLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocationActionPerformed
        // TODO add your handling code here
        OrganizationLocationJPanel muajp = new OrganizationLocationJPanel(userProcessContainer);
        userProcessContainer.add("OrganizationLocationJPanel", muajp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnLocationActionPerformed

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

    private void txtNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNameFocusLost
        // TODO add your handling code here:
        if (!txtName.getText().isEmpty()) {
            if (!Validator.validateName(txtName.getText())) {
                lblName.setText("*Only Alphabets and Spaces are allowed");
                txtName.setText("");
            } else {
                lblName.setText("");
            }
        }
    }//GEN-LAST:event_txtNameFocusLost

    private void txtOrgNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtOrgNameFocusLost
        // TODO add your handling code here:
        if (!txtOrgName.getText().isEmpty()) {
            if (!Validator.validateName(txtOrgName.getText())) {
                lblOrganization.setText("*Only Alphabets, '_' and '.' are allowed");
                txtOrgName.setText("");
            } else {
                lblOrganization.setText("");
            }
        }
    }//GEN-LAST:event_txtOrgNameFocusLost

    private void txtCityFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCityFocusLost
        // TODO add your handling code here:
        if (!txtCity.getText().isEmpty()) {
            if (!Validator.validateName(txtCity.getText())) {
                lblCity.setText("*Only Alphabets and Spaces are allowed");
                txtCity.setText("");
            } else {
                lblCity.setText("");
            }
        }

    }//GEN-LAST:event_txtCityFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnFile;
    private javax.swing.JButton btnLocation;
    private javax.swing.JComboBox comboCountry;
    private javax.swing.JComboBox comboEnterprise;
    private javax.swing.JComboBox comboOrganization;
    private javax.swing.JComboBox comboState;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblAcceptedUserName;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblOrganization;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JLabel lblWarning;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtImage;
    private javax.swing.JTextField txtLoc;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtOrgName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
