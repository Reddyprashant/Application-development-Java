/*
 * AdminWorkAreaJPanel.java
 *
 * Created on October 10, 2008, 8:50 AM
 */
package userinterface.Beneficiary.DisasterManagement;

import Business.EcoSystem;

import Business.Enterprise.Enterprise;
import Business.Event.Event;
import Business.Event.EventDirectory;
import Business.Network.CountryNetwork;
import Business.Network.StateNetwork;
import Business.Organization.DisasterOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.BeneficiaryWorkRequest;
import Business.WorkQueue.WorkQueue;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class DisasterManagementRequestWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount account;
    private DisasterOrganization organization;
    private Enterprise enterprise;
    private EcoSystem business;
    private StateNetwork state;
    private CountryNetwork country;

    /**
     * Creates new form AdminWorkAreaJPanel
     */
    public DisasterManagementRequestWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, DisasterOrganization organization, Enterprise enterprise, StateNetwork network, CountryNetwork cNetwork, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.account = account;
        this.business = business;
        this.organization = organization;
        this.state = network;
        this.country = cNetwork;
        populateWorkQueueTable();

    }
//Code to populate WorkQueue Table

    public void populateWorkQueueTable() {
        try {
            lblWarning.setText("");
            DefaultTableModel model = (DefaultTableModel) requestTable.getModel();

            model.setRowCount(0);
            if (organization.getWorkQueue() == null) {
                organization.setWorkQueue(new WorkQueue());
            }
            if (organization.getWorkQueue().getWorkRequestList().size() > 0) {

                lblWarning.setText("");
                for (WorkRequest work : organization.getWorkQueue().getWorkRequestList()) {
                    if (work instanceof BeneficiaryWorkRequest) {
                        if (((BeneficiaryWorkRequest) work).getEventDate().equals(new Date()) || ((BeneficiaryWorkRequest) work).getEventDate().after(new Date())) {
                            Object[] row = new Object[6];
                            row[0] = ((BeneficiaryWorkRequest) work).getRequestType();
                            row[1] = ((BeneficiaryWorkRequest) work).getEventName();
                            row[2] = ((BeneficiaryWorkRequest) work).getEventDate();
                            row[3] = ((BeneficiaryWorkRequest) work).getNumberOfVolunteersRequest();
                            row[4] = work;
                            row[5] = ((BeneficiaryWorkRequest) work).isLogisticRequest();
                            model.addRow(row);
                        }
                    }
                }
            } else {
                lblWarning.setText("*There are NO WorkRequests for Disaster Management");
            }
        } catch (Exception ex) {
            lblWarning.setText("*Sorry for the inconvinence. System is down, technical team is working on it. Contact -- poojithsShetty@gmail.com");
        }
    }

//Code to populate Available Table
    public void populateAvailable(int rows) {

        try {
            lblWarning.setText("");
            DefaultTableModel model = (DefaultTableModel) availableTable.getModel();

            model.setRowCount(0);
            WorkRequest p = (WorkRequest) requestTable.getValueAt(rows, 4);
            if (p instanceof BeneficiaryWorkRequest) {
                EventDirectory eventDir = ((BeneficiaryWorkRequest) p).getEventDirectory();
                if (eventDir != null) {
                    for (Event e : eventDir.getEventDirectory()) {
                        Object[] row = new Object[4];
                        row[0] = e.getEventName();
                        row[1] = e.getServingOrganization().getName();
                        row[2] = e.getAvailVolunteers();
                        row[3] = e.getEventDate();
                        model.addRow(row);
                    }
                }
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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        reqBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        availableTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        requestTable = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        btnBack1 = new javax.swing.JButton();
        lblWarning = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(71, 79, 112));
        jLabel1.setText("Disaster Work Area -Adminstrative Role");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 570, -1));

        reqBtn.setBackground(new java.awt.Color(0, 0, 0));
        reqBtn.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 18)); // NOI18N
        reqBtn.setForeground(new java.awt.Color(241, 51, 51));
        reqBtn.setText("Request For Help!!!!  >>>>>");
        reqBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        reqBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reqBtnActionPerformed(evt);
            }
        });
        add(reqBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 310, 50));
        reqBtn.getAccessibleContext().setAccessibleName("Request For Help!!!");

        availableTable.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        availableTable.setForeground(new java.awt.Color(71, 79, 112));
        availableTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Event Name", "Serving Organization", "Volunteers", "Event Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(availableTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 570, 700, 90));

        jLabel4.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(71, 79, 112));
        jLabel4.setText("Volunteers Requested");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 220, 30));

        jLabel5.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Volunteers Available");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 520, 190, 30));

        requestTable.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        requestTable.setForeground(new java.awt.Color(71, 79, 112));
        requestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request Type", "Event Name", "Event Date", "Volunteers Required", "Status", "Logistics Served"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        requestTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                requestTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(requestTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 720, 90));

        btnDelete.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(71, 79, 112));
        btnDelete.setText("Delete request");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 420, -1, 40));

        btnBack1.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        btnBack1.setForeground(new java.awt.Color(71, 79, 112));
        btnBack1.setText("back");
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });
        add(btnBack1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 730, 90, 40));

        lblWarning.setForeground(new java.awt.Color(255, 0, 0));
        add(lblWarning, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 690, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utility/global-world-map-background-business-template-d-globe-40201747.jpg"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, -4, 1310, 870));
    }// </editor-fold>//GEN-END:initComponents

    private void reqBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reqBtnActionPerformed

        DisasterManagementRequestHelpJPanel muajp = new DisasterManagementRequestHelpJPanel(userProcessContainer, account, organization, enterprise, state, country, business);
        userProcessContainer.add("DisasterManagementRequestHelpJPanel", muajp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_reqBtnActionPerformed

    private void requestTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_requestTableMouseClicked
        // TODO add your handling code here:
        int selectedRow = requestTable.getSelectedRow();
        if (selectedRow >= 0) {
            populateAvailable(selectedRow);

        }
    }//GEN-LAST:event_requestTableMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        //Code to delete Work Requests
        int selectedRow = requestTable.getSelectedRow();
        if (selectedRow >= 0) {

            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null, "Would you like to delete the details", "Warning", dialogButton);
            if (dialogResult == JOptionPane.YES_OPTION) {

                WorkRequest p = (WorkRequest) requestTable.getValueAt(selectedRow, 4);
                organization.getWorkQueue().getWorkRequestList().remove(p);
                account.getWorkQueue().getWorkRequestList().remove(p);
                business.getWorkQueue().getWorkRequestList().remove(p);
                JOptionPane.showMessageDialog(null, "You have successfully deleted the account");
                populateWorkQueueTable();
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBack1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable availableTable;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBack1;
    private javax.swing.JButton btnDelete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblWarning;
    private javax.swing.JButton reqBtn;
    private javax.swing.JTable requestTable;
    // End of variables declaration//GEN-END:variables

}
