/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Beneficiary.Homeless;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.EntityEnterprise;
import Business.Network.CountryNetwork;
import Business.Network.StateNetwork;
import Business.Organization.EducationOrganization;
import Business.Organization.HomelessOrganization;
import Business.Organization.HospitalOrganization;
import Business.Organization.MNCOrganization;
import Business.Organization.NGOOrganization;
import Business.Organization.Organization;
import Business.Organization.TransportOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.BeneficiaryWorkRequest;
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
public class HomelessRequestHelpJPanel extends javax.swing.JPanel {
//private  BeneficiaryWorkRequest request;
    JPanel userProcessContainer;
    UserAccount account; 
    HomelessOrganization organization; 
    Enterprise enterprise; 
    EcoSystem business;
     StateNetwork state;
    CountryNetwork country;
    /**
     * Creates new form RequestHelpJPanel
     */
    public HomelessRequestHelpJPanel(JPanel userProcessContainer, UserAccount account, HomelessOrganization organization, Enterprise enterprise,StateNetwork network,CountryNetwork cNetwork, EcoSystem business) {
        initComponents();
        //this.request=request;
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.account=account;
        this.business=business;
        this.organization= organization;
        this.state=network;
        this.country=cNetwork;
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
        populateComboBox();
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
        enterpriseLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        busBtn = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        detailTextArea = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        noVolTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        reqBtn = new javax.swing.JRadioButton();
        notReqBtn = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        noOfVehText = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        noVehLabel = new javax.swing.JLabel();
        reqComboBox = new javax.swing.JComboBox();
        typeLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        carBtn = new javax.swing.JRadioButton();
        eventNameTextfield = new javax.swing.JTextField();
        vanBtn = new javax.swing.JRadioButton();
        timelabel = new javax.swing.JLabel();
        timeField = new javax.swing.JTextField();
        addLabel = new javax.swing.JLabel();
        addressText = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(255, 255, 255));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");

        jLabel7.setText("Event Details");

        jLabel1.setText("Request Type:");

        buttonGroup1.add(busBtn);
        busBtn.setText("Bus");

        detailTextArea.setColumns(20);
        detailTextArea.setRows(5);
        jScrollPane1.setViewportView(detailTextArea);

        jLabel2.setText("Number of Volunteers Required");

        noVolTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                noVolTextFieldKeyPressed(evt);
            }
        });

        jLabel4.setText("Logistics");

        jLabel3.setText("Event Date ");

        buttonGroup2.add(reqBtn);
        reqBtn.setText("Required");
        reqBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reqBtnActionPerformed(evt);
            }
        });

        buttonGroup2.add(notReqBtn);
        notReqBtn.setText("Not Required");
        notReqBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notReqBtnActionPerformed(evt);
            }
        });

        jButton1.setText("Request Help");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        noOfVehText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                noOfVehTextKeyPressed(evt);
            }
        });

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        noVehLabel.setText("Number Of Vehicles");

        typeLabel.setText("Type of vehicle");

        jLabel5.setText("Event Name");

        buttonGroup1.add(carBtn);
        carBtn.setText("Car");
        carBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carBtnActionPerformed(evt);
            }
        });

        buttonGroup1.add(vanBtn);
        vanBtn.setText("Mini Van");

        timelabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        timelabel.setForeground(new java.awt.Color(71, 79, 112));
        timelabel.setText("Pickup Time");

        addLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        addLabel.setForeground(new java.awt.Color(71, 79, 112));
        addLabel.setText("Pickup Address");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(278, 278, 278)
                        .addComponent(reqBtn)
                        .addGap(31, 31, 31)
                        .addComponent(notReqBtn))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1)
                                .addComponent(jLabel3)
                                .addComponent(jLabel5)
                                .addComponent(jLabel7)))
                        .addGap(149, 149, 149)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(noVolTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                                .addComponent(reqComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(eventNameTextfield))
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(typeLabel)
                                    .addComponent(noVehLabel))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(noOfVehText, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(carBtn)
                                        .addGap(18, 18, 18)
                                        .addComponent(vanBtn)
                                        .addGap(18, 18, 18)
                                        .addComponent(busBtn))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(timelabel)
                                    .addComponent(addLabel))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addressText)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(timeField, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 80, Short.MAX_VALUE)))))))
                .addGap(279, 279, 279))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(59, 59, 59))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(reqComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(eventNameTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(noVolTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(reqBtn)
                                    .addComponent(notReqBtn)
                                    .addComponent(jLabel4))
                                .addGap(87, 87, 87)
                                .addComponent(noVehLabel))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(carBtn)
                                    .addComponent(vanBtn)
                                    .addComponent(busBtn)
                                    .addComponent(typeLabel))
                                .addGap(18, 18, 18)
                                .addComponent(noOfVehText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(timelabel)
                            .addComponent(timeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addLabel)
                            .addComponent(addressText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(81, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(btnBack)))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void reqBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reqBtnActionPerformed
        // TODO add your handling code here:

        carBtn.setVisible(true);
        busBtn.setVisible(true);
        vanBtn.setVisible(true);
        noOfVehText.setVisible(true);
        noVehLabel.setVisible(true);
        typeLabel.setVisible(true);
        timeField.setVisible(true);
        addressText.setVisible(true);
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
        timeField.setVisible(false);
        addressText.setVisible(false);
         timelabel.setVisible(false);
        addLabel.setVisible(false);
    }//GEN-LAST:event_notReqBtnActionPerformed

