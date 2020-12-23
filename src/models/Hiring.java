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
public class Hiring {
    String hiringID;
    String customerID;
    String carID;
    String duration;
    double unitHiringCost;
    double totalPrice;
    
    public void setHiringID(String hiringID){
        this.hiringID = hiringID;
    }
    public void setCustomerID(String customerID){
        this.customerID = customerID;
    }
    public void setCarID(String carID){
        this.carID = carID;
    }
    public void setDuration(String duration){
        this.duration = duration;
    }
    public void setUnitHiringCost(double unitHiringCost){
        this.unitHiringCost = unitHiringCost;
    }
    public void setTotalPrice(double totalPrice){
        this.totalPrice = totalPrice;
    }
    
    public String getHiringID(){
        return this.hiringID;
    }
    public String getCustomerID(){
        return this.customerID;
    }
    public String getCarID(){
        return this.carID;
    }
    public String getDuration(){
        return this.duration;
    }
    public double getUnitHiringCost(){
        return this.unitHiringCost;
    }
    public double getTotalPrice(){
        return this.totalPrice;
    }
    
    
}
