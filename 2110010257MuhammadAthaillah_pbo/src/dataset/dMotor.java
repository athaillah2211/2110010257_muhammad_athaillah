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
public class dMotor {
      private ArrayList<String> id;
    private ArrayList<String> nm_mtr;
    private ArrayList<String> merek_mtr;
    private ArrayList<String> plat_mtr;
    private ArrayList<Integer> harga_sewa;
    
    public dMotor() {
        id= new ArrayList<>();
        nm_mtr= new ArrayList<>();
        merek_mtr= new ArrayList<>();
        plat_mtr= new ArrayList<>();
        harga_sewa= new ArrayList<>();
    }
    public void addid(String value){
        this.id.add(value);
    }
    
    public ArrayList<String> getDataid(){
        return this.id;
    }
    public void addNm_mtr(String value){
        this.nm_mtr.add(value);
    }
    
    public ArrayList<String> getDataNm_mtr(){
        return this.nm_mtr;
    }
    public void addMerek_mtr(String value){
        this.merek_mtr.add(value);
    }
    
    public ArrayList<String> getDataMerek_mtr(){
        return this.merek_mtr;
    }    
    public void addPlat_mtr(String value){
        this.plat_mtr.add(value);
    }
    
    public ArrayList<String> getDataPlat_mtr(){
        return this.plat_mtr;
    } 
    public void addHarga_sewa(int value){
        this.harga_sewa.add(value);
    }
    
    public ArrayList<Integer> getDataHarga_sewa(){
        return this.harga_sewa;
    }     

    public Object getDataId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
}
