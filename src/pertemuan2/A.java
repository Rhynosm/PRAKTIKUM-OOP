/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan2;

/**
 *
 * @author octar
 */
public class A {
    public static void main (String []args)
    {
        persegipanjang pp1 = new persegipanjang();
     pp1.p = 20;
     pp1.l = 25;
         System.out.println("Panjang = "+pp1.p);
          System.out.println("Lebar = "+pp1.l);
        System.out.println("Luas = "+pp1.hitLuas());
        System.out.println("Keliling = "+pp1.hitKeliling());
    }
}
