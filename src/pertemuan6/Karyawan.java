/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan6;

/**
 *
 * @author octar
 */
public class Karyawan extends Pegawai{
    String keahlian;
    public String getKeahlian() {
        return keahlian;
    }  
    public void setKeahlian(String keahlian) {
        this.keahlian = keahlian;
    }
    @Override
    int hitGaji() {
        hitGaji = 1000000;
        return hitGaji;
    }
}
