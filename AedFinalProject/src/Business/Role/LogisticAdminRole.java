/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.CountryNetwork;
import Business.Network.StateNetwork;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;

import javax.swing.JPanel;
import userinterface.Beneficiary.BeneficiaryAdminWorkAreaJPanel;
import userinterface.Logistics.LogisticsAdminWorkAreaJPanel;


/**
 *
 * @author raunak
 */
public class LogisticAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, StateNetwork network,CountryNetwork cNetwork, EcoSystem business) {
        return new LogisticsAdminWorkAreaJPanel(userProcessContainer,account,enterprise,network,cNetwork,business);
    }
    
    @Override
    public String toString(){
        return RoleType.LogisticAdmin.getValue();
    }

   
}
