/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasprak;

/**
 *
 * @author octar
 */
public class cetakmatkul {
    public static void main(String[] args) {
    matkul mahasiswaA = new matkul();
    matkul mahasiswaB = new matkul();
    matkul mahasiswaC = new matkul();
    mahasiswaA.setmatkul("Pancasila");
    mahasiswaA.setmateri("Pancasila Dalam Arus Sejarah Indonesia");
    mahasiswaA.setkelas("A");
    mahasiswaA.setsks(2);
    mahasiswaA.setpertemuan(1);
    mahasiswaB.setmatkul("Matematika Diskrit");
    mahasiswaB.setmateri("Relasi");
    mahasiswaB.setkelas("B");
    mahasiswaB.setsks(3);
    mahasiswaB.setpertemuan(2);
    mahasiswaC.setmatkul("Riset Operasi");
    mahasiswaC.setmateri("NWC");
    mahasiswaC.setkelas("C");
    mahasiswaC.setsks(4);
    mahasiswaC.setpertemuan(2);
    System.out.println("Mahasiswa Kelas A");
    System.out.println("Matakuliah     : " + mahasiswaA.getmatkul());
    System.out.println("Materi     : " + mahasiswaA.getmateri());
    System.out.println("Kelas    : " + mahasiswaA.getkelas());
    System.out.println("Jumlah SKS   : " + mahasiswaA.getsks());
    System.out.println("Pertemuan Ke-     : " + mahasiswaA.getpertemuan());
    System.out.println("Mahasiswa Kelas B");
   System.out.println("Matakuliah     : " + mahasiswaB.getmatkul());
    System.out.println("Materi     : " + mahasiswaB.getmateri());
    System.out.println("Kelas    : " + mahasiswaB.getkelas());
    System.out.println("Jumlah SKS   : " + mahasiswaB.getsks());
    System.out.println("Pertemuan Ke-     : " + mahasiswaB.getpertemuan());
    System.out.println("Mahasiswa kelas C");
    System.out.println("Matakuliah     : " + mahasiswaC.getmatkul());
    System.out.println("Materi     : " + mahasiswaC.getmateri());
    System.out.println("Kelas    : " + mahasiswaC.getkelas());
    System.out.println("Jumlah SKS   : " + mahasiswaC.getsks());
    System.out.println("Pertemuan Ke-     : " + mahasiswaC.getpertemuan());
    }

    
}
