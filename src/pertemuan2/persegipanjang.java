/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan2;

/**
 *
 * @author octar
 */
public class persegipanjang {
    //atribut
    
    int p, l, Luas, Keliling;
    // method
    int hitLuas()
    {
        Luas = p*l;
        return Luas;
    }
    int hitKeliling()
    {
        Keliling = 2*(p+l);
        return Keliling;
    }
    
    // konstruktor

    public persegipanjang() {
        p = 10;
        l = 8;
    }
    
    
}
