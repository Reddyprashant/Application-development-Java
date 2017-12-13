/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.EcoSystemAdminWorkArea;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Network.CountryNetwork;
import Business.Role.CountryAdminRole;

import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.mail.SendFailedException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import utility.Validator;

/**
 *
 * @author raunak
 */
public class ManageCountryAdminJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;
   // private CountryNetwork cNetwork;
    /**
     * Creates new form ManageEnterpriseJPanel
     */
    public ManageCountryAdminJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.system = system;
        //this.cNetwork=cNetwork;
        populateTable();
        populateNetworkComboBox();
    }

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) enterpriseJTable.getModel();

        model.setRowCount(0);
        for (CountryNetwork network : system.getNetworkList()) {
                for (UserAccount userAccount : system.getUserAccountDirectory().getUserAccountList()) {
                    if(network.getName().equalsIgnoreCase(userAccount.getUsername())){
                    Object[] row = new Object[2];
                    row[0] = network;
                    row[1] = userAccount;

                    model.addRow(row);
                    }
            }
        }
    }
    
// Method to populate Nework ComboBox
    
    private void populateNetworkComboBox() {
        networkJComboBox.removeAllItems();
        if(system.getNetworkList().size()!=0){                     //Checking whether system contains any network
           for (CountryNetwork network : system.getNetworkList()) {
                networkJComboBox.addItem(network);
            }
           
           
        }
        else{
             txtEmail.setEnabled(false);
             usernameJTextField.setEnabled(false);
             passwordJPasswordField.setEnabled(false);
             nameJTextField.setEnabled(false);
             submitJButton.setEnabled(false);
             btnDelete.setEnabled(false);
             networkJComboBox.addItem("Please Add Networks");
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
        submitJButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        passwordJPasswordField = new javax.swing.JPasswordField();
        backJButton = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setForeground(new java.awt.Color(71, 79, 112));

        enterpriseJTable.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        enterpriseJTable.setForeground(new java.awt.Color(71, 79, 112));
        enterpriseJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Network", "Username"
            }
        ));
        jScrollPane1.setViewportView(enterpriseJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 523, 95));

        jLabel1.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(71, 79, 112));
        jLabel1.setText("Manage Country Admin");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 370, 30));

        networkJComboBox.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        networkJComboBox.setForeground(new java.awt.Color(71, 79, 112));
        networkJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkJComboBoxActionPerformed(evt);
            }
        });
        add(networkJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 470, 136, -1));

        jLabel2.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(71, 79, 112));
        jLabel2.setText("Username");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 520, 70, -1));

        usernameJTextField.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        usernameJTextField.setForeground(new java.awt.Color(71, 79, 112));
        add(usernameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 520, 136, -1));

        submitJButton.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        submitJButton.setForeground(new java.awt.Color(71, 79, 112));
        submitJButton.setText("Submit");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        add(submitJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 700, 110, 40));

        jLabel4.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 560, 80, -1));

        nameJTextField.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        nameJTextField.setForeground(new java.awt.Color(71, 79, 112));
        add(nameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 600, 136, -1));

        jLabel5.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Name");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 600, -1, -1));

        passwordJPasswordField.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        passwordJPasswordField.setForeground(new java.awt.Color(71, 79, 112));
        passwordJPasswordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordJPasswordFieldFocusLost(evt);
            }
        });
        add(passwordJPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 560, 134, -1));

        backJButton.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        backJButton.setForeground(new java.awt.Color(71, 79, 112));
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 780, -1, 40));

        btnDelete.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(71, 79, 112));
        btnDelete.setText("Delete request");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 309, 160, 40));

        jLabel3.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(71, 79, 112));
        jLabel3.setText("Network");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 470, 70, -1));

        jLabel6.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Email Id:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 640, -1, -1));

        txtEmail.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(71, 79, 112));
        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });
        add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 640, 136, -1));

        jLabel7.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utility/global-world-map-background-business-template-d-globe-40201747.jpg"))); // NOI18N
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, -4, 1300, 870));
    }// </editor-fold>//GEN-END:initComponents

    private void networkJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkJComboBoxActionPerformed
        usernameJTextField.setText(networkJComboBox.getSelectedItem().toString());
        usernameJTextField.setEnabled(false);
        
    }//GEN-LAST:event_networkJComboBoxActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        
       // Enterprise system = (Enterprise) enterpriseJComboBox.getSelectedItem();

      //Creating new Country Admin Role
        

        String username = usernameJTextField.getText();
        String password = String.valueOf(passwordJPasswordField.getPassword());
        String name = nameJTextField.getText();
        String email= txtEmail.getText();
        if(!nameJTextField.getText().equals("")){
            if(!password.isEmpty()){
                if(!username.isEmpty()){
                    if(!email.isEmpty()){
                         if(!Validator.validateEmail(txtEmail.getText())){
            
            txtEmail.setText("");
            return;
        }
                        
                        if (EcoSystem.checkIfUsernameIsUnique(username)) {
                            
                             try {
                                 Validator.sendMessage(email,Validator.ACCOUNT_ACTIVATION);
                             } catch (SendFailedException ex) {
                                  JOptionPane.showMessageDialog(null, "Wrong email id. Requested cannot be processed");
                                 return;
                             }
                            
                            Employee employee = system.getEmployeeDirectory().createEmployee(name,email);
                            UserAccount account = null;
                            account = system.getUserAccountDirectory().createUserAccount(username, password, employee, new CountryAdminRole());
                                     
                            JOptionPane.showMessageDialog(null, "Useraccount created", "Warning", JOptionPane.WARNING_MESSAGE);
                            populateTable(); 
                            txtEmail.setText("");
                            usernameJTextField.setText("");
                            passwordJPasswordField.setText("");
                            nameJTextField.setText("");
                            
                    }
                    else {
                         JOptionPane.showMessageDialog(null, "Please enter unique username", "Warning", JOptionPane.WARNING_MESSAGE);
                    }
                    
                }
                else{
                    JOptionPane.showMessageDialog(null, "Enter value for Email", "Warning", JOptionPane.WARNING_MESSAGE);
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Enter value username", "Warning", JOptionPane.WARNING_MESSAGE);
            }    
        }
        else{
            JOptionPane.showMessageDialog(null, "Enter password", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }
    else{
         JOptionPane.showMessageDialog(null, "Enter value name", "Warning", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_submitJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;
        sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = enterpriseJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select the row to delete the account", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {

            UserAccount p = (UserAccount) enterpriseJTable.getValueAt(selectedRow, 1);
                    for (UserAccount userAccount : system.getUserAccountDirectory().getUserAccountList()) {
                        if (p == userAccount) {
                            system.getUserAccountDirectory().getUserAccountList().remove(p);
                            break;
                        }
            }

            JOptionPane.showMessageDialog(null, "You have successfully deleted the account");
            populateTable();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

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

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
        // TODO add your handling code here:
            if(!Validator.validateEmail(txtEmail.getText())){
            JOptionPane.showMessageDialog(null, "Enter a valid Email Id");
            txtEmail.setText("");
            return;
        }
        
    }//GEN-LAST:event_txtEmailFocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnDelete;
    private javax.swing.JTable enterpriseJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JComboBox networkJComboBox;
    private javax.swing.JPasswordField passwordJPasswordField;
    private javax.swing.JButton submitJButton;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField usernameJTextField;
    // End of variables declaration//GEN-END:variables
}
