/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Beneficiary.Orphanage;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.EntityEnterprise;
import Business.Network.CountryNetwork;
import Business.Network.StateNetwork;
import Business.Organization.EducationOrganization;
import Business.Organization.HospitalOrganization;
import Business.Organization.MNCOrganization;
import Business.Organization.NGOOrganization;
import Business.Organization.Organization;
import Business.Organization.OrphanageOrganization;
import Business.Organization.TransportOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.BeneficiaryWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import utility.Validator;

/**
 *
 * @author prashantreddy
 */
public class OrphanageHomeRequestHelpJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    UserAccount account;
    OrphanageOrganization organization;
    Enterprise enterprise;
    EcoSystem business;
    StateNetwork state;
    CountryNetwork country;

    /**
     * Creates new form RequestHelpJPanel
     */
    public OrphanageHomeRequestHelpJPanel(JPanel userProcessContainer, UserAccount account, OrphanageOrganization organization, Enterprise enterprise, StateNetwork network, CountryNetwork cNetwork, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.account = account;
        this.business = business;
        this.organization = organization;
        this.state = network;
        this.country = cNetwork;
        carBtn.setVisible(false);
        busBtn.setVisible(false);
        vanBtn.setVisible(false);
        noOfVehText.setVisible(false);
        noVehLabel.setVisible(false);
        typeLabel.setVisible(false);
        addressText.setVisible(false);
        timeField.setVisible(false);
        timelabel.setVisible(false);
        addLabel.setVisible(false);
        jDateChooser1.setMinSelectableDate(new Date());
        populateComboBox();
    }

    public void populateComboBox() {
        reqComboBox.removeAllItems();
        reqComboBox.addItem(Organization.RequestType.Education);
        reqComboBox.addItem(Organization.RequestType.Hospital);
        reqComboBox.addItem(Organization.RequestType.MNC);
        reqComboBox.addItem(Organization.RequestType.NGO);
        reqComboBox.addItem(Organization.RequestType.ANY);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        carBtn = new javax.swing.JRadioButton();
        eventNameTextfield = new javax.swing.JTextField();
        vanBtn = new javax.swing.JRadioButton();
        enterpriseLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        busBtn = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        detailTextArea = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        noVolTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        reqBtn = new javax.swing.JRadioButton();
        notReqBtn = new javax.swing.JRadioButton();
        btnRequestHelp = new javax.swing.JButton();
        noOfVehText = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        noVehLabel = new javax.swing.JLabel();
        reqComboBox = new javax.swing.JComboBox();
        typeLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        timelabel = new javax.swing.JLabel();
        timeField = new javax.swing.JTextField();
        addLabel = new javax.swing.JLabel();
        addressText = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroup1.add(carBtn);
        carBtn.setText("Car");
        carBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carBtnActionPerformed(evt);
            }
        });
        add(carBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(421, 407, -1, -1));
        add(eventNameTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(377, 132, 126, -1));

        buttonGroup1.add(vanBtn);
        vanBtn.setText("Mini Van");
        add(vanBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(492, 407, -1, -1));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 20, 120, 30));

        jLabel7.setText("Event Details");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 246, -1, 35));

        buttonGroup1.add(busBtn);
        busBtn.setText("Bus");
        add(busBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(596, 407, -1, -1));

        jLabel1.setText("Request Type:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 106, -1, -1));

        detailTextArea.setColumns(20);
        detailTextArea.setRows(5);
        jScrollPane1.setViewportView(detailTextArea);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(377, 246, 232, -1));

        jLabel2.setText("Number of Volunteers Required");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 169, -1, -1));

        noVolTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                noVolTextFieldKeyPressed(evt);
            }
        });
        add(noVolTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(377, 164, 126, -1));

        jLabel4.setText("Logistics");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 352, -1, -1));

        jLabel3.setText("Event Date ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 208, -1, -1));

        buttonGroup2.add(reqBtn);
        reqBtn.setText("Required");
        reqBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reqBtnActionPerformed(evt);
            }
        });
        add(reqBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 348, -1, -1));

        buttonGroup2.add(notReqBtn);
        notReqBtn.setText("Not Required");
        notReqBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notReqBtnActionPerformed(evt);
            }
        });
        add(notReqBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 348, -1, -1));

        btnRequestHelp.setText("Request Help");
        btnRequestHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestHelpActionPerformed(evt);
            }
        });
        add(btnRequestHelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 545, -1, -1));

        noOfVehText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                noOfVehTextKeyPressed(evt);
            }
        });
        add(noOfVehText, new org.netbeans.lib.awtextra.AbsoluteConstraints(421, 448, 53, -1));

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 545, -1, -1));

        noVehLabel.setText("Number Of Vehicles");
        add(noVehLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 458, -1, -1));

        add(reqComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(377, 102, 126, -1));

        typeLabel.setText("Type of vehicle");
        add(typeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 411, -1, -1));

        jLabel5.setText("Event Name");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 137, -1, -1));

        timelabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        timelabel.setForeground(new java.awt.Color(71, 79, 112));
        timelabel.setText("Pickup Time");
        add(timelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 484, -1, -1));
        add(timeField, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 480, 171, -1));

        addLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        addLabel.setForeground(new java.awt.Color(71, 79, 112));
        addLabel.setText("Pickup Address");
        add(addLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 528, -1, -1));
        add(addressText, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 524, 267, -1));
        add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 198, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void carBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_carBtnActionPerformed

    private void reqBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reqBtnActionPerformed
        // TODO add your handling code here:

        carBtn.setVisible(true);
        busBtn.setVisible(true);
        vanBtn.setVisible(true);
        noOfVehText.setVisible(true);
        noVehLabel.setVisible(true);
        typeLabel.setVisible(true);
        addressText.setVisible(true);
        timeField.setVisible(true);
        timelabel.setVisible(true);
        addLabel.setVisible(true);

    }//GEN-LAST:event_reqBtnActionPerformed

    private void notReqBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notReqBtnActionPerformed
        // TODO add your handling code here:
        carBtn.setVisible(false);
        busBtn.setVisible(false);
        vanBtn.setVisible(false);
        noOfVehText.setVisible(false);
        noVehLabel.setVisible(false);
        typeLabel.setVisible(false);
        addressText.setVisible(false);
        timeField.setVisible(false);
        timelabel.setVisible(false);
        addLabel.setVisible(false);
    }//GEN-LAST:event_notReqBtnActionPerformed


    private void btnRequestHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestHelpActionPerformed
        // TODO add your handling code here:
        if (!(eventNameTextfield.getText().isEmpty())) {
            if (!(noVolTextField.getText().isEmpty())) {
                if (!(jDateChooser1.getDate().toString().isEmpty())) {
                    if (!(detailTextArea.getText().isEmpty())) {
                        if (reqBtn.isSelected() || notReqBtn.isSelected()) {
                            try {
                                //SimpleDateFormat dates = new SimpleDateFormat("MM/dd/yyyy");
                                SimpleDateFormat times = new SimpleDateFormat("hh:mm");
                                Organization.RequestType request = (Organization.RequestType) reqComboBox.getSelectedItem();
                                int noVolunteer = Integer.parseInt(noVolTextField.getText());

                                Date date = jDateChooser1.getDate();
                                String eventName = eventNameTextfield.getText();
                                String eventDetails = detailTextArea.getText();

                                BeneficiaryWorkRequest requests = new BeneficiaryWorkRequest();
                               
                                requests.setEventDate(date);
                                requests.setSenderOrganization(organization);
                                System.out.println("userss" + organization.getName());
                                //if(Organization.RequestType.Education.getValue()==request.getValue())
                                requests.setRequestType(request);
                                requests.setEventName(eventName);
                                requests.setEventDetails(eventDetails);
                                requests.setNumberOfVolunteersRequest(noVolunteer);

                                requests.setSender(account);
                                requests.setStatus("Requested");
                                if (reqBtn.isSelected()) {
                                    int no = Integer.parseInt(noOfVehText.getText());
                                    Date time = times.parse(timeField.getText());
                                    String address = addressText.getText();
                                    requests.setLogisticRequest(false);
                                    if (carBtn.isSelected()) {
                                        requests.setTypeOfVehicle("Car");

                                    } else if (vanBtn.isSelected()) {
                                        requests.setTypeOfVehicle("Van");
                                    } else if (busBtn.isSelected()) {
                                        requests.setTypeOfVehicle("Bus");
                                    }
                                    requests.setNoOfVehicle(no);
                                    requests.setPickupTime(time);
                                    requests.setAddress(address);
                                }
                                if (!requests.isLogisticRequest()) {
                                    for (Enterprise enter : state.getEnterpriseDirectory().getEnterpriseList()) {
                                        for (Organization organization1 : enter.getOrganizationDirectory().getOrganizationList()) {
                                            if (organization1 instanceof TransportOrganization) {
                                                System.out.println("sending to transport");
                                                organization1.getWorkQueue().getWorkRequestList().add(requests);
                                            }
                                        }
                                    }
                                }
                                System.out.println("type is" + request);
                                if (request == Organization.RequestType.ANY) {
                                    for (Enterprise enter : state.getEnterpriseDirectory().getEnterpriseList()) {
                                        if (enter instanceof EntityEnterprise) {
                                            enter.getWorkQueue().getWorkRequestList().add(requests);
                                        }
                                    }
                                } else if (request == Organization.RequestType.Education) {
                                    //enterprise.getOrganizationDirectory().getOrganizationList().
                                    for (Enterprise enter : state.getEnterpriseDirectory().getEnterpriseList()) {
                                        for (Organization organization1 : enter.getOrganizationDirectory().getOrganizationList()) {
                                            if (organization1 instanceof EducationOrganization) {
                                                organization1.getWorkQueue().getWorkRequestList().add(requests);
                                            }
                                        }
                                    }
                                } else if (request == Organization.RequestType.Hospital) {
                                    //enterprise.getOrganizationDirectory().getOrganizationList().
                                    for (Enterprise enter : state.getEnterpriseDirectory().getEnterpriseList()) {
                                        for (Organization organization1 : enter.getOrganizationDirectory().getOrganizationList()) {
                                            if (organization1 instanceof HospitalOrganization) {
                                                organization1.getWorkQueue().getWorkRequestList().add(requests);
                                            }
                                        }
                                    }
                                } else if (request == Organization.RequestType.MNC) {
                                    //enterprise.getOrganizationDirectory().getOrganizationList().
                                    for (Enterprise enter : state.getEnterpriseDirectory().getEnterpriseList()) {
                                        for (Organization organization1 : enter.getOrganizationDirectory().getOrganizationList()) {
                                            if (organization1 instanceof MNCOrganization) {
                                                System.out.println("userinterface MNC");
                                                organization1.getWorkQueue().getWorkRequestList().add(requests);
                                            }
                                        }
                                    }
                                } else if (request == Organization.RequestType.NGO) {
                                    //enterprise.getOrganizationDirectory().getOrganizationList().
                                    for (Enterprise enter : state.getEnterpriseDirectory().getEnterpriseList()) {
                                        for (Organization organization1 : enter.getOrganizationDirectory().getOrganizationList()) {
                                            if (organization1 instanceof NGOOrganization) {

                                                organization1.getWorkQueue().getWorkRequestList().add(requests);
                                            }
                                        }
                                    }
                                }
                               organization.getWorkQueue().getWorkRequestList().add(requests);
                                JOptionPane.showMessageDialog(null, "Help request complete");
                                eventNameTextfield.setText("");
                                noVolTextField.setText("");
                                detailTextArea.setText("");
                                jDateChooser1.setDate(null);
                                noOfVehText.setText("");
                                addressText.setText("");
                                timeField.setText(null);
buttonGroup1.clearSelection();
buttonGroup2.clearSelection();
                                   

                            } catch (NumberFormatException p) {
                                JOptionPane.showMessageDialog(null, "Enter integer value");
                            } catch (ParseException p) {
                                JOptionPane.showMessageDialog(null, "Please enter time in hh:mm format");
                            }
    }//GEN-LAST:event_btnRequestHelpActionPerformed
    
  else {
                            JOptionPane.showMessageDialog(null, "Please Selecteither of the two button");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Please enter event details");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Please select the date");
                }
            } else {
                JOptionPane.showMessageDialog(null, "please enter number of volunteers");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Please enter event name");
        }
    }


    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);

        Component[] componentArray = userProcessContainer.getComponents();
        OrphanageRequestWorkAreaJPanel orphanageRequestPanel = (OrphanageRequestWorkAreaJPanel) userProcessContainer.getComponent(componentArray.length - 1);
        // oldAgeRequestPanel.populateUpdatedTable();

        orphanageRequestPanel.populateWorkQueueTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void noVolTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_noVolTextFieldKeyPressed
        // TODO add your handling code here:
        Validator.onlyInteger(evt, noVolTextField);
    }//GEN-LAST:event_noVolTextFieldKeyPressed

    private void noOfVehTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_noOfVehTextKeyPressed
        // TODO add your handling code here:
        Validator.onlyInteger(evt, noOfVehText);
    }//GEN-LAST:event_noOfVehTextKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addLabel;
    private javax.swing.JTextField addressText;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRequestHelp;
    private javax.swing.JRadioButton busBtn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JRadioButton carBtn;
    private javax.swing.JTextArea detailTextArea;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JTextField eventNameTextfield;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField noOfVehText;
    private javax.swing.JLabel noVehLabel;
    private javax.swing.JTextField noVolTextField;
    private javax.swing.JRadioButton notReqBtn;
    private javax.swing.JRadioButton reqBtn;
    private javax.swing.JComboBox reqComboBox;
    private javax.swing.JTextField timeField;
    private javax.swing.JLabel timelabel;
    private javax.swing.JLabel typeLabel;
    private javax.swing.JRadioButton vanBtn;
    // End of variables declaration//GEN-END:variables
}
