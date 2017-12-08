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
    PersonDirectory pDirectory= new PersonDirectory();
    public GovAnalyticsJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, StateNetwork network,CountryNetwork cNetwork, EcoSystem business) {
        initComponents();
     this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
         this.system=business;
        this.state=network;
        this.country=cNetwork;
        this.account=account;
        populatePersonDirectory();
    }
 public void populatePersonDirectory() {
       for (StateNetwork stateNetwork : country.getStateList()) {
           for (Enterprise enterprise1 : stateNetwork.getEnterpriseDirectory().getEnterpriseList()) {
               if(enterprise1 instanceof BeneficiaryEnterprise){
               for (Organization organization : enterprise1.getOrganizationDirectory().getOrganizationList()) {
                   if(organization.getPersonList() != null){
                       for (Person person : organization.getPersonList().getPersonList()) {
                           pDirectory.getPersonList().add(person);
                       }
                   }
               }
           }
           }
     }
       System.out.println("Total number of people: "+pDirectory.getPersonList().size());
    }
 public void populateBarGraph(DefaultCategoryDataset dataset){
    
        
        JFreeChart barChart = ChartFactory.createBarChart(
         "Bar Graph",           
         "Category",            
         "No Of People",            
         dataset,          
         PlotOrientation.VERTICAL,           
         true, true, true);
         
      ChartPanel chartPanel = new ChartPanel( barChart );        
      panelGraph.removeAll();
      panelGraph.add(chartPanel, BorderLayout.CENTER);
      panelGraph.validate();
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
        btnBar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        panelGraph = new javax.swing.JPanel();
        btnAge = new javax.swing.JRadioButton();
        btnReason = new javax.swing.JRadioButton();
        btnGender = new javax.swing.JRadioButton();
        btnEthnicity = new javax.swing.JRadioButton();
        btnEdu = new javax.swing.JRadioButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBar.setText("Bar Graph");
        btnBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBarActionPerformed(evt);
            }
        });
        add(btnBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 520, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("People Analysis");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 14, 190, -1));
        add(panelGraph, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 780, 400));

        buttonGroup1.add(btnAge);
        btnAge.setText("Age");
        btnAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgeActionPerformed(evt);
            }
        });
        add(btnAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 50, -1, -1));

        buttonGroup1.add(btnReason);
        btnReason.setText("Reason");
        btnReason.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReasonActionPerformed(evt);
            }
        });
        add(btnReason, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 50, -1, -1));

        buttonGroup1.add(btnGender);
        btnGender.setText("Gender");
        btnGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenderActionPerformed(evt);
            }
        });
        add(btnGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, -1, -1));

        buttonGroup1.add(btnEthnicity);
        btnEthnicity.setText("Ethnicity");
        btnEthnicity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEthnicityActionPerformed(evt);
            }
        });
        add(btnEthnicity, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, -1, -1));

        buttonGroup1.add(btnEdu);
        btnEdu.setText("Education");
        btnEdu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEduActionPerformed(evt);
            }
        });
        add(btnEdu, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBarActionPerformed
        // TODO add your handling code here:
        
      
    }//GEN-LAST:event_btnBarActionPerformed

    private void btnEthnicityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEthnicityActionPerformed
        // TODO add your handling code here:
         if(btnEthnicity.isSelected()){
            int wa=0;
            int af=0;
            int as=0;
             int na=0;
            int me=0;
            int ot=0;
            
            for (Person person : pDirectory.getPersonList()) {
                if(person.getEthnicity().equals("White American")){
                    wa++;
                }
                else if(person.getEthnicity().equals("African")){
                    af++;
                }
                 else if(person.getEthnicity().equals("Asian")){
                    as++;
                }
                else if(person.getEthnicity().equals("Native Hawaiians")){
                    na++;
                }
                else if(person.getEthnicity().equals("Middle Eastern")){
                    me++;
                }
                else if(person.getEthnicity().equals("Others")){
                    ot++;
                }
                
            }
             DefaultCategoryDataset dataset= new DefaultCategoryDataset();
        dataset.setValue(wa,"","White American");
        dataset.setValue(af,"","African");
         dataset.setValue(as,"","Asian");
         dataset.setValue(na,"","Native Hawaiians");
         dataset.setValue(me,"","Middle Eastern");
         dataset.setValue(ot,"","Others");
         
            populateBarGraph(dataset);
             
               
        }
    }//GEN-LAST:event_btnEthnicityActionPerformed

    private void btnEduActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEduActionPerformed
        // TODO add your handling code here:
         if(btnEdu.isSelected()){
            int cg=0;
            int hg=0;
            int ue=0;
            for (Person person : pDirectory.getPersonList()) {
                if(person.getEducationBackground().equals("College Graduate")){
                    cg++;
                }
                else if(person.getEducationBackground().equals("HighSchool Graduate")){
                    hg++;
                }
                 else if(person.getEducationBackground().equals("Uneducated")){
                    ue++;
                }
            }
             DefaultCategoryDataset dataset= new DefaultCategoryDataset();
        dataset.setValue(cg,"","College Graduate");
        dataset.setValue(hg,"","HighSchool Graduate");
         dataset.setValue(ue,"","Uneducated");
            populateBarGraph(dataset);
             
               
        }
    }//GEN-LAST:event_btnEduActionPerformed

    private void btnGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenderActionPerformed
        // TODO add your handling code here:
          if(btnGender.isSelected()){
            int cg=0;
            int hg=0;
            int ue=0;
            for (Person person : pDirectory.getPersonList()) {
                if(person.getSex().equals("Male")){
                    cg++;
                }
                else if(person.getSex().equals("Female")){
                    hg++;
                }
                 else if(person.getSex().equals("Others")){
                    ue++;
                }
            }
             DefaultCategoryDataset dataset= new DefaultCategoryDataset();
        dataset.setValue(cg,"","Male");
        dataset.setValue(hg,"","Female");
         dataset.setValue(ue,"","Others");
            populateBarGraph(dataset);
             
               
        }
    }//GEN-LAST:event_btnGenderActionPerformed

    private void btnReasonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReasonActionPerformed
        // TODO add your handling code here:
           if(btnReason.isSelected()){
            int cg=0;
            int hg=0;
            int ue=0;
            int ot=0;
            for (Person person : pDirectory.getPersonList()) {
                if(person.getReason().equals("Individual and relational factors")){
                    cg++;
                }
                else if(person.getReason().equals("Economic Issues")){
                    hg++;
                }
                 else if(person.getReason().equals("Systems failures")){
                    ue++;
                }
                 else if(person.getReason().equals("Others")){
                    ot++;
                }
            }
             DefaultCategoryDataset dataset= new DefaultCategoryDataset();
        dataset.setValue(cg,"","Individual and relational factors");
        dataset.setValue(hg,"","Economic Issues");
         dataset.setValue(ue,"","Systems failures");
          dataset.setValue(ue,"","Others");
            populateBarGraph(dataset);
             
               
        }
    }//GEN-LAST:event_btnReasonActionPerformed

    private void btnAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgeActionPerformed
        // TODO add your handling code here:
         if(btnAge.isSelected()){
            int cg=0;
            int hg=0;
            int ue=0;
            for (Person person : pDirectory.getPersonList()) {
                if(person.getAge()< 18){
                    cg++;
                }
                else if(person.getAge() > 60){
                    hg++;
                }
                 else {
                    ue++;
                }
            }
        DefaultCategoryDataset dataset= new DefaultCategoryDataset();
        dataset.setValue(cg,"","Age <18");
        dataset.setValue(ue,"","18< Age < 60");
        dataset.setValue(hg,"","Age>60");
         
        populateBarGraph(dataset);
             
               
        }
    }//GEN-LAST:event_btnAgeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btnAge;
    private javax.swing.JButton btnBar;
    private javax.swing.JRadioButton btnEdu;
    private javax.swing.JRadioButton btnEthnicity;
    private javax.swing.JRadioButton btnGender;
    private javax.swing.JRadioButton btnReason;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel panelGraph;
    // End of variables declaration//GEN-END:variables
}
