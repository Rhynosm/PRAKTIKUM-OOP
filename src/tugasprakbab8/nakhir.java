/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasprakbab8;

import tugasoopbab5prak.*;

/**
 *
 * @author octar
 */
public class nakhir extends Mahasiswa{
    int nilaiuts,nilaiuas,nilairata;
    
    //konstruktor 
    public int nilairat(int nilaiuts, int nilaiuas){
        return nilairata = (nilaiuts+nilaiuas)/2 ;
    }
    void datanilaiuts(int nilaiuts){         
            this.nilaiuts = nilaiuts;
    }
      void datanilaiuas(int nilaiuas){         
            this.nilaiuas = nilaiuas;
    }
      int nilaiuts(int parseInt){
            return nilaiuts;
        }
      int nilaiuas(int parseInt){
            return nilaiuas;
        }
      int nilaiuts(){
          return nilaiuts;
      }
      int nilaiuas(){
          return nilaiuas;
      }
    //method

    @Override
    public int Nilairaa() {
        return NilaiAkhir = nilairat(nilaiuts, nilaiuas)+ total(Nilai1, nilai2, nilai3);
    } 
}
