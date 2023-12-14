/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraktikumPertemuan4;

/**
 *
 * @author octar
 */
public class Limas_Segitigas extends Segitiga{
    double tinggiLimas,vol;
    double volumeLimas(){
        vol = ((0.333*Luas())*tinggiLimas);
        return vol;
    }
}
