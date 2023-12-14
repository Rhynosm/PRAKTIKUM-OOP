/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraktikumPertemuan4;

/**
 *
 * @author octar
 */
public class A {
    public static void main (String[]args){
        lingkaran Lingkaran = new lingkaran();
                tabung Tabung = new tabung();
        System.out.println("Lingkaran adalah instance dari lingkaran => "+ (lingkaran instanceof lingkaran));
        System.out.println("Lingkaran adalah instance dari lingkaran => "+ (lingkaran instanceof tabung));
        System.out.println("Lingkaran adalah instance dari lingkaran => "+ (lingkaran instanceof lingkaran));
    
    
    }

}
