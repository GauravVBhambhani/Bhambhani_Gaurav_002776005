/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author gorubhambhani
 */
public class DateTime {
    static int day, month, year, hr, min, sec;
    
    public DateTime(){
        day = 0;
        month = 0;
        year = 0;
        hr = 0;
        min = 0;
        sec = 0;
    }
    
    public DateTime(int mm, int dd, int yyyy, int hr, int min, int sec){
        this.hr = hr;
        this.min = min;
        this.sec = sec;
        day = dd;
        month = mm;
        year = yyyy;
    }

    public static int getDay() {
        return day;
    }

    public static void setDay(int day) {
        DateTime.day = day;
    }

    public static int getMonth() {
        return month;
    }

    public static void setMonth(int month) {
        DateTime.month = month;
    }

    public static int getYear() {
        return year;
    }

    public static void setYear(int year) {
        DateTime.year = year;
    }

    public static int getHr() {
        return hr;
    }

    public static void setHr(int hr) {
        DateTime.hr = hr;
    }

    public static int getMin() {
        return min;
    }

    public static void setMin(int min) {
        DateTime.min = min;
    }

    public static int getSec() {
        return sec;
    }

    public static void setSec(int sec) {
        DateTime.sec = sec;
    }
    
    public static String toString(int i){
        return ""+i;
    }
}
