/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domaci10;

import java.util.Arrays;


public class Domaci10 {

    
    public static void main(String[] args) {
       
        int[] a = {50, 30, 70, 15, 7, 62, 22, 35, 87, 22, 31};
        System.out.println("Original niz: "+Arrays.toString(a));
        BSP stablo = new BSP(a[0]);
        for(int n : a){
            stablo.insert(stablo.cvor, n);
        }
        System.out.println("Srotiran niz (Rastuce)- ");
        stablo.sortiranRastuce(stablo.cvor);
        System.out.println();
        System.out.println("Srotiran niz (Opadajuce)- ");
        stablo.sortiranOpadajuce(stablo.cvor);
    }
    
    
}
