/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package maxelement;

import java.util.Random;


public class MaxElement {

    
    public static void main(String[] args) {
        
        int [] a = new int [50];
        
        Random r = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(50) + 1;    
        }
        
        System.out.println("Brojevi niza su: ");
        for (int i = 0; i < a.length; i++) {
        if (i % 10 == 0 && i > 0) {
            System.out.println();
        }
        System.out.print(a[i] + " ");
    }
        
      int maximum = max(a);
      System.out.println("\n" + "Indeks najveceg elementa niza je: "+ maximum);
      
    } 
         
    public static int max(int[] a){
            
      int m = a[0];
      int j = 0;

      for(int i=1; i<a.length; i++) {
        if (m < a[i]) {
            j = i;
            m = a[i];
        }
    } 
     return j;
}
            
       

}
