/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import com.sun.jdi.connect.spi.Connection;
import java.util.List;
import model.Account;
import model.Category;
import model.Product;
import model.user;

/**
 *
 * @author 2021
 */
public class main {
     public static void main(String[] args) {
        accountDAO accountDAO = new accountDAO();
        List<Category> c= accountDAO.getAllCategory();
        for(Category d:c){
            System.out.println(d);
        }
         
        List<user> list = accountDAO.getAllUser();
        for (user a:list){
            System.out.println(a);
        }
        
       
    }
    
}
