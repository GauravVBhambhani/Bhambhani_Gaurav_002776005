/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.ArrayList;
/**
 *
 * @author gorubhambhani
 */
public class PersonDirectory {
    
    private ArrayList<Person> persons;

    public PersonDirectory() {
        persons = new ArrayList<>();
    }

    public void addPerson(Person person){
        persons.add(person);
    }
    
    
    public void removePerson(Person person){
        persons.add(person);
    }


    public ArrayList<Person> getPersons() {
        return persons;
    }

    public void setPersons(ArrayList<Person> persons) {
        this.persons = persons;
    }
}
