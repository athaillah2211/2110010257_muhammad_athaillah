/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataset;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class dataPelanggan {
  private ArrayList<String> id;
    private ArrayList<String> nm_plg;
    private ArrayList<String> kota_plg;
    private ArrayList<String> alamat_plg;
    private ArrayList<Integer> telepon_plg;   
    
     public dataPelanggan() {
    id = new ArrayList<>();
    nm_plg = new ArrayList<>();
    kota_plg = new ArrayList<>();
    alamat_plg = new ArrayList<>();
    telepon_plg = new ArrayList<>();
}
public void addid(String value){
    this.id.add(value);
}

public ArrayList<String> getDataid(){
    return this.id;
}

public void addNm_plg(String value){
    this.nm_plg.add(value);
}

public ArrayList<String> getDataNm_plg(){
    return this.nm_plg;
}

public void addKota_plg(String value){
    this.kota_plg.add(value);
}

public ArrayList<String> getDataKota_plg(){
    return this.kota_plg;
}

public void addAlamat_plg(String value){
    this.alamat_plg.add(value);
}

public ArrayList<String> getDataAlamat_plg(){
    return this.alamat_plg;
}

public void addTelepon_plg(int value){
    this.telepon_plg.add(value);
}

public ArrayList<Integer> getDataTelepon_plg(){
    return this.telepon_plg;
}
}
