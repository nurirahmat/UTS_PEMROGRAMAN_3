/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nurysmile;

/**
 *
 * @author Windows 7
 */
public class Suplier {
    private Integer id_suplier;
    private String nama_suplier;
    private String alamat;
    private String telp;
    private String contact;
    
    public Suplier(){
        
    }
    
    public Integer getId() {
        return id_suplier;
    }
    public void setId(Integer id) {
        this.id_suplier = id;
    }
    
    public String getNamaSuplier() {
        return nama_suplier;
    }
    public void setId(String NamaSuplier) {
        this.nama_suplier = NamaSuplier;
    }
    
    public String getAlamat() {
        return alamat;
    }
    public void setAlamat(String Alamat) {
        this.alamat = Alamat;
    }
    
    public String getTelp() {
        return telp;
    }
    public void setTelp(String Telp) {
        this.telp = Telp;
    }
    
    public String getContact(){
        return contact;
    }
    public void setContact(String Contact){
        this.contact = Contact;
    }
    
    @Override
    public String toString() {
        return "Suplier{" +
                "id=" + id_suplier +
                ", NamaSuplier='" + nama_suplier + ", Alamat='" + alamat +", Telp='" + telp +", Contact='" + contact + 
                '}';
    }
}
