/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

import Business.Employee.Employee;
import java.util.ArrayList;
import java.util.Date;

public class PersonDirectory {

    private ArrayList<Person> personList;

    public PersonDirectory() {
        personList = new ArrayList<>();
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }
public Person createperson(String name, Date dateOfBirth, String reason ){
        Person person = new Person();
        person.setName(name);
        person.setDateOfBirth(dateOfBirth);
        person.setReason(reason);

        personList.add(person);
        return person;
    }
}
