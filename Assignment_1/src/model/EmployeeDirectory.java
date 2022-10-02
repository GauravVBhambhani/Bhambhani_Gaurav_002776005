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
        database = new ArrayList<>();
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
    
    
    public ArrayList<Employee> searchEmpName(String key)
    {
        ArrayList<Employee> searchEmpName = new ArrayList();
        for(Employee employee: database)
        {
            if(employee.getEmpName().equals(key))
            {
                if(employee.getEmpName()!=null)
                {
                    searchEmpName.add(employee);
                }
            }
        }
        return searchEmpName;
    }    

    public ArrayList<Employee> searchEmpID(String id)
    {
        ArrayList<Employee> searchEmpID = new ArrayList();
        for(Employee employee: database)
        {
            if(employee.getEmpId().equals(id))
            {
           
                searchEmpID.add(employee);
               
            }
        }
        return searchEmpID;
    }        

    public ArrayList<Employee> searchPosT(String title)
    {
        ArrayList<Employee> searchPosT = new ArrayList();
        for(Employee employee: database)
        {
            if(employee.getEmpPosTitle().equals(title)) {
                searchPosT.add(employee);  
            }
        }
        return searchPosT;
    }        
    
}