/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Beneficiary.Orphanage;

import userinterface.Beneficiary.Homeless.*;
import Business.EcoSystem;
//import userinterface.Hospital.*;
import Business.Enterprise.Enterprise;
import Business.Network.CountryNetwork;
import Business.Network.StateNetwork;
//import Business.Organization.ClinicOrganization;
import Business.Organization.HomelessOrganization;
import Business.Organization.OrphanageOrganization;
import Business.Person.Person;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Image;
import java.io.File;
import java.text.SimpleDateFormat;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import utility.Validator;

/**
 *
 * @author raunak
 */
public class OrphanagePersonJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount account; 
    private OrphanageOrganization organization; 
    private Enterprise enterprise; 
    private EcoSystem business;
    private StateNetwork state;
    private CountryNetwork country;
    private ImageIcon photo;
    /**
     * Creates new form ManageOrganizationJPanel
     */
    public OrphanagePersonJPanel(JPanel userProcessContainer, UserAccount account, OrphanageOrganization organization, Enterprise enterprise,StateNetwork network,CountryNetwork cNetwork, EcoSystem business) {
        initComponents();
         this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.account=account;
        this.business=business;
        this.organization= organization;
        populateTable(organization);
          this.state=network;
        this.country=cNetwork;
        TextArea.enable(false);
      //  populateOrganizationComboBox();
       // populateOrganizationEmpComboBox();
    }
    
//    public void populateOrganizationComboBox(){
//        organizationJComboBox.removeAllItems();
//        
//        for (Role role : organization.getSupportedRole()){
//            organizationJComboBox.addItem(role);
//        }
//    }
    
