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
public class EmployeeDirectory {
    
    private ArrayList<Employee> database;
    
    public EmployeeDirectory(){
        database = new ArrayList<Employee>();
    }

    public ArrayList<Employee> getDatabase() {
        return database;
    }

    public void setDatabase(ArrayList<Employee> database) {
        this.database = database;
    }
    
    public Employee addNewEmployee(){
        Employee newEmployee = new Employee();
        database.add(newEmployee);
        return newEmployee;
    }

}
