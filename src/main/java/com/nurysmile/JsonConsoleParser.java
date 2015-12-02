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
import com.google.gson.Gson;
import java.util.List;

public class JsonConsoleParser {

    public static void main(String[] args) {
        String json = "";
        BarangList brList  =new Gson().fromJson(json, BarangList.class);
        for(Barang st: brList.getBarangList()){
            System.out.println(st);
        }
        
        SuplierList spList  =new Gson().fromJson(json, SuplierList.class);
        for(Suplier sp: spList.getSuplierList()){
            System.out.println(sp);
        }
        
        CustomerList ctList  =new Gson().fromJson(json, CustomerList.class);
        for(Customer ct: ctList.getCustomerList()){
            System.out.println(ct);
        }
    }
}

class BarangList{
    private List<Barang> barangList;
    public List<Barang> getBarangList() {
        return barangList;
    }
    
    public void setBarangList(List<Barang> barangList) {
        this.barangList = barangList;
    }
}

class SuplierList{
    private List<Suplier> suplierList;
    public List<Suplier> getSuplierList() {
        return suplierList;
    }
    
    public void setSuplierList(List<Suplier> suplierList) {
        this.suplierList = suplierList;
    }
}

class CustomerList{
    private List<Customer> customerList;
    public List<Customer> getCustomerList() {
        return customerList;
    }
    
    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }
}