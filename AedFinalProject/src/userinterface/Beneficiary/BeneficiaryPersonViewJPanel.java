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

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Person Details");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Name:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Sex:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Age:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Ethnicity:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Education Background:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Reason:");

        txtFieldName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldNameActionPerformed(evt);
            }
        });

        txtFieldSex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldSexActionPerformed(evt);
            }
        });

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

        txtFieldEthnicity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldEthnicityActionPerformed(evt);
            }
        });

        txtFieldEducationBackground.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldEducationBackgroundActionPerformed(evt);
            }
        });

        txtFieldReason.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldReasonActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Reason Descripton:");

        txtFieldReasonDescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldReasonDescriptionActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnUpload.setText("Upload Photo");
        btnUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Date Joined:");

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSave)
                        .addGap(128, 128, 128)
                        .addComponent(btnUpdate))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(128, 128, 128)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFieldSex, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFieldAge, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFieldEthnicity, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFieldEducationBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFieldReason, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel8))
                        .addGap(128, 128, 128)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtFieldReasonDescription, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                            .addComponent(txtFieldJoiningDate))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnUpload)
                        .addGap(71, 71, 71))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(304, 304, 304)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(btnBack)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtFieldSex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtFieldAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtFieldEthnicity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtFieldEducationBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblPhoto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtFieldReason, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtFieldReasonDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(btnUpload)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtFieldJoiningDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnUpdate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(71, 71, 71))
        );
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
