/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import data.Gender;

/**
 *
 * @author gorubhambhani
 */
public class Doctor extends Person {
    private String hospitalName;
    
    public Doctor(String fname, String lname, int age, 
            Gender gender, House residence, long cellNumber, 
            String userName, String password, String hospitalName) {
        super(fname, lname, age, gender, residence, cellNumber, userName, password);
        this.hospitalName = hospitalName;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }
    
    
    
}