public void populateComboBox()
{
     reqComboBox.removeAllItems();
     reqComboBox.addItem(Organization.RequestType.Education);
     reqComboBox.addItem(Organization.RequestType.Hospital);
     reqComboBox.addItem(Organization.RequestType.MNC);
     reqComboBox.addItem(Organization.RequestType.NGO);
     reqComboBox.addItem(Organization.RequestType.ANY);
}
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
                      if(reqComboBox.getSelectedItem().equals(null)||jDateChooser1.getDate().equals(null)||eventNameTextfield.getText().isEmpty()||detailTextArea.getText().isEmpty()||reqBtn.isSelected()||notReqBtn.isSelected())
{ 
        try
        {
            //SimpleDateFormat dates = new SimpleDateFormat("MM/dd/yyyy");
//SimpleDateFormat times = new SimpleDateFormat("hh:mm");
            Organization.RequestType request = (Organization.RequestType) reqComboBox.getSelectedItem();
            int noVolunteer= Integer.parseInt(noVolTextField.getText());
            Date date= jDateChooser1.getDate();
            String eventName = eventNameTextfield.getText();
            String eventDetails= detailTextArea.getText();

            BeneficiaryWorkRequest requests= new BeneficiaryWorkRequest();
            requests.setEventDate(date);
            requests.setSenderOrganization(organization);
            System.out.println("userss"+organization.getName());
            //if(Organization.RequestType.Education.getValue()==request.getValue())
            requests.setRequestType(request);
            requests.setEventName(eventName);
            requests.setEventDetails(eventDetails);
            requests.setNumberOfVolunteersRequest(noVolunteer);

            requests.setSender(account);
            requests.setStatus("Requested");
            if(reqBtn.isSelected())
            {
                SimpleDateFormat times = new SimpleDateFormat("hh:mm");
                int no = Integer.parseInt(noOfVehText.getText());
                 Date time= times.parse(timeField.getText());
                 String address= addressText.getText();
                requests.setLogisticRequest(false);
                if(carBtn.isSelected()){
                    requests.setTypeOfVehicle("Car");

                }
                else if(vanBtn.isSelected()){
                    requests.setTypeOfVehicle("Van");
                }
                else if(busBtn.isSelected()){
                    requests.setTypeOfVehicle("Bus");
                }
                requests.setNoOfVehicle(no);
                requests.setPickupTime(time);
                requests.setAddress(address);

            }
            if(!requests.isLogisticRequest()){
                for (Enterprise enter : state.getEnterpriseDirectory().getEnterpriseList()) {
                    for (Organization organization1 : enter.getOrganizationDirectory().getOrganizationList()) {
                        if(organization1 instanceof TransportOrganization)
                        {
                            System.out.println("sending to transport");
                            organization1.getWorkQueue().getWorkRequestList().add(requests);
                        }
                    }
                }
            }
            System.out.println("type is"+request);
            if(request==Organization.RequestType.ANY)
            {
                for (Enterprise enter : state.getEnterpriseDirectory().getEnterpriseList()) {
                    if(enter instanceof EntityEnterprise){
                        enter.getWorkQueue().getWorkRequestList().add(requests);
                    }
                }
            }
            else if(request==Organization.RequestType.Education)
            {
                //enterprise.getOrganizationDirectory().getOrganizationList().
                for (Enterprise enter : state.getEnterpriseDirectory().getEnterpriseList()) {
                    for (Organization organization1 : enter.getOrganizationDirectory().getOrganizationList()) {
                        if(organization1 instanceof EducationOrganization)
                        {
                            organization1.getWorkQueue().getWorkRequestList().add(requests);
                        }
                    }
                }
            }
            else if(request==Organization.RequestType.Hospital)
            {
                //enterprise.getOrganizationDirectory().getOrganizationList().
                for (Enterprise enter : state.getEnterpriseDirectory().getEnterpriseList()) {
                    for (Organization organization1 : enter.getOrganizationDirectory().getOrganizationList()) {
                        if(organization1 instanceof HospitalOrganization)
                        {
                            organization1.getWorkQueue().getWorkRequestList().add(requests);
                        }
                    }
                }
            }
            else if(request==Organization.RequestType.MNC)
            {
                //enterprise.getOrganizationDirectory().getOrganizationList().
                for (Enterprise enter : state.getEnterpriseDirectory().getEnterpriseList()) {
                    for (Organization organization1 : enter.getOrganizationDirectory().getOrganizationList()) {
                        if(organization1 instanceof MNCOrganization)
                        {
                            System.out.println("userinterface MNC" );
                            organization1.getWorkQueue().getWorkRequestList().add(requests);
                        }
                    }
                }
            }
            else if(request==Organization.RequestType.NGO)
            {
                //enterprise.getOrganizationDirectory().getOrganizationList().
                for (Enterprise enter : state.getEnterpriseDirectory().getEnterpriseList()) {
                    for (Organization organization1 : enter.getOrganizationDirectory().getOrganizationList()) {
                        if(organization1 instanceof NGOOrganization)
                        {

                            organization1.getWorkQueue().getWorkRequestList().add(requests);
                        }
                    }
                }
            }
            organization.getWorkQueue().getWorkRequestList().add(requests);
            JOptionPane.showMessageDialog(null, "Help request complete");

        }
        catch(NumberFormatException p){
            JOptionPane.showMessageDialog(null, "Enter integer value");
        }
        catch(ParseException p)
        {
            JOptionPane.showMessageDialog(null, "Please enter time in hh:mm format");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

            else
{
    JOptionPane.showMessageDialog(null, "Fields cannot be left empty");
}
}
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);

        Component[] componentArray=userProcessContainer.getComponents();
        HomelessRequestWorkAreaJPanel homelessRequestPanel =(HomelessRequestWorkAreaJPanel)userProcessContainer.getComponent(componentArray.length -1);
        // oldAgeRequestPanel.populateUpdatedTable();

        homelessRequestPanel.populateWorkQueueTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void carBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_carBtnActionPerformed

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
    private javax.swing.JRadioButton busBtn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JRadioButton carBtn;
    private javax.swing.JTextArea detailTextArea;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JTextField eventNameTextfield;
    private javax.swing.JButton jButton1;
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
