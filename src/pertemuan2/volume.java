/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan2;

/**
 *
 * @author octar
 */
public class volume {
    public static void main (String []args)
    {
        kolam klm = new kolam();
         System.out.println("Panjang = "+klm.p+ " Meter");
          System.out.println("Lebar = "+klm.l+ " Meter");
          System.out.println("Tinggi = "+klm.t+ " Meter");
        System.out.println("Volume = "+klm.hitvolume()+ " Meter/Kubik");
        System.out.println("Volume = "+klm.volume * 1000+ " Liter");
    }
}
