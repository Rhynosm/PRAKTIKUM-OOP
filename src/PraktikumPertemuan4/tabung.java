/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraktikumPertemuan4;

/**
 *
 * @author octar
 */
public class tabung extends lingkaran{
    double tinggi;
    public tabung(){
        this.tinggi = 10;
    }
    public double hitungVolume(){
        return hitungLuas()* tinggi;
    }
}
