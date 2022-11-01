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
public class CityDirectory {
    private List<City> cities;
    
    public CityDirectory() {
        cities = new ArrayList<>();
        City city = new City("New York");
        city.addCommunity(new Community("Harlem"));
        
        City city1 = new City("California");
        city1.addCommunity(new Community("Los Angeles"));
        
        City city2 = new City("Boston");
        
        cities.add(city);
        cities.add(city1);
        cities.add(city2);
    }
    
    public void setCities(List<City> cities) {
        this.cities = cities;
    }
    
    public List<City> getCities() {
        return cities;
    }
    
    public void addCity(City city) {
        this.cities.add(city);
    }
}
