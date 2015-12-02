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
public class Customer {
    private Integer id_customer;
    private String nama;
    private String alamat;
    private String kota;
    private Integer kode_pos;
    private String telp;
    private String email;
    
    public Customer(){
        
    }
    
    public Integer getId() {
        return id_customer;
    }
    public void setId(Integer id) {
        this.id_customer = id;
    }
    
    public String getNamaCustomer() {
        return nama;
    }
    public void setId(String NamaCustomer) {
        this.nama = NamaCustomer;
    }
    
    public String getAlamat() {
        return alamat;
    }
    public void setAlamat(String Alamat) {
        this.alamat = Alamat;
    }
    
    public String getKota() {
        return kota;
    }
    public void setKota(String Kota) {
        this.kota = Kota;
    }
    
    public Integer getKodePos(){
        return kode_pos;
    }
    public void setKodePos(Integer KodePos){
        this.kode_pos = KodePos;
    }
    
    public String getTelp(){
        return telp;
    }
    public void setTelp(String Telp){
        this.telp = Telp;
    }
    
    public String getEmail(){
        return email;
    }
    public void setEmail(String Email){
        this.email = Email;
    }
    
    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id_customer +
                ", NamaCustomer='" + nama + ", Alamat='" + alamat +", Kota='" + kota +", KodePos='" + kode_pos +
                ", Telp='" + telp +", Email='" + email +
                '}';
    }
}
