/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package polindrom2;


public class Polindrom2 {

    
    public static void main(String[] args) {
        String string = "Anja sebe sanja";
        System.out.println(string);
        String obrnuti = obrniString(string);
        System.out.println("Obrnuti string: " + obrnuti);
        
    }
    
    public static String obrniString(String s)
    {
        if (s.isEmpty())
            return s;
        
        return obrniString(s.substring(1)) + s.charAt(0);
    }
}


