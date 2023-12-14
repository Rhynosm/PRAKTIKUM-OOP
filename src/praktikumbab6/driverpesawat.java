/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikumbab6;

/**
 *
 * @author octar
 */
public class driverpesawat {
    public static void main(String[]args){
        System.out.println("PESAWAT");
        pesawat pswt = new pesawat();
        System.out.println("------------------------------------------");
        System.out.println("Jenis Pesawat: "+pswt.Jenis());
        System.out.println("Jumlah Roda Pesawat: "+pswt.jmlroda());
        System.out.println("Bahan Bakar Pesawat: "+pswt.bbm());
        System.out.println("Keunikan Pesawat: "+pswt.keunikan());
        System.out.println("------------------------------------------");
    }
}
