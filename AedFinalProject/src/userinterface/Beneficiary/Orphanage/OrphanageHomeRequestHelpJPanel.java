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
import java.awt.CardLayout;
import java.awt.Component;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

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
    public OrphanageHomeRequestHelpJPanel(JPanel userProcessContainer, UserAccount account, OrphanageOrganization organization, Enterprise enterprise,StateNetwork network,CountryNetwork cNetwork, EcoSystem business) {
        initComponents();
         this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.account=account;
        this.business=business;
        this.organization= organization;
        this.state=network;
        this.country=cNetwork;
        populateComboBox();
    }
public void populateComboBox()
{
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
        dateField = new javax.swing.JTextField();
        notReqBtn = new javax.swing.JRadioButton();
        btnRequestHelp = new javax.swing.JButton();
        noOfVehText = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        noVehLabel = new javax.swing.JLabel();
        reqComboBox = new javax.swing.JComboBox();
        typeLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        carBtn.setText("Car");
        carBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carBtnActionPerformed(evt);
            }
        });

        vanBtn.setText("Mini Van");

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");

        jLabel7.setText("Event Details");

        busBtn.setText("Bus");

        jLabel1.setText("Request Type:");

        detailTextArea.setColumns(20);
        detailTextArea.setRows(5);
        jScrollPane1.setViewportView(detailTextArea);

        jLabel2.setText("Number of Volunteers Required");

        jLabel4.setText("Logistics");

        jLabel3.setText("Event Date ");

        reqBtn.setText("Required");
        reqBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reqBtnActionPerformed(evt);
            }
        });

        notReqBtn.setText("Not Required");
        notReqBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notReqBtnActionPerformed(evt);
            }
        });

        btnRequestHelp.setText("Request Help");
        btnRequestHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestHelpActionPerformed(evt);
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
                        .addGap(217, 217, 217)
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
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)))
                            .addComponent(jLabel7))
                        .addGap(149, 149, 149)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(noVolTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                                .addComponent(dateField)
                                .addComponent(reqComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(eventNameTextfield))))
                    .addComponent(btnBack, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(287, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnRequestHelp)
                .addGap(78, 78, 78))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnRequestHelp)
                        .addGap(56, 56, 56))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(65, 65, 65))))
        );
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
    }//GEN-LAST:event_reqBtnActionPerformed

    private void notReqBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notReqBtnActionPerformed
        // TODO add your handling code here:
        carBtn.setVisible(false);
        busBtn.setVisible(false);
        vanBtn.setVisible(false);
        noOfVehText.setVisible(false);
        noVehLabel.setVisible(false);
        typeLabel.setVisible(false);
    }//GEN-LAST:event_notReqBtnActionPerformed

    
    private void btnRequestHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestHelpActionPerformed
        // TODO add your handling code here:
        try
        {
            SimpleDateFormat dates = new SimpleDateFormat("MM/dd/yyyy");

            Organization.RequestType request = (Organization.RequestType) reqComboBox.getSelectedItem();
            int noVolunteer= Integer.parseInt(noVolTextField.getText());
            Date date= dates.parse(dateField.getText());
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
                int no = Integer.parseInt(noOfVehText.getText());
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
            JOptionPane.showMessageDialog(null, "Please enter date in MM/dd/yyyy format");
        }
    }//GEN-LAST:event_btnRequestHelpActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);

        Component[] componentArray=userProcessContainer.getComponents();
        OrphanageRequestWorkAreaJPanel orphanageRequestPanel =(OrphanageRequestWorkAreaJPanel)userProcessContainer.getComponent(componentArray.length -1);
        // oldAgeRequestPanel.populateUpdatedTable();

        orphanageRequestPanel.populateWorkQueueTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRequestHelp;
    private javax.swing.JRadioButton busBtn;
    private javax.swing.JRadioButton carBtn;
    private javax.swing.JTextField dateField;
    private javax.swing.JTextArea detailTextArea;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JTextField eventNameTextfield;
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
    private javax.swing.JLabel typeLabel;
    private javax.swing.JRadioButton vanBtn;
    // End of variables declaration//GEN-END:variables
}
