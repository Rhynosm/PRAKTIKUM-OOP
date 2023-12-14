/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan2;

/**
 *
 * @author octar
 */
public class kolamm extends kolam{
    double LK, LPK, JMLK,UK;
    double hitLPK (){
        LPK = ((p*l)+(2*(p*t))+(2*(l*t)));
        return LPK;
    } 
    double hitLK (){
        LK = UK * UK;
        return LK;
    }
    double hitJMLK(){
        JMLK = hitLPK()/ hitLK();
        return JMLK;     
    }

    public kolamm() {
        p = 7;
        l = 3;
        t = 1;
        UK = 0.5;
    }
    
}
