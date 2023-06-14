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
public class dskaryawan {
     private ArrayList<String> id_karyawan;    
    private ArrayList<String> nm_karyawan;
    private ArrayList<String> nik;
    private ArrayList<String> tempat_lahir;
    private ArrayList<String> alamat;
    private ArrayList<String> telp;
    
    public dskaryawan(){
        id_karyawan = new ArrayList<>();
        nm_karyawan = new ArrayList<>();
        nik = new ArrayList<>();
        tempat_lahir = new ArrayList<>();
        alamat = new ArrayList<>();
        telp = new ArrayList<>();
    }
public void addId_karyawan(String value){
    this.id_karyawan.add(value);
}

public ArrayList<String> getDataId_karyawan(){
    return this.id_karyawan;
}

public void addNm_karyawan(String value){
    this.nm_karyawan.add(value);
}

public ArrayList<String> getDataNm_karyawan(){
    return this.nm_karyawan;
}

public void addNik(String value){
    this.nik.add(value);
}

public ArrayList<String> getDataNik(){
    return this.nik;
}

public void addTempat_lahir(String value){
    this.tempat_lahir.add(value);
}

public ArrayList<String> getDataTempat_lahir(){
    return this.tempat_lahir;
}

public void addAlamat(String value){
    this.alamat.add(value);
}

public ArrayList<String> getDataAlamat(){
    return this.alamat;
}

public void addTelp(String value){
    this.telp.add(value);
}

public ArrayList<String> getDataTelp(){
    return this.telp;
}
}
