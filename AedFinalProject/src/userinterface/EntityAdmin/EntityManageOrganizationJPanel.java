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
import utility.Validator;

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
    public EntityManageOrganizationJPanel(JPanel userProcessContainer, OrganizationDirectory directory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.directory = directory;

        populateTable();
        populateCombo();
    }

    public void populateLatLong(LatLong latLong) {
        this.latLong = latLong;
        txtLoc.setText(latLong.getLatitude() + "," + latLong.getLongitude());
    }

    private void populateCombo() {
        organizationJComboBox.removeAllItems();
        organizationJComboBox.addItem(Type.Education);
        organizationJComboBox.addItem(Type.Hospital);
        organizationJComboBox.addItem(Type.MNC);
        organizationJComboBox.addItem(Type.NGO);
        organizationJComboBox.addItem(Type.Individuals);

        //  }
    }

    private void populateTable() {
        try {
            lblWarning.setText("");
            DefaultTableModel model = (DefaultTableModel) organizationJTable.getModel();

            model.setRowCount(0);
            if (directory != null) {
                if (directory.getOrganizationList().size() > 0) {

                    for (Organization organization : directory.getOrganizationList()) {
                        Object[] row = new Object[3];
                        row[0] = organization.getOrganizationID();
                        row[1] = organization.getName();
                        row[2] = organization.getCity();

                        model.addRow(row);
                    }
                } else {
                    lblWarning.setText("*NO Organization found");
                }
            } else {
                lblWarning.setText("*Sorry for the inconvinence. System is down, technical team is working on it. Contact -- poojithsShetty@gmail.com");
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
        btnBack = new javax.swing.JButton();
        lblName = new javax.swing.JLabel();
        lblWarning = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        organizationJTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        organizationJTable.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        organizationJTable.setForeground(new java.awt.Color(71, 79, 112));
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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 480, 92));

        addJButton.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        addJButton.setForeground(new java.awt.Color(71, 79, 112));
        addJButton.setText("Add Organization");
        addJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButtonActionPerformed(evt);
            }
        });
        add(addJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 490, 180, 40));

        organizationJComboBox.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        organizationJComboBox.setForeground(new java.awt.Color(71, 79, 112));
        add(organizationJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 300, 81, -1));

        jLabel1.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(71, 79, 112));
        jLabel1.setText("Organization Type ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, -1, -1));

        backJButton.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        backJButton.setForeground(new java.awt.Color(71, 79, 112));
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 830, 110, 40));

        jLabel2.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(71, 79, 112));
        jLabel2.setText("Organization Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, 150, -1));

        orgNameTextField.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        orgNameTextField.setForeground(new java.awt.Color(71, 79, 112));
        orgNameTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                orgNameTextFieldFocusLost(evt);
            }
        });
        add(orgNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 340, 80, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(71, 79, 112));
        jLabel3.setText("Organization City");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 380, 150, -1));

        txtcity.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        txtcity.setForeground(new java.awt.Color(71, 79, 112));
        txtcity.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtcityFocusLost(evt);
            }
        });
        add(txtcity, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 370, 80, -1));

        jLabel18.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(71, 79, 112));
        jLabel18.setText("Location :");
        add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 410, 100, -1));

        txtLoc.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        txtLoc.setForeground(new java.awt.Color(71, 79, 112));
        add(txtLoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 410, 170, -1));

        btnLocation.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        btnLocation.setForeground(new java.awt.Color(71, 79, 112));
        btnLocation.setText("Set Location");
        btnLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocationActionPerformed(evt);
            }
        });
        add(btnLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 410, -1, -1));

        btnBack.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        btnBack.setText("<<Back");
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 510, -1, -1));

        lblName.setForeground(new java.awt.Color(255, 0, 0));
        add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 340, -1, -1));

        lblWarning.setForeground(new java.awt.Color(255, 0, 0));
        add(lblWarning, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 590, -1, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 24)); // NOI18N
        jLabel4.setText("Manage Organization");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, -1, -1));

        lblCity.setForeground(new java.awt.Color(255, 0, 0));
        add(lblCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 370, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed
        try {
            lblWarning.setText("");
            Type type = (Type) organizationJComboBox.getSelectedItem();
            String name = orgNameTextField.getText();
            String city = txtcity.getText();
            if (!(name.isEmpty())) {
                if (!(city.isEmpty())) {
                    if (latLong != null || txtLoc.getText().isEmpty()) {
                        if (directory != null) {
                            directory.createOrganization(type, name, city, latLong);
                            JOptionPane.showMessageDialog(null, "Organization created successfully");
                            orgNameTextField.setText("");
                            
                            txtcity.setText("");
                            txtLoc.setText("");
                            populateTable();
                        } else {
                            lblWarning.setText("*Sorry for the inconvinence. System is down, technical team is working on it. Contact -- poojithsShetty@gmail.com");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Select the Location", "Warning", JOptionPane.WARNING_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Enter value for city", "Warning", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Enter Organization Name", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        } catch (Exception ex) {
            lblWarning.setText("*Sorry for the inconvinence. System is down, technical team is working on it. Contact -- poojithsShetty@gmail.com");
        }
    }//GEN-LAST:event_addJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void btnLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocationActionPerformed
        // TODO add your handling code here
        try {
            lblWarning.setText("");
            OrganizationLocationJPanel muajp = new OrganizationLocationJPanel(userProcessContainer);
            userProcessContainer.add("OrganizationLocationJPanel", muajp);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        } catch (Exception ex) {
            lblWarning.setText("*Sorry for the inconvinence. System is down, technical team is working on it. Contact -- poojithsShetty@gmail.com");
        }
    }//GEN-LAST:event_btnLocationActionPerformed

    private void orgNameTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_orgNameTextFieldFocusLost
        // TODO add your handling code here:
        if (!orgNameTextField.getText().isEmpty()) {
            if (!Validator.validateName(orgNameTextField.getText())) {
                lblName.setText("*Only Alphabets and Spaces are allowed");
                orgNameTextField.setText("");
            } else {
                lblName.setText("");
            }
        }
    }//GEN-LAST:event_orgNameTextFieldFocusLost

    private void txtcityFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcityFocusLost
        // TODO add your handling code here:
        if (!txtcity.getText().isEmpty()) {
            if (!Validator.validateName(txtcity.getText())) {
                lblCity.setText("*Only Alphabets and Spaces are allowed");
                txtcity.setText("");
            } else {
                lblCity.setText("");
            }
        }
    }//GEN-LAST:event_txtcityFocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnLocation;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblWarning;
    private javax.swing.JTextField orgNameTextField;
    private javax.swing.JComboBox organizationJComboBox;
    private javax.swing.JTable organizationJTable;
    private javax.swing.JTextField txtLoc;
    private javax.swing.JTextField txtcity;
    // End of variables declaration//GEN-END:variables
}
