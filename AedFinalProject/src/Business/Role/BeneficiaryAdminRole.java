/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
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


/**
 *
 * @author Administrator
 */
public class BeneficiaryAdminRole extends Role{
  
   

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, StateNetwork network, CountryNetwork cNetwork, EcoSystem business) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
      @Override
    public String toString(){
        return RoleType.BeneficiaryAdmin.getValue();
    }
}
