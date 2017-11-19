/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author Administrator
 */
public class LogisticEnterprise extends Enterprise{
      public LogisticEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.Logistic);
    }

    @Override
    public HashSet<Role> getSupportedRole() {
         roles= new HashSet<>();
       // roles.add(new CDCManagerRole());
        return roles;
    }
}
