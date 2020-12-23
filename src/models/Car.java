/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author hp
 */
public class Car {
    
    String name;
    String model;
    String make;
    String engineNo;
    String registrationNo;
    String color;
    String year;
    String PlateNo;
    
    public void setName(String name){
        this.name = name;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setMake(String make){
        this.make = make;
    }
    public void setEngineNo(String engineNo){
        this.engineNo = engineNo;
    }
    public void setRegistrationNo(String registrationNo){
        this.registrationNo = registrationNo;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setYear(String year){
        this.year = year;
    }
    public void setPlateNo(String PlateNo){
        this.PlateNo = PlateNo;
    }
    
    public String getName(){
        return this.name;
    }
    public String getModel(){
        return this.model;
    }
    public String getMake(){
        return this.make;
    }
    public String getEngineNo(){
        return this.engineNo;
    }
    public String getRegistrationNo(){
        return this.registrationNo;
    }
    public String getColor(){
        return this.color;
    }
    public String getYear(){
        return this.year;
    }
    public String getPlateNo(){
        return this.PlateNo;
}
}