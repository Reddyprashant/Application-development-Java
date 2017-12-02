/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Organization;

import Business.Role.HomelessAdmin;
import Business.Role.OldAgeAdmin;
import Business.Role.Role;
import java.util.HashSet;


public class OldAgeOrganization extends Organization{
    private String name;
    public OldAgeOrganization(String name, String city) {
        super(name,city);
        this.name=name;
    }
     public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public HashSet<Role> getSupportedRole() {
        roles= new HashSet<>();
        roles.add(new OldAgeAdmin()); 
        return roles;
    }

}
