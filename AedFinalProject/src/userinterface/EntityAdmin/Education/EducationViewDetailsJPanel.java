/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.EntityAdmin.Education;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Event.Event;
import Business.Event.EventDirectory;
import Business.Network.CountryNetwork;
import Business.Network.StateNetwork;
import Business.Organization.EducationOrganization;
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
public class EducationViewDetailsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewDetailsJPanel
     */
    private Enterprise enterprise;
    private UserAccount account;
    private CountryNetwork country;
    private StateNetwork state;
    private EcoSystem system;
    private JPanel userProcessContainer;
    private EducationOrganization organization;
    private BeneficiaryWorkRequest workRequest;
    private EducationRequestAreaJPanel eduRequestPanel;

    public EducationViewDetailsJPanel(JPanel userProcessContainer, UserAccount account, EducationOrganization organization, Enterprise enterprise, StateNetwork network, CountryNetwork cNetwork, EcoSystem business, BeneficiaryWorkRequest p) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.system = business;
        this.state = network;
        this.country = cNetwork;
        this.account = account;
        this.organization = organization;
        this.workRequest = p;
        nameLabel.setText(organization.getName());
        reqComboBox.setText(p.getRequestType().getValue());
        eventNameTextfield.setText(p.getEventName());
        reqVolText.setText(String.valueOf(p.getNumberOfVolunteersRequest()));
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        dateField.setText(sdf.format(p.getEventDate()));
        detailTextArea.setText(p.getEventDetails());
        nameLabel.setEnabled(false);
        reqComboBox.setEnabled(false);
        eventNameTextfield.setEnabled(false);
        reqVolText.setEnabled(false);
        dateField.setEnabled(false);
        detailTextArea.setEnabled(false);
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
        enterpriseLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        eventNameTextfield = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        availVolTextField = new javax.swing.JTextField();
        dateField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        UpdateBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        reqVolText = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        detailTextArea = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        reqComboBox = new javax.swing.JTextField();
        lblWarning = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        enterpriseLabel.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 18)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(71, 79, 112));
        enterpriseLabel.setText("Organization:");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 190, 30));

        jLabel1.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(71, 79, 112));
        jLabel1.setText("Request Type:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, -1, -1));

        eventNameTextfield.setEditable(false);
        eventNameTextfield.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        eventNameTextfield.setForeground(new java.awt.Color(71, 79, 112));
        eventNameTextfield.setEnabled(false);
        add(eventNameTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 210, 232, -1));

        jLabel5.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(71, 79, 112));
        jLabel5.setText("Event Name");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, -1, -1));

        jLabel2.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(71, 79, 112));
        jLabel2.setText("Available Volunteers");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, -1, 30));

        availVolTextField.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        availVolTextField.setForeground(new java.awt.Color(71, 79, 112));
        availVolTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                availVolTextFieldKeyTyped(evt);
            }
        });
        add(availVolTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 250, 232, -1));

        dateField.setEditable(false);
        dateField.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        dateField.setForeground(new java.awt.Color(71, 79, 112));
        dateField.setEnabled(false);
        add(dateField, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 320, 232, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(71, 79, 112));
        jLabel3.setText("Event Date ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, -1, -1));

        UpdateBtn.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        UpdateBtn.setForeground(new java.awt.Color(71, 79, 112));
        UpdateBtn.setText("Update");
        UpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtnActionPerformed(evt);
            }
        });
        add(UpdateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 510, 140, 50));

        jLabel6.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(71, 79, 112));
        jLabel6.setText("Required Volunteers");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, -1, -1));

        reqVolText.setEditable(false);
        reqVolText.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        reqVolText.setForeground(new java.awt.Color(71, 79, 112));
        reqVolText.setEnabled(false);
        add(reqVolText, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 280, 232, -1));

        jLabel7.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(71, 79, 112));
        jLabel7.setText("Event Details");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 370, -1, -1));

        jScrollPane1.setForeground(new java.awt.Color(71, 79, 112));

        detailTextArea.setEditable(false);
        detailTextArea.setColumns(20);
        detailTextArea.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        detailTextArea.setForeground(new java.awt.Color(71, 79, 112));
        detailTextArea.setRows(5);
        detailTextArea.setEnabled(false);
        jScrollPane1.setViewportView(detailTextArea);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 370, 232, -1));
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, -1, -1));

        nameLabel.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 18)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(71, 79, 112));
        add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, 130, 30));

        jButton1.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(71, 79, 112));
        jButton1.setText("<Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 830, 120, 40));

        reqComboBox.setEditable(false);
        reqComboBox.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        reqComboBox.setForeground(new java.awt.Color(71, 79, 112));
        reqComboBox.setEnabled(false);
        add(reqComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 170, 232, -1));

        lblWarning.setForeground(new java.awt.Color(255, 0, 0));
        add(lblWarning, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 580, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void UpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtnActionPerformed
        // TODO add your handling code here:
        try {
            if(!availVolTextField.getText().isEmpty()){
            SimpleDateFormat date = new SimpleDateFormat("MM/dd/yyyy");
            String name = eventNameTextfield.getText();
            int availableVolunteers = Integer.parseInt(availVolTextField.getText());
            int requiredVolunteers = Integer.parseInt(reqVolText.getText());
            Date eventDate = date.parse(dateField.getText());
            if (availableVolunteers <= requiredVolunteers) {
                if (organization.getEventDirectory().getEventDirectory() == null) {
                    organization.setEventDirectory(new EventDirectory());
                }
                Event event = organization.getEventDirectory().createEvent();
                event.setAvailVolunteers(availableVolunteers);
                event.setRequiredVolunteers(requiredVolunteers);

                event.setEventDate(eventDate);
                event.setEventName(name);
                event.setServingOrganization(organization);
                event.setSenderOrganization(workRequest.getSenderOrganization());

                workRequest.setNumberOfVolunteersRequest(requiredVolunteers - availableVolunteers);
                workRequest.getEventDirectory().getEventDirectory().add(event);
                if (workRequest.getNumberOfVolunteersRequest() == 0 && workRequest.isLogisticRequest() == true) {
                    workRequest.setStatus("Complete");

                }
                JOptionPane.showMessageDialog(null, "Details updated Successfully");
                availVolTextField.setText("");
            }
            else{
                JOptionPane.showMessageDialog(null, "Please add value for Available volunteers");
            }
            
            } else {
                JOptionPane.showMessageDialog(null, "Available volunteers cannot be more than Required Volunteers");
            }

        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null, "Please enter date in MM/dd/yyyy format");
        }
        catch(Exception ex){
            lblWarning.setText("*Sorry for the inconvinence. System is down, technical team is working on it. Contact -- poojithsShetty@gmail.com");
        }
    }//GEN-LAST:event_UpdateBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);

        Component[] componentArray = userProcessContainer.getComponents();
        EducationRequestAreaJPanel eduRequestPanel = (EducationRequestAreaJPanel) userProcessContainer.getComponent(componentArray.length - 1);
        eduRequestPanel.populateUpdatedTable();
        eduRequestPanel.populateWorkQueueTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void availVolTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_availVolTextFieldKeyTyped
        // TODO add your handling code here:
        Validator.onlyInteger(evt, availVolTextField);
    }//GEN-LAST:event_availVolTextFieldKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JTextField availVolTextField;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField dateField;
    private javax.swing.JTextArea detailTextArea;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JTextField eventNameTextfield;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblWarning;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField reqComboBox;
    private javax.swing.JTextField reqVolText;
    // End of variables declaration//GEN-END:variables
}
