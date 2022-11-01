/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gorubhambhani
 */
public class DoctorDirectory {
    private List<Doctor> doctors;


    public DoctorDirectory() {
        this.doctors = new ArrayList<>();
    }
    
    public List<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(List<Doctor> doctors) {
        this.doctors = doctors;
    }
    
    public void addDoctor(Doctor doctor) {
        this.doctors.add(doctor);
    }
    
}
