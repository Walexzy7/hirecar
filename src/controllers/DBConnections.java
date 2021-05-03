/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.sql.*;
import javax.swing.JOptionPane;
import models.Car;
import models.Customer;
import models.Hiring;
/**
 *
 * @author Ashpot
 */
public class DBConnections {   
    
    private Connection con;
    
    public DBConnections(){
        try {
            
            Class.forName("com.mysql.jdbc.Driver");  
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hirecar", "root", "");                
             
            JOptionPane.showMessageDialog(null, "Connection successful!");
            
        } catch(Exception e){ 
            
            JOptionPane.showMessageDialog(null, "Connection failed!" + e.getMessage());
            
        }  
 
        
    }
    
    public boolean addCar(Car car){
          
        PreparedStatement stmt;
        try {				
                                
            stmt = con.prepareStatement("INSERT into cars(car_id, name, model, make, engine_number, registration_number, color, year, plate_number, date_added) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            stmt.setString(1, String.valueOf(Math.floor(Math.random() * 1000000)));
            stmt.setString(2, car.getName());
            stmt.setString(3, car.getModel());
            stmt.setString(4, car.getMake());
            stmt.setString(5, car.getEngineNo());
            stmt.setString(6, car.getRegistrationNo());
            stmt.setString(7, car.getColor());
            stmt.setString(8, car.getYear());
            stmt.setString(9, car.getPlateNo());
            stmt.setTimestamp(10, new Timestamp(System.currentTimeMillis()));
                                
            stmt.executeUpdate();
            return true;

        } catch(SQLException e ){
                    JOptionPane.showMessageDialog(null, e.toString());
        }
                 
        return false;
    }
    
}
