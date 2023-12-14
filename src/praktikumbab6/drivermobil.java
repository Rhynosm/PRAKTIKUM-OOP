/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikumbab6;

/**
 *
 * @author octar
 */
public class drivermobil {
    public static void main(String[]args){
        System.out.println("MOBIL");
        mobil mbl = new mobil();
        System.out.println("------------------------------------------");
        System.out.println("Merk Mobil: "+mbl.Jenis());
        System.out.println("Jumlah Roda Mobil: "+mbl.jmlroda());
        System.out.println("Bahan Bakar Mobil: "+mbl.bbm());
        System.out.println("Keunikan Mobil: "+mbl.keunikan());
        System.out.println("------------------------------------------");
    }
    
}
