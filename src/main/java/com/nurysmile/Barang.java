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
public class Barang {
    private Integer id_barang;
    private String nama_barang;
    private String nama_suplier;
    private Integer harga;
    private Integer barang_rusak;
    private Integer stok;
    
    
    public Barang() {
    }

    public Integer getId() {
        return id_barang;
    }

    public void setId(Integer id) {
        this.id_barang = id;
    }

    public String getNamaBarang() {
        return nama_barang;
    }

    public void setNamaBarang(String NamaBarang) {
        this.nama_barang = NamaBarang;
    }
    
    public String getNamaSuplier(){
        return nama_suplier;
    }
    
    public void setNamaSuplier(String NamaSuplier) {
        this.nama_suplier = NamaSuplier;
    }
    
    
    public Integer getHarga() {
        return harga;
    }

    public void setHarga(Integer Harga) {
        this.harga = Harga;
    }
    
    public Integer getBarangRusak() {
        return barang_rusak;
    }

    public void setBarangRusak(Integer BarangRusak) {
        this.barang_rusak = BarangRusak;
    }
    
    public Integer getStok() {
        return stok;
    }

    public void setStok(Integer Stok) {
        this.stok = Stok;
    }

    @Override
    public String toString() {
        return "Barang{" +
                "id=" + id_barang +
                ", NamaBarang='" + nama_barang + ", NamaSuplier='" + nama_suplier +", Harga='" + harga +
                ", BarangRusak='" + barang_rusak + ", Stok='" + stok +
                '}';
    }
}
