/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasoopbab5prak;

import tugasprakbab8.simpandata;

/**
 *
 * @author octar
 */
// Mahasiswa class
public class Mahasiswa implements simpandata {
    // Atribut
    public String Nama, Kelas, Matkul, Nim;
    public int Nilai1, nilai2, nilai3, NilaiAkhir, nilairata;

    // Constructor
    public Mahasiswa() {
        // Add any initialization logic if needed
    }

    // Implementing methods from simpandata interface
    @Override
    public void dataNilai1(int Nilai1) {
        this.Nilai1 = Nilai1;
    }

    @Override
    public void datanilai2(int nilai2) {
        this.nilai2 = nilai2;
    }

    @Override
    public void datanilai3(int nilai3) {
        this.nilai3 = nilai3;
    }

    @Override
    public void dataNama(String Nama) {
        this.Nama = Nama;
    }

    @Override
    public void dataNIM(String Nim) {
        this.Nim = Nim;
    }

    @Override
    public void dataKelas(String Kelas) {
        this.Kelas = Kelas;
    }

    @Override
    public void dataMatkul(String Matkul) {
        this.Matkul = Matkul;
    }

    @Override
    public String cetakNim() {
        return Nim;
    }

    @Override
    public String cetakNama() {
        return Nama;
    }

    @Override
    public String cetakKelas() {
        return Kelas;
    }

    @Override
    public String cetakMatkul() {
        return Matkul;
    }

    @Override
    public int total(int nilai1, int nilai2, int nilai3) {
        return nilairata = (nilai1 + nilai2 + nilai3) / 3;
    }

    // Additional method, not part of the interface
    public int Nilairaa() {
        return NilaiAkhir = 0;
    }

    // Additional method, not part of the interface
    public void nilairata() {
        // Provide implementation if needed
    }
}

