/*
 * AdminWorkAreaJPanel.java
 *
 * Created on October 10, 2008, 8:50 AM
 */
package userinterface.EcoSystemAdminWorkArea;

import userinterface.CountryAdminWorkAreas.*;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.CountryNetwork;
import Business.Network.StateNetwork;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author raunak
 */
public class SystemAdminWorkAreaJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    EcoSystem system;
    UserAccount account;

    //CountryNetwork cNetwork;
    /**
     * Creates new form AdminWorkAreaJPanel
     */
    public SystemAdminWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.account = account;
        // this.cNetwork=cNetwork;
        populateTree();
    }

    public void populateTree() {

        DefaultTreeModel model = (DefaultTreeModel) JTree.getModel();

        ArrayList<CountryNetwork> cnetworkList = system.getNetworkList();
        ArrayList<StateNetwork> networkList;
        ArrayList<Enterprise> enterpriseList;
        ArrayList<Organization> organizationList;
        CountryNetwork cNetwork;
        StateNetwork network;
        Enterprise enterprise;
        Organization organization;

        DefaultMutableTreeNode networks = new DefaultMutableTreeNode("Networks");
        DefaultMutableTreeNode root = (DefaultMutableTreeNode) model.getRoot();
        root.removeAllChildren();
        root.insert(networks, 0);

        DefaultMutableTreeNode cnetworkNode;
        DefaultMutableTreeNode networkNode;
        DefaultMutableTreeNode enterpriseNode;
        DefaultMutableTreeNode organizationNode;
        for (int h = 0; h < cnetworkList.size(); h++) {
            System.out.println("country"+ cnetworkList.get(h));
            cNetwork = cnetworkList.get(h);
            cnetworkNode = new DefaultMutableTreeNode(cNetwork.getName());
            networks.insert(cnetworkNode, h);

            networkList = cNetwork.getStateList();
            for (int i = 0; i < networkList.size(); i++) {
                System.out.println("state"+ networkList.get(i));
                network = networkList.get(i);
                networkNode = new DefaultMutableTreeNode(network.getName());
                cnetworkNode.insert(networkNode, i);

                enterpriseList = network.getEnterpriseDirectory().getEnterpriseList();

                for (int j = 0; j < enterpriseList.size(); j++) {
                    System.out.println("enterprizse"+ enterpriseList.get(j));
                    enterprise = enterpriseList.get(j);
                    enterpriseNode = new DefaultMutableTreeNode(enterprise.getName());
                    networkNode.insert(enterpriseNode, j);

                    organizationList = enterprise.getOrganizationDirectory().getOrganizationList();
                    for (int k = 0; k < organizationList.size(); k++) {
                        organization = organizationList.get(k);
                        organizationNode = new DefaultMutableTreeNode(organization.getName());
                        enterpriseNode.insert(organizationNode, k);
                    }
                }
            }
        }

        model.reload();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        manageNetworkJButton = new javax.swing.JButton();
        manageAdminJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        selectedNodeJLabel = new javax.swing.JLabel();
        btnRequestArea = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTree = new javax.swing.JTree();

        setLayout(new java.awt.BorderLayout());

        jSplitPane1.setDividerLocation(150);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        manageNetworkJButton.setBackground(new java.awt.Color(71, 79, 112));
        manageNetworkJButton.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        manageNetworkJButton.setForeground(new java.awt.Color(71, 79, 112));
        manageNetworkJButton.setText("Manage Network");
        manageNetworkJButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        manageNetworkJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageNetworkJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(manageNetworkJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 200, 80));

        manageAdminJButton.setBackground(new java.awt.Color(0, 0, 0));
        manageAdminJButton.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        manageAdminJButton.setForeground(new java.awt.Color(71, 79, 112));
        manageAdminJButton.setText("Manage Country Admin");
        manageAdminJButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        manageAdminJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageAdminJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(manageAdminJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 250, 190, 80));

        jLabel1.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(71, 79, 112));
        jLabel1.setText("Selected Node:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, -1, -1));

        selectedNodeJLabel.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 18)); // NOI18N
        selectedNodeJLabel.setForeground(new java.awt.Color(71, 79, 112));
        selectedNodeJLabel.setText("<view_selected_node>");
        jPanel1.add(selectedNodeJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, -1, -1));

        btnRequestArea.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        btnRequestArea.setForeground(new java.awt.Color(71, 79, 112));
        btnRequestArea.setText("Manage Request Catalog");
        btnRequestArea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnRequestArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestAreaActionPerformed(evt);
            }
        });
        jPanel1.add(btnRequestArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 430, 200, 80));

        jSplitPane1.setRightComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(71, 79, 112));

        JTree.setBackground(new java.awt.Color(204, 204, 204));
        JTree.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        JTree.setForeground(new java.awt.Color(71, 79, 112));
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("System");
        JTree.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        JTree.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JTree.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                valueChangedAction(evt);
            }
        });
        jScrollPane1.setViewportView(JTree);

        jPanel2.add(jScrollPane1);

        jSplitPane1.setLeftComponent(jPanel2);

        add(jSplitPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void manageAdminJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageAdminJButtonActionPerformed
        // TODO add your handling code here:
        
        ManageCountryAdminJPanel manageEnterpriseAdminJPanel = new ManageCountryAdminJPanel(userProcessContainer, system);
        userProcessContainer.add("ManageCountryAdminJPanel", manageEnterpriseAdminJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageAdminJButtonActionPerformed

    private void manageNetworkJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageNetworkJButtonActionPerformed
        ManageCountryNetworkJPanel manageNetworkJPanel = new ManageCountryNetworkJPanel(userProcessContainer, system);
        userProcessContainer.add("ManageCountryNetworkJPanel", manageNetworkJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageNetworkJButtonActionPerformed

    private void valueChangedAction(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_valueChangedAction
        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) JTree.getLastSelectedPathComponent();
        if (selectedNode != null) {
            selectedNodeJLabel.setText(selectedNode.toString());
        }

    }//GEN-LAST:event_valueChangedAction

    private void btnRequestAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestAreaActionPerformed
        // TODO add your handling code here:
        SystemAdminRequestAreaJPanel manageNetworkJPanel = new SystemAdminRequestAreaJPanel(userProcessContainer,account, system);
        userProcessContainer.add("SystemAdminRequestAreaJPanel", manageNetworkJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnRequestAreaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTree JTree;
    private javax.swing.JButton btnRequestArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton manageAdminJButton;
    private javax.swing.JButton manageNetworkJButton;
    private javax.swing.JLabel selectedNodeJLabel;
    // End of variables declaration//GEN-END:variables
}
