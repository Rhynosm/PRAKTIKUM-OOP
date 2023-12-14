/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspraktikum6abstark;

/**
 *
 * @author octar
 */
public class input {
    private String nilai1, nilai2, nilai3,nilai5,nilai4;

    public input() {
        super();
        nilai1 = "A";
        nilai2 = "B";
        nilai3 = "C";
        nilai4 = "D";
        nilai5 = "E";
    }

    String getTipeNilai(int enterednilai) {
        switch (enterednilai) {
            case 1:
                return nilai1;
            case 2:
                return nilai2;
            case 3:
                return nilai3;
            case 4:
                return nilai4;
            case 5:
                return nilai5;
            default:
                return "Nilai Masih Kosong";
        }
    } 
}
