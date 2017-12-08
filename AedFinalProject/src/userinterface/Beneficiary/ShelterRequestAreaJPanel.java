/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Beneficiary;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.CountryNetwork;
import Business.Network.StateNetwork;
import Business.Organization.BGVOrganization;
import Business.Organization.IndividualOrganization;
import Business.Organization.Organization;
import Business.Role.DisasterAdmin;
import Business.Role.HomelessAdmin;
import Business.Role.OldAgeAdmin;
import Business.Role.OrphanageAdmin;
import Business.SignUp.SignUpRequest;
import Business.SignUp.SignUpRequestOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ShelterWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.mail.SendFailedException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.googleApi.HomelessDisplayJPanel;
import utility.Validator;

/**
 *
 * @author prashantreddy
 */
public class ShelterRequestAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form EntityManageRequestJPanel
     */
        private JPanel container;
    private Enterprise enterprise;
    UserAccount account;
    CountryNetwork country;
    StateNetwork state;
    EcoSystem system;
    JPanel userProcessContainer;
    Organization organization;
    public ShelterRequestAreaJPanel(JPanel userProcessContainer, UserAccount account,Organization organization, Enterprise enterprise, StateNetwork network,CountryNetwork cNetwork, EcoSystem business) {
        initComponents();
     //this.organizationDir = organizationDir;
     this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.container = container;
         this.system=business;
        this.state=network;
        this.country=cNetwork;
        this.account=account;
        this.organization=organization;
        populateWorkQueueTable();
    }
 public void populateWorkQueueTable() {
        DefaultTableModel model = (DefaultTableModel) tblReq.getModel();

        model.setRowCount(0);
       
        for (WorkRequest work : organization.getWorkQueue().getWorkRequestList()) {
            System.out.println("q"+work);
            if (work instanceof ShelterWorkRequest) {
               ShelterWorkRequest  s= (ShelterWorkRequest) work;
                Object[] row = new Object[6];
                row[0] = s.getRequestDate();
                row[1] = s.getSender();
                 row[2] = s.getReceiver();
                 row[3]= s;
                 row[4]= s.getPersonPresent();
                 row[5]= s.getPersonAbsent();
                 
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

        btnAssign = new javax.swing.JButton();
        btnServe = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblReq = new javax.swing.JTable();
        btnView = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAssign.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnAssign.setForeground(new java.awt.Color(71, 79, 112));
        btnAssign.setText("Assign to me");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });
        add(btnAssign, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, -1, -1));

        btnServe.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnServe.setForeground(new java.awt.Color(71, 79, 112));
        btnServe.setText("Complete");
        btnServe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnServeActionPerformed(evt);
            }
        });
        add(btnServe, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, -1, -1));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(71, 79, 112));
        jLabel1.setText("Request Recieved");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(71, 79, 112));
        jLabel3.setText("Shelter Request Area Panel");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 14, 389, -1));

        tblReq.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tblReq.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        tblReq.setForeground(new java.awt.Color(71, 79, 112));
        tblReq.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Requested Date", "Sender", "Receiver", "Status", "Verified", "Invalid"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblReq);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 690, 182));

        btnView.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnView.setForeground(new java.awt.Color(71, 79, 112));
        btnView.setText("View Details");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });
        add(btnView, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 340, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        // TODO add your handling code here:
         int selectedRow = tblReq.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select the row to assign the account", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
          
            ShelterWorkRequest p = (ShelterWorkRequest) tblReq.getValueAt(selectedRow, 3);
          
            if(p.getStatus().equals("Requested") && !(organization instanceof IndividualOrganization)){
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
            ShelterWorkRequest p = (ShelterWorkRequest) tblReq.getValueAt(selectedRow, 3);
           // SignUpRequestOrganization orgRequest = null;
            //SignUpRequestEnterprise e = null;
            UserAccount acc=null;

            if (p.getReceiver() != null) {
                if (p.getStatus().equals("Pending") && p.getReceiver()==account && !(organization instanceof IndividualOrganization)) {
                    if (p instanceof ShelterWorkRequest) {
                        
                    p.setStatus("Complete");
                    JOptionPane.showMessageDialog(null, "You have successfully completed the request"); 
                    }
                    populateWorkQueueTable();
                } else {
                    JOptionPane.showMessageDialog(null, "You cannot complete it two times.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please assign first");
            }

        }
    }//GEN-LAST:event_btnServeActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
         int selectedRow = tblReq.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select the row to assign the account", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            ShelterWorkRequest p = (ShelterWorkRequest) tblReq.getValueAt(selectedRow, 3);
         HomelessDisplayJPanel muajp = new HomelessDisplayJPanel(userProcessContainer, account,organization, enterprise, state, country, system, p);
        userProcessContainer.add("HomelessDisplayJPanel", muajp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_btnViewActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnServe;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblReq;
    // End of variables declaration//GEN-END:variables
}
