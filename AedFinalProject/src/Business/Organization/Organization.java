/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.Event.EventDirectory;
import Business.Person.PersonDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.HashSet;


public abstract class Organization {
private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter=0;
    public HashSet<Role> roles;
    private PersonDirectory personList;
    private String city;
    private EventDirectory eventDirectory;
    private String address;
    public enum Type{
        OldAge("Oldage Home Organization"),Orphanage("Orphanage Organization"),Homeless("Homeless Shelter Organization"), CommonPeople("Common People Organization"), Disaster("Disaster Recovery Organization"),Hospital("Hospital Organization"),Education("Education Organization"),NGO("NGO Organization"),MNC("MNC Organization"),Individuals("Individuals Organization"),Transportation("Transportation Organization"),Rental("Rental Organization"),BGV("BGV Organization");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
    
       public enum RequestType{
        Education("Education Institution"),Hospital("Hospital"),MNC("MNC"),NGO("NGO"),ANY("ANY");
         
        private String value;
        private RequestType(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    } 

   public Organization(String name, String city, String address) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        roles = new HashSet<>();
        personList= new PersonDirectory();
        eventDirectory= new EventDirectory();
        this.city=city;
        this.address=address;
        ++counter;
    }

    public abstract HashSet<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public PersonDirectory getPersonList() {
        return personList;
    }

    public void setPersonList(PersonDirectory personList) {
        this.personList = personList;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public EventDirectory getEventDirectory() {
        return eventDirectory;
    }

    public void setEventDirectory(EventDirectory eventDirectory) {
        this.eventDirectory = eventDirectory;
    }

    @Override
    public String toString() {
        return name;
    }    
}
