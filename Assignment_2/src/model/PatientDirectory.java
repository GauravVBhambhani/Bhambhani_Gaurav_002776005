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
public class PatientDirectory {
    
    private ArrayList<Patient> patientDatabase;
    
    public PatientDirectory(){
        patientDatabase = new ArrayList<>();
    }

    public ArrayList<Patient> getPatientDatabase() {
        return patientDatabase;
    }

    public void setPatientDatabase(ArrayList<Patient> patientDatabase) {
        this.patientDatabase = patientDatabase;
    }
    
    public Patient addNewPatient(){
        Patient newPatient = new Patient();
        patientDatabase.add(newPatient);
        return newPatient;
    }
    
    public void deletePatient(Patient selectedPatient){
        patientDatabase.remove(selectedPatient);
    }
    
    public void updatePatient(Patient selectedPatient, int index){
        patientDatabase.set(index, selectedPatient);
    }
    
    public ArrayList<Patient> searchPatientName(String key){
        ArrayList<Patient> searchPatientName = new ArrayList();
        for (Patient patient: patientDatabase){
            if (patient.getPatientName().equals(key)){
                if (patient.getPatientName()!= null){
                    searchPatientName.add(patient);
                }
            }
        }
        return searchPatientName;
    }
}
