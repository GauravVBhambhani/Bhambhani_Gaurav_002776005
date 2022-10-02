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

    public void deleteEmployee(Employee selectedEmp) {
        
        database.remove(selectedEmp);
    }
    
    public void updateEmployee(Employee selectedEmp, int index){
        database.set(index, selectedEmp);
        
    }
    
    
    public ArrayList<Employee> searchEmployee(String key)
    {
        ArrayList<Employee> searchEmployee = new ArrayList();
        for(Employee employee: database)
        {
            if(employee.getEmpName().equals(key))
            {
                if(employee.getEmpName()!=null)
                {
                    searchEmployee.add(employee);
                }
            }
        }
        return searchEmployee;
    }    

    public ArrayList<Employee> searchEmployeeID(String key)
    {
        ArrayList<Employee> searchEmployeeID = new ArrayList();
        for(Employee employee: database)
        {
            if(employee.getEmpId().equals(key))
            {
           
                searchEmployeeID.add(employee);
               
            }
        }
        return searchEmployeeID;
    }        

    public ArrayList<Employee> searchPosTitle(String title)
    {
        ArrayList<Employee> searchPosTitle = new ArrayList();
        for(Employee employee: database)
        {
            if(employee.getEmpPosTitle().equals(title)) {
                searchPosTitle.add(employee);  
            }
        }
        return searchPosTitle;
    }        
    
}