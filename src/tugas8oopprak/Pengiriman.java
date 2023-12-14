/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas8oopprak;



/**
 *
 * @author Lenovo
 */
public class Pengiriman extends diskon implements Total{
    String lokasi;
    int jumlah;
    
    @Override
    public int hitung(int harga, int stok){
        return jumlah = (getNilai1() * getNilai2());
    }
    
    //public int getpengiriman(int harga, int stok){
      //  return jumlah  = (harga * stok) - dis(harga, stok) ;
    //}
    public void setPengiriman(){
        this.jumlah = jumlah;
    }

}
