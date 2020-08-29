/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bonusmnozenje;


public class BonusMnozenje {

    
    public static void main(String[] args) {
        int a = 15;
        int b = 9;
        
        int r = mnozenje(a, b);
        System.out.println(a + "*" + b + " = " + r);
    }
    
     static int mnozenje(int x, int y) 
    { 
      
        if (x < y) 
            return mnozenje(y, x); 
      
        
        else if (y != 0) 
            return (x + mnozenje(x, y - 1)); 
      
        
        else
            return 0; 
    } 

}
