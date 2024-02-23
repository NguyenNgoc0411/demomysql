/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author 2021
 */
public class Category {
    private  int iddong;
    private String tendong;
    public Category(){
        
    }

    public Category(int iddong, String tendong) {
        this.iddong = iddong;
        this.tendong = tendong;
    }

    public int getIddong() {
        return iddong;
    }

    public void setIddong(int iddong) {
        this.iddong = iddong;
    }

    public String getTendong() {
        return tendong;
    }

    public void setTendong(String tendong) {
        this.tendong = tendong;
    }

    @Override
    public String toString() {
        return "Category{" + "iddong=" + iddong + ", tendong=" + tendong + '}';
    }
    
    
}
