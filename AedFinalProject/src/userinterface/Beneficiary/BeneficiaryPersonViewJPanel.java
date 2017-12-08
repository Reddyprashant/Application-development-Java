/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Beneficiary;

import Business.Organization.HomelessOrganization;
import Business.Person.Person;
import java.awt.CardLayout;
import java.awt.Image;
import java.io.File;
import java.text.SimpleDateFormat;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import utility.Validator;

/**
 *
 * @author vinya
 */
public class BeneficiaryPersonViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form HomelessPersonViewJPanel
     */
    private JPanel userProcessContainer;
    private HomelessOrganization organization;
    private Person p;
    private ImageIcon photo;
    public BeneficiaryPersonViewJPanel(JPanel userProcessContainer, Person p) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.p=p;
        populateValues();
    }

    
    public void populateValues(){

        
            txtFieldName.setText(p.getName());
            txtFieldSex.setText(p.getSex());
            txtFieldAge.setText(Integer.toString(p.getAge()));
            txtFieldEthnicity.setText(p.getEthnicity());
            txtFieldEducationBackground.setText(p.getEducationBackground());
            txtFieldReason.setText(p.getReason());
            txtFieldReasonDescription.setText(p.getReasonDescription());
            lblPhoto.setIcon(p.getPhtoto());
            SimpleDateFormat Dateformat = new SimpleDateFormat("MM:dd:yyyy");
            txtFieldJoiningDate.setText(Dateformat.format(p.getDateOfJoining()));
            
            txtFieldAge.setEnabled(false);
            txtFieldName.setEnabled(false);
            txtFieldEducationBackground.setEnabled(false);
            txtFieldEthnicity.setEnabled(false);
            txtFieldReason.setEnabled(false);
            txtFieldReasonDescription.setEnabled(false);
            txtFieldSex.setEnabled(false);
            
     
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtFieldName = new javax.swing.JTextField();
        txtFieldSex = new javax.swing.JTextField();
        txtFieldAge = new javax.swing.JTextField();
        txtFieldEthnicity = new javax.swing.JTextField();
        txtFieldEducationBackground = new javax.swing.JTextField();
        txtFieldReason = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtFieldReasonDescription = new javax.swing.JTextField();
        lblPhoto = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnUpload = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtFieldJoiningDate = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(71, 79, 112));
        jLabel1.setText("Person Details");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 23, -1, -1));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(71, 79, 112));
        jLabel2.setText("Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 98, -1, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(71, 79, 112));
        jLabel3.setText("Sex:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 131, -1, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(71, 79, 112));
        jLabel4.setText("Age:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(71, 79, 112));
        jLabel5.setText("Ethnicity:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(221, 209, -1, -1));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(71, 79, 112));
        jLabel6.setText("Education Background:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 252, -1, -1));

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(71, 79, 112));
        jLabel7.setText("Reason:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 291, -1, -1));

        txtFieldName.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        txtFieldName.setForeground(new java.awt.Color(71, 79, 112));
        txtFieldName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldNameActionPerformed(evt);
            }
        });
        add(txtFieldName, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 93, 127, -1));

        txtFieldSex.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        txtFieldSex.setForeground(new java.awt.Color(71, 79, 112));
        txtFieldSex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldSexActionPerformed(evt);
            }
        });
        add(txtFieldSex, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 126, 127, -1));

        txtFieldAge.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        txtFieldAge.setForeground(new java.awt.Color(71, 79, 112));
        txtFieldAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldAgeActionPerformed(evt);
            }
        });
        txtFieldAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFieldAgeKeyPressed(evt);
            }
        });
        add(txtFieldAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 165, 127, -1));

        txtFieldEthnicity.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        txtFieldEthnicity.setForeground(new java.awt.Color(71, 79, 112));
        txtFieldEthnicity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldEthnicityActionPerformed(evt);
            }
        });
        add(txtFieldEthnicity, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 204, 127, -1));

        txtFieldEducationBackground.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        txtFieldEducationBackground.setForeground(new java.awt.Color(71, 79, 112));
        txtFieldEducationBackground.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldEducationBackgroundActionPerformed(evt);
            }
        });
        add(txtFieldEducationBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 247, 127, -1));

        txtFieldReason.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        txtFieldReason.setForeground(new java.awt.Color(71, 79, 112));
        txtFieldReason.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldReasonActionPerformed(evt);
            }
        });
        add(txtFieldReason, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 286, 127, -1));

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(71, 79, 112));
        jLabel8.setText("Reason Descripton:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 324, -1, -1));

        txtFieldReasonDescription.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        txtFieldReasonDescription.setForeground(new java.awt.Color(71, 79, 112));
        txtFieldReasonDescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldReasonDescriptionActionPerformed(evt);
            }
        });
        add(txtFieldReasonDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 319, 127, -1));

        lblPhoto.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        add(lblPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(606, 68, 190, 206));

        btnSave.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnSave.setForeground(new java.awt.Color(71, 79, 112));
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 432, -1, -1));

        btnUpdate.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(71, 79, 112));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(448, 432, -1, -1));

        btnUpload.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnUpload.setForeground(new java.awt.Color(71, 79, 112));
        btnUpload.setText("Upload Photo");
        btnUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadActionPerformed(evt);
            }
        });
        add(btnUpload, new org.netbeans.lib.awtextra.AbsoluteConstraints(637, 329, -1, -1));

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(71, 79, 112));
        jLabel10.setText("Date Joined:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 375, -1, -1));

        txtFieldJoiningDate.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        txtFieldJoiningDate.setForeground(new java.awt.Color(71, 79, 112));
        add(txtFieldJoiningDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 370, 127, -1));

        btnBack.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(71, 79, 112));
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 496, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtFieldNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldNameActionPerformed

    private void txtFieldSexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldSexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldSexActionPerformed

    private void txtFieldAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldAgeActionPerformed

    private void txtFieldEthnicityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldEthnicityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldEthnicityActionPerformed

    private void txtFieldEducationBackgroundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldEducationBackgroundActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldEducationBackgroundActionPerformed

    private void txtFieldReasonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldReasonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldReasonActionPerformed

    private void txtFieldReasonDescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldReasonDescriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldReasonDescriptionActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
                    
            txtFieldAge.setEnabled(true);
            txtFieldName.setEnabled(true);
            txtFieldEducationBackground.setEnabled(true);
            txtFieldEthnicity.setEnabled(true);
            txtFieldReason.setEnabled(true);
            txtFieldReasonDescription.setEnabled(true);
            txtFieldSex.setEnabled(true);
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        
        
        try{
            String name = txtFieldName.getText();
            int age = Integer.parseInt(txtFieldAge.getText());
            String sex = txtFieldSex.getText();
            String reason = txtFieldReason.getText();
            String reasonDesc = txtFieldReasonDescription.getText();
            String education = txtFieldEducationBackground.getText();
            String ethnicity = txtFieldEthnicity.getText();
        if(name.isEmpty() || txtFieldAge.getText().isEmpty()||sex.isEmpty()||reason.isEmpty()){
            
            JOptionPane.showMessageDialog(null, "Please provide all the details","Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        else{
        
            p.setAge(age);
            p.setEducationBackground(education);
            p.setEthnicity(ethnicity);
            p.setName(name);
            p.setPhtoto(photo);
            p.setReason(reason);
            p.setReasonDescription(reasonDesc);
            p.setSex(sex);
            
        }   
        }catch(NumberFormatException ex){
            
            JOptionPane.showMessageDialog(null, "Please Enter number for Age","Warning",JOptionPane.WARNING_MESSAGE);
        }
               
          
            txtFieldAge.setEnabled(false);
            txtFieldName.setEnabled(false);
            txtFieldEducationBackground.setEnabled(false);
            txtFieldEthnicity.setEnabled(false);
            txtFieldReason.setEnabled(false);
            txtFieldReasonDescription.setEnabled(false);
            txtFieldSex.setEnabled(false);
            
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnUploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f1 = chooser.getSelectedFile();
        if (f1 != null) {
            try {
                Image pic = ImageIO.read(f1);
                pic = pic.getScaledInstance(300, 300, java.awt.Image.SCALE_SMOOTH);
                photo = new ImageIcon(pic);
                lblPhoto.setIcon(photo);
                   } catch (Exception e) {

           }
        }
        else {
            
            JOptionPane.showMessageDialog(null, "Please select a picture","Warning",JOptionPane.WARNING_MESSAGE);
        }        
        
    }//GEN-LAST:event_btnUploadActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtFieldAgeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFieldAgeKeyPressed
        // TODO add your handling code here:
        Validator.onlyInteger(evt, txtFieldAge);
    }//GEN-LAST:event_txtFieldAgeKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnUpload;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblPhoto;
    private javax.swing.JTextField txtFieldAge;
    private javax.swing.JTextField txtFieldEducationBackground;
    private javax.swing.JTextField txtFieldEthnicity;
    private javax.swing.JTextField txtFieldJoiningDate;
    private javax.swing.JTextField txtFieldName;
    private javax.swing.JTextField txtFieldReason;
    private javax.swing.JTextField txtFieldReasonDescription;
    private javax.swing.JTextField txtFieldSex;
    // End of variables declaration//GEN-END:variables
}
