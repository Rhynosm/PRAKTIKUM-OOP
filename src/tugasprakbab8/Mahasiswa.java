/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasprakbab8;

import tugasoopbab5prak.*;

/**
 *
 * @author octar
 */
public class Mahasiswa {
        // Atribut
    public String Nama, Kelas, Matkul,Nim;
    public int Nilai1,nilai2,nilai3, NilaiAkhir,nilairata;
    // constructor       
    public void nilairata(){
        this.nilairata = nilairata;
    }
    public int total(int nilai1,int nilai2,int nilai3){
        return nilairata = (nilai1+nilai2+nilai3)/3;
    }
    public int Nilairaa(){
        return NilaiAkhir = 0;
    }
    void dataNilai1(int Nilai1){         
            this.Nilai1 = Nilai1;
    }
    void datanilai2(int nilai2){         
            this.nilai2 = nilai2;
    }
    void datanilai3(int nilai2){         
            this.nilai3 = nilai2;
    }
       void dataNama(String Nama){         
            this.Nama = Nama;
       }
        void dataNIM(String Nim){
        this.Nim = Nim; 
    }
         void dataKelas(String Kelas){
        this.Kelas = Kelas; 
    }
          void dataMatkul(String Matkul){
        this.Matkul = Matkul; 
    }
          String cetakNim(){         
            return Nim; 
    }
        String cetakNama(){         
            return Nama; 
        }
        String cetakKelas(){         
            return Kelas; 
        }
        String cetakMatkul(){         
            return Matkul;
        } 
        int Nilai1(){
            return Nilai1;
        }
        int nilai2(){
            return nilai2;
        }
        int nilai3(){
            return nilai3;
        }
}
