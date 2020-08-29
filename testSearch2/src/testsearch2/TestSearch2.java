/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testsearch2;

import java.util.Random;


public class TestSearch2 {

    
    public static void main(String[] args) {
        int[] a = new int[100000];
        Random r2 = new Random();
        int x = r2.nextInt(100);
        System.out.println("Broj koji se trazi je: " + x);
        
        Random r = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(100) + 1;
            System.out.print(a[i] + " ");
        }
        System.out.println();
        
        long pocetnoVreme = System.currentTimeMillis();
        int nadjen1 = seqSearch(a, x);
        if (nadjen1 > 0) {
            System.out.println("Element je nadjen i nalazi se na indeksu: " + nadjen1);
        }else{
            System.out.println("Element se ne nalazi u nizu.");
        }
        long vremeIz = System.currentTimeMillis() - pocetnoVreme;
        System.out.println(vremeIz/1000 + " sekunde");
        
        
        
        selectSort(a);
        System.out.println("Sortirani niz: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        
        pocetnoVreme = System.currentTimeMillis(); 
        int nadjen2 = binSearch(a, x);
         if (nadjen2 > 0) {
            System.out.println("Element je nadjen i nalazi se na indeksu: " + nadjen2);
        }else{
            System.out.println("Element se ne nalazi u nizu.");
        }
        long vremeIz2 = System.currentTimeMillis() - pocetnoVreme;
        System.out.println(vremeIz2/1000 + " sekunde");
    }
    
    static int seqSearch(int[] a, int x){
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                return i;
            }
        }
        return 0;
    }
    
    static int binSearch (int[] a, int x){
        int i = 1;
        int j = a.length - 1;
        
        while(i <= j){
            int k = (i + j)/2;
            if (x < a[k]) {
                j = k - 1;
            }
            else if (x > a[k]) {
                i = k + 1;     
            }
            else{
               return k;
            }
        }
        return 0;
    }
    
     public static void selectSort(int[] a){  
        for (int i = 0; i < a.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < a.length; j++){  
                if (a[j] < a[index]){  
                    index = j;
                }  
            }  
            int smallerNumber = a[index];   
            a[index] = a[i];  
            a[i] = smallerNumber;  
        }  
    }  

}
