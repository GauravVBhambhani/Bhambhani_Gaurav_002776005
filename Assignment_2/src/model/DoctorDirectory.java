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
public class DoctorDirectory {
    
    private ArrayList<Doctor> doctorDatabase;
    
    public DoctorDirectory(){
        doctorDatabase = new ArrayList<>();
    }

    public ArrayList<Doctor> getDoctorDatabase() {
        return doctorDatabase;
    }

    public void setPatientDatabase(ArrayList<Doctor> doctorDatabase) {
        this.doctorDatabase = doctorDatabase;
    }
    
    public Doctor addNewDoctor(){
        Doctor newDoctor = new Doctor();
        doctorDatabase.add(newDoctor);
        return newDoctor;
    }
    
    public void deleteDoctor(Doctor selectedDoctor){
        doctorDatabase.remove(selectedDoctor);
    }
    
    public void updateDoctor(Doctor selectedDoctor, int index){
        doctorDatabase.set(index, selectedDoctor);
    }
    
    public ArrayList<Doctor> searchDoctorId(String key){
        ArrayList<Doctor> searchDoctorId = new ArrayList();
        for (Doctor doctor: doctorDatabase){
            if (doctor.getDoctorId().equals(key)){
                if (doctor.getDoctorId()!= null){
                    searchDoctorId.add(doctor);
                }
            }
        }
        return searchDoctorId;
    }
    
}
