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
public class VitalSignHistory {
    
    private ArrayList<VitalSigns> history;
    
    public VitalSignHistory() {
        history = new ArrayList<>();
    }
    
    public ArrayList<VitalSigns> getHistory() {
        return history;
    }
    
    public void setHistory(ArrayList<VitalSigns> history) {
        this.history = history;
    }
    
    public VitalSigns createAndAddVitalSign() {
        VitalSigns vitalSign = new VitalSigns();
        history.add(vitalSign);
        return vitalSign;
    }
    
    public void deleteVitalSign(VitalSigns vitalSign) {
        history.remove(vitalSign);
    }
}
