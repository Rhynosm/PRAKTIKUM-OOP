/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB1.ClassObject;

/**
 *
 * @author octar
 */
public class main {
    public static void main(String[] args){
        Kendaraan mobil = new Kendaraan();
        mobil.nama = "mobil";
        mobil.warna = "merah";
        mobil.merk = "Toyota";
        System.out.println("Nama Kendaraan : "+ mobil.nama);
        System.out.println("Warna Kendaraan : "+ mobil.warna);
        System.out.println("Merk Kendaraan : "+ mobil.merk);
        System.out.println("Jumlah Roda : "+ mobil.jmlrod(4)+"\n");
        System.out.println("cara kendaraan bergerak: ");
        System.out.println("Saat Maju: ");
        mobil.KendaraanMaju();
        System.out.println("Saat Mundur: ");
        mobil.KendaraanMundur();
        System.out.println("Saat Berhenti : "+ mobil.nama);
        mobil.KendaraanBerhenti();
    }
    
}
