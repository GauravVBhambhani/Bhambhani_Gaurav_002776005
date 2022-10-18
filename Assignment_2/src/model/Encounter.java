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
public class Encounter {
    LocalDate timestamp;

    public LocalDate getTimestamp() {
        this.timestamp = LocalDate.now();
        return timestamp;
    }
    
}
