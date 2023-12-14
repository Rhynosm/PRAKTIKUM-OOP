/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab7.Polimorfisme;

/**
 *
 * @author octar
 */
    public class S0001 extends Pembayaran{
    public String InputPinKredit; 
    public String name,alamat;
    public int saldo;
    public String kode;
    double diskon,bayar,total;
    public S0001(){
        this.name = "Octaryo Lucas";
        this.kode = "S0001";
        this.saldo = 500000;
        this.alamat = "Malang, jl.singosari no.23";
    }
    @Override
    double cekKode(String input){
        if (input.compareTo(kode)== 0){
            diskon = 0.1;
        }else {
            diskon = 0;
        }
        return diskon;
    }
    @Override
    double hitPembayaran (double bayar){
        diskon = bayar * diskon;
        total = bayar - diskon;
        return total;
    }
    double potSaldo(){
        return this.saldo - total;
    }
    @Override
    void tampilkanMember(){
        System.out.println("Member S0001 dengan diskon 10%");
    }
    void jenisPembayaran(Cash cash) {
        if (bayar >= total) {
            System.out.println("Kembalian : " + cash.kembalian(total, bayar));
        } else if (bayar <= total) {
            System.out.println("uang anda kurang");
        } else {
        System.out.println("Pembayaran Berhasil");
        }
}
    }

