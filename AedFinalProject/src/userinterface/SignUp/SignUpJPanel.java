/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SignUp;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.CountryNetwork;
import Business.Network.StateNetwork;
import Business.Organization.Organization;
import Business.Organization.Organization.Type;
import Business.SignUp.SignUpRequest;
import Business.SignUp.SignUpRequestEnterprise;
import Business.SignUp.SignUpRequestOrganization;
import Business.UserAccount.UserAccount;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
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
    private JFileChooser openFile= new JFileChooser();
    private String type;
    public SignUpJPanel(JPanel userProcessContainer, EcoSystem business, SignUpRequest.SignUpType type) {
        initComponents();
        this.system = business;
        this.userProcessContainer=userProcessContainer;
        this.type=type.getValue();
        populateCombo();
    }
    
    public void populateCombo(){
        for (CountryNetwork countryNetwork : system.getNetworkList()) {
            comboCountry.addItem(countryNetwork);
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

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setText("Register");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 160, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Name :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, -1, -1));

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNameKeyPressed(evt);
            }
        });
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 170, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Country:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 80, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("User Name :");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, -1, -1));

        btnCreate.setText("Register");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 550, 90, -1));

        txtUserName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUserNameKeyPressed(evt);
            }
        });
        add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 170, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Email Id :");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, -1, -1));

        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmailKeyPressed(evt);
            }
        });
        add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, 170, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("Password:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, -1, -1));
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 170, -1));

        txtCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityActionPerformed(evt);
            }
        });
        txtCity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCityKeyPressed(evt);
            }
        });
        add(txtCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, 170, -1));

        comboCountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCountryActionPerformed(evt);
            }
        });
        add(comboCountry, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, 170, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setText("State :");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 80, -1));

        comboState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboStateActionPerformed(evt);
            }
        });
        add(comboState, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 310, 170, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setText("City :");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, 80, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel11.setText("Enterprise :");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 390, 90, -1));

        comboEnterprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEnterpriseActionPerformed(evt);
            }
        });
        add(comboEnterprise, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 390, 170, -1));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel12.setText("Organization :");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 430, 100, -1));

        add(comboOrganization, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 430, 170, -1));

        txtOrgName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtOrgNameKeyPressed(evt);
            }
        });
        add(txtOrgName, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 470, 170, -1));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel13.setText("Organization Name :");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 470, 150, -1));

        txtImage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtImageKeyPressed(evt);
            }
        });
        add(txtImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 510, 170, -1));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel14.setText("Documents :");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 510, 100, -1));

        btnFile.setText("Choose File");
        btnFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFileActionPerformed(evt);
            }
        });
        add(btnFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 510, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtNameActionPerformed

    private void txtNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyPressed
        // TODO add your handling code here:
        Validator.onlyString(evt, txtName);
    }//GEN-LAST:event_txtNameKeyPressed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        try{
            if(!txtUserName.getText().isEmpty() && !txtName.getText().isEmpty() && !txtCity.getText().isEmpty() && !txtPassword.getText().isEmpty() ){
                CountryNetwork country= (CountryNetwork) comboCountry.getSelectedItem();
                  StateNetwork state= (StateNetwork) comboState.getSelectedItem();
                  Enterprise e= (Enterprise) comboEnterprise.getSelectedItem();
                  Organization.Type type= (Type) comboOrganization.getSelectedItem();
                  if(EcoSystem.checkIfUsernameIsUnique(txtUserName.getText())){
                      JOptionPane.showMessageDialog(null, "Please enter unique username");
                      return;
                  }
                SignUpRequestOrganization orgRequest= new SignUpRequestOrganization();
                orgRequest.setName(txtName.getText());
                orgRequest.setUserName(txtUserName.getText());
                orgRequest.setPassword(txtPassword.getText());
                orgRequest.setEmail(txtEmail.getText());
                orgRequest.setCountry(country);
                orgRequest.setState(state);
                orgRequest.setCity(txtCity.getText());
                orgRequest.setOrgType(type);
                orgRequest.setStatus("Requested");
                orgRequest.setOrgName(txtOrgName.getText());
                orgRequest.setEnterprise(e);
                orgRequest.setImage(file);
                
             //   orgRequest.setEnterprise((Enterprise.EnterpriseType)comboEnterprise.getSelectedItem());
//                 for (UserAccount userAccount : system.getUserAccountDirectory().getUserAccountList()) {
//                    if(country.getName().equalsIgnoreCase(userAccount.getUsername())){
//                        userAccount.getWorkQueue().getWorkRequestList().add(orgRequest);
//                    }
//                }
                   if(orgRequest.getImage() == (null)){
             JOptionPane.showMessageDialog(null, "Please load the Authorised Organization Document");
             return;
        }
                 for (CountryNetwork countryNetwork : system.getNetworkList()) {
                     for (StateNetwork stateNetwork : countryNetwork.getStateList()) {
                         for (Enterprise enterprise : stateNetwork.getEnterpriseDirectory().getEnterpriseList()) {
                              System.out.println("enterall"+e.getEnterpriseType()+stateNetwork.getName()+countryNetwork.getName());
                             if(enterprise == e){
                                 System.out.println("enter"+e.getEnterpriseType()+" "+enterprise);
                                 e.getWorkQueue().getWorkRequestList().add(orgRequest);
                             }
                         }
                     }
                }
             

                JOptionPane.showMessageDialog(null, "Registration succesfull. Your account will be available in 24 hrs");
            }
            else{
                JOptionPane.showMessageDialog(null, "Please enter all values");
            }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Enter integer for Salary", "Warning", JOptionPane.WARNING_MESSAGE);
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Sorry for the inconvinence. Technical team is working on it", "Warning", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btnCreateActionPerformed

    private void txtUserNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserNameKeyPressed
        // TODO add your handling code here:
        Validator.onlyString(evt, txtUserName);
    }//GEN-LAST:event_txtUserNameKeyPressed

    private void txtEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailKeyPressed

    private void txtCityKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCityKeyPressed
        // TODO add your handling code here:
        Validator.onlyString(evt, txtCity);
    }//GEN-LAST:event_txtCityKeyPressed

    private void txtOrgNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOrgNameKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOrgNameKeyPressed

    private void txtImageKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtImageKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtImageKeyPressed

    private void btnFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFileActionPerformed
        // TODO add your handling code here:
        openFile.setCurrentDirectory(new File("c:\\temp"));
       int value=openFile.showOpenDialog(btnFile);
       if(value==JFileChooser.APPROVE_OPTION){
            try{
                file=ImageIO.read(openFile.getSelectedFile());
                //person.setImage(file);
//                 Image smallImage = person.getImage().getScaledInstance(250, 250,Image.SCALE_SMOOTH);
//       ImageIcon imgIcon=new ImageIcon(smallImage);
//       imageLabel.setIcon(imgIcon);
                txtImage.setText(openFile.getSelectedFile().getPath());
                JOptionPane.showMessageDialog(null, "Image Loaded Successfully");
            }catch(IOException ioe){
                JOptionPane.showMessageDialog(null, "Image load unsuccessfull");
            }
       }
       else{
           JOptionPane.showMessageDialog(null, "No file");
       }
    }//GEN-LAST:event_btnFileActionPerformed

    private void comboCountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCountryActionPerformed
        // TODO add your handling code here:
         comboState.removeAllItems();
        CountryNetwork country= (CountryNetwork) comboCountry.getSelectedItem();
        for (StateNetwork stateNetwork : country.getStateList()) {
            comboState.addItem(stateNetwork);
        }
    }//GEN-LAST:event_comboCountryActionPerformed

    private void comboStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboStateActionPerformed
        // TODO add your handling code here:
        comboEnterprise.removeAllItems();
        StateNetwork stateNetwork= (StateNetwork) comboState.getSelectedItem();
        for (Enterprise e : stateNetwork.getEnterpriseDirectory().getEnterpriseList()) {
            comboEnterprise.addItem(e);
        }
    }//GEN-LAST:event_comboStateActionPerformed

    private void comboEnterpriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEnterpriseActionPerformed
        // TODO add your handling code here:
        comboOrganization.removeAllItems();
         Enterprise e= (Enterprise) comboEnterprise.getSelectedItem();
         if(e!= null){
        for (Organization.Type org : e.getOrganizations()) {
            comboOrganization.addItem(org);
        }
         }
    }//GEN-LAST:event_comboEnterpriseActionPerformed

    private void txtCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnFile;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtImage;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtOrgName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
