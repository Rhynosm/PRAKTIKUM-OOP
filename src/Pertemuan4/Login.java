/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4;

/**
 *
 * @author octar
 */
public class Login {
    
    String username;
    private String password;
    private String InputUser;
    String hasilCek;

    public Login() {
        password = "ITN MALANG";
    }

    public void setInputUser(String InputUser) {
        this.InputUser = InputUser;
    }

    String cocokkanPass()
    {
        if(password.compareTo(InputUser)==0)
        {
            hasilCek = "Password benar";
        }
        else
        {
            hasilCek = "Password salah";
        }
        return hasilCek;
    }
   
    

    
    
    
    
}
