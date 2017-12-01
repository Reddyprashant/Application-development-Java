/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Government.BGV;

import userinterface.Beneficiary.*;
import userinterface.EntityAdmin.*;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.CountryNetwork;
import Business.Network.StateNetwork;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Role.CommonPeopleAdmin;
import Business.Role.DisasterAdmin;
import Business.Role.EducationAdmin;
import Business.Role.HomelessAdmin;
import Business.Role.HospitalAdmin;
import Business.Role.IndividualAdmin;
import Business.Role.MNCAdmin;
import Business.Role.NGOAdmin;
import Business.Role.OldAgeAdmin;
import Business.Role.OrphanageAdmin;
import Business.SignUp.SignUpRequest;
import Business.SignUp.SignUpRequestOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.BeneficiaryWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.mail.SendFailedException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.EntityAdmin.MNCAdmin.ViewDetailsJPanel;
import utility.Validator;

/**
 *
 * @author prashantreddy
 */
public class BGVRequestAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form EntityManageRequestJPanel
     */
        private JPanel container;
    private Enterprise enterprise;
    UserAccount account;
    CountryNetwork country;
    StateNetwork state;
    EcoSystem system;
    Organization organization;
    JPanel userProcessContainer;
    public BGVRequestAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, StateNetwork network,CountryNetwork cNetwork, EcoSystem business) {
        initComponents();
     this.organization = organization;
     this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.container = container;
         this.system=business;
        this.state=network;
        this.country=cNetwork;
        this.account=account;
        populateWorkQueueTable();
    }
 public void populateWorkQueueTable() {
        DefaultTableModel model = (DefaultTableModel) tblReq.getModel();

        model.setRowCount(0);
        System.out.println("qasda"+enterprise.getWorkQueue().getWorkRequestList().size()+" "+enterprise);
       // SignUpRequest s=null;
        for (WorkRequest work : organization.getWorkQueue().getWorkRequestList()) {
            System.out.println("q"+work);
            if (work instanceof SignUpRequestOrganization) {
               SignUpRequestOrganization  s= (SignUpRequestOrganization) work;
                Object[] row = new Object[6];
                row[0] = s.getOrgName();
                row[1] = s.getReceiver();
                 row[2] = s.getEnterprise();
                 row[3]= s.getOrgType().getValue();
                 row[4]=s.getCity();
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        btnAssign = new javax.swing.JButton();
        btnServe = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblReq = new javax.swing.JTable();
        userJButton = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 337, -1, 198));

        btnAssign.setText("Assign to me");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });
        add(btnAssign, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, -1, -1));

        btnServe.setText("Serve");
        btnServe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnServeActionPerformed(evt);
            }
        });
        add(btnServe, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 260, -1, -1));

        jButton3.setText("Send Request to BGV");
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(417, 553, -1, -1));

        jLabel1.setText("Verification Table");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 110, 20));

        jLabel2.setText("jLabel2");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 308, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("BGV Admin Request Area Panel");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 14, 389, -1));

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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 750, 182));

        userJButton.setText("View Details");
        userJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userJButtonActionPerformed(evt);
            }
        });
        add(userJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 260, 170, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        // TODO add your handling code here:
         int selectedRow = tblReq.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select the row to assign the account", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
          
            SignUpRequest p = (SignUpRequest) tblReq.getValueAt(selectedRow, 5);
          
            if(p.getStatus().equals("Background Verification")){
              //  System.out.println("admin name"+ account.getUsername());
                p.setStatus("Pending");
                p.setReceiver(account);

                populateWorkQueueTable();
               
            }
            else{
                JOptionPane.showMessageDialog(null, "Already assigned");
            }

        }
    }//GEN-LAST:event_btnAssignActionPerformed

    private void btnServeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnServeActionPerformed
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
                        
                        if(orgRequest.getOrgType()== Organization.Type.CommonPeople){
                            acc = org.getUserAccountDirectory().createUserAccount(p.getUserName(), p.getPassword(), emp, new CommonPeopleAdmin());
                        }
                        else if(orgRequest.getOrgType()== Organization.Type.Disaster){
                            acc = org.getUserAccountDirectory().createUserAccount(p.getUserName(), p.getPassword(), emp, new DisasterAdmin());
                        }
                        else if(orgRequest.getOrgType()== Organization.Type.Homeless){
                            acc = org.getUserAccountDirectory().createUserAccount(p.getUserName(), p.getPassword(), emp, new HomelessAdmin());
                        }
                        else if(orgRequest.getOrgType()== Organization.Type.OldAge){
                            acc = org.getUserAccountDirectory().createUserAccount(p.getUserName(), p.getPassword(), emp, new OldAgeAdmin());
                        }
                        else if(orgRequest.getOrgType()== Organization.Type.Orphanage){
                            acc = org.getUserAccountDirectory().createUserAccount(p.getUserName(), p.getPassword(), emp, new OrphanageAdmin());
                        }

                        try {
                            Validator.sendMessage(p.getEmail());
                        } catch (SendFailedException ex) {
                            JOptionPane.showMessageDialog(null, "User has a wrong email address");
                             p.setStatus("Cancelled");
                             populateWorkQueueTable();
                             return;
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
    }//GEN-LAST:event_btnServeActionPerformed

    private void userJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userJButtonActionPerformed
        // TODO add your handling code here:
        
       
         int selectedRow = tblReq.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select the row to assign the account", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {

            SignUpRequestOrganization p = (SignUpRequestOrganization) tblReq.getValueAt(selectedRow, 5);

           // if (p.getStatus().equals("Requested")) {
                //  System.out.println("admin name"+ account.getUsername());
               // p.setStatus("Pending");
                
                //p.setReceiver(account);

        BGVViewDetailsJPane requestAreaJPanel = new BGVViewDetailsJPane(userProcessContainer,  account,  organization,  enterprise,state,country,  system, p);
        userProcessContainer.add("BGVViewDetailsJPane", requestAreaJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
//            } else {
//                JOptionPane.showMessageDialog(null, "Already assigned");
//            }

        }
    }//GEN-LAST:event_userJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnServe;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable tblReq;
    private javax.swing.JButton userJButton;
    // End of variables declaration//GEN-END:variables
}
