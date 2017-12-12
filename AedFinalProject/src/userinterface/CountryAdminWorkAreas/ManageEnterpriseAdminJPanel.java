/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CountryAdminWorkAreas;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.CountryNetwork;
import Business.Network.StateNetwork;
import Business.Role.BeneficiaryAdminRole;
import Business.Role.EntityAdminRole;
import Business.Role.GovtAdminRole;
import Business.Role.LogisticAdminRole;

import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.SendFailedException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import utility.Validator;

/**
 *
 * @author raunak
 */
public class ManageEnterpriseAdminJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;
    private CountryNetwork cNetwork;
    /**
     * Creates new form ManageEnterpriseJPanel
     */
    public ManageEnterpriseAdminJPanel(JPanel userProcessContainer,CountryNetwork cNetwork, EcoSystem system) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.cNetwork=cNetwork;
        populateTable();
        populateNetworkComboBox();
        
    }

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) enterpriseJTable.getModel();

        model.setRowCount(0);
        for (StateNetwork network : cNetwork.getStateList()) {
            if(network.getEnterpriseDirectory() != null){
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                if(enterprise.getUserAccountDirectory()!= null){
                for (UserAccount userAccount : enterprise.getUserAccountDirectory().getUserAccountList()) {
                    Object[] row = new Object[3];
                    row[0] = enterprise.getName();
                    row[1] = network.getName();
                    row[2] = userAccount;

                    model.addRow(row);
                }
            }
            }
            }
        }
    }

    private void populateNetworkComboBox() {
        networkJComboBox.removeAllItems();
        for (StateNetwork network : cNetwork.getStateList()) {
            networkJComboBox.addItem(network);
        }   

    }

    private void populateEnterpriseComboBox(StateNetwork network) {
        enterpriseJComboBox.removeAllItems();
        if(network.getEnterpriseDirectory()!= null){
      //  if(!network.getEnterpriseDirectory().getEnterpriseList().isEmpty()){
           for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                enterpriseJComboBox.addItem(enterprise);
            }
        }
        else{
             txtEmail.setEnabled(false);
             usernameJTextField.setEnabled(false);
             passwordJPasswordField.setEnabled(false);
             nameJTextField.setEnabled(false);
             submitJButton.setEnabled(false);
             btnDelete.setEnabled(false);
             networkJComboBox.addItem("Please Add Enterprise");
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
        enterpriseJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        networkJComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        usernameJTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        enterpriseJComboBox = new javax.swing.JComboBox();
        submitJButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        passwordJPasswordField = new javax.swing.JPasswordField();
        backJButton = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setForeground(new java.awt.Color(71, 79, 112));

        enterpriseJTable.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        enterpriseJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Enterprise Name", "Network", "Username"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(enterpriseJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 523, 95));

        jLabel1.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(71, 79, 112));
        jLabel1.setText("Network");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 410, 70, -1));

        networkJComboBox.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        networkJComboBox.setForeground(new java.awt.Color(71, 79, 112));
        networkJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkJComboBoxActionPerformed(evt);
            }
        });
        add(networkJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 410, 136, -1));

        jLabel2.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(71, 79, 112));
        jLabel2.setText("Username");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 500, 70, -1));

        usernameJTextField.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        usernameJTextField.setForeground(new java.awt.Color(71, 79, 112));
        add(usernameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 500, 136, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(71, 79, 112));
        jLabel3.setText("Enterprise");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 460, 90, -1));

        enterpriseJComboBox.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        enterpriseJComboBox.setForeground(new java.awt.Color(71, 79, 112));
        add(enterpriseJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 460, 136, -1));

        submitJButton.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        submitJButton.setForeground(new java.awt.Color(71, 79, 112));
        submitJButton.setText("Submit");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        add(submitJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 690, 110, 50));

        jLabel4.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 540, 70, -1));

        nameJTextField.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        nameJTextField.setForeground(new java.awt.Color(71, 79, 112));
        add(nameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 580, 136, -1));

        jLabel5.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Name");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 580, 40, -1));

        passwordJPasswordField.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        passwordJPasswordField.setForeground(new java.awt.Color(71, 79, 112));
        passwordJPasswordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordJPasswordFieldFocusLost(evt);
            }
        });
        add(passwordJPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 540, 134, -1));

        backJButton.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        backJButton.setForeground(new java.awt.Color(71, 79, 112));
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 740, -1, 40));

        btnDelete.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(71, 79, 112));
        btnDelete.setText("Delete request");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 300, -1, 40));

        jLabel6.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Email Id:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 620, 80, -1));

        txtEmail.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(71, 79, 112));
        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });
        add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 620, 136, -1));

        jLabel7.setBackground(new java.awt.Color(0, 171, 56));
        jLabel7.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(71, 79, 112));
        jLabel7.setText("Manage Enterprise Work Area");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 410, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utility/global-world-map-background-business-template-d-globe-40201747.jpg"))); // NOI18N
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, -4, 1300, 870));
    }// </editor-fold>//GEN-END:initComponents

    private void networkJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkJComboBoxActionPerformed

        StateNetwork network = (StateNetwork) networkJComboBox.getSelectedItem();
        if ((networkJComboBox.getSelectedItem() != null)) {
            populateEnterpriseComboBox(network);
        }
        else{
            JOptionPane.showMessageDialog(null, "Add network ");
        }


    }//GEN-LAST:event_networkJComboBoxActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        if(!nameJTextField.getText().equals("") && !usernameJTextField.getText().isEmpty() && !passwordJPasswordField.getText().isEmpty() && !txtEmail.getText().isEmpty()){
            
            
        Enterprise enterprise = (Enterprise) enterpriseJComboBox.getSelectedItem();

        String username = usernameJTextField.getText();
        String password = String.valueOf(passwordJPasswordField.getPassword());
        String name = nameJTextField.getText();
        String email= txtEmail.getText();
        Employee employee = enterprise.getEmployeeDirectory().createEmployee(name,email);
        if (EcoSystem.checkIfUsernameIsUnique(username)) {
            try {
                Validator.sendMessage(txtEmail.getText());
            } catch (SendFailedException ex) {
               // Logger.getLogger(ManageEnterpriseAdminJPanel.class.getName()).log(Level.SEVERE, null, ex);
               JOptionPane.showMessageDialog(null, "Wrong emailId entered. ");
               return;
            }
            UserAccount account = null;
            if (enterprise.getEnterpriseType() == Enterprise.EnterpriseType.Beneficiary) {
                account = enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, new BeneficiaryAdminRole());
            } else if (enterprise.getEnterpriseType() == Enterprise.EnterpriseType.Entity) {
                account = enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, new EntityAdminRole());
            } else if (enterprise.getEnterpriseType() == Enterprise.EnterpriseType.Government) {
                account = enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, new GovtAdminRole());
            }else if (enterprise.getEnterpriseType() == Enterprise.EnterpriseType.Logistic) {
                account = enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, new LogisticAdminRole());
            }
            JOptionPane.showMessageDialog(null, "Useraccount created successfully", "Warning", JOptionPane.WARNING_MESSAGE);
            usernameJTextField.setText("");
            passwordJPasswordField.setText("");
            nameJTextField.setText("");
            txtEmail.setText("");
            populateTable();
        }
        else {
            JOptionPane.showMessageDialog(null, "Please enter unique username", "Warning", JOptionPane.WARNING_MESSAGE);
        }
 }else{
             JOptionPane.showMessageDialog(null, "Enter all the value", "Warning", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_submitJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CountryAdminWorkAreaJPanel sysAdminwjp = (CountryAdminWorkAreaJPanel) component;
        sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = enterpriseJTable.getSelectedRow();
        if(selectedRow >=0)
        {
            
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null,"Would you like to delete the details","Warning", dialogButton);
            if (dialogResult == JOptionPane.YES_OPTION){

            UserAccount p = (UserAccount) enterpriseJTable.getValueAt(selectedRow, 2);

            for (StateNetwork network : cNetwork.getStateList()) {
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                    for (UserAccount userAccount : enterprise.getUserAccountDirectory().getUserAccountList()) {
                        if (p == userAccount) {
                            enterprise.getUserAccountDirectory().getUserAccountList().remove(p);
                            break;
                        }

                    }
                }
            }

            JOptionPane.showMessageDialog(null, "You have successfully deleted the account");
            populateTable();
            }
        }
        else{
           JOptionPane.showMessageDialog(null, "Please select a Row from table ","Warning",JOptionPane.WARNING_MESSAGE);
        }   
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
        // TODO add your handling code here:
        if(!Validator.validateEmail(txtEmail.getText())){
            JOptionPane.showMessageDialog(null, "Enter a valid Email Id");
            txtEmail.setText("");
        }
    }//GEN-LAST:event_txtEmailFocusLost

    private void passwordJPasswordFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordJPasswordFieldFocusLost
        // TODO add your handling code here:
                String password = String.valueOf(passwordJPasswordField.getPassword());
        if(!Validator.validatePassword(password)){
            JOptionPane.showMessageDialog(null, "Password should Contain \n"+
"       # At least one digit\n" +
"       # At least one lower case letter\n" +
"       # At least one upper case letter\n" +
"       # At least one special character\n" +
"       # no whitespace allowed in the entire string\n" +
"       # at least eight characters");
            passwordJPasswordField.setText("");
        }
    }//GEN-LAST:event_passwordJPasswordFieldFocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnDelete;
    private javax.swing.JComboBox enterpriseJComboBox;
    private javax.swing.JTable enterpriseJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JComboBox networkJComboBox;
    private javax.swing.JPasswordField passwordJPasswordField;
    private javax.swing.JButton submitJButton;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField usernameJTextField;
    // End of variables declaration//GEN-END:variables
}
