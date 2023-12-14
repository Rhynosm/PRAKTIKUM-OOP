/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan2;

/**
 *
 * @author octar
 */
public class C {
     public static void main (String []args)
    {
        kolamm keramik = new kolamm();
         System.out.println("Panjang = "+keramik.p+ " Meter");
          System.out.println("Lebar = "+keramik.l+ " Meter");
          System.out.println("Tinggi = "+keramik.t+ " Meter");
        System.out.println("Volume = "+keramik.hitLPK()+ " Meter");
        System.out.println("Volume = "+keramik.hitLK()+ " Meter");
        System.out.println("Volume = "+keramik.hitJMLK() +" Keping");
    }
    
}
