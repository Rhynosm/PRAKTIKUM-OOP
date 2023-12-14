/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tugasprakbab8;

/**
 *
 * @author octar
 */
// simpandata interface
public interface simpandata {
    void dataNilai1(int Nilai1);
    void datanilai2(int nilai2);
    void datanilai3(int nilai3);
    void dataNama(String Nama);
    void dataNIM(String Nim);
    void dataKelas(String Kelas);
    void dataMatkul(String Matkul);
    String cetakNim();
    String cetakNama();
    String cetakKelas();
    String cetakMatkul();
    int total(int nilai1, int nilai2, int nilai3);
}

