/*
 * AdminWorkAreaJPanel.java
 *
 * Created on October 10, 2008, 8:50 AM
 */

package userinterface.Beneficiary.Orphanage;

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
import Business.Organization.OrphanageOrganization;
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
 * @author  raunak
 */
public class OrphanageRequestWorkAreaJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    UserAccount account; 
    OrphanageOrganization organization; 
    Enterprise enterprise; 
    EcoSystem business;
     StateNetwork state;
    CountryNetwork country;
    
    /** Creates new form AdminWorkAreaJPanel */
    public OrphanageRequestWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, OrphanageOrganization organization, Enterprise enterprise,StateNetwork network,CountryNetwork cNetwork, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.account=account;
        this.business=business;
        this.organization= organization;
          this.state=network;
        this.country=cNetwork;
       // populateCombo();
        //populateQuantity();
       //populateWorkQueueTable();
       //populateAvailable();
       
    }
    
    public void populateWorkQueueTable(){
        DefaultTableModel model = (DefaultTableModel) requestTable.getModel();
        
        model.setRowCount(0);
        
        for (WorkRequest work : organization.getWorkQueue().getWorkRequestList()){
           if(work instanceof BeneficiaryWorkRequest)
           {
               if(((BeneficiaryWorkRequest) work).getEventDate().equals(new Date())||((BeneficiaryWorkRequest) work).getEventDate().after(new Date()))
               {
            Object[] row = new Object[6];
            row[0] = ((BeneficiaryWorkRequest) work).getRequestType();
            row[1] = ((BeneficiaryWorkRequest) work).getEventName();
            row[2] = ((BeneficiaryWorkRequest) work).getEventDate();
            row[3] = ((BeneficiaryWorkRequest) work).getNumberOfVolunteersRequest();
            row[4]= work;
            row[5]=((BeneficiaryWorkRequest) work).isLogisticRequest();
            model.addRow(row);
           }
           }
        }
    }
     public void populateAvailable(int rows){
         DefaultTableModel model = (DefaultTableModel) availableTable.getModel();
        
        model.setRowCount(0);
        //Pharmacy p= organization.getP();
         WorkRequest p=(WorkRequest) requestTable.getValueAt(rows, 4);
         if(p instanceof BeneficiaryWorkRequest)
           {
         EventDirectory eventDir= ((BeneficiaryWorkRequest) p).getEventDirectory();
           
          for (Event e : eventDir.getEventDirectory()){
           
               
            Object[] row = new Object[4];
            row[0] = e.getEventName();
            row[1] = e.getServingOrganization().getName();
            row[2] = e.getAvailVolunteers();
            row[3] = e.getEventDate();
            model.addRow(row);
           
           
        }
           }
    }
//    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        requestTable = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        availableTable = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        reqBtn = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Orphanage Work Area -Adminstrative Role");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Volunteers Requested");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 170, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Volunteers Available");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 150, 30));

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
        jScrollPane3.setViewportView(requestTable);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 720, 90));

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
        jScrollPane4.setViewportView(availableTable);

        add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 700, 90));

        btnDelete.setText("Delete request");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 280, -1, -1));

        reqBtn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        reqBtn.setText("Request For Help");
        reqBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reqBtnActionPerformed(evt);
            }
        });
        add(reqBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 180, 40));

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void requestTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_requestTableMouseClicked
        // TODO add your handling code here:
        int selectedRow= requestTable.getSelectedRow();
        if(selectedRow >=0){
            //JOptionPane.showMessageDialog(null, "Please select the row to delete the account", "Warning", JOptionPane.WARNING_MESSAGE);
            populateAvailable(selectedRow);

        }
    }//GEN-LAST:event_requestTableMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow= requestTable.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select the row to delete the account", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{

            WorkRequest p=(WorkRequest) requestTable.getValueAt(selectedRow, 4);

            // s.getWorkQueue().getWorkRequestList().remove(p);
            organization.getWorkQueue().getWorkRequestList().remove(p);
            account.getWorkQueue().getWorkRequestList().remove(p);
            business.getWorkQueue().getWorkRequestList().remove(p);
            JOptionPane.showMessageDialog(null, "You have successfully deleted the account");
            populateWorkQueueTable();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void reqBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reqBtnActionPerformed

        OrphanageHomeRequestHelpJPanel muajp = new OrphanageHomeRequestHelpJPanel( userProcessContainer,  account,  organization,  enterprise, state,country, business);
        userProcessContainer.add("OrphanageHomeRequestHelpJPanel", muajp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_reqBtnActionPerformed

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
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton reqBtn;
    private javax.swing.JTable requestTable;
    // End of variables declaration//GEN-END:variables
    
}
