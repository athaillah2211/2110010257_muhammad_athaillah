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
public class datasetKaryawan {
    private ArrayList <String> nip;
    private ArrayList <String> nama;
    private ArrayList <String> golongan;
    private ArrayList <String> status;
    private ArrayList <Integer> jumanak;
    private ArrayList <Integer> masakerja;
    
 public datasetKaryawan(){ 
   nip = new ArrayList<String>();
   nama = new ArrayList<String>();
   golongan = new ArrayList<String>();
   status = new ArrayList<String>();   
   jumanak = new ArrayList<Integer>();
   masakerja = new ArrayList<Integer>();

 };//contruktor
 public void insertNip(String isi){
     this.nip.add(isi);
 }
   public ArrayList<String> getRecordNip(){
       return this.nip;
   }
   public void insertmasakerja(int isi){
       this.masakerja.add(isi);
   }
   public ArrayList<Integer> getRecordmasakerja(){
       return this.masakerja;
   }
}