/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasmatkuloop;

/**
 *
 * @author octar
 */
public class Gaji implements MenghitungGaji{
    int Gapok;
    int T_trans;
    int Lembur;
    int Total;
    public Gaji() {
        Gapok = 3200000;
        T_trans = 25000;
        Lembur = 60000;
    }
    int Gaji() {
        Total = Gapok;
        return Total;
    }
    int Gaji(int jmlHadir) {
        Total = Gapok + (jmlHadir * T_trans);
        return Total;
    }
    int Gaji(int jmlHadir, int jmllembur) {
        Total = Gapok + (jmlHadir * T_trans) + (jmllembur * Lembur);
        return Total;}
    @Override
    public int menghitungGaji() {
        return Total;

    }
}
