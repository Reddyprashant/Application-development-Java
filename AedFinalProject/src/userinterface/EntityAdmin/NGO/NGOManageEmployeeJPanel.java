/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.EntityAdmin.NGO;


import userinterface.EntityAdmin.Hospital.*;
import userinterface.EntityAdmin.MNCAdmin.*;
import Business.EcoSystem;
//import userinterface.Hospital.*;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.CountryNetwork;
import Business.Network.StateNetwork;
import Business.Organization.HospitalOrganization;
import Business.Organization.NGOOrganization;
//import Business.Organization.MNCOrganization;
//import Business.Organization.ClinicOrganization;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
//import Business.Organization.OrphanageOrganization;
import Business.Person.Person;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import utility.Validator;

/**
 *
 * @author raunak
 */
public class NGOManageEmployeeJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    UserAccount account; 
    NGOOrganization organization; 
    Enterprise enterprise; 
    EcoSystem business;
     StateNetwork state;
    CountryNetwork country;
    /**
     * Creates new form ManageOrganizationJPanel
     */
    public NGOManageEmployeeJPanel(JPanel userProcessContainer, UserAccount account, NGOOrganization organization, Enterprise enterprise,StateNetwork network,CountryNetwork cNetwork, EcoSystem business) {
        initComponents();
         this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.account=account;
        this.business=business;
        this.organization= organization;
        populateTable(organization);
          this.state=network;
        this.country=cNetwork;
        //TextArea.enable(false);
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

    private void populateTable(NGOOrganization organization){
        DefaultTableModel model = (DefaultTableModel) organizationJTable.getModel();
        
        model.setRowCount(0);
        
        for (Person person : organization.getPersonList().getPersonList()){
            
            Object[] row = new Object[5];
            row[0] = person.getPersonId();
            row[1] = person.getName();
            row[2]=person.getAge();
            row[3]=person.getDateOfJoining();
            row[4]=person.getReason();
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        organizationJTable = new javax.swing.JTable();
        addJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        dobTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        organizationJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Date Of Birth", "Date Of Joining", "Reason"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
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
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 63, 480, 92));

        addJButton.setText("Create Person");
        addJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButtonActionPerformed(evt);
            }
        });
        add(addJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 550, -1, -1));

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, -1, -1));

        jLabel2.setText("Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 40, -1));

        nameJTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nameJTextFieldKeyPressed(evt);
            }
        });
        add(nameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, 126, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("View Persons");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 130, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Create Person");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 130, 30));
        add(dobTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, 130, -1));

        jLabel1.setText("email id");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed
         if(!nameJTextField.getText().equals("")){
           
        //ClinicOrganization organization = (ClinicOrganization) organizationEmpJComboBox.getSelectedItem();
        String name = nameJTextField.getText();
       String Email = (dobTextField.getText());
       
       organization.getEmployeeDirectory().createEmployee(name);
        
        
        
        populateTable(organization);
        
         }else{
             JOptionPane.showMessageDialog(null, "Enter value", "Warning", JOptionPane.WARNING_MESSAGE);
        }

        
    }//GEN-LAST:event_addJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void nameJTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameJTextFieldKeyPressed
        // TODO add your handling code here:
        Validator.onlyString(evt, nameJTextField);
    }//GEN-LAST:event_nameJTextFieldKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField dobTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JTable organizationJTable;
    // End of variables declaration//GEN-END:variables
}
