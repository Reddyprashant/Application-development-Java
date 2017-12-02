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
import Business.SignUp.SignUpRequestEnterprise;
import Business.SignUp.SignUpRequestState;
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
public class SignUpJPanelEnterprise extends javax.swing.JPanel {

    /**
     * Creates new form SignUpJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    private BufferedImage file;
    private JFileChooser openFile;
    public SignUpJPanelEnterprise(JPanel userProcessContainer, EcoSystem business) {
        initComponents();
        this.system = business;
        this.userProcessContainer=userProcessContainer;
        populateComboBox();
      
    }
    
    public void populateComboBox(){
        for (CountryNetwork countryNetwork : system.getNetworkList()) {
            comboCountry.addItem(countryNetwork);
        }
        comboEnterprise.addItem(Enterprise.EnterpriseType.Beneficiary);
        comboEnterprise.addItem(Enterprise.EnterpriseType.Entity);
        comboEnterprise.addItem(Enterprise.EnterpriseType.Government);
        comboEnterprise.addItem(Enterprise.EnterpriseType.Logistic);
        
        
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

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setText("Register");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 160, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("State:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Country:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 80, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("User Name :");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, -1, -1));

        txtUserName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUserNameKeyPressed(evt);
            }
        });
        add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 170, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Email Id :");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, -1, -1));

        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmailKeyPressed(evt);
            }
        });
        add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, 170, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("Password:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, -1, -1));
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

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel14.setText("Documents :");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, 100, -1));

        btnFile.setText("Choose File");
        btnFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFileActionPerformed(evt);
            }
        });
        add(btnFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 390, -1, -1));

        btnCreateState.setText("Register");
        btnCreateState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateStateActionPerformed(evt);
            }
        });
        add(btnCreateState, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 430, 90, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel11.setText("Enterprise :");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 90, -1));

        add(comboEnterprise, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 170, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("Name :");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, -1, -1));

        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNameKeyPressed(evt);
            }
        });
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 170, -1));

        add(comboState, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, 170, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserNameKeyPressed
        // TODO add your handling code here:
        Validator.onlyString(evt, txtUserName);
    }//GEN-LAST:event_txtUserNameKeyPressed

    private void txtEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailKeyPressed

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

    private void btnCreateStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateStateActionPerformed
        // TODO add your handling code here:
        try{
            if(!txtUserName.getText().isEmpty()  && !txtPassword.getText().isEmpty() ){
                
                  CountryNetwork country= (CountryNetwork) comboCountry.getSelectedItem();
                  StateNetwork state= (StateNetwork) comboState.getSelectedItem();
                SignUpRequestEnterprise enterpriseRequest= new SignUpRequestEnterprise();
                enterpriseRequest.setName(txtName.getText());
                enterpriseRequest.setUserName(txtUserName.getText());
                enterpriseRequest.setPassword(txtPassword.getText());
                enterpriseRequest.setEmail(txtEmail.getText());
                enterpriseRequest.setCountry(country);
                enterpriseRequest.setState(state);
                enterpriseRequest.setStatus("Requested");
                enterpriseRequest.setEnterprise((Enterprise.EnterpriseType)comboEnterprise.getSelectedItem());
                 enterpriseRequest.setImage(file);
              
                
               
                 for (UserAccount userAccount : system.getUserAccountDirectory().getUserAccountList()) {
                    if(country.getName().equalsIgnoreCase(userAccount.getUsername())){
                        userAccount.getWorkQueue().getWorkRequestList().add(enterpriseRequest);
                    }
                }
                
                
               //business.getWorkQueue().getWorkRequestList().add(stateRequest);
                
                JOptionPane.showMessageDialog(null, "Updated successfully");
                
            }
            else{
                JOptionPane.showMessageDialog(null, "Please enter all values");
            }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Enter integer for Salary", "Warning", JOptionPane.WARNING_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Sorry for the inconvinence. Technical team is working on it", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnCreateStateActionPerformed

    private void txtNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameKeyPressed

    private void comboCountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCountryActionPerformed
        // TODO add your handling code here:
        //comboCountry.removeAllItems();
        CountryNetwork c= (CountryNetwork) comboCountry.getSelectedItem();
        for (StateNetwork state : c.getStateList()) {
            comboState.addItem(state);
        }
    }//GEN-LAST:event_comboCountryActionPerformed


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
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtImage;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
