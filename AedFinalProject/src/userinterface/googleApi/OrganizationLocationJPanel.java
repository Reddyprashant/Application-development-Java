/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.googleApi;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.LatLong;
import Business.Network.CountryNetwork;
import Business.Network.StateNetwork;
import Business.UserAccount.UserAccount;
import com.teamdev.jxbrowser.chromium.Browser;
import com.teamdev.jxbrowser.chromium.swing.BrowserView;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import org.netbeans.lib.awtextra.AbsoluteLayout;
import userinterface.Beneficiary.BeneficiaryManageOrganizationJPanel;
import userinterface.EntityAdmin.Education.EducationRequestAreaJPanel;
import userinterface.EntityAdmin.EntityManageOrganizationJPanel;
import userinterface.Government.GovernmentManageOrganizationJPanel;
import userinterface.Logistics.LogisticsManageOrganizationJPanel;
import userinterface.SignUp.SignUpJPanel;
import utility.googleMap.GoogleMapsSample;

/**
 *
 * @author pooji
 */
public class OrganizationLocationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form HomelessFoundJPanel
     */
    JPanel userProcessContainer;


    final Browser browser;
     BrowserView view;
      LatLong latLong;
    public OrganizationLocationJPanel(JPanel userProcessContainer) {
        initComponents();
        this.userProcessContainer=userProcessContainer;

       // GoogleMapsSample g= new GoogleMapsSample();
         latLong= new LatLong();
             browser = new Browser();
             view = new BrowserView(browser);
            browser.loadURL("https://www.google.com/maps");
//          JPanel frame = new JPanel();
        
           // frame.add(toolBar, BorderLayout.SOUTH);
          //  frame.setSize(900, 500);
            //frame.setLocationRelativeTo(null);
            //frame.setVisible(true);
//            JButton setMarkerButton = new JButton("Set Marker");
//          setMarkerButton.addActionListener(new ActionListener() {
//              public void actionPerformed(ActionEvent e) {
//              
//              }
//                  });
//           frame.add(setMarkerButton);
            this.mapContainer.add(view,"a");
//            this.jPanel1.add(frame,"b");
            this.mapContainer.setVisible(true);
      //  g.returnLatLong(JPanel userProcessContainer,UserAccount account,Enterprise enterprise,StateNetwork state,CountryNetwork country,EcoSystem system);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane2 = new javax.swing.JSplitPane();
        mapContainer = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnLocation = new javax.swing.JButton();

        jSplitPane2.setDividerLocation(800);
        jSplitPane2.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        mapContainer.setLayout(new java.awt.CardLayout());
        jSplitPane2.setTopComponent(mapContainer);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLocation.setText("Set Location");
        btnLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocationActionPerformed(evt);
            }
        });
        jPanel1.add(btnLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, -1, -1));

        jSplitPane2.setRightComponent(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocationActionPerformed
        // TODO add your handling code here:
         if(browser.getURL()!= null){
            
                    System.out.println(browser.getURL());
                    String[] a= browser.getURL().split("!3d",0);
                    String[] b= a[1].split("!4d");
                    System.out.println("Lat"+b[0]+"  "+"Lon"+b[1]);
                    double lat= Double.parseDouble(b[0]);
                    double lon= Double.parseDouble(b[1]);
                    latLong.setLatitude(lat);
                    latLong.setLongitude(lon);
                    }
         System.out.println("Lat"+latLong.getLatitude()+latLong.getLongitude());
         
         userProcessContainer.remove(this);
          Component[] componentArray=userProcessContainer.getComponents();
          if(userProcessContainer.getComponent(componentArray.length -1) instanceof SignUpJPanel){
        SignUpJPanel eduRequestPanel =(SignUpJPanel)userProcessContainer.getComponent(componentArray.length -1);
        eduRequestPanel.populateLatLong(latLong);
          }
          else if(userProcessContainer.getComponent(componentArray.length -1) instanceof BeneficiaryManageOrganizationJPanel){
        BeneficiaryManageOrganizationJPanel eduRequestPanel =(BeneficiaryManageOrganizationJPanel)userProcessContainer.getComponent(componentArray.length -1);
        eduRequestPanel.populateLatLong(latLong);
          }
          else if(userProcessContainer.getComponent(componentArray.length -1) instanceof EntityManageOrganizationJPanel){
        EntityManageOrganizationJPanel eduRequestPanel =(EntityManageOrganizationJPanel)userProcessContainer.getComponent(componentArray.length -1);
        eduRequestPanel.populateLatLong(latLong);
          }
          else if(userProcessContainer.getComponent(componentArray.length -1) instanceof GovernmentManageOrganizationJPanel){
        GovernmentManageOrganizationJPanel eduRequestPanel =(GovernmentManageOrganizationJPanel)userProcessContainer.getComponent(componentArray.length -1);
        eduRequestPanel.populateLatLong(latLong);
          }
          else if(userProcessContainer.getComponent(componentArray.length -1) instanceof GovernmentManageOrganizationJPanel){
        LogisticsManageOrganizationJPanel eduRequestPanel =(LogisticsManageOrganizationJPanel)userProcessContainer.getComponent(componentArray.length -1);
        eduRequestPanel.populateLatLong(latLong);
          }
          
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnLocationActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLocation;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JPanel mapContainer;
    // End of variables declaration//GEN-END:variables
}
