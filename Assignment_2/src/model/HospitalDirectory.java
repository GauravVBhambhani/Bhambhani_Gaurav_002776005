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
public class HospitalDirectory {
    
    private ArrayList<Hospital> hospitalDatabase;
    
    public HospitalDirectory(){
        hospitalDatabase = new ArrayList<>();
    }

    public ArrayList<Hospital> getHospitalDatabase() {
        return hospitalDatabase;
    }

    public void setHospitalDatabase(ArrayList<Hospital> hospitalDatabase) {
        this.hospitalDatabase = hospitalDatabase;
    }
    
    public Hospital addNewHospital() {
        Hospital newHospital = new Hospital();
        hospitalDatabase.add(newHospital);
        return newHospital;
    }
    
    public void deleteHospital(Hospital selectedHospital) {
        hospitalDatabase.remove(selectedHospital);
    }
    
    public void updateHospital(Hospital selectedHospital, int index) {
        hospitalDatabase.set(index, selectedHospital);
    }
    
    public ArrayList<Hospital> searchHospital(String key) {
        ArrayList<Hospital> searchHospital = new ArrayList();
        for (Hospital hospital: hospitalDatabase){
            if (hospital.getHospitalName().equals(key)) {
                if (hospital.getHospitalName()!=null){
                    searchHospital.add(hospital);
                }
            }
        }
        return searchHospital;
    }
}
