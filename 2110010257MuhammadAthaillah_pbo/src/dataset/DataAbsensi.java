/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataset;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class DataAbsensi {
 private  ArrayList <Integer> IdAbsen;
    private  ArrayList<Integer> IdSiswa;
    private  ArrayList<LocalDate> WktAbsen;
    private  ArrayList<String> KetAbsen;
    
    public DataAbsensi(){
        IdAbsen = new ArrayList<Integer>();
        IdSiswa = new ArrayList<Integer>();
        WktAbsen = new ArrayList<LocalDate>();
        KetAbsen = new ArrayList<String>();        
    }
    
   
    public void insertIdAbsen(int isi){
        this.IdAbsen.add(isi);
    }
    
    public ArrayList<Integer> getRecordIdAbsen(){
        return this.IdAbsen;
    }
    
    //IdTSiswa
    public void insertIdSiswa(int isi){
        this.IdSiswa.add(isi);
    }
    
    public ArrayList<Integer> getRecordIdSiswa(){
        return this.IdSiswa;
    }
    
    //WktAbsen
    public void insertWktAbsen(LocalDate isi){
        this.WktAbsen.add(isi);
    }
    
    public ArrayList<LocalDate> getRecordWktAbsen(){
        return this.WktAbsen;
    }
    
    //KetAbsen
    public void insertKetAbsen(String isi){
        this.KetAbsen.add(isi);
    }
    
    public ArrayList<String> getRecordKetAbsen(){
        return this.KetAbsen;
    }    
}
