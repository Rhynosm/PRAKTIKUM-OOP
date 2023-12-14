/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikumbab6;

/**
 *
 * @author octar
 */
public class pesawat extends kendaraan {
int roda;
String merk;
String bakar;
String unik;
String maskapai;

public pesawat(){
          this.roda=3;
          this.merk="BOEING-353"+" "+"Garuda Airlines";
          this.bakar="Avtur";
          this.unik="Bisa Terbang";
      }
    @Override
    int jmlroda() {
        return roda;
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    String Jenis() {
        return merk + maskapai;
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    String bbm() {
        return bakar;
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    String keunikan() {
        return unik;
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
