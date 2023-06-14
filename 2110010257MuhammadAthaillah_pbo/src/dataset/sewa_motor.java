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
public class sewa_motor {
 private ArrayList<String> id_sewa;
    private ArrayList<String> id_mtr;
    private ArrayList<String> lama;
    private ArrayList<Integer> bayar;
    
    public sewa_motor(){
    id_sewa = new ArrayList<>();
    id_mtr = new ArrayList<>();
    lama = new ArrayList<>();
    bayar = new ArrayList<>();
}
    public void addId_sewa(String value){
        this.id_sewa.add(value);
    }
    
    public ArrayList<String> getDataId_sewa(){
        return this.id_sewa;
    }
    public void addId_mtr(String value){
        this.id_mtr.add(value);
    }
    
    public ArrayList<String> getId_mtr(){
        return this.id_mtr;
    }
    public void addLama(String value){
        this.lama.add(value);
    }
    
    public ArrayList<String> getDataLama(){
        return this.lama;
    }    
    public void addBayar(int value){
        this.bayar.add(value);
    }
    
    public ArrayList<Integer> getDataBayar(){
        return this.bayar;
    } 
}
