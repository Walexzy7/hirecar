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
public class Payment {
    String customerId;
    String hiringId;
    double amountPaid;
    double balance;
    
    public void setCustomerId(String customerId){
        this.customerId = customerId;
    }
    public void setHiringId(String hiringId){
        this.hiringId = hiringId;
    }
    public void setAmountPaid(Double amountPaid){
        this.amountPaid = amountPaid;
    }
    public void setBalance(Double balance){
        this.balance = balance;
    }
    public String getCustomerId(){
        return this.customerId;
    }
    public String getHiringId(){
        return this.hiringId;
    }
    public Double getAmountPaid(){
        return this.amountPaid;
    }
    public Double getBalance(){
        return this.balance;
    }
    
}
