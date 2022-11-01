/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import data.Address;
import data.Gender;
import java.util.Date;

/**
 *
 * @author gorubhambhani
 */
public class Person {
    private String fname; 
    private String lname;
    private int age;
    private Gender gender;
    private House residence; 
    private long cellNumber;
    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    private String password;

    public Person(String fname, String lname, int age, Gender gender, 
            House residence, long cellNumber, String userName, String password) {
        this.fname = fname;
        this.lname = lname;
        this.age = age;
        this.gender = gender;
        this.residence = residence;
        this.cellNumber = cellNumber;
        this.userName = userName;
        this.password = password;
    } 

    
    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public House getResidence() {
        return residence;
    }

    public void setResidence(House residence) {
        this.residence = residence;
    }

    public long getCellNumber() {
        return cellNumber;
    }

    public void setCellNumber(long cellNumber) {
        this.cellNumber = cellNumber;
    }
    
    @Override
    public String toString() {
        return userName;
    }
}
