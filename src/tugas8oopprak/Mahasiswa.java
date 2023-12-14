/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas8oopprak;


/**
 *
 * @author Lenovo
 */
public class Mahasiswa {
    // Atribut
    public String Nama, Nim, Kelas, Matkul;
    private int Nilai1, Nilai2;

    // Method setter untuk mengisi data buah
    public  void setNilai1(int Nilai1) {
        this.Nilai1 = Nilai1;
    }

    public void setNilai2(int Nilai2) {
        this.Nilai2 = Nilai2;
    }

    // Membuat method getter untuk mengambil nilai atribut
    String getNama() {
        return Nama;
    }

    String getNim() {
        return Nim;
    }

    String getKelas() {
        return Kelas;
    }
    
    String Matkul() {
        return Matkul;
    }
    
    public int getNilai1() {
        return Nilai1;
    }

    public int getNilai2() {
        return Nilai2;
    }
}


