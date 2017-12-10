/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Beneficiary.Homeless;

import userinterface.Beneficiary.BeneficiaryPersonViewJPanel;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.CountryNetwork;
import Business.Network.StateNetwork;
import Business.Organization.HomelessOrganization;
import Business.Person.Person;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import utility.Validator;

/**
 *
 * @author raunak
 */
public class HomelessManagePersonJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private UserAccount account;
    private HomelessOrganization organization;
    private Enterprise enterprise;
    private EcoSystem business;
    private StateNetwork state;
    private CountryNetwork country;
    private ImageIcon photo;

    /**
     * Creates new form ManageOrganizationJPanel
     */
    public HomelessManagePersonJPanel(JPanel userProcessContainer, UserAccount account, HomelessOrganization organization, Enterprise enterprise, StateNetwork network, CountryNetwork cNetwork, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.account = account;
        this.business = business;
        this.organization = organization;
        populateTable(organization);
        this.state = network;
        this.country = cNetwork;
        TextArea.enable(false);
        //  populateOrganizationComboBox();
        // populateOrganizationEmpComboBox();
        populateComboBox();
    }
    
    public void populateComboBox() {
        reqComboBox.removeAllItems();
        reqComboBox.addItem("White American");
        reqComboBox.addItem("African");
        reqComboBox.addItem("Asian");
        reqComboBox.addItem("Native Hawaiians");
        reqComboBox.addItem("Middle Eastern");
        reqComboBox.addItem("Others");
    }

