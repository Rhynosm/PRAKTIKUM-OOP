/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4;

/**
 *
 * @author octar
 */
public class Diskon {
    private double totalBelanja;
    private String kodePelanggan;
    private double diskon;
    private double totalBayar;

    public Diskon(double totalBelanja, String kodePelanggan) {
        this.totalBelanja = totalBelanja;
        this.kodePelanggan = kodePelanggan;
    }

    public void hitungDiskon() {
        if (kodePelanggan.equals("P001")) {
            diskon = totalBelanja * 0.1;
        } else if (kodePelanggan.equals("P002")) {
            diskon = totalBelanja * 0.15;
        } else {
            diskon = 0;
        }
        totalBayar = totalBelanja - diskon;
    }

    public double getTotalBelanja() {
        return totalBelanja;
    }

    public String getKodePelanggan() {
        return kodePelanggan;
    }

    public double getDiskon() {
        return diskon;
    }

    public double getTotalBayar() {
        return totalBayar;
    }
}
    

