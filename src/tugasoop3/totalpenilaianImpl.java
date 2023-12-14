/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasoop3;


public class totalpenilaianImpl extends Matakuliah {
    int nilaiKuis1,nilaiKuis2, nilaiKuis3, nilaiKuis4, NilaiUTS, NilaiUas, NilaiPresentasi;
    
    double nilaiTengahSemester(){
        return ((ratanilai()+ nilaiKuis1+nilaiKuis2+NilaiUTS)/4);
    }
    double nilaiakhir(){
        return((nilaiTengahSemester()*0.2)+((nilaiKuis3+nilaiKuis4+NilaiUas+NilaiPresentasi)/4)/2);
    }
    double hadir(){
        return 0;
    }
}
