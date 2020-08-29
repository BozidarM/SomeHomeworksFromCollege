/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package minmaxelement;

import java.util.Random;


public class MinMaxElement {

    
    public static void main(String[] args) {
        
        int [] a = new int [100];
        
        Random r = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(100) + 1;    
        }
        
        System.out.println("Brojevi niza su: ");
        for (int i = 0; i < a.length; i++) {
        if (i % 15 == 0 && i > 0) {
            System.out.println();
        }
        System.out.print(a[i] + " ");
    }
        System.out.println("\n");
        minMax(a);
        
    }
    
    public static void minMax(int[] a){
        int min=a[0];
        int max=a[0];
        for(int ii=0;ii<a.length;ii++){
            if(a[ii]<min){
                min=a[ii];
            }
            else if(a[ii]>max){
                max=a[ii];
            }
        }
        System.out.println("Minimum niza je: " + min);
        System.out.println("Maximum niza je: " + max);
        
    }
}

            


