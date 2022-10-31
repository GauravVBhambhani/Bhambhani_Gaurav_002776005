/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author gorubhambhani
 */
public class Patient {
    
    private String patientId;
    private String patientPassword;
    
    private Doctor primaryDoctor;
    private Hospital preferredHospital;
    
    private VitalSignHistory vitalSignHistory;
    private EncounterHistory encounterHistory;
    
    public Patient() {
        this.vitalSignHistory = new VitalSignHistory();
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getPatientPassword() {
        return patientPassword;
    }

    public void setPatientPassword(String patientPassword) {
        this.patientPassword = patientPassword;
    }

    public Doctor getPrimaryDoctor() {
        return primaryDoctor;
    }

    public void setPrimaryDoctor(Doctor primaryDoctor) {
        this.primaryDoctor = primaryDoctor;
    }

    public Hospital getPreferredHospital() {
        return preferredHospital;
    }

    public void setPreferredHospital(Hospital preferredHospital) {
        this.preferredHospital = preferredHospital;
    }

    public VitalSignHistory getVitalSignHistory() {
        return vitalSignHistory;
    }

    public void setVitalSignHistory(VitalSignHistory vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }

    public EncounterHistory getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(EncounterHistory encounterHistory) {
        this.encounterHistory = encounterHistory;
    }
    
    public String toString(){
        return String.valueOf(this.patientId);
    }
    
}
