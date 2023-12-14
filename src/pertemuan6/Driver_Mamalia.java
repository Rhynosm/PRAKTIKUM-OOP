/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan6;

/**
 *
 * @author octar
 */
public class Driver_Mamalia {
    public static void main(String []args){
        Mamalia sapi = new Mamalia();
        
        Pisces gurami = new Pisces();
        
        sapi.setnama("sapi");
        
        System.out.println(sapi.KelasMH(sapi));
        System.out.println(sapi.KelasMH(gurami));
        
        System.out.println(sapi.bernafas);
    }
    
}
