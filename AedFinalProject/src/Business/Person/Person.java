/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Person;

import java.util.Date;


public class Person {
    
    private String personId;
    private Date dateOfBirth;
    private Date dateOfJoining;
    private String name;
    private String reason;
    private static int pCount;
    public Person(){
        dateOfJoining= new Date();
        pCount++;
        personId="PID"+pCount;
      
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public static int getpCount() {
        return pCount;
    }

    public static void setpCount(int pCount) {
        Person.pCount = pCount;
    }
    
    
}
