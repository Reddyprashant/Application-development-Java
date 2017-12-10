/*
 * AdminWorkAreaJPanel.java
 *
 * Created on October 10, 2008, 8:50 AM
 */
package userinterface.Beneficiary.DisasterManagement;

//import Business.Clinic.Pharmacy;
//import userinterface.Hospital.Clinic.*;
import Business.EcoSystem;
//import userinterface.Hospital.*;
import Business.Enterprise.Enterprise;
import Business.Event.Event;
import Business.Event.EventDirectory;
import Business.Network.CountryNetwork;
//import Business.Network.Network;
import Business.Network.StateNetwork;
import Business.Organization.DisasterOrganization;
//import Business.Supplier.Vaccine;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.BeneficiaryWorkRequest;
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

    JPanel userProcessContainer;
    UserAccount account;
    DisasterOrganization organization;
    Enterprise enterprise;
    EcoSystem business;
    StateNetwork state;
    CountryNetwork country;

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
        // populateCombo();
        //populateQuantity();
        //populateWorkQueueTable();
        //populateAvailable();

    }

//    public void populateCombo(){
//        for (Vaccine vaccine : business.getVaccineList().getVaccineList()) {
//            comboVaccine.addItem(vaccine);
//        }
//        
//    }
//    public void populateWorkQueueTable(){
//         DefaultTableModel model = (DefaultTableModel) requestTable.getModel();
//        
//        model.setRowCount(0);
//        
//        for (WorkRequest work : organization.getWorkQueue().getWorkRequestList()){
//           if(work instanceof PharmacyWorkRequest){ 
//            Object[] row = new Object[4];
//            row[0] = work.getVaccine().getVaccineName();
//            row[1] = ((PharmacyWorkRequest) work).getQuantity();
//            row[2] = work;
//            row[3] = work.getReceiver();
//            model.addRow(row);
//           }
//        }
//    }
//     public void populateAvailable(){
//         DefaultTableModel model = (DefaultTableModel) availableTable.getModel();
//        
//        model.setRowCount(0);
//        Pharmacy p= organization.getP();
//         System.out.println("pharmacy"+ p.getVaccine().getVaccineList().size());
//        for (Vaccine vaccine : p.getVaccine().getVaccineList()){
//          
//            Object[] row = new Object[2];
//            row[0] = vaccine.getVaccineName();
//            row[1] = vaccine.getQuantity();
//            model.addRow(row);
//           
//        }
//    }
//     public void populateQuantity(){
//         
//         for ( WorkRequest workRequest : account.getWorkQueue().getWorkRequestList()) {
//            // HashMap<WorkRequest,Integer> map = new HashMap<WorkRequest,Integer>();
//             int temp=0;
//             PharmacyWorkRequest p= (PharmacyWorkRequest) workRequest;
//             if(workRequest.getStatus().equals("Complete") && !p.isAdd() ){ //&& add == false
//                 Vaccine v = workRequest.getVaccine();
//                
//                  for (Vaccine vaccine : organization.getP().getVaccine().getVaccineList()) {
//                     if(v.getVaccineName().equals(vaccine.getVaccineName())){
//                         temp=1;
//                          vaccine.setQuantity(p.getQuantity()+vaccine.getQuantity());
//                     }
//                     
//                 }
//                  if(temp==0){
//                       Vaccine vac= organization.getP().getVaccine().addVaccine();
//                       vac.setDisease(v.getDisease());
//                       vac.setVaccineName(v.getVaccineName());
//                       vac.setQuantity(p.getQuantity());
//                   }
//                 p.setAdd(true); 
//             }
//         }
//        
//     }
//    
    public void populateWorkQueueTable() {
        try {
            lblWarning.setText("");
            DefaultTableModel model = (DefaultTableModel) requestTable.getModel();

            model.setRowCount(0);
            if (organization != null) {
                if (organization.getWorkQueue() != null) {
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
                } else {
                    lblWarning.setText("*Sorry for the inconvinence. System is down, technical team is working on it. Contact -- poojithsShetty@gmail.com");
                }
            } else {
                lblWarning.setText("*Sorry for the inconvinence. System is down, technical team is working on it. Contact -- poojithsShetty@gmail.com");
            }
        } catch (Exception ex) {
            lblWarning.setText("*Sorry for the inconvinence. System is down, technical team is working on it. Contact -- poojithsShetty@gmail.com");
        }
    }

    public void populateAvailable(int rows) {

        try {
            lblWarning.setText("");
            DefaultTableModel model = (DefaultTableModel) availableTable.getModel();

            model.setRowCount(0);
            //Pharmacy p= organization.getP();
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
                } else {
                    lblWarning.setText("*Sorry for the inconvinence. System is down, technical team is working on it. contact -- poojithsShetty@gmail.com");
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
        btnBack = new javax.swing.JButton();
        lblWarning = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(71, 79, 112));
        jLabel1.setText("Disaster Work Area -Adminstrative Role");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, -1, -1));

        reqBtn.setBackground(new java.awt.Color(0, 0, 0));
        reqBtn.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        reqBtn.setForeground(new java.awt.Color(241, 51, 51));
        reqBtn.setText("Request For Help!!!!  >>>>>");
        reqBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reqBtnActionPerformed(evt);
            }
        });
        add(reqBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 310, 50));
        reqBtn.getAccessibleContext().setAccessibleName("Request For Help!!!");

        availableTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 700, 90));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(71, 79, 112));
        jLabel4.setText("Volunteers Requested");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 170, 30));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(71, 79, 112));
        jLabel5.setText("Volunteers Available");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 150, 30));

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

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 720, 90));

        btnDelete.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(71, 79, 112));
        btnDelete.setText("Delete request");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 280, -1, -1));

        btnBack.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(71, 79, 112));
        btnBack.setText("back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, -1, -1));

        lblWarning.setForeground(new java.awt.Color(255, 0, 0));
        add(lblWarning, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 540, -1, -1));
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
            //JOptionPane.showMessageDialog(null, "Please select the row to delete the account", "Warning", JOptionPane.WARNING_MESSAGE);
            populateAvailable(selectedRow);

        }
    }//GEN-LAST:event_requestTableMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = requestTable.getSelectedRow();
        if (selectedRow >= 0) {

            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null, "Would you like to delete the details", "Warning", dialogButton);
            if (dialogResult == JOptionPane.YES_OPTION) {

                WorkRequest p = (WorkRequest) requestTable.getValueAt(selectedRow, 4);

                // s.getWorkQueue().getWorkRequestList().remove(p);
                organization.getWorkQueue().getWorkRequestList().remove(p);
                account.getWorkQueue().getWorkRequestList().remove(p);
                business.getWorkQueue().getWorkRequestList().remove(p);
                JOptionPane.showMessageDialog(null, "You have successfully deleted the account");
                populateWorkQueueTable();
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable availableTable;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblWarning;
    private javax.swing.JButton reqBtn;
    private javax.swing.JTable requestTable;
    // End of variables declaration//GEN-END:variables

}
