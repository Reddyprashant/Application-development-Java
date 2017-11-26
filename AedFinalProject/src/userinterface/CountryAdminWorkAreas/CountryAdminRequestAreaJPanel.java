/*
 * AdminWorkAreaJPanel.java
 *
 * Created on October 10, 2008, 8:50 AM
 */
package userinterface.CountryAdminWorkAreas;


import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.CountryNetwork;
import Business.Network.StateNetwork;
import Business.Organization.Organization;
import Business.Role.BeneficiaryAdminRole;
import Business.Role.CountryAdminRole;
import Business.Role.EntityAdminRole;
import Business.Role.GovtAdminRole;
import Business.Role.LogisticAdminRole;
import Business.Role.Role;
import Business.SignUp.SignUpRequest;
import Business.SignUp.SignUpRequestEnterprise;
import Business.SignUp.SignUpRequestState;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.PharmacyWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import utility.Validator;

/**
 *
 * @author vinya
 */
public class CountryAdminRequestAreaJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    UserAccount account;
    Enterprise enterprise;
    EcoSystem system;
    CountryNetwork cNetwork;
    /**
     * Creates new form AdminWorkAreaJPanel
     */
    public CountryAdminRequestAreaJPanel(JPanel userProcessContainer,UserAccount account,CountryNetwork cNetwork, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        
        this.system = business;
        this.account=account;
        this.cNetwork=cNetwork;
       // populateCombo();
       // populateQuantity();
        populateWorkQueueTable();
       

    }

  

    public void populateWorkQueueTable() {
        DefaultTableModel model = (DefaultTableModel) requestTable.getModel();

        model.setRowCount(0);
        SignUpRequest s=null;
        for (WorkRequest work : account.getWorkQueue().getWorkRequestList()) {
            if (work instanceof SignUpRequestState) {
                 s= (SignUpRequestState) work;
            }
            else if(work instanceof SignUpRequestEnterprise){
                s= (SignUpRequestEnterprise) work;
            }
                Object[] row = new Object[4];
                row[0] = s.getName();
                row[1] = s.getReceiver();
                 row[2] = s.getSender();
                  row[3] = s; 
                 
                model.addRow(row);
            
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
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        requestTable = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        reqBtn = new javax.swing.JButton();
        btnComplete = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Work Area: Country Admin");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Request for State Creation");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 300, 30));

        requestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "State Name", "Receiver", "Sender", "Status"
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

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 850, 330));

        btnDelete.setText("Delete request");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 450, -1, -1));

        reqBtn.setText("Assign To Me");
        reqBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reqBtnActionPerformed(evt);
            }
        });
        add(reqBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 450, 120, -1));

        btnComplete.setText("Complete");
        btnComplete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompleteActionPerformed(evt);
            }
        });
        add(btnComplete, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 450, 140, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = requestTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select the row to delete the account", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {

            WorkRequest p = (WorkRequest) requestTable.getValueAt(selectedRow, 3);

            // s.getWorkQueue().getWorkRequestList().remove(p);
            account.getWorkQueue().getWorkRequestList().remove(p);
           // account.getWorkQueue().getWorkRequestList().remove(p);
          //  business.getWorkQueue().getWorkRequestList().remove(p);
            JOptionPane.showMessageDialog(null, "You have successfully deleted the account");
            populateWorkQueueTable();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void reqBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reqBtnActionPerformed
        int selectedRow = requestTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select the row to assign the account", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
          
            SignUpRequest p = (SignUpRequest) requestTable.getValueAt(selectedRow, 3);
          
            if(p.getStatus().equals("Requested")){
              //  System.out.println("admin name"+ account.getUsername());
                p.setStatus("Pending");
                p.setReceiver(account);

                populateWorkQueueTable();
               
            }
            else{
                JOptionPane.showMessageDialog(null, "Already assigned");
            }

        }
        //        SupplierWorkRequest request= new SupplierWorkRequest();
        //        request.setVaccine((Vaccine)comboVaccine.getSelectedItem());
        //        request.setQuantity(Integer.parseInt(txtquant.getText()));
        //        request.setStatus("Requested");
        //        request.setSender(account);
        //        //organization.getWorkQueue().getWorkRequestList().add(request);
        //        s.getWorkQueue().getWorkRequestList().add(request);
        //        populateWorkQueueTable();
    }//GEN-LAST:event_reqBtnActionPerformed

    private void btnCompleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = requestTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select the row to assign the account", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            SignUpRequest p = (SignUpRequest) requestTable.getValueAt(selectedRow, 3);
            SignUpRequestState s=null;
              SignUpRequestEnterprise e=null;
            
            
            
            
            if (p.getReceiver() != null) {
                if (p.getStatus().equals("Pending")) {
                     if (p instanceof SignUpRequestState) {
                 s= (SignUpRequestState) p;
                StateNetwork net = cNetwork.createAndAddNetwork();
                    net.setName(p.getName());
             }
            else if(p instanceof SignUpRequestEnterprise){
                e= (SignUpRequestEnterprise) p;
                //You can check for non duplicate of enterprise here.
                Enterprise enterprise = e.getState().getEnterpriseDirectory().createAndAddEnterprise(e.getName(), e.getEnterprise());
                Employee emp= new Employee();
                    emp.setName(p.getName());
                    emp.setEmailId(p.getEmail());
                    if (enterprise.getEnterpriseType() == Enterprise.EnterpriseType.Beneficiary) {
                account = enterprise.getUserAccountDirectory().createUserAccount(p.getUserName(), p.getPassword(), emp, new BeneficiaryAdminRole());
            } else if (enterprise.getEnterpriseType() == Enterprise.EnterpriseType.Entity) {
                account = enterprise.getUserAccountDirectory().createUserAccount(p.getUserName(), p.getPassword(), emp, new EntityAdminRole());
            } else if (enterprise.getEnterpriseType() == Enterprise.EnterpriseType.Government) {
                account = enterprise.getUserAccountDirectory().createUserAccount(p.getUserName(), p.getPassword(), emp, new GovtAdminRole());
            }else if (enterprise.getEnterpriseType() == Enterprise.EnterpriseType.Logistic) {
                account = enterprise.getUserAccountDirectory().createUserAccount(p.getUserName(), p.getPassword(), emp, new LogisticAdminRole());
            }
                    
              Validator.sendMessage(p.getEmail());      
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComplete;
    private javax.swing.JButton btnDelete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton reqBtn;
    private javax.swing.JTable requestTable;
    // End of variables declaration//GEN-END:variables

}
