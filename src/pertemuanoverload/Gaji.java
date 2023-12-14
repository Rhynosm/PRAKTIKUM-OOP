/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuanoverload;

/**
 *
 * @author octar
 */
public class Gaji {
    //atribut
    int Gapok;
    int T_Trans;
    int Lembur;
    int Total;

    //konstruktor
    public Gaji() {
        Gapok = 3200000;
        T_Trans = 250000;
        Lembur = 60000;
    }
    
    //method1
    int Gaji(){
        Total = Gapok;
        return Gapok;
    }
    
    //method2
    int Gaji(int jmlHadir){
        Total = Gapok + (jmlHadir * T_Trans);
        return Total;
    }
    
      //method3
    int Gaji(int jmlHadir, int jmllembur){
        Total = Gapok + (jmlHadir * T_Trans)+(jmllembur*Lembur);
        return Total;
}
}
