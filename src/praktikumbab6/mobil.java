/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikumbab6;

/**
 *
 * @author octar
 */
public class mobil extends kendaraan{
      int roda;
      String merk;
      String bahanbakar;
      String unik;
      
      public mobil(){
          this.roda=4;
          this.merk="Toyota";
          this.bahanbakar="Pertamax";
          this.unik="Tahan Tabrak";
      }
    @Override
    int jmlroda() {
        return roda;
    }

    @Override
    String Jenis() {
        return merk;
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    String bbm() {
        return bahanbakar;
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    String keunikan() {
        return unik;
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
