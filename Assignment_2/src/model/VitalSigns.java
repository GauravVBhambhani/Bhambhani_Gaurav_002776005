/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;

/**
 *
 * @author gorubhambhani
 */
public class VitalSigns {
    
    private double temperature;
    private double bloodPressure;
    private int pulse;
    Encounter encounterTimestamp = new Encounter();
    

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodpressure(double bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public int getPulse() {
        return pulse;
    }

    public void setPulse(int pulse) {
        this.pulse = pulse;
    }

    public LocalDate getDate() {
        return encounterTimestamp.getTimestamp();
    }

//    public void setDate(String date) {
//        this.date = date;
//    }
    
    
    
}
