/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasoop3;

/**
 *
 * @author octar
 */
public class kehadiran extends Matakuliah{
    int nilaiKehadiran;
    public kehadiran(){
        this.nilaiKehadiran = 0;
    }
    @Override
    double hadir(){
        return((nilaiKehadiran*0.5)+nilaiakhir());
    }
@Override
    double nilaiakhir() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
