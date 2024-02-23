package model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 2021
 */
public class Product {
    private String id;
    private String tieude,noidung;
    private Category c;
    public Product(){
        
    }

    public Product(String id, String tieude, String noidung, Category c) {
        this.id = id;
        this.tieude = tieude;
        this.noidung = noidung;
        this.c = c;
    }

    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTieude() {
        return tieude;
    }

    public void setTieude(String tieude) {
        this.tieude = tieude;
    }

    public String getNoidung() {
        return noidung;
    }

    public void setNoidung(String noidung) {
        this.noidung = noidung;
    }

    public Category getC() {
        return c;
    }

    public void setC(Category c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", tieude=" + tieude + ", noidung=" + noidung + ", c=" + c + '}';
    }
    
    
            
    
}
