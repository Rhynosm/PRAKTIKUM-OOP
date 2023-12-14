/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikumbab6;

/**
 *
 * @author octar
 */
public class gaji_reward extends gaji_abs_reward{

    double menit, tunj_bouns,gajipokok,tunj_anak,anak;
    int waktu;
   
    @Override
    double tunjanganAnak(){
        if (anak == 0){
            tunj_anak = 0; 
        }
        else if ( anak == 1){
         tunj_anak = gajipokok * 0.1;
    }
        else{
             tunj_anak = gajipokok * 0.2;
        }
        return tunj_anak;
    }
    @Override
    double lembur(){
        tunj_bouns = waktu /60;
        return tunj_bouns* 25000;
    }
}
