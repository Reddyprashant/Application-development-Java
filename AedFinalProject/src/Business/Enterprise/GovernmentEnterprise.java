/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author raunak
 */
public class GovernmentEnterprise extends Enterprise{

    public GovernmentEnterprise(String name) {
        super(name, EnterpriseType.Government);
    }

    @Override
    public HashSet<Role> getSupportedRole() {
         roles= new HashSet<>();
//        roles.add(new ClinicAdminRole());
        return roles;
    }
    
    
    
}
