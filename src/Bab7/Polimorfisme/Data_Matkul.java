/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab7.Polimorfisme;

/**
 *
 * @author Edwar Arliman Gea
 */
public class Data_Matkul {
    String kode_mk;
    String nama_mk;
    String dosen_pengampu;
    int jml_sks;
    
    // Konstruktor untuk menginisialisasi nilai
    public Data_Matkul() {
        this.kode_mk = "124567";
        this.nama_mk = "ZUMBA-ALIF";
        this.dosen_pengampu = "ARYAK";
        this.jml_sks = 60;
    }
    
    public static void main(String[] args) {
        Data_Matkul matkul = new Data_Matkul();
        System.out.println("Kode MK: " + matkul.kode_mk);
        System.out.println("Nama MK: " + matkul.nama_mk);
        System.out.println("Dosen Pengampu: " + matkul.dosen_pengampu);
        System.out.println("Jumlah SKS: " + matkul.jml_sks);
    }
}
