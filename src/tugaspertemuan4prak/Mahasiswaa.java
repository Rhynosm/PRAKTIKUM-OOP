/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspertemuan4prak;

/**
 *
 * @author octar
 */
public class Mahasiswaa {
    // Atribut
    public String nama, kelas, matkul;
    public int nilai1,nilai2,nilai3, nilai4;
    private int nim;

    // Method setter untuk mengisi data buah
    public  void setnim(int nim) {
        this.nim = nim;
    }
    public  void setnilai1(int nilai1) {
        this.nilai1 = nilai1;
    }
    public  void setnilai2(int nilai2) {
        this.nilai2 = nilai2;
    }
    public  void setnilai3(int nilai3) {
        this.nilai3 = nilai3;
    }
    public  void setnilai4(int nilai4) {
        this.nilai4 = nilai4;
    }

    // Membuat method getter untuk mengambil nilai atribut
    String getnama() {
        return nama;
    }

    String getkelas() {
        return kelas;
    }

    String getmatkul() {
        return matkul;
    }
    
    public int getnim() {
        return nim;
    }
    int getnilai1(){
        return nilai1;
    }
    int getnilai2(){
        return nilai2;
    }
    int getnilai3(){
        return nilai3;
    }
    int getnilai4(){
        return nilai4;
    }
}

    
    

