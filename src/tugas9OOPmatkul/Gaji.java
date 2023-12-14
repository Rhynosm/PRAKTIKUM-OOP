/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas9OOPmatkul;


/**
 *
 * @author lenovo
 */
public class Gaji {
    int Gajipokok;
    int Kehadiran;
    int Lembur;
    int Total;
    public Gaji() {
        Gajipokok = 3200000;
        Kehadiran = 25000;
        Lembur = 60000;
    }
    int Gaji() {
        Total = Gajipokok;
        return Total;
    }
    int Gaji(int jmlHadir) {
        Total = Gajipokok + (jmlHadir * Kehadiran);
        return Total;
    }
    int Gaji(int jmlHadir, int jmllembur) {
        Total = Gajipokok + (jmlHadir * Kehadiran) + (jmllembur * Lembur);
        return Total;
    }
    int hitgaji() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

