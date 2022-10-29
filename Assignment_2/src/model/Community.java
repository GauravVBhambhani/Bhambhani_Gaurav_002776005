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
public class Community {
    
    private String community;
//    private HospitalDirectory hospital = new HospitalDirectory();
    private ArrayList<Hospital> hospitalDatabase;

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public ArrayList<Hospital> getHospitalDatabase() {
        return hospitalDatabase;
    }

    public void setHospitalDatabase(ArrayList<Hospital> hospitalDatabase) {
        this.hospitalDatabase = hospitalDatabase;
    }

    
}
