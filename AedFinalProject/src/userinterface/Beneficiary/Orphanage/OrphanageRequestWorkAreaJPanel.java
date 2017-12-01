/*
 * AdminWorkAreaJPanel.java
 *
 * Created on October 10, 2008, 8:50 AM
 */

package userinterface.Beneficiary.Orphanage;

//import Business.Clinic.Pharmacy;
//import userinterface.Hospital.Clinic.*;
import Business.EcoSystem;
import Business.Employee.Employee;
//import userinterface.Hospital.*;
import Business.Enterprise.Enterprise;
import Business.Network.CountryNetwork;
//import Business.Network.Network;
import Business.Network.StateNetwork;
import Business.Organization.OrphanageOrganization;
import Business.Organization.Organization;
//import Business.Supplier.Vaccine;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import utility.Validator;

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
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
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
        backJButton = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Orphanage Work Area -Adminstrative Role");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        reqBtn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        reqBtn.setText("Request For Help");
        reqBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reqBtnActionPerformed(evt);
            }
        });
        add(reqBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 190, 50));

        availableTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vaccine Name", "Quantity"
            }
        ));
        jScrollPane1.setViewportView(availableTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 650, 90));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Vaccines Requested");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 170, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Vaccines Available");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 150, 30));

        requestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vaccine Name", "Quantity", "Status", "Receiver"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(requestTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 640, 90));

        backJButton.setText("Refresh");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, -1, -1));

        btnDelete.setText("Delete request");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void reqBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reqBtnActionPerformed
//         if(!txtquant.getText().equals("")){
//        PharmacyWorkRequest request= new PharmacyWorkRequest();
//        request.setVaccine((Vaccine)comboVaccine.getSelectedItem());
//        request.setQuantity(Integer.parseInt(txtquant.getText()));
//        request.setStatus("Requested");
//        request.setSender(account);
//        organization.getWorkQueue().getWorkRequestList().add(request);
//        account.getWorkQueue().getWorkRequestList().add(request);
//        business.getWorkQueue().getWorkRequestList().add(request);
//        populateWorkQueueTable();
//        }else{
//             JOptionPane.showMessageDialog(null, "Enter value", "Warning", JOptionPane.WARNING_MESSAGE);
//        }

        
    }//GEN-LAST:event_reqBtnActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        new OrphanageRequestWorkAreaJPanel(userProcessContainer, account, organization, enterprise,state,country, business);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow= requestTable.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select the row to delete the account", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{

            WorkRequest p=(WorkRequest) requestTable.getValueAt(selectedRow, 2);

           // s.getWorkQueue().getWorkRequestList().remove(p);
            organization.getWorkQueue().getWorkRequestList().remove(p);
            account.getWorkQueue().getWorkRequestList().remove(p);
            business.getWorkQueue().getWorkRequestList().remove(p);
            JOptionPane.showMessageDialog(null, "You have successfully deleted the account");
            //populateWorkQueueTable();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable availableTable;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnDelete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton reqBtn;
    private javax.swing.JTable requestTable;
    // End of variables declaration//GEN-END:variables
    
}
