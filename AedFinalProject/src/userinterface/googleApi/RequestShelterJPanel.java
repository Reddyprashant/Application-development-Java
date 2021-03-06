/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.googleApi;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.LatLong;
import Business.Network.CountryNetwork;
import Business.Network.StateNetwork;
import Business.Organization.HomelessOrganization;
import Business.Organization.IndividualOrganization;
import Business.Organization.OldAgeOrganization;
import Business.Organization.Organization;
import Business.Organization.OrphanageOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ShelterWorkRequest;
import java.awt.CardLayout;
import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.mail.SendFailedException;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import utility.Validator;

/**
 *
 * @author pooji
 */
public class RequestShelterJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RequestShelterJPanel
     */
    JPanel userProcessContainer;
    UserAccount account;
    Enterprise enterprise;
    StateNetwork state;
    CountryNetwork country;
    EcoSystem system;
    LatLong latLong;
    Organization organization;
    ImageIcon image;
    private ArrayList<Organization> orglist5;
    private ArrayList<Organization> orglist10;

    public RequestShelterJPanel(JPanel userProcessContainer, UserAccount account, Organization org, Enterprise enterprise, StateNetwork state, CountryNetwork country, EcoSystem system, LatLong latLng) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.enterprise = enterprise;
        this.state = state;
        this.country = country;
        this.system = system;
        this.latLong = latLng;
        this.organization = org;
        orglist5 = new ArrayList<>();
        orglist10 = new ArrayList<>();
        //Setting the value of Latitude and Longitude
        txtLat.setText(String.valueOf(latLong.getLatitude()));
        txtLong.setText(String.valueOf(latLong.getLongitude()));
        if (account == null) {
            //helpBtn.setEnabled(false);
            btnHome.setEnabled(false);
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

        jLabel2 = new javax.swing.JLabel();
        txtLat = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtImage = new javax.swing.JTextField();
        enterpriseLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtLong = new javax.swing.JTextField();
        reqBtn = new javax.swing.JButton();
        btnUpload = new javax.swing.JButton();
        lblPic = new javax.swing.JLabel();
        btnHome = new javax.swing.JButton();
        helpBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        disTable = new javax.swing.JTable();
        mapBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(71, 79, 112));
        jLabel2.setText("Latitude:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, -1, -1));

        txtLat.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        txtLat.setForeground(new java.awt.Color(71, 79, 112));
        txtLat.setEnabled(false);
        txtLat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLatKeyPressed(evt);
            }
        });
        add(txtLat, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 190, 126, -1));

        jLabel5.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(71, 79, 112));
        jLabel5.setText("Upload Picture:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, -1, -1));

        txtImage.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        txtImage.setForeground(new java.awt.Color(71, 79, 112));
        add(txtImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, 126, -1));

        enterpriseLabel.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 24)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(71, 79, 112));
        enterpriseLabel.setText("Request Shelter :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 320, 30));

        jLabel3.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(71, 79, 112));
        jLabel3.setText("Longitude:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, -1, -1));

        txtLong.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        txtLong.setForeground(new java.awt.Color(71, 79, 112));
        txtLong.setEnabled(false);
        txtLong.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLongKeyPressed(evt);
            }
        });
        add(txtLong, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, 126, -1));

        reqBtn.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        reqBtn.setForeground(new java.awt.Color(71, 79, 112));
        reqBtn.setText("Request for Shelter");
        reqBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reqBtnActionPerformed(evt);
            }
        });
        add(reqBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 299, 190, 40));

        btnUpload.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        btnUpload.setForeground(new java.awt.Color(71, 79, 112));
        btnUpload.setText("Upload ");
        btnUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadActionPerformed(evt);
            }
        });
        add(btnUpload, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 160, -1, -1));
        add(lblPic, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 240, 210, 210));

        btnHome.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        btnHome.setForeground(new java.awt.Color(71, 79, 112));
        btnHome.setText("Home");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 80, 40));

        helpBtn.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        helpBtn.setForeground(new java.awt.Color(71, 79, 112));
        helpBtn.setText("Willing to help!!!!");
        helpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpBtnActionPerformed(evt);
            }
        });
        add(helpBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 430, 180, 40));

        disTable.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        disTable.setForeground(new java.awt.Color(71, 79, 112));
        disTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Oragnization Name", "Distance"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(disTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 500, 300, 160));

        mapBtn.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        mapBtn.setForeground(new java.awt.Color(71, 79, 112));
        mapBtn.setText("View Map");
        mapBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mapBtnActionPerformed(evt);
            }
        });
        add(mapBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 569, -1, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utility/global-world-map-background-business-template-d-globe-40201747.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, -4, 1310, 860));
    }// </editor-fold>//GEN-END:initComponents

    private void txtLatKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLatKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtLatKeyPressed

    private void txtLongKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLongKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLongKeyPressed
    public void populateTable(ArrayList<Organization> org) {
        //Populating the value of organizations nearby
        DefaultTableModel model = (DefaultTableModel) disTable.getModel();

        model.setRowCount(0);
        for (Organization organization1 : org) {

            Object[] row = new Object[3];
            row[0] = organization1;
            row[1] = organization1.populateDistance(latLong);

            model.addRow(row);
        }
    }
    private void reqBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reqBtnActionPerformed
        try{
        if (image != null) {
            //Request for shelter of homeless person
            ShelterWorkRequest request = new ShelterWorkRequest();
            request.setImage(image);
            request.setStatus("Requested");
            request.setSender(account);
            request.setLatLong(latLong);

            if (state.getEnterpriseDirectory() != null) {
                for (Enterprise enterprise1 : state.getEnterpriseDirectory().getEnterpriseList()) {
                    for (Organization organization : enterprise1.getOrganizationDirectory().getOrganizationList()) {
                        if (organization instanceof HomelessOrganization || organization instanceof OrphanageOrganization || organization instanceof OldAgeOrganization || organization instanceof IndividualOrganization) {

                            organization.getWorkQueue().getWorkRequestList().add(request);
                            // Checking for distanceless than 5 miles
                            if (organization.populateDistance(latLong) < 5) {
                                for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()) {
                                    try {
                                        Validator.sendMessage(employee.getEmailId(), Validator.HOMELESS_FOUND);
                                    } catch (SendFailedException s) {

                                    }

                                }

                            } // Checking for distanceless than 10 miles
                            else if (organization.populateDistance(latLong) < 10) {
                                System.out.println("Distance 10 " + organization.getName() + " : " + organization.populateDistance(latLong));
                                for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()) {
                                    try {
                                        Validator.sendMessage(employee.getEmailId(),Validator.HOMELESS_FOUND);
                                    } catch (SendFailedException s) {

                                    }

                                }
                            } else {
                                System.out.println("Distance " + organization.getName() + " : " + organization.populateDistance(latLong));
                                for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()) {
                                    try {
                                        Validator.sendMessage(employee.getEmailId(),Validator.HOMELESS_FOUND);
                                    } catch (SendFailedException s) {

                                    }

                                }
                            }
                        }
                    }
                }

                if (account != null) {
                    account.getWorkQueue().getWorkRequestList().add(request);
                }
                JOptionPane.showMessageDialog(null, "Shelter Request Raised");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Please upload the image", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        }catch(Exception e){
            
        }

    }//GEN-LAST:event_reqBtnActionPerformed

    private void btnUploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f1 = chooser.getSelectedFile();
        if (f1 != null) {
            try {
                Image pic = ImageIO.read(f1);
                pic = pic.getScaledInstance(300, 300, java.awt.Image.SCALE_SMOOTH);
                image = new ImageIcon(pic);
                lblPic.setIcon(image);
                txtImage.setText(chooser.getSelectedFile().getPath());
                JOptionPane.showMessageDialog(null, "Picture uploaded successfully.");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Upload different picture.");
            }
        } else {

            JOptionPane.showMessageDialog(null, "Please select a picture", "Warning", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btnUploadActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
        JPanel j = account.getRole().createWorkArea(userProcessContainer, account, organization, enterprise, state, country, system);
        userProcessContainer.add("workarea1", j);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnHomeActionPerformed

    private void helpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpBtnActionPerformed
        // TODO add your handling code here:
        if (account != null) {
            for (Enterprise enterprise1 : state.getEnterpriseDirectory().getEnterpriseList()) {
                for (Organization organization : enterprise1.getOrganizationDirectory().getOrganizationList()) {

                    if (organization instanceof HomelessOrganization || organization instanceof OrphanageOrganization || organization instanceof OldAgeOrganization) {

                        if (organization.populateDistance(latLong) < 5) {
                            orglist5.add(organization);
                        } else if (organization.populateDistance(latLong) < 10) {
                            orglist10.add(organization);
                        }
                    }

                }

            }
            if (orglist5.size() > 0) {
                populateTable(orglist5);
            } else if (orglist10.size() > 0) {
                populateTable(orglist10);
            } else {
                JOptionPane.showMessageDialog(null, "No organization found Within 10 Miles. Please request for help", "Warning", JOptionPane.WARNING_MESSAGE);

            }
        } else {
            JOptionPane.showMessageDialog(null, "Please register yourself to perform this action. Raise Request for Shelter.");
        }

    }//GEN-LAST:event_helpBtnActionPerformed

    private void mapBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mapBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = disTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select the row to view map", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {

            Organization p = (Organization) disTable.getValueAt(selectedRow, 0);
            DisplayNearestOrgJPanel displayNearestOrgJPanel = new DisplayNearestOrgJPanel(userProcessContainer, account, organization, enterprise, state, country, system, p.getLatLong());
            userProcessContainer.add("DisplayNearestOrgJPanel", displayNearestOrgJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);

        }
    }//GEN-LAST:event_mapBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnUpload;
    private javax.swing.JTable disTable;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JButton helpBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPic;
    private javax.swing.JButton mapBtn;
    private javax.swing.JButton reqBtn;
    private javax.swing.JTextField txtImage;
    private javax.swing.JTextField txtLat;
    private javax.swing.JTextField txtLong;
    // End of variables declaration//GEN-END:variables
}
