/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author gorubhambhani
 */
public class VitalSigns {
    
    private double temp;
    private int pulse;
    private int oxygenLevel;
    private long bp;
    
    public VitalSigns() {
        
    }

    public VitalSigns(double temp, int pulse, int oxygenLevel, long bp) {
        this.temp = temp;
        this.pulse = pulse;
        this.oxygenLevel = oxygenLevel;
        this.bp = bp;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public int getPulse() {
        return pulse;
    }

    public void setPulse(int pulse) {
        this.pulse = pulse;
    }

    public int getOxygenLevel() {
        return oxygenLevel;
    }

    public void setOxygenLevel(int oxygenLevel) {
        this.oxygenLevel = oxygenLevel;
    }

    public long getBp() {
        return bp;
    }

    public void setBp(long bp) {
        this.bp = bp;
    }
}
