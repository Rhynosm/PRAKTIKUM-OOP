/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspraktikum6abstark;

/**
 *
 * @author octar
 */
public abstract class nilai {
    String Matkul1;
    String Matkul2;
    String Matkul3;
    String Matkul4;
    public nilai() {
        super();
        Matkul1 = "OOP";
        Matkul2 = "Jaringan Komputer";
        Matkul3 = "PCD";
        Matkul4 = "Riset Operasi";
    }

    public String getMatkul1() {
        return Matkul1;
    }

    public String getMatkul2() {
        return Matkul2;
    }

    public String getMatkul3() {
        return Matkul3;
    }

    public String getMatkul4() {
        return Matkul4;
    }
    public abstract String getnilaibyMatkuliah(String Matkuliah);

}
