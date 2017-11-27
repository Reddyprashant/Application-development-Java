/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Organization;

import Business.Role.Role;
import java.util.HashSet;


public class EducationOrganization extends  Organization{
    private String name;
    public EducationOrganization(String name, String city) {
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
