/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikumbab6;

/**
 *
 * @author octar
 */
public class layanglayang extends BangunDatarSegiEmpat {

    int d1,d2,a,b;
    
    public layanglayang(){
        this.d1 = 5;
        this.d2 = 6;
        this.a = 12;
        this.b = 35;
    }
    
    @Override
    double luas() {
        return (0.5*d1*d2);
    }

    @Override
    double keliling() {
        return (2*(a+b));
    }
    
}
