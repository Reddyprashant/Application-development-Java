/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.EntityAdmin.MNCAdmin;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Event.Event;
import Business.Event.EventDirectory;
import Business.Network.CountryNetwork;
import Business.Network.StateNetwork;
import Business.Organization.MNCOrganization;
import Business.Person.Person;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.BeneficiaryWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author prashantreddy
 */
public class ViewDetailsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewDetailsJPanel
     */
       private Enterprise enterprise;
    UserAccount account;
    CountryNetwork country;
    StateNetwork state;
    EcoSystem system;
    JPanel userProcessContainer;
MNCOrganization organization;
BeneficiaryWorkRequest workRequest;
private MNCRequestAreaJPanel mncRequestPanel;
    public ViewDetailsJPanel(JPanel userProcessContainer, UserAccount account, MNCOrganization organization,Enterprise enterprise, StateNetwork network, CountryNetwork cNetwork, EcoSystem business, BeneficiaryWorkRequest p)  {
        initComponents();
            this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.system = business;
        this.state = network;
        this.country = cNetwork;
        this.account = account;
        this.organization=organization;
        this.workRequest=p;
        nameLabel.setText(organization.getName());
        reqComboBox.setSelectedItem(p.getRequestType());
        eventNameTextfield.setText(p.getEventName());
        reqVolText.setText(String.valueOf(p.getNumberOfVolunteersRequest()));
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        dateField.setText(sdf.format(p.getEventDate()));
        detailTextArea.setText(p.getEventDetails());
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
        enterpriseLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        reqComboBox = new javax.swing.JComboBox<>();
        eventNameTextfield = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        availVolTextField = new javax.swing.JTextField();
        dateField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        UpdateBtn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        reqVolText = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        detailTextArea = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("Enterprise:");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 120, 30));

        jLabel1.setText("Request Type:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 106, -1, -1));

        reqComboBox.setEnabled(false);
        add(reqComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 102, 232, -1));

        eventNameTextfield.setEditable(false);
        eventNameTextfield.setEnabled(false);
        add(eventNameTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 132, 232, -1));

        jLabel5.setText("Event Name");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 137, -1, -1));

        jLabel2.setText("Available Volunteers");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 182, -1, -1));

        availVolTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                availVolTextFieldActionPerformed(evt);
            }
        });
        add(availVolTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 177, 232, -1));

        dateField.setEditable(false);
        dateField.setEnabled(false);
        dateField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateFieldActionPerformed(evt);
            }
        });
        add(dateField, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 248, 232, -1));

        jLabel3.setText("Event Date ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 253, -1, -1));

        UpdateBtn.setText("Update");
        UpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtnActionPerformed(evt);
            }
        });
        add(UpdateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 410, -1, -1));

        jButton2.setText("<<Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 547, -1, -1));

        jLabel6.setText("Required Volunteers");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 220, -1, -1));

        reqVolText.setEditable(false);
        reqVolText.setEnabled(false);
        add(reqVolText, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 210, 232, -1));

        jLabel7.setText("Event Details");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 280, -1, -1));

        detailTextArea.setEditable(false);
        detailTextArea.setColumns(20);
        detailTextArea.setRows(5);
        detailTextArea.setEnabled(false);
        jScrollPane1.setViewportView(detailTextArea);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 280, 232, -1));
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, -1, -1));
        add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 130, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void UpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtnActionPerformed
        // TODO add your handling code here:
        try
        {
        SimpleDateFormat date = new SimpleDateFormat("MM/dd/yyyy");
        String name = eventNameTextfield.getText();
        int availableVolunteers= Integer.parseInt(availVolTextField.getText());
        int requiredVolunteers = Integer.parseInt(reqVolText.getText());
        Date eventDate = date.parse(dateField.getText());
if(organization.getEventDirectory().getEventDirectory() == null){
    organization.setEventDirectory(new EventDirectory());
}
        Event event=  organization.getEventDirectory().createEvent();
            event.setAvailVolunteers(availableVolunteers);
            event.setRequiredVolunteers(requiredVolunteers);
            
           event.setEventDate(eventDate);
            event.setEventName(name);
            event.setServingOrganization(organization);
            event.setSenderOrganization(workRequest.getSenderOrganization());
            
            workRequest.setNumberOfVolunteersRequest(requiredVolunteers-availableVolunteers);
            
       if(workRequest.getNumberOfVolunteersRequest()==0 && workRequest.isLogisticRequest()==true){
            workRequest.setStatus("Complete");
        }
            
        }
        catch(ParseException e)
            
        {
            JOptionPane.showMessageDialog(null, "Please enter date in MM/dd/yyyy format");
        }
    }//GEN-LAST:event_UpdateBtnActionPerformed

    private void dateFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateFieldActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
               userProcessContainer.remove(this);
        
        Component[] componentArray=userProcessContainer.getComponents();
        MNCRequestAreaJPanel mncRequestPanel =(MNCRequestAreaJPanel)userProcessContainer.getComponent(componentArray.length -1);
        mncRequestPanel.populateUpdatedTable();
        mncRequestPanel.populateWorkQueueTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void availVolTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_availVolTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_availVolTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JTextField availVolTextField;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField dateField;
    private javax.swing.JTextArea detailTextArea;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JTextField eventNameTextfield;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JComboBox<String> reqComboBox;
    private javax.swing.JTextField reqVolText;
    // End of variables declaration//GEN-END:variables
}
