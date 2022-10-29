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
//    private String patientName;
//    private int patientAge;
//    private String patientGender;
//    private String patientMobile;
    private Person patient;
    private String patientUsername;
    private String patientPassword;
    private VitalSigns vitalSigns;
    private EncounterHistory encounterHistory; //?
    
    

    public String getPatientUsername() {
        return patientUsername;
    }

    public void setPatientUsername(String patientUsername) {
        this.patientUsername = patientUsername;
    }

    public String getPatientPassword() {
        return patientPassword;
    }

    public void setPatientPassword(String patientPassword) {
        this.patientPassword = patientPassword;
    }
    
}
