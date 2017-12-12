/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SignUp;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Network.CountryNetwork;
import Business.Network.StateNetwork;
import Business.SignUp.SignUpRequestState;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import utility.Validator;

/**
 *
 * @author pooji
 */
public class SignUpJPanelState extends javax.swing.JPanel {

    /**
     * Creates new form SignUpJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
     private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    public SignUpJPanelState(JPanel userProcessContainer, EcoSystem business) {
        initComponents();
        this.system = business;
        this.userProcessContainer = userProcessContainer;
        if(!system.getNetworkList().isEmpty()){
        for (CountryNetwork countryNetwork : system.getNetworkList()) {
            comboCountry.addItem(countryNetwork);
        }
      }
        else{
            txtName.setEnabled(false);
            comboCountry.setEnabled(false);
            lblWarning.setText("*Sorry for the inconvenience the system is not set up yet please contact System administrator for the issue");
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

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        comboCountry = new javax.swing.JComboBox();
        btnCreateState = new javax.swing.JButton();
        lblName = new javax.swing.JLabel();
        lblWarning = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(71, 79, 112));
        jLabel1.setText("Register For State");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, 300, 40));

        jLabel3.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(71, 79, 112));
        jLabel3.setText("State:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, -1, -1));

        txtName.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 18)); // NOI18N
        txtName.setForeground(new java.awt.Color(71, 79, 112));
        txtName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNameFocusLost(evt);
            }
        });
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 270, 170, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(71, 79, 112));
        jLabel4.setText("Country:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, 90, -1));

        comboCountry.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 18)); // NOI18N
        comboCountry.setForeground(new java.awt.Color(71, 79, 112));
        add(comboCountry, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, 170, -1));

        btnCreateState.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 18)); // NOI18N
        btnCreateState.setForeground(new java.awt.Color(71, 79, 112));
        btnCreateState.setText("Register");
        btnCreateState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateStateActionPerformed(evt);
            }
        });
        add(btnCreateState, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 330, 140, 40));

        lblName.setForeground(new java.awt.Color(255, 0, 0));
        add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 270, -1, -1));

        lblWarning.setForeground(new java.awt.Color(255, 0, 0));
        add(lblWarning, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateStateActionPerformed
        // TODO add your handling code here:
        try {

            for (CountryNetwork country : system.getNetworkList()) {
                for (StateNetwork state : country.getStateList()) {
                    if (state.getName().equals(txtName.getText())) {
                        JOptionPane.showMessageDialog(null, "State Already exists Please enter a new State");
                        return;
                    }
                }
            }

            for (UserAccount userAccount : system.getUserAccountDirectory().getUserAccountList()) {
                for (WorkRequest workReq : userAccount.getWorkQueue().getWorkRequestList()) {
                    if (workReq instanceof SignUpRequestState) {
                        if (((SignUpRequestState) workReq).getName().equals(txtName.getText())) {
                            JOptionPane.showMessageDialog(null, "Request Already raised for the state");
                            return;
                        }
                    }
                }
            }

            if (!txtName.getText().isEmpty()) {

                CountryNetwork country = (CountryNetwork) comboCountry.getSelectedItem();
                SignUpRequestState stateRequest = new SignUpRequestState();
                stateRequest.setName(txtName.getText());
                stateRequest.setCountry(country);
                stateRequest.setStatus("Requested");
                for (UserAccount userAccount : system.getUserAccountDirectory().getUserAccountList()) {
                    if (country.getName().equalsIgnoreCase(userAccount.getUsername())) {
                        userAccount.getWorkQueue().getWorkRequestList().add(stateRequest);
                    }
                }

                JOptionPane.showMessageDialog(null, "State Request created successfully");
                 //dB4OUtil.storeSystem(system);
                txtName.setText("");

            } else {
                JOptionPane.showMessageDialog(null, "Please enter State name");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Sorry for the inconvinence. Technical team is working on it", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnCreateStateActionPerformed

    private void txtNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNameFocusLost
        // TODO add your handling code here:
        if (!txtName.getText().isEmpty()) {
            if (!Validator.validateName(txtName.getText())) {
                lblName.setText("*Only Alphabets and Spaces are allowed");
                txtName.setText("");
            }
        }
    }//GEN-LAST:event_txtNameFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateState;
    private javax.swing.JComboBox comboCountry;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblWarning;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
