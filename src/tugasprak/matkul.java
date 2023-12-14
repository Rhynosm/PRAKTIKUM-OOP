/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasprak;

/**
 *
 * @author octar
 */
public class matkul {
        // Atribut
    String matkul, materi, kelas,sks, pertemuan;
    //method
    void setmatkul(String matkul) {
        this.matkul = matkul;
    }
    void setmateri(String materi) {
        this.materi = materi;
    }
    void setkelas(String Kelas) {
        this.kelas = Kelas;
    }
     void setsks(String sks) {
        this.sks = sks;
     }    
    void setpertemuan(String pertemuan) {
        this.pertemuan = pertemuan;
    }
    String getmatkul() {
        return matkul;
    }
    String getmateri() {
        return materi;
    }
    
    String getkelas() {
        return kelas;
    }
     String getsks() {
        return sks;
    }
    String getpertemuan() {
        return pertemuan;
    }
// konstruktor
    public matkul(String matkul, String materi, String kelas, String sks, String pertemuan) {
        this.matkul = matkul;
        this.materi = materi;
        this.kelas = kelas;
        this.sks = sks;
        this.pertemuan = pertemuan;
    }

    
}
