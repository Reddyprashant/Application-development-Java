/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;


import Business.Role.CommonPeopleAdmin;
import Business.Role.DisasterAdmin;
import Business.Role.HomelessAdmin;
import Business.Role.OldAgeAdmin;
import Business.Role.OrphanageAdmin;
import Business.Role.Role;
import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author Administrator
 */
public class BeneficiaryEnterprise extends Enterprise{
    
      public BeneficiaryEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.Beneficiary);
    }

    @Override
    public HashSet<Role> getSupportedRole() {
         roles= new HashSet<>();
       roles.add(new OldAgeAdmin());
        roles.add(new HomelessAdmin());
        roles.add(new CommonPeopleAdmin());
        roles.add(new DisasterAdmin());
        roles.add(new OrphanageAdmin());
        return roles;
    }
}
