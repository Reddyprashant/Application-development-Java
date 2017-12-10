/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Government.BGV;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.CountryNetwork;
import Business.Network.StateNetwork;
import Business.Organization.Organization;
import Business.SignUp.SignUpRequestOrganization;
import Business.UserAccount.UserAccount;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import utility.Validator;

/**
 *
 * @author pooji
 */
public class BGVViewDetailsJPane extends javax.swing.JPanel {

    /**
     * Creates new form BGVViewDetailsJPane
     */
 
    private Enterprise enterprise;
    UserAccount account;
    CountryNetwork country;
    StateNetwork state;
    EcoSystem system;
    Organization organization;
    JPanel userProcessContainer;
    SignUpRequestOrganization request;
    public BGVViewDetailsJPane(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, StateNetwork network,CountryNetwork cNetwork, EcoSystem business, SignUpRequestOrganization request) {
        initComponents();
     this.organization = organization;
     this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
         this.system=business;
        this.state=network;
        this.country=cNetwork;
        this.account=account;
        this.request=request;
        populateValues();
       
    }
    public void populateValues(){
        txtName.setText(request.getName());
        txtCity.setText(request.getCity());
        txtEmail.setText(request.getEmail());
        txtOrgName.setText(request.getOrgName());
        txtUserName.setText(request.getUserName());
        txtState.setText(request.getState().getName());
        txtOrg.setText(request.getOrgType().getValue());
        txtEnterprise.setText(request.getEnterprise().getName());
        txtCountry.setText(request.getCountry().getName());
       if(request.getImage() !=null){
       Image smallImage = request.getImage().getScaledInstance(250, 250,Image.SCALE_SMOOTH);
       ImageIcon imgIcon=new ImageIcon(smallImage);
       lblImage.setIcon(imgIcon);
       }
       else{
           System.out.println("No image");
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
        jLabel5 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtEnterprise = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtOrgName = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lblImage = new javax.swing.JLabel();
        txtState = new javax.swing.JTextField();
        txtOrg = new javax.swing.JTextField();
        txtCountry = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(71, 79, 112));
        jLabel1.setText("Register");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, 160, 30));

        jLabel3.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(71, 79, 112));
        jLabel3.setText("Name :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, -1, -1));

        txtName.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        txtName.setForeground(new java.awt.Color(71, 79, 112));
        txtName.setEnabled(false);
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 170, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(71, 79, 112));
        jLabel4.setText("Country:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 80, -1));

        jLabel5.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(71, 79, 112));
        jLabel5.setText("User Name :");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, -1, -1));

        txtUserName.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        txtUserName.setForeground(new java.awt.Color(71, 79, 112));
        txtUserName.setEnabled(false);
        add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 170, -1));

        jLabel6.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(71, 79, 112));
        jLabel6.setText("Email Id :");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, -1, -1));

        txtEmail.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(71, 79, 112));
        txtEmail.setEnabled(false);
        add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 170, -1));

        txtEnterprise.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        txtEnterprise.setForeground(new java.awt.Color(71, 79, 112));
        txtEnterprise.setEnabled(false);
        add(txtEnterprise, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 320, 170, -1));

        jLabel9.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(71, 79, 112));
        jLabel9.setText("State :");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 80, -1));

        jLabel10.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(71, 79, 112));
        jLabel10.setText("City :");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 280, 80, -1));

        jLabel11.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(71, 79, 112));
        jLabel11.setText("Enterprise :");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 320, 160, -1));

        jLabel12.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(71, 79, 112));
        jLabel12.setText("Organization :");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 200, 160, -1));

        txtOrgName.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        txtOrgName.setForeground(new java.awt.Color(71, 79, 112));
        txtOrgName.setEnabled(false);
        add(txtOrgName, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 240, 170, -1));

        jLabel13.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(71, 79, 112));
        jLabel13.setText("Organization Name :");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 240, 160, -1));

        jLabel14.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(71, 79, 112));
        jLabel14.setText("Documents :");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, 100, -1));

        lblImage.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        lblImage.setForeground(new java.awt.Color(71, 79, 112));
        lblImage.setText("Image");
        add(lblImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 420, 220, 210));

        txtState.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        txtState.setForeground(new java.awt.Color(71, 79, 112));
        txtState.setEnabled(false);
        add(txtState, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, 170, -1));

        txtOrg.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        txtOrg.setForeground(new java.awt.Color(71, 79, 112));
        txtOrg.setEnabled(false);
        add(txtOrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 200, 170, -1));

        txtCountry.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        txtCountry.setForeground(new java.awt.Color(71, 79, 112));
        txtCountry.setEnabled(false);
        txtCountry.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCountryKeyPressed(evt);
            }
        });
        add(txtCountry, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, 170, -1));

        txtCity.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        txtCity.setForeground(new java.awt.Color(71, 79, 112));
        txtCity.setEnabled(false);
        add(txtCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 280, 170, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtCountryKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCountryKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCountryKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblImage;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtCountry;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEnterprise;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtOrg;
    private javax.swing.JTextField txtOrgName;
    private javax.swing.JTextField txtState;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
