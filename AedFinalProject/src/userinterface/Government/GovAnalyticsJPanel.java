/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Government;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.BeneficiaryEnterprise;
import Business.Enterprise.Enterprise;
import Business.Network.CountryNetwork;
import Business.Network.StateNetwork;
import Business.Organization.BGVOrganization;
import Business.Organization.Organization;
import Business.Person.Person;
import Business.Person.PersonDirectory;
import Business.Role.BGVAdmin;
import Business.SignUp.SignUpRequest;
import Business.SignUp.SignUpRequestOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.BorderLayout;
import javax.mail.SendFailedException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import utility.Validator;

/**
 *
 * @author prashantreddy
 */
public class GovAnalyticsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form EntityManageRequestJPanel
     */
    private JPanel container;
    private Enterprise enterprise;
    UserAccount account;
    CountryNetwork country;
    StateNetwork state;
    EcoSystem system;
    JPanel userProcessContainer;
    PersonDirectory pDirectory = new PersonDirectory();

    public GovAnalyticsJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, StateNetwork network, CountryNetwork cNetwork, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.system = business;
        this.state = network;
        this.country = cNetwork;
        this.account = account;
        populatePersonDirectory();
    }

    public void populatePersonDirectory() {
        for (StateNetwork stateNetwork : country.getStateList()) {
            for (Enterprise enterprise1 : stateNetwork.getEnterpriseDirectory().getEnterpriseList()) {
                if (enterprise1 instanceof BeneficiaryEnterprise) {
                    for (Organization organization : enterprise1.getOrganizationDirectory().getOrganizationList()) {
                        if (organization.getPersonList() != null) {
                            for (Person person : organization.getPersonList().getPersonList()) {
                                pDirectory.getPersonList().add(person);
                            }
                        }
                    }
                }
            }
        }
        System.out.println("Total number of people: " + pDirectory.getPersonList().size());
    }

    public void populateBarGraph(DefaultCategoryDataset dataset, JPanel panel) {

        JFreeChart barChart = ChartFactory.createBarChart(
                "Bar Graph",
                "Category",
                "No Of People",
                dataset,
                PlotOrientation.VERTICAL,
                true, true, true);

        ChartPanel chartPanel = new ChartPanel(barChart);
        panel.removeAll();
        panel.add(chartPanel, BorderLayout.CENTER);
        panel.validate();
    }

    public void populateComboBoxEthnicity(JComboBox reqComboBox) {
        reqComboBox.removeAllItems();
        reqComboBox.addItem("White American");
        reqComboBox.addItem("African");
        reqComboBox.addItem("Asian");
        reqComboBox.addItem("Native Hawaiians");
        reqComboBox.addItem("Middle Eastern");
        reqComboBox.addItem("Others");
    }

    public void populateComboBoxEducation(JComboBox reqComboBox) {
        reqComboBox.removeAllItems();
        reqComboBox.addItem("College Graduate");
        reqComboBox.addItem("HighSchool Graduate");
        reqComboBox.addItem("Uneducated");
    }

    public void populateComboBoxReasons(JComboBox reqComboBox) {
        reqComboBox.removeAllItems();
        reqComboBox.addItem("Individual and relational factors");
        reqComboBox.addItem("Economic Issues");
        reqComboBox.addItem("Systems failures");
        reqComboBox.addItem("Others");
    }

    public void populateComboBoxAge(JComboBox reqComboBox) {
        reqComboBox.removeAllItems();
        reqComboBox.addItem("Age<18");
        reqComboBox.addItem("18<Age<60");
        reqComboBox.addItem("Age>60");
    }

    public void populateComboBoxGender(JComboBox reqComboBox) {
        reqComboBox.removeAllItems();
        reqComboBox.addItem("Male");
        reqComboBox.addItem("Female");
        reqComboBox.addItem("Others");
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
        jLabel3 = new javax.swing.JLabel();
        panelGraph = new javax.swing.JPanel();
        btnAge = new javax.swing.JRadioButton();
        btnReason = new javax.swing.JRadioButton();
        btnGender = new javax.swing.JRadioButton();
        btnEthnicity = new javax.swing.JRadioButton();
        btnEdu = new javax.swing.JRadioButton();
        panelEthnicity = new javax.swing.JPanel();
        panelReason = new javax.swing.JPanel();
        panelAge = new javax.swing.JPanel();
        combo1 = new javax.swing.JComboBox();
        combo2 = new javax.swing.JComboBox();
        combo3 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(71, 79, 112));
        jLabel3.setText("People Analysis");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 220, -1));

        panelGraph.setBackground(new java.awt.Color(153, 153, 153));
        add(panelGraph, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 670, 420));

        btnAge.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(btnAge);
        btnAge.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        btnAge.setForeground(new java.awt.Color(71, 79, 112));
        btnAge.setText("Age");
        btnAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgeActionPerformed(evt);
            }
        });
        add(btnAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 50, 90, -1));

        btnReason.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(btnReason);
        btnReason.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        btnReason.setForeground(new java.awt.Color(71, 79, 112));
        btnReason.setText("Reason");
        btnReason.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReasonActionPerformed(evt);
            }
        });
        add(btnReason, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 50, 140, -1));

        btnGender.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(btnGender);
        btnGender.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        btnGender.setForeground(new java.awt.Color(71, 79, 112));
        btnGender.setText("Gender");
        btnGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenderActionPerformed(evt);
            }
        });
        add(btnGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, 120, -1));

        btnEthnicity.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(btnEthnicity);
        btnEthnicity.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        btnEthnicity.setForeground(new java.awt.Color(71, 79, 112));
        btnEthnicity.setText("Ethnicity");
        btnEthnicity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEthnicityActionPerformed(evt);
            }
        });
        add(btnEthnicity, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 130, -1));

        btnEdu.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(btnEdu);
        btnEdu.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        btnEdu.setForeground(new java.awt.Color(71, 79, 112));
        btnEdu.setText("Education");
        btnEdu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEduActionPerformed(evt);
            }
        });
        add(btnEdu, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 140, -1));

        panelEthnicity.setBackground(new java.awt.Color(153, 153, 153));
        add(panelEthnicity, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 100, 590, 410));

        panelReason.setBackground(new java.awt.Color(153, 153, 153));
        add(panelReason, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 560, 670, 420));

        panelAge.setBackground(new java.awt.Color(153, 153, 153));
        add(panelAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 560, 600, 410));

        combo1.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        combo1.setForeground(new java.awt.Color(71, 79, 112));
        combo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo1ActionPerformed(evt);
            }
        });
        add(combo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 60, 210, -1));

        combo2.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        combo2.setForeground(new java.awt.Color(71, 79, 112));
        combo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo2ActionPerformed(evt);
            }
        });
        add(combo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 530, 220, -1));

        combo3.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        combo3.setForeground(new java.awt.Color(71, 79, 112));
        combo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo3ActionPerformed(evt);
            }
        });
        add(combo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 520, 190, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utility/global-world-map-background-business-template-d-globe-40201747.jpg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, -4, 1510, 860));
    }// </editor-fold>//GEN-END:initComponents

    private void btnEthnicityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEthnicityActionPerformed
        // TODO add your handling code here:
        if (btnEthnicity.isSelected()) {
            populateComboBoxEducation(combo1);
            populateComboBoxReasons(combo2);
            populateComboBoxGender(combo3);
            int wa = 0;
            int af = 0;
            int as = 0;
            int na = 0;
            int me = 0;
            int ot = 0;

            for (Person person : pDirectory.getPersonList()) {
                if (person.getEthnicity().equals("White American")) {
                    wa++;
                } else if (person.getEthnicity().equals("African")) {
                    af++;
                } else if (person.getEthnicity().equals("Asian")) {
                    as++;
                } else if (person.getEthnicity().equals("Native Hawaiians")) {
                    na++;
                } else if (person.getEthnicity().equals("Middle Eastern")) {
                    me++;
                } else if (person.getEthnicity().equals("Others")) {
                    ot++;
                }

            }
            DefaultCategoryDataset dataset = new DefaultCategoryDataset();
            dataset.setValue(wa, "", "White American");
            dataset.setValue(af, "", "African");
            dataset.setValue(as, "", "Asian");
            dataset.setValue(na, "", "Native Hawaiians");
            dataset.setValue(me, "", "Middle Eastern");
            dataset.setValue(ot, "", "Others");

            populateBarGraph(dataset, panelGraph);

        }
    }//GEN-LAST:event_btnEthnicityActionPerformed

    private void btnEduActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEduActionPerformed
        // TODO add your handling code here:
        if (btnEdu.isSelected()) {
            populateComboBoxEthnicity(combo1);
            populateComboBoxReasons(combo2);
            populateComboBoxAge(combo3);
            int cg = 0;
            int hg = 0;
            int ue = 0;
            for (Person person : pDirectory.getPersonList()) {
                if (person.getEducationBackground().equals("College Graduate")) {
                    cg++;
                } else if (person.getEducationBackground().equals("HighSchool Graduate")) {
                    hg++;
                } else if (person.getEducationBackground().equals("Uneducated")) {
                    ue++;
                }
            }
            DefaultCategoryDataset dataset = new DefaultCategoryDataset();
            dataset.setValue(cg, "", "College Graduate");
            dataset.setValue(hg, "", "HighSchool Graduate");
            dataset.setValue(ue, "", "Uneducated");
            populateBarGraph(dataset, panelGraph);

        }
    }//GEN-LAST:event_btnEduActionPerformed

    private void btnGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenderActionPerformed
        // TODO add your handling code here:
        if (btnGender.isSelected()) {
            populateComboBoxEducation(combo1);
            populateComboBoxReasons(combo2);
            populateComboBoxAge(combo3);
            int cg = 0;
            int hg = 0;
            int ue = 0;
            for (Person person : pDirectory.getPersonList()) {
                if (person.getSex().equals("Male")) {
                    cg++;
                } else if (person.getSex().equals("Female")) {
                    hg++;
                } else if (person.getSex().equals("Others")) {
                    ue++;
                }
            }
            DefaultCategoryDataset dataset = new DefaultCategoryDataset();
            dataset.setValue(cg, "", "Male");
            dataset.setValue(hg, "", "Female");
            dataset.setValue(ue, "", "Others");
            populateBarGraph(dataset, panelGraph);

        }
    }//GEN-LAST:event_btnGenderActionPerformed

    private void btnReasonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReasonActionPerformed
        // TODO add your handling code here:
        if (btnReason.isSelected()) {
            populateComboBoxEthnicity(combo1);
            populateComboBoxEducation(combo2);
            populateComboBoxAge(combo3);
            int cg = 0;
            int hg = 0;
            int ue = 0;
            int ot = 0;
            for (Person person : pDirectory.getPersonList()) {
                if (person.getReason().equals("Individual and relational factors")) {
                    cg++;
                } else if (person.getReason().equals("Economic Issues")) {
                    hg++;
                } else if (person.getReason().equals("Systems failures")) {
                    ue++;
                } else if (person.getReason().equals("Others")) {
                    ot++;
                }
            }
            DefaultCategoryDataset dataset = new DefaultCategoryDataset();
            dataset.setValue(cg, "", "Individual and relational factors");
            dataset.setValue(hg, "", "Economic Issues");
            dataset.setValue(ue, "", "Systems failures");
            dataset.setValue(ot, "", "Others");
            populateBarGraph(dataset, panelGraph);

        }
    }//GEN-LAST:event_btnReasonActionPerformed

    private void btnAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgeActionPerformed
        // TODO add your handling code here:
        if (btnAge.isSelected()) {
            populateComboBoxEthnicity(combo1);
            populateComboBoxReasons(combo2);
            populateComboBoxEducation(combo3);
            int cg = 0;
            int hg = 0;
            int ue = 0;
            for (Person person : pDirectory.getPersonList()) {
                if (person.getAge() < 18) {
                    cg++;
                } else if (person.getAge() > 60) {
                    hg++;
                } else {
                    ue++;
                }
            }
            DefaultCategoryDataset dataset = new DefaultCategoryDataset();
            dataset.setValue(cg, "", "Age <18");
            dataset.setValue(ue, "", "18< Age < 60");
            dataset.setValue(hg, "", "Age>60");

            populateBarGraph(dataset, panelGraph);
        }
    }//GEN-LAST:event_btnAgeActionPerformed

    private void combo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo1ActionPerformed
        // TODO add your handling code here:
        if (btnEdu.isSelected()) {
            int cg = 0;
            int hg = 0;
            int ue = 0;
            String ethnic = (String) combo1.getSelectedItem();
            for (Person person : pDirectory.getPersonList()) {
                if (person.getEducationBackground().equals("College Graduate") && person.getEthnicity().equals(ethnic)) {
                    cg++;
                } else if (person.getEducationBackground().equals("HighSchool Graduate") && person.getEthnicity().equals(ethnic)) {
                    hg++;
                } else if (person.getEducationBackground().equals("Uneducated") && person.getEthnicity().equals(ethnic)) {
                    ue++;
                }
            }
            DefaultCategoryDataset dataset1 = new DefaultCategoryDataset();
            dataset1.setValue(cg, "", "College Graduate");
            dataset1.setValue(hg, "", "HighSchool Graduate");
            dataset1.setValue(ue, "", "Uneducated");
            populateBarGraph(dataset1, panelEthnicity);
        } else if (btnEthnicity.isSelected()) {
            int wa = 0;
            int af = 0;
            int as = 0;
            int na = 0;
            int me = 0;
            int ot = 0;
            String edu = (String) combo1.getSelectedItem();
            for (Person person : pDirectory.getPersonList()) {
                if (person.getEthnicity().equals("White American") && person.getEducationBackground().equals(edu)) {
                    wa++;
                } else if (person.getEthnicity().equals("African") && person.getEducationBackground().equals(edu)) {
                    af++;
                } else if (person.getEthnicity().equals("Asian") && person.getEducationBackground().equals(edu)) {
                    as++;
                } else if (person.getEthnicity().equals("Native Hawaiians") && person.getEducationBackground().equals(edu)) {
                    na++;
                } else if (person.getEthnicity().equals("Middle Eastern") && person.getEducationBackground().equals(edu)) {
                    me++;
                } else if (person.getEthnicity().equals("Others") && person.getEducationBackground().equals(edu)) {
                    ot++;
                }

            }
            DefaultCategoryDataset dataset = new DefaultCategoryDataset();
            dataset.setValue(wa, "", "White American");
            dataset.setValue(af, "", "African");
            dataset.setValue(as, "", "Asian");
            dataset.setValue(na, "", "Native Hawaiians");
            dataset.setValue(me, "", "Middle Eastern");
            dataset.setValue(ot, "", "Others");

            populateBarGraph(dataset, panelEthnicity);

        } else if (btnGender.isSelected()) {

            int cg = 0;
            int hg = 0;
            int ue = 0;
            String edu = (String) combo1.getSelectedItem();
            for (Person person : pDirectory.getPersonList()) {
                if (person.getSex().equals("Male") && person.getEducationBackground().equals(edu)) {
                    cg++;
                } else if (person.getSex().equals("Female") && person.getEducationBackground().equals(edu)) {
                    hg++;
                } else if (person.getSex().equals("Others") && person.getEducationBackground().equals(edu)) {
                    ue++;
                }
            }
            DefaultCategoryDataset dataset = new DefaultCategoryDataset();
            dataset.setValue(cg, "", "Male");
            dataset.setValue(hg, "", "Female");
            dataset.setValue(ue, "", "Others");
            populateBarGraph(dataset, panelEthnicity);

        } else if (btnReason.isSelected()) {
            int cg = 0;
            int hg = 0;
            int ue = 0;
            int ot = 0;
            String ethnic = (String) combo1.getSelectedItem();
            for (Person person : pDirectory.getPersonList()) {
                if (person.getReason().equals("Individual and relational factors") && person.getEthnicity().equals(ethnic)) {
                    cg++;
                } else if (person.getReason().equals("Economic Issues") && person.getEthnicity().equals(ethnic)) {
                    hg++;
                } else if (person.getReason().equals("Systems failures") && person.getEthnicity().equals(ethnic)) {
                    ue++;
                } else if (person.getReason().equals("Others") && person.getEthnicity().equals(ethnic)) {
                    ot++;
                }
            }
            DefaultCategoryDataset dataset = new DefaultCategoryDataset();
            dataset.setValue(cg, "", "Individual and relational factors");
            dataset.setValue(hg, "", "Economic Issues");
            dataset.setValue(ue, "", "Systems failures");
            dataset.setValue(ot, "", "Others");
            populateBarGraph(dataset, panelEthnicity);

        } else if (btnAge.isSelected()) {
            int cg = 0;
            int hg = 0;
            int ue = 0;
            String ethnic = (String) combo1.getSelectedItem();
            for (Person person : pDirectory.getPersonList()) {
                if (person.getAge() < 18 && person.getEthnicity().equals(ethnic)) {
                    cg++;
                } else if (person.getAge() > 60 && person.getEthnicity().equals(ethnic)) {
                    hg++;
                } else if (person.getAge() <= 60 && person.getAge() >= 18 && person.getEthnicity().equals(ethnic)) {
                    ue++;
                }
            }
            DefaultCategoryDataset dataset = new DefaultCategoryDataset();
            dataset.setValue(cg, "", "Age <18");
            dataset.setValue(ue, "", "18< Age < 60");
            dataset.setValue(hg, "", "Age>60");

            populateBarGraph(dataset, panelEthnicity);
        }
    }//GEN-LAST:event_combo1ActionPerformed

    private void combo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo2ActionPerformed
        // TODO add your handling code here:
        if (btnEdu.isSelected()) {
            int cg = 0;
            int hg = 0;
            int ue = 0;
            String reason = (String) combo2.getSelectedItem();
            for (Person person : pDirectory.getPersonList()) {
                if (person.getEducationBackground().equals("College Graduate") && person.getReason().equals(reason)) {
                    cg++;
                } else if (person.getEducationBackground().equals("HighSchool Graduate") && person.getReason().equals(reason)) {
                    hg++;
                } else if (person.getEducationBackground().equals("Uneducated") && person.getReason().equals(reason)) {
                    ue++;
                }
            }
            DefaultCategoryDataset dataset2 = new DefaultCategoryDataset();
            dataset2.setValue(cg, "", "College Graduate");
            dataset2.setValue(hg, "", "HighSchool Graduate");
            dataset2.setValue(ue, "", "Uneducated");
            populateBarGraph(dataset2, panelReason);
        } else if (btnEthnicity.isSelected()) {
            int wa = 0;
            int af = 0;
            int as = 0;
            int na = 0;
            int me = 0;
            int ot = 0;
            String edu = (String) combo2.getSelectedItem();
            for (Person person : pDirectory.getPersonList()) {
                if (person.getEthnicity().equals("White American") && person.getReason().equals(edu)) {
                    wa++;
                } else if (person.getEthnicity().equals("African") && person.getReason().equals(edu)) {
                    af++;
                } else if (person.getEthnicity().equals("Asian") && person.getReason().equals(edu)) {
                    as++;
                } else if (person.getEthnicity().equals("Native Hawaiians") && person.getReason().equals(edu)) {
                    na++;
                } else if (person.getEthnicity().equals("Middle Eastern") && person.getReason().equals(edu)) {
                    me++;
                } else if (person.getEthnicity().equals("Others") && person.getReason().equals(edu)) {
                    ot++;
                }

            }
            DefaultCategoryDataset dataset = new DefaultCategoryDataset();
            dataset.setValue(wa, "", "White American");
            dataset.setValue(af, "", "African");
            dataset.setValue(as, "", "Asian");
            dataset.setValue(na, "", "Native Hawaiians");
            dataset.setValue(me, "", "Middle Eastern");
            dataset.setValue(ot, "", "Others");

            populateBarGraph(dataset, panelReason);

        } else if (btnGender.isSelected()) {
            int cg = 0;
            int hg = 0;
            int ue = 0;
            String edu = (String) combo2.getSelectedItem();
            for (Person person : pDirectory.getPersonList()) {
                if (person.getSex().equals("Male") && person.getReason().equals(edu)) {
                    cg++;
                } else if (person.getSex().equals("Female") && person.getReason().equals(edu)) {
                    hg++;
                } else if (person.getSex().equals("Others") && person.getReason().equals(edu)) {
                    ue++;
                }
            }
            DefaultCategoryDataset dataset = new DefaultCategoryDataset();
            dataset.setValue(cg, "", "Male");
            dataset.setValue(hg, "", "Female");
            dataset.setValue(ue, "", "Others");
            populateBarGraph(dataset, panelReason);

        } else if (btnReason.isSelected()) {
            int cg = 0;
            int hg = 0;
            int ue = 0;
            int ot = 0;
            String ethnic = (String) combo2.getSelectedItem();
            for (Person person : pDirectory.getPersonList()) {
                if (person.getReason().equals("Individual and relational factors") && person.getEducationBackground().equals(ethnic)) {
                    cg++;
                } else if (person.getReason().equals("Economic Issues") && person.getEducationBackground().equals(ethnic)) {
                    hg++;
                } else if (person.getReason().equals("Systems failures") && person.getEducationBackground().equals(ethnic)) {
                    ue++;
                } else if (person.getReason().equals("Others") && person.getEducationBackground().equals(ethnic)) {
                    ot++;
                }
            }
            DefaultCategoryDataset dataset = new DefaultCategoryDataset();
            dataset.setValue(cg, "", "Individual and relational factors");
            dataset.setValue(hg, "", "Economic Issues");
            dataset.setValue(ue, "", "Systems failures");
            dataset.setValue(ot, "", "Others");
            populateBarGraph(dataset, panelReason);

        } else if (btnAge.isSelected()) {
            int cg = 0;
            int hg = 0;
            int ue = 0;
            String ethnic = (String) combo2.getSelectedItem();
            for (Person person : pDirectory.getPersonList()) {
                if (person.getAge() < 18 && person.getReason().equals(ethnic)) {
                    cg++;
                } else if (person.getAge() > 60 && person.getReason().equals(ethnic)) {
                    hg++;
                } else if (person.getAge() <= 60 && person.getAge() >= 18 && person.getReason().equals(ethnic)) {
                    ue++;
                }
            }
            DefaultCategoryDataset dataset = new DefaultCategoryDataset();
            dataset.setValue(cg, "", "Age <18");
            dataset.setValue(ue, "", "18< Age < 60");
            dataset.setValue(hg, "", "Age>60");

            populateBarGraph(dataset, panelReason);
        }
    }//GEN-LAST:event_combo2ActionPerformed

    private void combo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo3ActionPerformed
        // TODO add your handling code here:
        if (btnEdu.isSelected()) {
            int cg = 0;
            int hg = 0;
            int ue = 0;
            String age = (String) combo3.getSelectedItem();

            for (Person person : pDirectory.getPersonList()) {
                System.out.println("age" + age);
                if (age != null) {
                    if (age.equals("Age<18")) {
                        if (person.getEducationBackground().equals("College Graduate") && person.getAge() < 18) {
                            cg++;
                        } else if (person.getEducationBackground().equals("HighSchool Graduate") && person.getAge() < 18) {
                            hg++;
                        } else if (person.getEducationBackground().equals("Uneducated") && person.getAge() < 18) {
                            ue++;
                        }
                    } else if (age.equals("Age>60")) {
                        if (person.getEducationBackground().equals("College Graduate") && person.getAge() > 60) {
                            cg++;
                        } else if (person.getEducationBackground().equals("HighSchool Graduate") && person.getAge() > 60) {
                            hg++;
                        } else if (person.getEducationBackground().equals("Uneducated") && person.getAge() > 60) {
                            ue++;
                        }
                    } else {
                        if (person.getEducationBackground().equals("College Graduate") && person.getAge() <= 60 && person.getAge() >= 18) {
                            cg++;
                        } else if (person.getEducationBackground().equals("HighSchool Graduate") && person.getAge() <= 60 && person.getAge() >= 18) {
                            hg++;
                        } else if (person.getEducationBackground().equals("Uneducated") && person.getAge() <= 60 && person.getAge() >= 18) {
                            ue++;
                        }
                    }
                }
            }
            DefaultCategoryDataset dataset3 = new DefaultCategoryDataset();
            dataset3.setValue(cg, "", "College Graduate");
            dataset3.setValue(hg, "", "HighSchool Graduate");
            dataset3.setValue(ue, "", "Uneducated");
            populateBarGraph(dataset3, panelAge);
        } else if (btnEthnicity.isSelected()) {
            int wa = 0;
            int af = 0;
            int as = 0;
            int na = 0;
            int me = 0;
            int ot = 0;
            String edu = (String) combo3.getSelectedItem();
            for (Person person : pDirectory.getPersonList()) {
                System.out.println("ethnicity"+person.getEthnicity());
                if (person.getEthnicity().equals("White American") && person.getSex().equals(edu)) {
                    wa++;
                } else if (person.getEthnicity().equals("African") && person.getSex().equals(edu)) {
                    af++;
                } else if (person.getEthnicity().equals("Asian") && person.getSex().equals(edu)) {
                    as++;
                } else if (person.getEthnicity().equals("Native Hawaiians") && person.getSex().equals(edu)) {
                    na++;
                } else if (person.getEthnicity().equals("Middle Eastern") && person.getSex().equals(edu)) {
                    me++;
                } else if (person.getEthnicity().equals("Others") && person.getSex().equals(edu)) {
                    ot++;
                }

            }
            DefaultCategoryDataset dataset = new DefaultCategoryDataset();
            dataset.setValue(wa, "", "White American");
            dataset.setValue(af, "", "African");
            dataset.setValue(as, "", "Asian");
            dataset.setValue(na, "", "Native Hawaiians");
            dataset.setValue(me, "", "Middle Eastern");
            dataset.setValue(ot, "", "Others");

            populateBarGraph(dataset, panelAge);

        } else if (btnGender.isSelected()) {
            int cg = 0;
            int hg = 0;
            int ue = 0;
            String age = (String) combo3.getSelectedItem();

            for (Person person : pDirectory.getPersonList()) {
                if (age != null) {
                    if (age.equals("Age<18")) {
                        if (person.getSex().equals("Male") && person.getAge() < (18)) {
                            cg++;
                        } else if (person.getSex().equals("Female") && person.getAge() < 18) {
                            hg++;
                        } else if (person.getSex().equals("Others") && person.getAge() < 18) {
                            ue++;
                        }
                    } else if (age.equals("Age>60")) {
                        if (person.getSex().equals("Male") && person.getAge() > (60)) {
                            cg++;
                        } else if (person.getSex().equals("Female") && person.getAge() > 60) {
                            hg++;
                        } else if (person.getSex().equals("Others") && person.getAge() > 60) {
                            ue++;
                        }
                    } else {
                        if (person.getSex().equals("Male") && person.getAge() <= 60 && person.getAge() >= 18) {
                            cg++;
                        } else if (person.getSex().equals("Female") && person.getAge() <= 60 && person.getAge() >= 18) {
                            hg++;
                        } else if (person.getSex().equals("Others") && person.getAge() <= 60 && person.getAge() >= 18) {
                            ue++;
                        }
                    }
                }

            }
            DefaultCategoryDataset dataset = new DefaultCategoryDataset();
            dataset.setValue(cg, "", "Male");
            dataset.setValue(hg, "", "Female");
            dataset.setValue(ue, "", "Others");
            populateBarGraph(dataset, panelAge);
        } else if (btnReason.isSelected()) {
            int cg = 0;
            int hg = 0;
            int ue = 0;
            int ot = 0;
            String age = (String) combo3.getSelectedItem();
            for (Person person : pDirectory.getPersonList()) {
                if (age != null) {
                    if (age.equals("Age<18")) {
                        if (person.getReason().equals("Individual and relational factors") && person.getAge() < 18) {
                            cg++;
                        } else if (person.getReason().equals("Economic Issues") && person.getAge() < 18) {
                            hg++;
                        } else if (person.getReason().equals("Systems failures") && person.getAge() < 18) {
                            ue++;
                        } else if (person.getReason().equals("Others") && person.getAge() < 18) {
                            ot++;
                        }
                    } else if (age.equals("Age>60")) {
                        if (person.getReason().equals("Individual and relational factors") && person.getAge() > 60) {
                            cg++;
                        } else if (person.getReason().equals("Economic Issues") && person.getAge() > 60) {
                            hg++;
                        } else if (person.getReason().equals("Systems failures") && person.getAge() > 60) {
                            ue++;
                        } else if (person.getReason().equals("Others") && person.getAge() > 60) {
                            ot++;
                        }
                    } else {
                        if (person.getReason().equals("Individual and relational factors") && person.getAge() <= 60 && person.getAge() >= 18) {
                            cg++;
                        } else if (person.getReason().equals("Economic Issues") && person.getAge() <= 60 && person.getAge() >= 18) {
                            hg++;
                        } else if (person.getReason().equals("Systems failures") && person.getAge() <= 60 && person.getAge() >= 18) {
                            ue++;
                        } else if (person.getReason().equals("Others") && person.getAge() <= 60 && person.getAge() >= 18) {
                            ot++;
                        }
                    }
                }
            }
            DefaultCategoryDataset dataset = new DefaultCategoryDataset();
            dataset.setValue(cg, "", "Individual and relational factors");
            dataset.setValue(hg, "", "Economic Issues");
            dataset.setValue(ue, "", "Systems failures");
            dataset.setValue(ot, "", "Others");
            populateBarGraph(dataset, panelAge);
        } else if (btnAge.isSelected()) {
            int cg = 0;
            int hg = 0;
            int ue = 0;
            String ethnic = (String) combo3.getSelectedItem();
            for (Person person : pDirectory.getPersonList()) {
                if (person.getAge() < 18 && person.getEducationBackground().equals(ethnic)) {
                    cg++;
                } else if (person.getAge() > 60 && person.getEducationBackground().equals(ethnic)) {
                    hg++;
                } else if (person.getAge() <= 60 && person.getAge() >= 18 && person.getEducationBackground().equals(ethnic)) {
                    ue++;
                }
            }
            DefaultCategoryDataset dataset = new DefaultCategoryDataset();
            dataset.setValue(cg, "", "Age <18");
            dataset.setValue(ue, "", "18< Age < 60");
            dataset.setValue(hg, "", "Age>60");

            populateBarGraph(dataset, panelAge);
        }
    }//GEN-LAST:event_combo3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btnAge;
    private javax.swing.JRadioButton btnEdu;
    private javax.swing.JRadioButton btnEthnicity;
    private javax.swing.JRadioButton btnGender;
    private javax.swing.JRadioButton btnReason;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox combo1;
    private javax.swing.JComboBox combo2;
    private javax.swing.JComboBox combo3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel panelAge;
    private javax.swing.JPanel panelEthnicity;
    private javax.swing.JPanel panelGraph;
    private javax.swing.JPanel panelReason;
    // End of variables declaration//GEN-END:variables
}
