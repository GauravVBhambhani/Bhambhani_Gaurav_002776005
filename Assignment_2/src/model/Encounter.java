/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


/**
 *
 * @author gorubhambhani
 */
public class Encounter {
    private String patientId;
    private String doctorId;
    private DateTime datetime;
    
    public Encounter(String patientId, String doctorId, DateTime datetime){
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.datetime = datetime;
    }
    
    public Encounter(){
        this.datetime = new DateTime();
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public DateTime getDatetime() {
        return datetime;
    }

    public void setDatetime(DateTime datetime) {
        this.datetime = datetime;
    }
    
    @Override
    public String toString(){
        return "Encounter[patientId="+patientId+", doctorId="+doctorId+"]";
    }
    
}