//    public void populateOrganizationEmpComboBox(){
//        organizationEmpJComboBox.removeAllItems();
//        
//        for (Role role : organization.getSupportedRole()){
//            organizationEmpJComboBox.addItem(role);
//        }
//    }

    private void populateTable(OrphanageOrganization organization){
        DefaultTableModel model = (DefaultTableModel) organizationJTable.getModel();
        
        model.setRowCount(0);
        
        for (Person person : organization.getPersonList().getPersonList()){
            
            Object[] row = new Object[7];
            row[0] = person.getPersonId();
            row[1] = person.getName();
            row[2]=person.getAge();
            row[3]=person.getSex();
            row[4]=person.getEthnicity();
            row[5]=person.getDateOfJoining();
            row[6]=person.getEducationBackground();
            
            model.addRow(row);
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

        btnGrpReasons = new javax.swing.ButtonGroup();
        btnGrpEducationBackGround = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        organizationJTable = new javax.swing.JTable();
        btnCreatePerson = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ageTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        sexTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ethnicityTextField = new javax.swing.JTextField();
        rdBtnHighschoolGrad = new javax.swing.JRadioButton();
        rdBtnCollegeGrad = new javax.swing.JRadioButton();
        rdBtnUneducated = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        ARadioButton = new javax.swing.JRadioButton();
        BRadioButton2 = new javax.swing.JRadioButton();
        CRadioButton3 = new javax.swing.JRadioButton();
        ORadioButton4 = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TextArea = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        btnUpload = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        btnViewDetails = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        organizationJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Age", "Sex", "Ethnicity", "Date Of Joining", "Education Background"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(organizationJTable);
        if (organizationJTable.getColumnModel().getColumnCount() > 0) {
            organizationJTable.getColumnModel().getColumn(0).setResizable(false);
            organizationJTable.getColumnModel().getColumn(1).setResizable(false);
            organizationJTable.getColumnModel().getColumn(2).setResizable(false);
            organizationJTable.getColumnModel().getColumn(3).setResizable(false);
            organizationJTable.getColumnModel().getColumn(4).setResizable(false);
            organizationJTable.getColumnModel().getColumn(5).setResizable(false);
            organizationJTable.getColumnModel().getColumn(6).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 850, 92));

        btnCreatePerson.setText("Create Person");
        btnCreatePerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreatePersonActionPerformed(evt);
            }
        });
        add(btnCreatePerson, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 660, -1, -1));

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel2.setText("Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 40, -1));

        nameJTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nameJTextFieldKeyPressed(evt);
            }
        });
        add(nameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, 126, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel4.setText("Person Details");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 170, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel5.setText("Create Person");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 170, 30));
        add(ageTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, 130, -1));

        jLabel1.setText("Age:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 50, -1));

        jLabel3.setText("Sex:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 40, -1));

        sexTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sexTextFieldActionPerformed(evt);
            }
        });
        sexTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                sexTextFieldKeyPressed(evt);
            }
        });
        add(sexTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, 126, -1));

        jLabel7.setText("Ethnicity:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 70, -1));

        jLabel8.setText("Education Background:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, -1, -1));
        add(ethnicityTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 340, 130, -1));

        rdBtnHighschoolGrad.setText("Highschool Graduate");
        add(rdBtnHighschoolGrad, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 380, -1, -1));

        rdBtnCollegeGrad.setText("College Graduate");
        add(rdBtnCollegeGrad, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 380, -1, -1));

        rdBtnUneducated.setText("Uneducated");
        add(rdBtnUneducated, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 380, -1, -1));

        jLabel6.setText("Reason For Joining");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, -1, -1));

        ARadioButton.setText("Individual and relational factors");
        ARadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ARadioButtonActionPerformed(evt);
            }
        });
        add(ARadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 420, -1, -1));

        BRadioButton2.setText("Economic Issues");
        BRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BRadioButton2ActionPerformed(evt);
            }
        });
        add(BRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 420, -1, -1));

        CRadioButton3.setText("System failures");
        CRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CRadioButton3ActionPerformed(evt);
            }
        });
        add(CRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 420, -1, -1));

        ORadioButton4.setText("Others");
        ORadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ORadioButton4ActionPerformed(evt);
            }
        });
        add(ORadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 420, -1, -1));

        TextArea.setColumns(20);
        TextArea.setRows(5);
        jScrollPane2.setViewportView(TextArea);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 460, -1, 52));

        jLabel9.setText("Description: ");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 470, -1, -1));

        btnUpload.setText("Upload ");
        btnUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadActionPerformed(evt);
            }
        });
        add(btnUpload, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 530, -1, -1));

        jLabel10.setText("Photo:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 530, -1, -1));

        btnViewDetails.setText("View Details");
        btnViewDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDetailsActionPerformed(evt);
            }
        });
        add(btnViewDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 190, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreatePersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreatePersonActionPerformed
         if(!nameJTextField.getText().equals("")){
             try
             {
             SimpleDateFormat date = new SimpleDateFormat("MM/dd/yyyy");
        //ClinicOrganization organization = (ClinicOrganization) organizationEmpJComboBox.getSelectedItem();
       String name = nameJTextField.getText();
       int age = Integer.parseInt(ageTextField.getText());
       String ethnicity = ethnicityTextField.getText();
       String sex = sexTextField.getText();
       String educationBG = null;
       if(rdBtnCollegeGrad.isSelected()){
           educationBG = "College Graduate";
       }
       
       if(rdBtnHighschoolGrad.isSelected()){
           educationBG = "HighSchool Graduate";
       }
       
       if(rdBtnUneducated.isSelected()){
           educationBG = "Uneducated";
       }
       
       String reason= null;
       if(ARadioButton.isSelected())
      {
          reason="Individual and relational factors";
      }
             
      else if(BRadioButton2.isSelected())
      {
          reason="Economic Issues";
      }
      else if(CRadioButton3.isSelected())
        {
                  reason="Systems failures";
        }
      
      else if(ORadioButton4.isSelected())
               {
                 reason="Others";
               }
       String description= TextArea.getText();
        organization.getPersonList().createperson(name, age, reason,ethnicity,sex,educationBG,description,photo);
        
        
        
        populateTable(organization);
        
        }
             catch(NumberFormatException p)
        {
            JOptionPane.showMessageDialog(null, "Please enter Valid Age");
        }
         }else{
             JOptionPane.showMessageDialog(null, "Enter value", "Warning", JOptionPane.WARNING_MESSAGE);
        }

        
    }//GEN-LAST:event_btnCreatePersonActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void nameJTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameJTextFieldKeyPressed
        // TODO add your handling code here:
        Validator.onlyString(evt, nameJTextField);
    }//GEN-LAST:event_nameJTextFieldKeyPressed

    private void sexTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sexTextFieldKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_sexTextFieldKeyPressed

    private void sexTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sexTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sexTextFieldActionPerformed

    private void ARadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ARadioButtonActionPerformed
        // TODO add your handling code here:
        TextArea.enable(true);
    }//GEN-LAST:event_ARadioButtonActionPerformed

    private void BRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BRadioButton2ActionPerformed
        // TODO add your handling code here:
        TextArea.enable(true);
    }//GEN-LAST:event_BRadioButton2ActionPerformed

    private void CRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CRadioButton3ActionPerformed
        // TODO add your handling code here:
        TextArea.enable(true);
    }//GEN-LAST:event_CRadioButton3ActionPerformed

    private void ORadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ORadioButton4ActionPerformed
        // TODO add your handling code here:
        TextArea.enable(true);
    }//GEN-LAST:event_ORadioButton4ActionPerformed

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

            } catch (Exception e) {

            }
        }
        else {

            JOptionPane.showMessageDialog(null, "Please select a picture","Warning",JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btnUploadActionPerformed

    private void btnViewDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDetailsActionPerformed
        // TODO add your handling code here:
        
                int selectedrow = organizationJTable.getSelectedRow();
        
        if(selectedrow <0)
        {
            JOptionPane.showMessageDialog(null, "Please select a Row from table first to view details","Warning",JOptionPane.WARNING_MESSAGE);
        }
        
        else {
        Person p = (Person) organizationJTable.getValueAt(selectedrow, 0);    
        HomelessPersonViewJPanel muajp = new HomelessPersonViewJPanel( userProcessContainer,p);
        userProcessContainer.add("HomelessPersonViewJPanel", muajp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
            
        }
    }//GEN-LAST:event_btnViewDetailsActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton ARadioButton;
    private javax.swing.JRadioButton BRadioButton2;
    private javax.swing.JRadioButton CRadioButton3;
    private javax.swing.JRadioButton ORadioButton4;
    private javax.swing.JTextArea TextArea;
    private javax.swing.JTextField ageTextField;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreatePerson;
    private javax.swing.ButtonGroup btnGrpEducationBackGround;
    private javax.swing.ButtonGroup btnGrpReasons;
    private javax.swing.JButton btnUpload;
    private javax.swing.JButton btnViewDetails;
    private javax.swing.JTextField ethnicityTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JTable organizationJTable;
    private javax.swing.JRadioButton rdBtnCollegeGrad;
    private javax.swing.JRadioButton rdBtnHighschoolGrad;
    private javax.swing.JRadioButton rdBtnUneducated;
    private javax.swing.JTextField sexTextField;
    // End of variables declaration//GEN-END:variables
}