//    public void populateOrganizationComboBox(){
//        organizationJComboBox.removeAllItems();
//        
//        for (Role role : organization.getSupportedRole()){
//            organizationJComboBox.addItem(role);
//        }
//    }
//    public void populateOrganizationEmpComboBox(){
//        organizationEmpJComboBox.removeAllItems();
//        
//        for (Role role : organization.getSupportedRole()){
//            organizationEmpJComboBox.addItem(role);
//        }
//    }
    private void populateTable(HomelessOrganization organization) {
        try {
            lblName.setText("");
            lblWarning.setText("");
            lblWarningTable.setText("");
            
            DefaultTableModel model = (DefaultTableModel) organizationJTable.getModel();
            
            model.setRowCount(0);
            if (organization != null) {
                if (organization.getPersonList() != null) {
                    
                    if (organization.getPersonList().getPersonList().size() > 0) {
                        
                        lblWarning.setText("");
                        lblWarningTable.setText("");
                        
                        for (Person person : organization.getPersonList().getPersonList()) {
                            
                            Object[] row = new Object[5];
                            row[0] = person.getPersonId();
                            row[1] = person;
                            row[2] = person.getAge();
                            row[3] = person.getSex();
                            row[4] = person.getDateOfJoining();
                            
                            model.addRow(row);
                        }
                    } else {
                        lblWarningTable.setText("*NO Data for Person is Available");
                    }
                } else {
                    lblWarning.setText("*Sorry for the inconvinence. System is down, technical team is working on it. Contact -- poojithsShetty@gmail.com");
                }
            } else {
                lblWarning.setText("*Sorry for the inconvinence. System is down, technical team is working on it. Contact -- poojithsShetty@gmail.com");
            }
        } catch (Exception ex) {
            lblWarning.setText("*Sorry for the inconvinence. System is down, technical team is working on it. Contact -- poojithsShetty@gmail.com");
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

        btnGrpReasons = new javax.swing.ButtonGroup();
        btnGrpEducationBackGround = new javax.swing.ButtonGroup();
        btnGrpSex = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        organizationJTable = new javax.swing.JTable();
        btnCreatePerson = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ageTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ARadioButton = new javax.swing.JRadioButton();
        BRadioButton2 = new javax.swing.JRadioButton();
        CRadioButton3 = new javax.swing.JRadioButton();
        ORadioButton4 = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TextArea = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        rdBtnHighschoolGrad = new javax.swing.JRadioButton();
        rdBtnCollegeGrad = new javax.swing.JRadioButton();
        rdBtnUneducated = new javax.swing.JRadioButton();
        rdBtnMale = new javax.swing.JRadioButton();
        rdBtnFemale = new javax.swing.JRadioButton();
        rdBtnOthers = new javax.swing.JRadioButton();
        reqComboBox = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        btnUpload = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        btnViewDetails = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        picText = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        lblWarning = new javax.swing.JLabel();
        lblWarningTable = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        organizationJTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        organizationJTable.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        organizationJTable.setForeground(new java.awt.Color(71, 79, 112));
        organizationJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Age", "Sex", "Date Of Joining"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(organizationJTable);
        if (organizationJTable.getColumnModel().getColumnCount() > 0) {
            organizationJTable.getColumnModel().getColumn(0).setResizable(false);
            organizationJTable.getColumnModel().getColumn(1).setResizable(false);
            organizationJTable.getColumnModel().getColumn(2).setResizable(false);
            organizationJTable.getColumnModel().getColumn(3).setResizable(false);
            organizationJTable.getColumnModel().getColumn(4).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 850, 92));

        btnCreatePerson.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnCreatePerson.setForeground(new java.awt.Color(71, 79, 112));
        btnCreatePerson.setText("Create Person");
        btnCreatePerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreatePersonActionPerformed(evt);
            }
        });
        add(btnCreatePerson, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 600, -1, -1));

        btnBack.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(71, 79, 112));
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 650, -1, -1));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(71, 79, 112));
        jLabel2.setText("*Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 50, -1));

        nameJTextField.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        nameJTextField.setForeground(new java.awt.Color(71, 79, 112));
        nameJTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                nameJTextFieldFocusLost(evt);
            }
        });
        add(nameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, 126, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(71, 79, 112));
        jLabel4.setText("Person Details");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 220, 30));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(71, 79, 112));
        jLabel5.setText("Create Person");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, 220, 30));

        ageTextField.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        ageTextField.setForeground(new java.awt.Color(71, 79, 112));
        ageTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ageTextFieldKeyPressed(evt);
            }
        });
        add(ageTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, 130, -1));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(71, 79, 112));
        jLabel1.setText("*Age:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 50, -1));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(71, 79, 112));
        jLabel6.setText("*Reason For Joining");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, -1, -1));

        btnGrpReasons.add(ARadioButton);
        ARadioButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        ARadioButton.setForeground(new java.awt.Color(71, 79, 112));
        ARadioButton.setText("Individual and relational factors");
        ARadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ARadioButtonActionPerformed(evt);
            }
        });
        add(ARadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 420, -1, -1));

        btnGrpReasons.add(BRadioButton2);
        BRadioButton2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        BRadioButton2.setForeground(new java.awt.Color(71, 79, 112));
        BRadioButton2.setText("Economic Issues");
        BRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BRadioButton2ActionPerformed(evt);
            }
        });
        add(BRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 420, -1, -1));

        btnGrpReasons.add(CRadioButton3);
        CRadioButton3.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        CRadioButton3.setForeground(new java.awt.Color(71, 79, 112));
        CRadioButton3.setText("System failures");
        CRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CRadioButton3ActionPerformed(evt);
            }
        });
        add(CRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 420, -1, -1));

        btnGrpReasons.add(ORadioButton4);
        ORadioButton4.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        ORadioButton4.setForeground(new java.awt.Color(71, 79, 112));
        ORadioButton4.setText("Others");
        ORadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ORadioButton4ActionPerformed(evt);
            }
        });
        add(ORadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 420, -1, -1));

        TextArea.setColumns(20);
        TextArea.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        TextArea.setForeground(new java.awt.Color(71, 79, 112));
        TextArea.setRows(5);
        TextArea.setEnabled(false);
        jScrollPane2.setViewportView(TextArea);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 460, -1, 52));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(71, 79, 112));
        jLabel3.setText("*Sex:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 40, -1));

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(71, 79, 112));
        jLabel7.setText("*Ethnicity:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 70, -1));

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(71, 79, 112));
        jLabel8.setText("*Education Background:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, -1, -1));

        btnGrpEducationBackGround.add(rdBtnHighschoolGrad);
        rdBtnHighschoolGrad.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        rdBtnHighschoolGrad.setForeground(new java.awt.Color(71, 79, 112));
        rdBtnHighschoolGrad.setText("Highschool Graduate");
        add(rdBtnHighschoolGrad, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 380, -1, -1));

        btnGrpEducationBackGround.add(rdBtnCollegeGrad);
        rdBtnCollegeGrad.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        rdBtnCollegeGrad.setForeground(new java.awt.Color(71, 79, 112));
        rdBtnCollegeGrad.setText("College Graduate");
        add(rdBtnCollegeGrad, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 380, -1, -1));

        btnGrpEducationBackGround.add(rdBtnUneducated);
        rdBtnUneducated.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        rdBtnUneducated.setForeground(new java.awt.Color(71, 79, 112));
        rdBtnUneducated.setText("Uneducated");
        add(rdBtnUneducated, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 380, -1, -1));

        btnGrpSex.add(rdBtnMale);
        rdBtnMale.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        rdBtnMale.setForeground(new java.awt.Color(71, 79, 112));
        rdBtnMale.setText("Male");
        add(rdBtnMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, -1, -1));

        btnGrpSex.add(rdBtnFemale);
        rdBtnFemale.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        rdBtnFemale.setForeground(new java.awt.Color(71, 79, 112));
        rdBtnFemale.setText("Female");
        add(rdBtnFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 300, -1, -1));

        btnGrpSex.add(rdBtnOthers);
        rdBtnOthers.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        rdBtnOthers.setForeground(new java.awt.Color(71, 79, 112));
        rdBtnOthers.setText("Others");
        add(rdBtnOthers, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 300, -1, -1));

        reqComboBox.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        reqComboBox.setForeground(new java.awt.Color(71, 79, 112));
        add(reqComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 340, 110, -1));

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(71, 79, 112));
        jLabel9.setText("Description: ");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 470, -1, -1));

        btnUpload.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnUpload.setForeground(new java.awt.Color(71, 79, 112));
        btnUpload.setText("Upload ");
        btnUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadActionPerformed(evt);
            }
        });
        add(btnUpload, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 530, -1, -1));

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(71, 79, 112));
        jLabel10.setText("*Photo:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 530, -1, -1));

        btnViewDetails.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnViewDetails.setForeground(new java.awt.Color(71, 79, 112));
        btnViewDetails.setText("View Details");
        btnViewDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDetailsActionPerformed(evt);
            }
        });
        add(btnViewDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 180, -1, -1));

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(71, 79, 112));
        jLabel11.setText("* Mandatory Fields");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 660, -1, -1));
        add(picText, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 530, 110, -1));

        lblName.setForeground(new java.awt.Color(255, 0, 0));
        add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 240, -1, -1));

        lblWarning.setForeground(new java.awt.Color(255, 0, 0));
        add(lblWarning, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 700, -1, -1));

        lblWarningTable.setForeground(new java.awt.Color(255, 0, 0));
        add(lblWarningTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 170, -1, -1));

        btnDelete.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(71, 79, 112));
        btnDelete.setText("Delete request");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 180, 140, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreatePersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreatePersonActionPerformed
        try {
            lblWarning.setText("");
            lblWarningTable.setText("");
            lblName.setText("");
            
            if (!(nameJTextField.getText().isEmpty())) {
                if (!(ageTextField.getText().isEmpty())) {
                    if (((rdBtnMale.isSelected() || rdBtnFemale.isSelected() || rdBtnOthers.isSelected()))) {
                        
                        if (rdBtnCollegeGrad.isSelected() || rdBtnHighschoolGrad.isSelected() || rdBtnUneducated.isSelected()) {
                            
                            if (ARadioButton.isSelected() || BRadioButton2.isSelected() || CRadioButton3.isSelected() || ORadioButton4.isSelected()) {
                                
                                if (!(picText.getText().isEmpty())) {
                                    
                                    try {
                                        //SimpleDateFormat date = new SimpleDateFormat("MM/dd/yyyy");
                                        //ClinicOrganization organization = (ClinicOrganization) organizationEmpJComboBox.getSelectedItem();
                                        String name = nameJTextField.getText();
                                        int age = Integer.parseInt(ageTextField.getText());
                                        String ethnicity = (String) reqComboBox.getSelectedItem();
                                        
                                        String sex = null;
                                        if (rdBtnMale.isSelected()) {
                                            sex = "Male";
                                        } else if (rdBtnFemale.isSelected()) {
                                            sex = "Female";
                                        } else if (rdBtnOthers.isSelected()) {
                                            sex = "Others";
                                        }
                                        String educationBG = null;
                                        if (rdBtnCollegeGrad.isSelected()) {
                                            educationBG = "College Graduate";
                                        } else if (rdBtnHighschoolGrad.isSelected()) {
                                            educationBG = "HighSchool Graduate";
                                        } else if (rdBtnUneducated.isSelected()) {
                                            educationBG = "Uneducated";
                                        }
                                        
                                        String reason = null;
                                        if (ARadioButton.isSelected()) {
                                            reason = "Individual and relational factors";
                                        } else if (BRadioButton2.isSelected()) {
                                            reason = "Economic Issues";
                                        } else if (CRadioButton3.isSelected()) {
                                            reason = "Systems failures";
                                        } else if (ORadioButton4.isSelected()) {
                                            reason = "Others";
                                        }
                                        
                                        String reasonDescription = TextArea.getText();
                                        organization.getPersonList().createperson(name, age, reason, ethnicity, sex, educationBG, reasonDescription, photo);
                                        JOptionPane.showMessageDialog(null, "Person Created");
                                        nameJTextField.setText("");
                                        ageTextField.setText("");
                                        btnGrpSex.clearSelection();
                                        btnGrpEducationBackGround.clearSelection();
                                        btnGrpReasons.clearSelection();
                                        TextArea.setText("");
                                        picText.setText("");
                                        populateTable(organization);
                                    } catch (NumberFormatException p) {
                                        JOptionPane.showMessageDialog(null, "Please enter Valid Age");
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(null, "Please upload the picture", "Warning", JOptionPane.WARNING_MESSAGE);
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "Please Select the either of the options for Reason", "Warning", JOptionPane.WARNING_MESSAGE);
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Please Select education background option", "Warning", JOptionPane.WARNING_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Please Select male or female option", "Warning", JOptionPane.WARNING_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Please enter the age", "Warning", JOptionPane.WARNING_MESSAGE);
                }
                
            } else {
                JOptionPane.showMessageDialog(null, "Please enter the name", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        } catch (Exception ex) {
            lblWarning.setText("*Sorry for the inconvinence. System is down, technical team is working on it. Contact -- poojithsShetty@gmail.com");
        }
    }//GEN-LAST:event_btnCreatePersonActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void ORadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ORadioButton4ActionPerformed
        // TODO add your handling code here:
        TextArea.enable(true);
    }//GEN-LAST:event_ORadioButton4ActionPerformed

    private void ARadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ARadioButtonActionPerformed
        // TODO add your handling code here:
        TextArea.enable(true);
    }//GEN-LAST:event_ARadioButtonActionPerformed

    private void BRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BRadioButton2ActionPerformed
        // TODO add your handling code here:
        TextArea.enable(true);
    }//GEN-LAST:event_BRadioButton2ActionPerformed

    private void CRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CRadioButton3ActionPerformed
        // TODO add your handling code here:
        TextArea.enable(true);
    }//GEN-LAST:event_CRadioButton3ActionPerformed

    private void btnUploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadActionPerformed
        // TODO add your handling code here:
        try {
            lblWarning.setText("");
            JFileChooser chooser = new JFileChooser();
            chooser.showOpenDialog(null);
            File f1 = chooser.getSelectedFile();
            if (f1 != null) {
                try {
                    Image pic = ImageIO.read(f1);
                    pic = pic.getScaledInstance(300, 300, java.awt.Image.SCALE_SMOOTH);
                    picText.setText(chooser.getSelectedFile().getPath());
                    photo = new ImageIcon(pic);
                    
                } catch (Exception e) {
                    
                }
            } else {
                
                JOptionPane.showMessageDialog(null, "Please select a picture", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        } catch (Exception ex) {
            lblWarning.setText("*Sorry for the inconvinence. System is down, technical team is working on it. Contact -- poojithsShetty@gmail.com");
        }
    }//GEN-LAST:event_btnUploadActionPerformed

    private void btnViewDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDetailsActionPerformed
        // TODO add your handling code here:

        int selectedrow = organizationJTable.getSelectedRow();
        
        if (selectedrow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a Row from table first to view details", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            Person p = (Person) organizationJTable.getValueAt(selectedrow, 1);
            BeneficiaryPersonViewJPanel muajp = new BeneficiaryPersonViewJPanel(userProcessContainer, p);
            userProcessContainer.add("HomelessPersonViewJPanel", muajp);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
            
        }
        

    }//GEN-LAST:event_btnViewDetailsActionPerformed

    private void ageTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ageTextFieldKeyPressed
        // TODO add your handling code here:
        Validator.onlyInteger(evt, ageTextField);
    }//GEN-LAST:event_ageTextFieldKeyPressed

    private void nameJTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameJTextFieldFocusLost
        // TODO add your handling code here:
        if (!nameJTextField.getText().isEmpty()) {
            if (!Validator.validateName(nameJTextField.getText())) {
                lblName.setText("*Only Alphabets and Spaces are allowed");
                nameJTextField.setText("");
            } else {
                lblName.setText("");
            }
        }
    }//GEN-LAST:event_nameJTextFieldFocusLost

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = organizationJTable.getSelectedRow();
        if (selectedRow >= 0) {

            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null, "Would you like to delete the details", "Warning", dialogButton);
            if (dialogResult == JOptionPane.YES_OPTION) {

                Person p = (Person) organizationJTable.getValueAt(selectedRow, 1);

                for (Person person : organization.getPersonList().getPersonList()) {
                    if (p == person) {
                        organization.getPersonList().getPersonList().remove(p);
                        break;
                    }

                }

                JOptionPane.showMessageDialog(null, "You have successfully deleted the account");
                populateTable(organization);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a Row from table ", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton ARadioButton;
    private javax.swing.JRadioButton BRadioButton2;
    private javax.swing.JRadioButton CRadioButton3;
    private javax.swing.JRadioButton ORadioButton4;
    private javax.swing.JTextArea TextArea;
    private javax.swing.JTextField ageTextField;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreatePerson;
    private javax.swing.JButton btnDelete;
    private javax.swing.ButtonGroup btnGrpEducationBackGround;
    private javax.swing.ButtonGroup btnGrpReasons;
    private javax.swing.ButtonGroup btnGrpSex;
    private javax.swing.JButton btnUpload;
    private javax.swing.JButton btnViewDetails;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblWarning;
    private javax.swing.JLabel lblWarningTable;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JTable organizationJTable;
    private javax.swing.JTextField picText;
    private javax.swing.JRadioButton rdBtnCollegeGrad;
    private javax.swing.JRadioButton rdBtnFemale;
    private javax.swing.JRadioButton rdBtnHighschoolGrad;
    private javax.swing.JRadioButton rdBtnMale;
    private javax.swing.JRadioButton rdBtnOthers;
    private javax.swing.JRadioButton rdBtnUneducated;
    private javax.swing.JComboBox reqComboBox;
    // End of variables declaration//GEN-END:variables
}
