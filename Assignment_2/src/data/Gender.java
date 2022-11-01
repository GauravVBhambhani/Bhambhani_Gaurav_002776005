/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author gorubhambhani
 */
public enum Gender 
{
    
    M("Male"),
    F("Female"),
    OTHERS("Others");
    
    
private final String name;
  private Gender(String name)
   {
     this.name=name;
    }

  public String getName()
  {
   return this.name;
   }
    
}
