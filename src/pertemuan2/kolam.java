/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan2;

/**
 *
 * @author octar
 */
public class kolam extends persegipanjang{
    int t,volume;
    int hitvolume(){
    volume = hitLuas()*t;
    return volume;
}

    public kolam() {
    p = 20;
    l = 10;
    t = 2;
    }
    
}
