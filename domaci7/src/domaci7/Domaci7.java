/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domaci7;


public class Domaci7 {

    
    public static void main(String[] args) {
        String s = "Ana nabra par banana";
        System.out.println(daLiJePalindrom(s));
    }
    public static String daLiJePalindrom(String nekiDjavo){
    
        nekiDjavo = nekiDjavo.toLowerCase().replaceAll(" ","");
    
        Stek stek=new Stek();
        Red red=new Red();
        
         for (int i = 0; i < nekiDjavo.length(); i++) {
            stek.push(nekiDjavo.charAt(i));
            red.enqueue(nekiDjavo.charAt(i));
        }
         
        for (int i = 0; i < nekiDjavo.length(); i++) {
            if(stek.pop()!=red.dequeue()) 
                return "Nije";
        }
        
        return "Jeste";
    }

}
