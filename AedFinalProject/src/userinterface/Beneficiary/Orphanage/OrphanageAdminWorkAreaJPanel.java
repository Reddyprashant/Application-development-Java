/*
 * AdminWorkAreaJPanel.java
 *
 * Created on October 10, 2008, 8:50 AM
 */

package userinterface.Beneficiary.Orphanage;

import Business.EcoSystem;
//import userinterface.Hospital.*;
import Business.Enterprise.Enterprise;
import Business.Network.CountryNetwork;
import Business.Network.StateNetwork;
//import Business.Organization.ClinicOrganization;
import Business.Organization.OrphanageOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import userinterface.Beneficiary.ShelterRequestAreaJPanel;

/**
 *
 * @author  raunak
 */
public class OrphanageAdminWorkAreaJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    UserAccount account; 
    OrphanageOrganization organization; 
    Enterprise enterprise; 
    EcoSystem business;
    StateNetwork state;
    CountryNetwork country;
    /** Creates new form AdminWorkAreaJPanel */
    public OrphanageAdminWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, OrphanageOrganization organization, Enterprise enterprise,StateNetwork network,CountryNetwork cNetwork, EcoSystem business) {
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
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(71, 79, 112));
        jLabel1.setText("Orphanage Work Area -Adminstrative Role");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 590, -1));

        userJButton.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        userJButton.setForeground(new java.awt.Color(71, 79, 112));
        userJButton.setText("Manage Request");
        userJButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        userJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userJButtonActionPerformed(evt);
            }
        });
        add(userJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 310, 170, 70));

        manageEmployeeJButton.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        manageEmployeeJButton.setForeground(new java.awt.Color(71, 79, 112));
        manageEmployeeJButton.setText("Manage Person");
        manageEmployeeJButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        manageEmployeeJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEmployeeJButtonActionPerformed(evt);
            }
        });
        add(manageEmployeeJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 170, 70));

        enterpriseLabel.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 18)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(71, 79, 112));
        enterpriseLabel.setText("Organization :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 160, 30));

        valueLabel.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        valueLabel.setForeground(new java.awt.Color(71, 79, 112));
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, 130, 20));

        btnShelter.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        btnShelter.setForeground(new java.awt.Color(246, 5, 4));
        btnShelter.setText("Homeless Found!!!");
        btnShelter.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnShelter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShelterActionPerformed(evt);
            }
        });
        add(btnShelter, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 500, 180, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utility/global-world-map-background-business-template-d-globe-40201747.jpg"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, -4, -1, 870));
    }// </editor-fold>//GEN-END:initComponents

    private void userJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userJButtonActionPerformed
        // TODO add your handling code here:
        OrphanageRequestWorkAreaJPanel muajp = new OrphanageRequestWorkAreaJPanel( userProcessContainer,  account,  organization,  enterprise, state,country, business);
        userProcessContainer.add("OrphanageRequestWorkAreaJPanel", muajp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_userJButtonActionPerformed

    private void manageEmployeeJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEmployeeJButtonActionPerformed

        OrphanagePersonJPanel manageEmployeeJPanel;
        manageEmployeeJPanel = new OrphanagePersonJPanel(userProcessContainer,  account,  organization,  enterprise,state,country,  business);
        userProcessContainer.add("OrphanageManageEmployeeJPanel", manageEmployeeJPanel);
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton manageEmployeeJButton;
    private javax.swing.JButton userJButton;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
    
}
