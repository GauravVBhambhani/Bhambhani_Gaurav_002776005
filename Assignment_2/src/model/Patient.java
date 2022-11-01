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
public class Patient extends Person {     
    public Patient(String fname, String lname, int age, 
            Gender gender, House residence, long cellNumber, 
            String userName, String password) {
        super(fname, lname, age, gender, residence, cellNumber, userName, password);
    }
    
}
