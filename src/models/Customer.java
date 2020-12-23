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
public class Customer {
    String firtname;
    String surname;
    String identification;
    String address;
    String occupation;
    String email;
    String phoneNo;
    
    public void setFirstname(String firstname){
        this.firtname = firstname;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public void setIdentification(String identification){
        this.identification = identification;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setOccupation(String occupation){
        this.occupation = occupation;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPhoneNo(String phoneNo){
        this.phoneNo = phoneNo;
    }
    
    public String getFirstname(){
        return this.firtname;
    }
    public String getSurname(){
        return this.surname;
    }
    public String getIdentification(){
        return this.identification;
    }
    public String getAddress(){
        return this.address;
    }
    public String getOccupation(){
        return this.occupation;
    }
    public String getEmail(){
        return this.email;
    }
    public String getPhoneNo(){
        return this.phoneNo;
    }
    
}
