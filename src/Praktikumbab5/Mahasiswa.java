/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikumbab5;

/**
 *
 * @author octar
 */
public class Mahasiswa {
    String nim, nama,JenisKelamin, prodi, angkatan,NAkhir;  
    
    void dataNIM(String Nim){
        this.nim = Nim; 
    }
        void dataNama(String Nama){         
            this.nama = Nama;
        }
        void dataJenisKelamin(String JenisKelamin){         
            this.JenisKelamin = JenisKelamin; 
        }
        void dataProdi(String Prodi){         
            this.prodi = Prodi; 
        }
        void dataAngkatan(String angkatan){         
            this.angkatan = angkatan; 
        }
        void dataNAkhir(String NAkhir){         
            this.NAkhir = NAkhir; 
        }
        
        String cetakNIM(){         
            return nim; 
    }
        String cetakNama(){         
            return nama; 
        }
        String cetakJenisKelamin(){         
            return JenisKelamin; 
        }
        String cetakProdi(){         
            return prodi;
        } 
        String cetakAngkatan(){         
            return angkatan;
        } 
        String cetakNAkhir(){         
            return NAkhir;
        } 
}
