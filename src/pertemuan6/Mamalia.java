/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan6;

/**
 *
 * @author octar
 */
public class Mamalia extends MahlukHidup{
    int jmlkaki;
    String suara;
    
    public Mamalia(){
        nama = "kuda";
    }

    @Override
    String bernafas() {
        return "Bernafas Menggunakan Paru-Paru";
    }
    
}
