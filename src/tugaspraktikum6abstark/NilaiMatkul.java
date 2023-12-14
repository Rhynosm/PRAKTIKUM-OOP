/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspraktikum6abstark;

/**
 *
 * @author octar
 */
public class NilaiMatkul extends nilai {
    
    @Override
    public String getnilaibyMatkuliah(String Matkuliah) {
        String lowercaseMatkuliah = Matkuliah.toLowerCase();

        if (Matkul1.toLowerCase().equals(lowercaseMatkuliah)) {
            return Matkul1;
        } else if (Matkul2.toLowerCase().equals(lowercaseMatkuliah)) {
            return Matkul2;
        } else if (Matkul3.toLowerCase().equals(lowercaseMatkuliah)) {
            return Matkul3;
        } else if (Matkul4.toLowerCase().equals(lowercaseMatkuliah)) {
            return Matkul4;
        } else {
            return "MataKuliah Tidak Valid";
        }
    }

}
