/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan6;

/**
 *
 * @author octar
 */
public class Sekretaris extends Pegawai {
    String pengalaman;
    public String getPengalaman() {
        return pengalaman;
    }
    public void setPengalaman(String pengalaman) {
        this.pengalaman = pengalaman;
    }
    @Override
    int hitGaji() {
        hitGaji = 1500000;
        return hitGaji;
    }
}
