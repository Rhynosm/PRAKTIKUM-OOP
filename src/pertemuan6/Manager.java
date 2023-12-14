/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan6;

/**
 *
 * @author octar
 */
public class Manager extends Pegawai{
    String Pendidikan;
    int jmlLembur, jmlHadir;
    public String getPendidikan() {
        return Pendidikan;
    }
    public Manager(int jmlHadir) {
        this.jmlHadir = jmlHadir;
    }  
    public Manager(int jmlLembur, int jmlHadir) {
        this.jmlLembur = jmlLembur;
    }
    @Override
    int hitGaji() {
        hitGaji = hitGaji + (jmlHadir * jmllembur + jmlHadir * jmlhadir);
        return hitGaji;
    }
}
