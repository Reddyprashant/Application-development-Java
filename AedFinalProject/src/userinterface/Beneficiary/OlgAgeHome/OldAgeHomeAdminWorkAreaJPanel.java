/*
 * AdminWorkAreaJPanel.java
 *
 * Created on October 10, 2008, 8:50 AM
 */

package userinterface.Beneficiary.OlgAgeHome;

import Business.EcoSystem;
//import userinterface.Hospital.*;
import Business.Enterprise.Enterprise;
import Business.Network.CountryNetwork;
import Business.Network.StateNetwork;
import Business.Organization.OldAgeOrganization;
//import Business.Organization.ClinicOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.SwingUtilities;
import userinterface.Beneficiary.ShelterRequestAreaJPanel;

/**
 *
 * @author  raunak
 */
public class OldAgeHomeAdminWorkAreaJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    UserAccount account; 
    OldAgeOrganization organization; 
    Enterprise enterprise; 
    EcoSystem business;
    StateNetwork state;
    CountryNetwork country;
    /** Creates new form AdminWorkAreaJPanel */
    public OldAgeHomeAdminWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, OldAgeOrganization organization, Enterprise enterprise,StateNetwork network,CountryNetwork cNetwork, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.account=account;
        this.business=business;
        this.organization= organization;
        this.state=network;
        this.country=cNetwork;
        valueLabel.setText(enterprise.getName());
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        userJButton = new javax.swing.JButton();
        manageEmployeeJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        btnShelter = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(71, 79, 112));
        jLabel1.setText("Old Age Home Work Area -Adminstrative Role");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, -1, -1));

        userJButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        userJButton.setForeground(new java.awt.Color(71, 79, 112));
        userJButton.setText("Manage Request");
        userJButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        userJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userJButtonActionPerformed(evt);
            }
        });
        add(userJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 200, 170, 60));

        manageEmployeeJButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        manageEmployeeJButton.setForeground(new java.awt.Color(71, 79, 112));
        manageEmployeeJButton.setText("Manage Employee");
        manageEmployeeJButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        manageEmployeeJButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        manageEmployeeJButton.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        manageEmployeeJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEmployeeJButtonActionPerformed(evt);
            }
        });
        add(manageEmployeeJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 160, 60));
        manageEmployeeJButton.getAccessibleContext().setAccessibleDescription("");

        enterpriseLabel.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(71, 79, 112));
        enterpriseLabel.setText("Enterprise :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 120, 30));

        valueLabel.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        valueLabel.setForeground(new java.awt.Color(71, 79, 112));
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, 130, 20));

        btnShelter.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnShelter.setForeground(new java.awt.Color(255, 3, 8));
        btnShelter.setText("Homeless Found!!!");
        btnShelter.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnShelter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShelterActionPerformed(evt);
            }
        });
        add(btnShelter, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, 190, 70));
    }// </editor-fold>//GEN-END:initComponents

    private void userJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userJButtonActionPerformed
        // TODO add your handling code here:
       
        OldAgeHomeRequestWorkAreaJPanel muajp = new OldAgeHomeRequestWorkAreaJPanel( userProcessContainer,  account,  organization,  enterprise, state,country, business);
        userProcessContainer.add("OldAgeHomeRequestWorkAreaJPanel", muajp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_userJButtonActionPerformed

    private void manageEmployeeJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEmployeeJButtonActionPerformed

        OldAgeHomePersonJPanel manageEmployeeJPanel;
        manageEmployeeJPanel = new OldAgeHomePersonJPanel(userProcessContainer,  account,  organization,  enterprise,state,country,  business);
        userProcessContainer.add("OldAgeHomeManageEmployeeJPanel", manageEmployeeJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_manageEmployeeJButtonActionPerformed

    private void btnShelterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShelterActionPerformed
        // TODO add your handling code here:
        ShelterRequestAreaJPanel muajp = new ShelterRequestAreaJPanel( userProcessContainer,  account,  organization,  enterprise, state,country, business);
        userProcessContainer.add("ShelterRequestAreaJPanel", muajp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnShelterActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnShelter;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton manageEmployeeJButton;
    private javax.swing.JButton userJButton;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
    
}
