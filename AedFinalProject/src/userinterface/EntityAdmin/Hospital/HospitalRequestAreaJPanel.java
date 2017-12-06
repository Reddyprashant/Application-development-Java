/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.EntityAdmin.Hospital;

import userinterface.EntityAdmin.MNCAdmin.*;
import userinterface.EntityAdmin.*;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Event.Event;
import Business.Event.EventDirectory;
import Business.Network.CountryNetwork;
import Business.Network.StateNetwork;
import Business.Organization.HospitalOrganization;
//import Business.Organization.MNCOrganization;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Role.BeneficiaryAdminRole;
import Business.Role.EducationAdmin;
import Business.Role.EntityAdminRole;
import Business.Role.GovtAdminRole;
import Business.Role.HospitalAdmin;
import Business.Role.IndividualAdmin;
import Business.Role.LogisticAdminRole;
import Business.Role.MNCAdmin;
import Business.Role.NGOAdmin;
import Business.SignUp.SignUpRequest;
import Business.SignUp.SignUpRequestEnterprise;
import Business.SignUp.SignUpRequestOrganization;
import Business.SignUp.SignUpRequestState;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.BeneficiaryWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.SendFailedException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import utility.Validator;

/**
 *
 * @author prashantreddy
 */
public class HospitalRequestAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form EntityManageRequestJPanel
     */
    private Enterprise enterprise;
    UserAccount account;
    CountryNetwork country;
    StateNetwork state;
    EcoSystem system;
    JPanel userProcessContainer;
HospitalOrganization organization;
    public HospitalRequestAreaJPanel(JPanel userProcessContainer, UserAccount account, HospitalOrganization organization,Enterprise enterprise, StateNetwork network, CountryNetwork cNetwork, EcoSystem business) {
        initComponents();
        //this.organizationDir = organizationDir;
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.system = business;
        this.state = network;
        this.country = cNetwork;
        this.account = account;
        this.organization=organization;
        populateWorkQueueTable();
        populateUpdatedTable();
        
    }


    public void populateWorkQueueTable() {
        System.out.println("entity");
        DefaultTableModel model = (DefaultTableModel) tblReq.getModel();

        model.setRowCount(0);
        //System.out.println("qasda" + enterprise.getWorkQueue().getWorkRequestList().size() + " " + enterprise);
        // SignUpRequest s=null;
        
        for (WorkRequest work : organization.getWorkQueue().getWorkRequestList()) {
            System.out.println("work request");
            if(work instanceof BeneficiaryWorkRequest ){
                  BeneficiaryWorkRequest s = (BeneficiaryWorkRequest) work;
                Object[] row = new Object[6];
                 //System.out.println("qwe"+s.getSenderOrganization());
                row[0] = s.getSenderOrganization();
                row[1] = s.getEventName();
                row[2] = s.getNumberOfVolunteersRequest();
                row[3] = s.getEventDate();
                row[4] = s;
                model.addRow(row);
            }
            
        }
         for (WorkRequest work : enterprise.getWorkQueue().getWorkRequestList()) {
            if(work instanceof BeneficiaryWorkRequest ){
                  BeneficiaryWorkRequest s = (BeneficiaryWorkRequest) work;
                Object[] row = new Object[6];
                 //System.out.println("qwe"+s.getSenderOrganization());
                row[0] = s.getSenderOrganization();
                row[1] = s.getEventName();
                row[2] = s.getNumberOfVolunteersRequest();
                row[3] = s.getEventDate();
                row[4] = s;
                model.addRow(row);
            }
            
        }
    }
