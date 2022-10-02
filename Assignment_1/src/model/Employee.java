/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author gorubhambhani
 */
public class Employee {
    
    private String empName;
    private String empId;
    private int empAge;
    private String empGender;
    private String empJoinDate;
    private String empLevel;
    private String empTeamInfo;
    private String empPosTitle;
    private String mobile;
    private String email;
    private String empImage;

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

    public String getEmpGender() {
        return empGender;
    }
    
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setEmpGender(String empGender) {
        this.empGender = empGender;
    }

    public String getEmpJoinDate() {
        return empJoinDate;
    }

    public void setEmpJoinDate(String empJoinDate) {
        this.empJoinDate = empJoinDate;
    }

    public String getEmpLevel() {
        return empLevel;
    }

    public void setEmpLevel(String empLevel) {
        this.empLevel = empLevel;
    }

    public String getEmpTeamInfo() {
        return empTeamInfo;
    }

    public void setEmpTeamInfo(String empTeamInfo) {
        this.empTeamInfo = empTeamInfo;
    }

    public String getEmpPosTitle() {
        return empPosTitle;
    }

    public void setEmpPosTitle(String empPosTitle) {
        this.empPosTitle = empPosTitle;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmpImage() {
        return empImage;
    }

    public void setEmpImage(String empImage) {
        this.empImage = new String(empImage);
    }
    
    @Override
    public String toString(){
        return empId;
    }
    
}
