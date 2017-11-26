/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.EntityAdmin;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.CountryNetwork;
import Business.Network.StateNetwork;
import Business.Organization.OrganizationDirectory;
import Business.SignUp.SignUpRequest;
import Business.SignUp.SignUpRequestEnterprise;
import Business.SignUp.SignUpRequestOrganization;
import Business.SignUp.SignUpRequestState;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

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
    public EntityRequestAreaJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, StateNetwork network,CountryNetwork cNetwork, EcoSystem business) {
        initComponents();
     //this.organizationDir = organizationDir;
     this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
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
        for (WorkRequest work : enterprise.getWorkQueue().getWorkRequestList()) {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblReq = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

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

        jButton1.setText("Assign to me");
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 270, -1, -1));

        jButton2.setText("Serve");
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 270, -1, -1));

        jButton3.setText("Send Request to BGV");
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(417, 553, -1, -1));

        jLabel1.setText("Request Recieved");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 43, -1, -1));

        jLabel2.setText("jLabel2");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 308, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("Entity Admin Request Area Panel");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 14, 389, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
