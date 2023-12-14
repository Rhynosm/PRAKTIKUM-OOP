/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan6;

/**
 *
 * @author octar
 */
public class Driver_pisces {
    public static void main(String []args){
        Pisces mujair = new Pisces();
        mujair.berat = 1;
        mujair.tinggi = 50;
        mujair.jmlsirip = 4;
        mujair.warna = "silver kombinasi";
        System.out.println(mujair.kelas());
        System.out.println("Berat= "+mujair.berat);
        System.out.println("Tinggi= "+mujair.tinggi);
        System.out.println("Jumalh Sirip= "+mujair.jmlsirip);
        System.out.println("warna= "+mujair.warna);
        System.out.println("Cara Bernafas= "+mujair.bernafas());
        
    }
}
