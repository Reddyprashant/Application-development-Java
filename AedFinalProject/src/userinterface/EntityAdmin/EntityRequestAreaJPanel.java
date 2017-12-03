/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.EntityAdmin;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.CountryNetwork;
import Business.Network.StateNetwork;
import Business.Organization.BGVOrganization;
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
import Business.WorkQueue.WorkRequest;
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
public class EntityRequestAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form EntityManageRequestJPanel
     */
    private Enterprise enterprise;
    UserAccount account;
    CountryNetwork country;
    StateNetwork state;
    EcoSystem system;
    JPanel userProcessContainer;

    public EntityRequestAreaJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, StateNetwork network, CountryNetwork cNetwork, EcoSystem business) {
        initComponents();
        //this.organizationDir = organizationDir;
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.system = business;
        this.state = network;
        this.country = cNetwork;
        this.account = account;
        populateWorkQueueTable();
    }

    public void populateWorkQueueTable() {
        DefaultTableModel model = (DefaultTableModel) tblReq.getModel();

        model.setRowCount(0);
        //System.out.println("qasda" + enterprise.getWorkQueue().getWorkRequestList().size() + " " + enterprise);
        // SignUpRequest s=null;
        for (WorkRequest work : enterprise.getWorkQueue().getWorkRequestList()) {
            //System.out.println("q" + work);
            if (work instanceof SignUpRequestOrganization) {
                SignUpRequestOrganization s = (SignUpRequestOrganization) work;
                Object[] row = new Object[6];
                row[0] = s.getOrgName();
                row[1] = s.getReceiver();
                row[2] = s.getEnterprise();
                row[3] = s.getOrgType().getValue();
                row[4] = s.getCity();
                row[5] = s;

                model.addRow(row);
            }
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
        jTable2 = new javax.swing.JTable();
        btnAssign = new javax.swing.JButton();
        btnComplete = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnAssign1 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblReq.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Organization Name", "Reciever", "Enterprise", "Org Type", "City", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblReq);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 77, 690, 182));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 337, 660, 198));

        btnAssign.setText("Assign to me");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });
        add(btnAssign, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 270, -1, -1));

        btnComplete.setText("Serve");
        btnComplete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompleteActionPerformed(evt);
            }
        });
        add(btnComplete, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 270, -1, -1));

        jButton3.setText("Send Request to BGV");
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(417, 553, -1, -1));

        jLabel1.setText("Request Recieved");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 43, -1, -1));

        jLabel2.setText("jLabel2");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 308, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("Entity Admin Request Area Panel");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 14, 389, -1));

        btnAssign1.setText("Assign to BGV");
        btnAssign1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssign1ActionPerformed(evt);
            }
        });
        add(btnAssign1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblReq.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select the row to assign the account", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {

            SignUpRequest p = (SignUpRequest) tblReq.getValueAt(selectedRow, 5);

            if (p.getStatus().equals("Requested")) {
                //  System.out.println("admin name"+ account.getUsername());
                p.setStatus("Pending");
                p.setReceiver(account);

                populateWorkQueueTable();

            } else {
                JOptionPane.showMessageDialog(null, "Already assigned");
            }

        }
    }//GEN-LAST:event_btnAssignActionPerformed

    private void btnCompleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblReq.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select the row to assign the account", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            SignUpRequest p = (SignUpRequest) tblReq.getValueAt(selectedRow, 5);
            SignUpRequestOrganization orgRequest = null;
            //SignUpRequestEnterprise e = null;
            UserAccount acc=null;

            if (p.getReceiver() != null) {
                if (p.getStatus().equals("Pending")) {
                    if (p instanceof SignUpRequestOrganization) {
                         try {
                            Validator.sendMessage(p.getEmail());
                        } catch (SendFailedException ex) {
                            JOptionPane.showMessageDialog(null, "User has a wrong email address");
                             p.setStatus("Cancelled");
                            // populateWorkQueueTable();
                             return;
                        }
                        orgRequest = (SignUpRequestOrganization) p;
                        //You can check for non duplicate of enterprise here.
                       // Enterprise enterprise = e.getState().getEnterpriseDirectory().createAndAddEnterprise(e.getName(), e.getEnterprise());
                        Employee emp = new Employee();
                        emp.setName(p.getName());
                        emp.setEmailId(p.getEmail());
                        Enterprise e= orgRequest.getEnterprise();
                        CountryNetwork country = orgRequest.getCountry();
                        StateNetwork state= orgRequest.getState();
                        
                        Organization org= e.getOrganizationDirectory().createOrganization(orgRequest.getOrgType(), orgRequest.getName(), orgRequest.getCity());
                        
                        if(orgRequest.getOrgType()== Organization.Type.MNC){
                            acc = org.getUserAccountDirectory().createUserAccount(p.getUserName(), p.getPassword(), emp, new MNCAdmin());
                        }
                        else if(orgRequest.getOrgType()== Organization.Type.Education){
                            acc = org.getUserAccountDirectory().createUserAccount(p.getUserName(), p.getPassword(), emp, new EducationAdmin());
                        }
                        else if(orgRequest.getOrgType()== Organization.Type.Individuals){
                            acc = org.getUserAccountDirectory().createUserAccount(p.getUserName(), p.getPassword(), emp, new IndividualAdmin());
                        }
                        else if(orgRequest.getOrgType()== Organization.Type.Hospital){
                            acc = org.getUserAccountDirectory().createUserAccount(p.getUserName(), p.getPassword(), emp, new HospitalAdmin());
                        }
                        else if(orgRequest.getOrgType()== Organization.Type.NGO){
                            acc = org.getUserAccountDirectory().createUserAccount(p.getUserName(), p.getPassword(), emp, new NGOAdmin());
                        }

                       
                    }

                    p.setStatus("Complete");
                    JOptionPane.showMessageDialog(null, "You have successfully completed the request");

                    populateWorkQueueTable();
                } else {
                    JOptionPane.showMessageDialog(null, "You cannot complete it two times.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please assign first");
            }

        }
    }//GEN-LAST:event_btnCompleteActionPerformed

    private void btnAssign1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssign1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblReq.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select the row to assign the account", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {

            SignUpRequest p = (SignUpRequest) tblReq.getValueAt(selectedRow, 5);

            if(p.getStatus().equals("Requested")){
                //  System.out.println("admin name"+ account.getUsername());
                p.setStatus("Background Verification");
                //  p.setReceiver(account);
                for (Enterprise enterprise1 : state.getEnterpriseDirectory().getEnterpriseList()) {
                    for (Organization organization1 : enterprise1.getOrganizationDirectory().getOrganizationList()) {
                        if(organization1 instanceof BGVOrganization){
                            organization1.getWorkQueue().getWorkRequestList().add(p);
                        }
                    }
                }
                populateWorkQueueTable();

            }
            else{
                JOptionPane.showMessageDialog(null, "Already assigned");
            }

        }
    }//GEN-LAST:event_btnAssign1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnAssign1;
    private javax.swing.JButton btnComplete;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable tblReq;
    // End of variables declaration//GEN-END:variables
}
