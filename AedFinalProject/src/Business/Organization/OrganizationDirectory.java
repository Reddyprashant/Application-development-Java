/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Enterprise.LogisticEnterprise;
import Business.Organization.Organization.Type;

import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type, String name){
        Organization organization = null;
        if (type.getValue().equals(Type.OldAge.getValue())){
            organization = new OldAgeOrganization(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Orphanage.getValue())){
            organization = new OrphanageOrganization(name);
            organizationList.add(organization);
        }
       
        else if (type.getValue().equals(Type.Homeless.getValue())){
            organization = new HomelessOrganization(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.CommonPeople.getValue())){
            organization = new CommonPeopleOrganization(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Disaster.getValue())){
            organization = new DisasterOrganization(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Hospital.getValue())){
            organization = new HospitalOrganization(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Education.getValue())){
            organization = new EducationOrganization(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.NGO.getValue())){
            organization = new NGOOrganization(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.MNC.getValue())){
            organization = new MNCOrganization(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Individuals.getValue())){
            organization = new IndividualOrganization(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Transportation.getValue())){
            organization = new TransportOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Rental.getValue())){
            organization = new RentalOrganization(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.BGV.getValue())){
            organization = new BGVOrganization(name);
            organizationList.add(organization);
        }
 
        return organization;
    }
}