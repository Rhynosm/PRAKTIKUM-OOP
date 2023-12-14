/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasoop3;

/**
 *
 * @author octar
 */
public class Matakuliah {
    String nim,nama,matkul,kelas;
    int nilai1,nilai2,nilai3;
    int nilaiKuis1,nilaiKuis2, nilaiKuis3, nilaiKuis4, NilaiUTS, NilaiUas, NilaiPresentasi;
    
    double nilaiTengahSemester(){
        return ((ratanilai()+ nilaiKuis1+nilaiKuis2+NilaiUTS)/4);
    }
    double nilaiakhir(){
        return((nilaiTengahSemester()*0.1)+((nilaiKuis3+nilaiKuis4+NilaiUas+NilaiPresentasi)/4));
    }
    double hadir(){
        return 0;
    }
    double ratanilai(){
        return((nilai1+nilai2+nilai3)/3);
    }
    
}
