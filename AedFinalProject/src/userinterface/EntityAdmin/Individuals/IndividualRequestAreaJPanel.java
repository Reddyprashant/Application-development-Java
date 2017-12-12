/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.EntityAdmin.Individuals;

import userinterface.EntityAdmin.Hospital.*;
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
import Business.Organization.IndividualOrganization;
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
import Business.WorkQueue.WorkQueue;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.SendFailedException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.Beneficiary.ShelterRequestAreaJPanel;
import utility.Validator;

/**
 *
 * @author prashantreddy
 */
public class IndividualRequestAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form EntityManageRequestJPanel
     */
    private Enterprise enterprise;
    UserAccount account;
    CountryNetwork country;
    StateNetwork state;
    EcoSystem system;
    JPanel userProcessContainer;
    IndividualOrganization organization;

    public IndividualRequestAreaJPanel(JPanel userProcessContainer, UserAccount account, IndividualOrganization organization, Enterprise enterprise, StateNetwork network, CountryNetwork cNetwork, EcoSystem business) {
        initComponents();
        //this.organizationDir = organizationDir;
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.system = business;
        this.state = network;
        this.country = cNetwork;
        this.account = account;
        this.organization = organization;
        populateWorkQueueTable();
        populateUpdatedTable();

    }

    public void populateWorkQueueTable() {
        try {
            lblWarning.setText("");
            DefaultTableModel model = (DefaultTableModel) tblReq.getModel();

            model.setRowCount(0);
            if (enterprise.getWorkQueue() == null) {
                enterprise.setWorkQueue(new WorkQueue());
            }
            //Displaying the work requests
            if (enterprise.getWorkQueue().getWorkRequestList().size() > 0) {
                for (WorkRequest work : enterprise.getWorkQueue().getWorkRequestList()) {
                    if (work instanceof BeneficiaryWorkRequest) {
                        BeneficiaryWorkRequest s = (BeneficiaryWorkRequest) work;
                        Object[] row = new Object[6];
                        row[0] = s.getSenderOrganization();
                        row[1] = s.getEventName();
                        row[2] = s.getNumberOfVolunteersRequest();
                        row[3] = s.getEventDate();
                        row[4] = s;
                        model.addRow(row);
                    }

                }

            } else {
                lblWarning.setText("*Work Request is not Available");
            }
        } catch (Exception ex) {
            lblWarning.setText("*Sorry for the inconvinence. System is down, technical team is working on it. Contact -- poojithsShetty@gmail.com");
        }
    }
    

    public void populateUpdatedTable() {
        try {
            lblWarning.setText("");
            DefaultTableModel model = (DefaultTableModel) UpdatedJTable.getModel();
            //Displaying the events
            model.setRowCount(0);
            if (organization.getEventDirectory() == null) {
                organization.setEventDirectory(new EventDirectory());

            }
            //Populating the event directory
            if (organization.getEventDirectory().getEventDirectory().size() > 0) {
                lblWarning.setText("");
                for (Event event : organization.getEventDirectory().getEventDirectory()) {
                    Object[] row = new Object[6];
                    row[0] = event.getEventId();
                    row[1] = event.getSenderOrganization();
                    row[2] = event.getAvailVolunteers();
                    row[3] = event;
                    row[4] = event.getEventDate();
                    model.addRow(row);
                }
            } else {
                lblWarning.setText("*NO Events are Available");
            }
        } catch (Exception ex) {
            lblWarning.setText("*Sorry for the inconvinence. System is down, technical team is working on it. Contact -- poojithsShetty@gmail.com");
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
        btnComplete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        lblWarning = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblReq.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        tblReq.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        tblReq.setForeground(new java.awt.Color(71, 79, 112));
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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 690, 182));

        UpdatedJTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        UpdatedJTable.setForeground(new java.awt.Color(71, 79, 112));
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

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 550, 660, 198));

        btnComplete.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        btnComplete.setForeground(new java.awt.Color(71, 79, 112));
        btnComplete.setText("Serve");
        btnComplete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompleteActionPerformed(evt);
            }
        });
        add(btnComplete, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 420, 130, 40));

        jLabel1.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(71, 79, 112));
        jLabel1.setText("Request Recieved");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, -1, -1));
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 308, -1, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(71, 79, 112));
        jLabel3.setText("Individual Request Area Panel");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 460, -1));

        backJButton.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        backJButton.setForeground(new java.awt.Color(71, 79, 112));
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 790, 110, 40));

        lblWarning.setForeground(new java.awt.Color(255, 51, 0));
        add(lblWarning, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 860, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utility/global-world-map-background-business-template-d-globe-40201747.jpg"))); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, -4, 1300, 870));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCompleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompleteActionPerformed
        // Completing the request by subtracting volunteer by 1
        try {
            lblWarning.setText("");
            int selectedRow = tblReq.getSelectedRow();
            if (selectedRow < 0) {
                JOptionPane.showMessageDialog(null, "Please select the row to assign the account", "Warning", JOptionPane.WARNING_MESSAGE);
            } else {
                BeneficiaryWorkRequest p = (BeneficiaryWorkRequest) tblReq.getValueAt(selectedRow, 4);
                BeneficiaryWorkRequest orgRequest = null;
                UserAccount acc = null;
                if (p.getStatus().equals("Complete")) {
                    if (organization.getEventDirectory() == null) {
                        organization.setEventDirectory(new EventDirectory());

                    }
                    //Displays all the events of the individual
                    Event event = organization.getEventDirectory().createEvent();
                    event.setAvailVolunteers(1);
                    event.setEventDate(p.getEventDate());
                    event.setEventName(p.getEventName());
                    event.setRequiredVolunteers(p.getNumberOfVolunteersRequest());
                    event.setServingOrganization(organization);
                    event.setSenderOrganization(p.getSenderOrganization());

                    p.setNumberOfVolunteersRequest(p.getNumberOfVolunteersRequest() - event.getAvailVolunteers());
                    p.getEventDirectory().getEventDirectory().add(event);
                    if (p.isLogisticRequest() == true && p.getNumberOfVolunteersRequest() == 0) {
                        try {
                            p.setStatus("Complete");
                            Validator.sendMessage(p.getSender().getEmployee().getEmailId());
                        } catch (SendFailedException ex) {
                            
                        }
                    }
                    JOptionPane.showMessageDialog(null, "You have successfully completed the request");

                    populateWorkQueueTable();
                    populateUpdatedTable();
                } else {
                    JOptionPane.showMessageDialog(null, "You cannot complete it two times.");
                }

            }
        } catch (Exception ex) {
            lblWarning.setText("*Sorry for the inconvinence. System is down, technical team is working on it. Contact -- poojithsShetty@gmail.com");
        }


    }//GEN-LAST:event_btnCompleteActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable UpdatedJTable;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnComplete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblWarning;
    private javax.swing.JTable tblReq;
    // End of variables declaration//GEN-END:variables
}
