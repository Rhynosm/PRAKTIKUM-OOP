/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspertemuan4prak;

/**
 *
 * @author octar
 */
public class IP extends Mahasiswaa{
    int ip;
    int sks;
    
    public void setsks(int sks){
        this.sks = sks;
    }
    public int getsks(){
        return sks;
    }
    public int getIPP(int nilai1, int nilai2, int nilai3, int nilai4){
        return ip =   ((( nilai1+nilai2+nilai3+nilai4)/4)/sks);
    } 
    public void setIPP(){
        this.ip = ip;
    }   
}
