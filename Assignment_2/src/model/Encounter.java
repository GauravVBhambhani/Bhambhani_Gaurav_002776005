/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;


/**
 *
 * @author gorubhambhani
 */
public class Encounter {
    private VitalSigns vitalSign;
    private String diagnosis;
    private Date date;
    private String time;
    private double encId;
    private String doctorId;
    private String patientId;

    public Encounter(VitalSigns vitalSign, String diagnosis, String time,
            Date date, double encId, String doctorId, String patientId) {
        this.vitalSign = vitalSign;
        this.diagnosis = diagnosis;
        this.date = date;
        this.encId = encId;
        this.doctorId = doctorId;
        this.patientId = patientId;
        this.time = time;
    }

    public VitalSigns getVitalSign() {
        return vitalSign;
    }

    public void setVitalSign(VitalSigns vitalSign) {
        this.vitalSign = vitalSign;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public double getEncId() {
        return encId;
    }

    public void setEncId(double encId) {
        this.encId = encId;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return String.valueOf(encId);
    }
}