public void populateUpdatedTable()
{
     DefaultTableModel model = (DefaultTableModel) UpdatedJTable.getModel();

        model.setRowCount(0);
        if(organization.getEventDirectory()==null){
            organization.setEventDirectory(new EventDirectory());
            System.out.println("uevent");
        }
        for (Event event : organization.getEventDirectory().getEventDirectory()) {
                Object[] row = new Object[6];
                row[0]=event.getEventId();
                row[1] = event.getSenderOrganization();
                row[2] = event.getAvailVolunteers();
                row[3] = event;
                row[4] = event.getEventDate();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblReq = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        UpdatedJTable = new javax.swing.JTable();
        btnAssign = new javax.swing.JButton();
        btnComplete = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblReq.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Organization Name", "Event Name", "Volunteers Required", "Event Date", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblReq);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 77, 690, 182));

        UpdatedJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Event Id", "Organization Name", "Available Volunteers", "Event Name", "Event Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(UpdatedJTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 337, 660, 198));

        btnAssign.setText("View Details");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });
        add(btnAssign, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 270, -1, -1));

        btnComplete.setText("Serve");
        btnComplete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompleteActionPerformed(evt);
            }
        });
        add(btnComplete, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 270, -1, -1));

        jButton3.setText("Send Request to BGV");
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(417, 553, -1, -1));

        jLabel1.setText("Request Recieved");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 43, -1, -1));
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 308, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("Hospital Admin Request Area Panel");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 14, 389, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblReq.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select the row to assign the account", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {

            BeneficiaryWorkRequest p = (BeneficiaryWorkRequest) tblReq.getValueAt(selectedRow, 4);

           // if (p.getStatus().equals("Requested")) {
                //  System.out.println("admin name"+ account.getUsername());
                p.setStatus("Pending");
                
                //p.setReceiver(account);

                populateWorkQueueTable();
                       HospitalViewDetailsJPanel RequestAreaJPanel = new HospitalViewDetailsJPanel(userProcessContainer,  account,  organization,  enterprise,state,country,  system, p);
        userProcessContainer.add("HospitalViewDetailsJPanel", RequestAreaJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
//            } else {
//                JOptionPane.showMessageDialog(null, "Already assigned");
//            }

        }
    }//GEN-LAST:event_btnAssignActionPerformed

    private void btnCompleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblReq.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select the row to assign the account", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            BeneficiaryWorkRequest p = (BeneficiaryWorkRequest) tblReq.getValueAt(selectedRow, 4);
            //BeneficiaryWorkRequest orgRequest = null;
            //SignUpRequestEnterprise e = null;
            UserAccount acc=null;
            if(organization.getEventDirectory()== null){
                organization.setEventDirectory(new EventDirectory());
                System.out.println("event dir null");
            }
    Event event = organization.getEventDirectory().createEvent();
      event.setAvailVolunteers(p.getNumberOfVolunteersRequest());
      event.setEventDate(p.getEventDate());
      event.setEventName(p.getEventName());
      event.setRequiredVolunteers(p.getNumberOfVolunteersRequest());
      event.setServingOrganization(organization);
      
      
      
          p.setNumberOfVolunteersRequest(p.getNumberOfVolunteersRequest() - event.getAvailVolunteers());
          p.getEventDirectory().getEventDirectory().add(event);
      if(p.getNumberOfVolunteersRequest()==0 && p.isLogisticRequest()==true){
      p.setStatus("Complete");
      }
      
                //if (p.getStatus().equals("Pending")) {
//                    if (p instanceof BeneficiaryWorkRequest) {
//                         try {
//                            Validator.sendMessage(p.getEmail());
//                        } catch (SendFailedException ex) {
//                            JOptionPane.showMessageDialog(null, "User has a wrong email address");
//                             p.setStatus("Cancelled");
//                            // populateWorkQueueTable();
//                             return;
                        //}
                                               //You can check for non duplicate of enterprise here.
                       // Enterprise enterprise = e.getState().getEnterpriseDirectory().createAndAddEnterprise(e.getName(), e.getEnterprise());
                        
                       
                    

                    
                    JOptionPane.showMessageDialog(null, "You have successfully completed the request");

                    populateWorkQueueTable();
        }
           
            


        
    }//GEN-LAST:event_btnCompleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable UpdatedJTable;
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnComplete;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblReq;
    // End of variables declaration//GEN-END:variables
}
