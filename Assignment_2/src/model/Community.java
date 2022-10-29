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
    
    private String communityName;
//    private HospitalDirectory hospital = new HospitalDirectory();
    private ArrayList<Hospital> hospitalDatabase;

    public Community(){
        communityName = "";
    }
    
    public Community(String community){
        communityName = community;
    }
    
    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    public ArrayList<Hospital> getHospitalDatabase() {
        return hospitalDatabase;
    }

    public void setHospitalDatabase(ArrayList<Hospital> hospitalDatabase) {
        this.hospitalDatabase = hospitalDatabase;
    }

    
}
