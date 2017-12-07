/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.EntityAdmin;

//import userinterface.AdministrativeRole.*;
import Business.LatLong;
import Business.Organization.Organization;
import Business.Organization.Organization.Type;
import Business.Organization.OrganizationDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.googleApi.OrganizationLocationJPanel;

/**
 *
 * @author raunak
 */
public class EntityManageOrganizationJPanel extends javax.swing.JPanel {

    private OrganizationDirectory directory;
    private JPanel userProcessContainer;
    private LatLong latLong;
    /**
     * Creates new form ManageOrganizationJPanel
     */
    public EntityManageOrganizationJPanel(JPanel userProcessContainer,OrganizationDirectory directory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.directory = directory;
        
        populateTable();
        populateCombo();
    }
    public void populateLatLong(LatLong latLong){
        this.latLong=latLong;
       txtLoc.setText(latLong.getLatitude()+","+latLong.getLongitude());
    }
    private void populateCombo(){
        organizationJComboBox.removeAllItems();
      //  for (Type type : Organization.Type.values()){
       //     if (!type.getValue().equals(Type.Clinic.getValue()))
                organizationJComboBox.addItem(Type.Education);
                organizationJComboBox.addItem(Type.Hospital);
                organizationJComboBox.addItem(Type.MNC);
                organizationJComboBox.addItem(Type.NGO);
                organizationJComboBox.addItem(Type.Individuals);
                
      //  }
    }

    private void populateTable(){
        DefaultTableModel model = (DefaultTableModel) organizationJTable.getModel();
        
        model.setRowCount(0);
        
        for (Organization organization : directory.getOrganizationList()){
            Object[] row = new Object[3];
            row[0] = organization.getOrganizationID();
            row[1] = organization.getName();
            row[2] = organization.getCity();
           
            
            model.addRow(row);
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
        organizationJTable = new javax.swing.JTable();
        addJButton = new javax.swing.JButton();
        organizationJComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        orgNameTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtcity = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtLoc = new javax.swing.JTextField();
        btnLocation = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        organizationJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "City"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(organizationJTable);
        if (organizationJTable.getColumnModel().getColumnCount() > 0) {
            organizationJTable.getColumnModel().getColumn(0).setResizable(false);
            organizationJTable.getColumnModel().getColumn(1).setResizable(false);
            organizationJTable.getColumnModel().getColumn(2).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 60, 480, 92));

        addJButton.setText("Add Organization");
        addJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButtonActionPerformed(evt);
            }
        });
        add(addJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 430, -1, -1));

        organizationJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(organizationJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 225, 81, -1));

        jLabel1.setText("Organization Type ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 228, -1, -1));

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 310, -1, -1));

        jLabel2.setText("Organization Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, -1, -1));

        orgNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgNameTextFieldActionPerformed(evt);
            }
        });
        add(orgNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 80, -1));

        jLabel3.setText("Organization City");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, -1, -1));

        txtcity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcityActionPerformed(evt);
            }
        });
        add(txtcity, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, 80, -1));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(71, 79, 112));
        jLabel18.setText("Location :");
        add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 100, -1));

        txtLoc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLocKeyPressed(evt);
            }
        });
        add(txtLoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, 170, -1));

        btnLocation.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnLocation.setForeground(new java.awt.Color(71, 79, 112));
        btnLocation.setText("Set Location");
        btnLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocationActionPerformed(evt);
            }
        });
        add(btnLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 340, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed
    
        Type type = (Type) organizationJComboBox.getSelectedItem();
        String name = orgNameTextField.getText();
        String city= txtcity.getText();
        if(!(name.isEmpty())){
            if(!(city.isEmpty())){
                if(latLong!=null){
               directory.createOrganization(type, name, city,latLong);
               populateTable();
            }
            
            else{
                JOptionPane.showMessageDialog(null, "Select the Location", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            }
            else{
                JOptionPane.showMessageDialog(null, "Enter value for city", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }   
        else{
             JOptionPane.showMessageDialog(null, "Enter Organization Name", "Warning", JOptionPane.WARNING_MESSAGE);   
        }    
    }//GEN-LAST:event_addJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void orgNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orgNameTextFieldActionPerformed

    private void txtcityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcityActionPerformed

    private void txtLocKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLocKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLocKeyPressed

    private void btnLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocationActionPerformed
        // TODO add your handling code here
        OrganizationLocationJPanel muajp = new OrganizationLocationJPanel(userProcessContainer);
        userProcessContainer.add("OrganizationLocationJPanel", muajp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnLocationActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnLocation;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField orgNameTextField;
    private javax.swing.JComboBox organizationJComboBox;
    private javax.swing.JTable organizationJTable;
    private javax.swing.JTextField txtLoc;
    private javax.swing.JTextField txtcity;
    // End of variables declaration//GEN-END:variables
}
