/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SignUp;

import Business.EcoSystem;
import Business.SignUp.SignUpRequest;
import Business.SignUp.SignUpRequestBeneficiary;
import Business.SignUp.SignUpRequestState;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author vinya
 */
public class SignUpWelcome extends javax.swing.JPanel {

    /**
     * Creates new form SignUpWelcome
     */
    private JPanel container;
    private EcoSystem system;
    public SignUpWelcome(JPanel container, EcoSystem system) {
        initComponents();
        this.system=system;
        this.container=container;
        populateRoleComboBox();
    }
    
    private void populateRoleComboBox() {
        comboBoxSignUpType.removeAllItems();
        for(SignUpRequest.SignUpType e: Business.SignUp.SignUpRequest.SignUpType.values()){
        comboBoxSignUpType.addItem(e.getValue());
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
        jLabel2 = new javax.swing.JLabel();
        comboBoxSignUpType = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(900, 600));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Welcome");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 37, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setText("Please Select an Option from Below");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 94, -1, -1));

        add(comboBoxSignUpType, new org.netbeans.lib.awtextra.AbsoluteConstraints(463, 151, 146, 33));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Sign Up Type");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 151, -1, -1));

        btnSubmit.setText("Next");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 227, 73, 42));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        
    String type = (String)comboBoxSignUpType.getSelectedItem();
    CardLayout layout = (CardLayout) container.getLayout();
        if(type.equals(SignUpRequest.SignUpType.Beneficiary.getValue())){
         SignUpRequestBeneficiary snb = new SignUpRequestBeneficiary();
         snb.signUpForm(container, system);
        }
        else if(type.equals(SignUpRequest.SignUpType.State.getValue())){
         SignUpRequestState sns = new SignUpRequestState();
         sns.signUpForm(container, system);
         
          container.add("workArea", new SignUpJPanelState(container, system));
           // container.add("workArea", sns.signUpForm(container, system));
            layout.next(container);
        }
    }//GEN-LAST:event_btnSubmitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox comboBoxSignUpType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
