/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Product;
import com.mysql.cj.jdbc.Driver;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Account;
import model.Category;
import model.user;
import org.apache.tomcat.dbcp.dbcp2.DriverManagerConnectionFactory;

/**
 *
 * @author 2021
 */
public class accountDAO extends  DBContext{

   
   
    public List<Category> getAllCategory() {
        try {
            String query = "select * from category  ";
            
            
            PreparedStatement ps = connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            List<Category> list = new ArrayList<>();
            while (rs.next()) {
                Category a;
                a = new Category(rs.getInt(1), rs.getString(2));
                list.add(a);
            }
            return list;
        } catch (Exception e) {
        }
        return null;
    }

    public Category getCategoryById(int id) {
        try {
            String query = "select * from category where iddong=?";
           
            
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, id);
            
             ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Category c = new Category(rs.getInt(1), rs.getString(2));
                return c;

            }

        } catch (Exception e) {
        }
        return null;
    }

    public List<Product> getProductsById(String cida) {
        List<Product> list = new ArrayList<>();
        try {
            String query = "select tieude,noidung from product  ";
            int cid=Integer.parseInt(cida.substring(0,1));
            if(cid !=0){
                query+=" where cid="+cid;
            }
            if(cida.length()>2){
                query+=cida.substring(1);
            }
            
            
            PreparedStatement ps = connection.prepareStatement(query);
            
            ResultSet rs = ps.executeQuery();
             
            while (rs.next()) {
                Product x = new Product();
                x.setId("1");
                x.setTieude(rs.getString(1));
                x.setNoidung(rs.getString(2));
               

//                Category c = getCategoryById(rs.getInt(4));
//                x.setC(c);
                    x.setC(null);
                list.add(x);

            }
            
        } catch (Exception e) {
        }
        return list;

    }
    public List<Product> getProducts(){
         try {
            String query = "select * from product where 1=1";
            
            
            PreparedStatement ps = connection.prepareStatement(query);
            
            ResultSet rs = ps.executeQuery();
             List<Product> list = new ArrayList<>();
             while (rs.next()) {
                Product x = new Product();
                x.setId(rs.getString(1));
                x.setTieude(rs.getString(2));
                x.setNoidung(rs.getString(3));
               

                Category c = getCategoryById(rs.getInt("cid"));
                x.setC(c);
                list.add(x);

            }
             return list;}
          catch (Exception e) {
        }
        return null;
             
    
    }
    

    public List<Account> searchAccounts(String timkiem) {
        try {
            String query = "select * from user_tb where 1=1 ";
            if (timkiem != null && !timkiem.equals("")) {
                query += " and username like '%" + timkiem + "%'";
            }
            
            PreparedStatement ps = connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            List<Account> list = new ArrayList<>();
            while (rs.next()) {
                Account a;
                a = new Account(rs.getString(1), rs.getString(2));
                list.add(a);
            }
            return list;

        } catch (Exception e) {
            return null;
        }
    }

    
    public user checkUser(String username,String password){
        String sql="select * from user where username=? and password=?";
        try {
            PreparedStatement ps= connection.prepareStatement(sql);
            ps.setString(1,username);
            ps.setString(2, password);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                user u = new user(rs.getString("username"),rs.getString("password"),rs.getInt("roleid"));
                return u;
                
            }
                    
                    }
                     catch (Exception e) {
        }
        return null;
    }
    public List<user> getAllUser() {
        String query ="select * from user ";
        try 
        {
            PreparedStatement ps= connection.prepareStatement(query);
           
            ResultSet rs=ps.executeQuery();
            List<user> u= new ArrayList<>();
            while(rs.next()){
                user us= new user(rs.getString(1),rs.getString(2),rs.getInt(3));
                u.add(us);
            }
            return u;
           
        }catch(Exception e) {
               
                }
        return null;
        
        
    }
    public void delete(String username){
        String query="delete from user where username=?";
        try 
        {PreparedStatement ps= connection.prepareStatement(query);
           ps.setString(1, username);
           ps.executeUpdate();
            
        }catch(SQLException e)
        {
            System.out.println(e);
        }
    }
    
}


