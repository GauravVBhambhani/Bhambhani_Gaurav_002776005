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

public class City {
     private String cityName;
    private List<Community> communities;

    public List<Community> getCommunities() {
        return communities;
    }

    public void setCommunities(List<Community> communities) {
        this.communities = communities;
    }
    
    public City(String c){
        cityName = c;
        communities = new ArrayList<>();
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
      public void addCommunity(Community c){
        communities.add(c);
    }
    
    public void removeCommunity(Community c){
    }
    
    @Override
    public String toString() {
        return cityName;
    }
}
