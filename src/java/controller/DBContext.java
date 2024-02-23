/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 2021
 */
public class DBContext {
        protected Connection connection;
         public DBContext(){
             try {
             Class.forName("com.mysql.cj.jdbc.Driver");
             connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/nhom05_atw","root","@Ngoc30121995");
             }
             catch(ClassNotFoundException | SQLException ex){
                 System.out.println("ex");
             }
       
       
        
    }   
      
}
