/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas8oopprak;



/**
 *
 * @author Lenovo
 */
public class diskon extends Mahasiswa implements Perhitungan {
    int has,d ;
    
    @Override
    public double hitnil(){
        return has = (int) (getNilai1() - (getNilai1() * (d  * 0.01 )));
    }
    //public int dis(int harga,int stok){
      //  return has = (stok * harga)/10;
   // }

    //public void dis(){
      //  this.has = has;
    //}
}
