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
public class Staff {
    String firstname;
    String surname;
    String staffID;
    String address;
    String phoneNo;
    String sex;
    
   public void setFirstname(String firstname){
       this.firstname = firstname;
   }
   public void setSurname(String surname){
       this.surname = surname;
   }
   public void setStaffID(String staffID){
       this.staffID = staffID;
   }
   public void setAddress(String address){
       this.address = address;
   }
   public void setPhoneNo(String phoneNo){
       this.phoneNo = phoneNo;
   }
   public void setSex(String sex){
       this.sex = sex;
   }
   
   public String getFirstname(){
       return this.firstname;
   }
   public String getSurname(){
       return this.surname;
   }
   public String getStaffID(){
       return this.staffID;
   }
   public String getaddress(){
       return this.address;
   }
   public String getPhoneNo(){
       return this.phoneNo;
   }
   public String getSex(){
       return this.sex;
   }
}
