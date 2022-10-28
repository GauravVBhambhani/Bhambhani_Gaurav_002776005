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
public class EncounterHistory {
    
    private ArrayList<VitalSigns> encounterHistory;
    
    public EncounterHistory(){
        this.encounterHistory = new ArrayList<VitalSigns>();
    }

    public ArrayList<VitalSigns> getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(ArrayList<VitalSigns> encounterHistory) {
        this.encounterHistory = encounterHistory;
    }
    
}
