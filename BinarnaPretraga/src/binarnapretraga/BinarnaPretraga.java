/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package binarnapretraga;

import java.util.Arrays;
import java.util.Random;


public class BinarnaPretraga {

    
    public static void main(String[] args) {
        Random rand = new Random();
        int[] a = new int [50];
        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(100) + 1;
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("Sortirani niz: ");
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        int r = rand.nextInt(100) + 1;
        System.out.println("Trazi se broj: " + r);
        int index = binPretraga(a,0,a.length,r);
        System.out.println("Pronadjen je element na indexu: " + index);
        
    }
    
    public static int binPretraga(int[] sortedArray, int start, int end, int key){
				
	 if (start < end) {
            int mid = start + (end - start) / 2;  
            if (key < sortedArray[mid]) {
                return binPretraga(sortedArray, start, mid, key);
                 
            } else if (key > sortedArray[mid]) {
                return binPretraga(sortedArray, mid+1, end , key);
                 
            } else {
                return mid;   
            }
        }
        return -1;  
	}

}
