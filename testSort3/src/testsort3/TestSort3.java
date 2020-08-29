/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testsort3;

import java.util.Random;


public class TestSort3 {

    
    public static void main(String[] args) {
        
        int[] x = new int [10];
        
        Random r = new Random();
        for (int i = 0; i < x.length; i++) {
            x[i] = r.nextInt(100) + 1;
            System.out.print(x[i] + " ");
        }
        System.out.println();
        
        bubbleSort(x);
        insertSort(x);
        selectSort(x);
        System.out.println("Sortirani niz: ");
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println();
        
        int[] y = new int [100000];
        
        for (int i = 0; i < y.length; i++) {
            y[i] = r.nextInt(100) + 1;
            System.out.print(y[i] + " ");
        }
        System.out.println();
        
        long pocetnoVreme = System.currentTimeMillis();
        bubbleSort(y);
        System.out.println("Sortirani niz: ");
        for (int i = 0; i < y.length; i++) {
            System.out.print(y[i] + " ");
        }
        long vremeIz = System.currentTimeMillis() - pocetnoVreme;
        System.out.println();
        System.out.println(vremeIz / 1000 + " sekunde");
        
        pocetnoVreme = System.currentTimeMillis();
        insertSort(y);
        System.out.println("Sortirani niz: ");
        for (int i = 0; i < y.length; i++) {
            System.out.print(y[i] + " ");
        }
        long vremeIz2 = System.currentTimeMillis() - pocetnoVreme;
        System.out.println();
        System.out.println(vremeIz2 / 1000 + " sekunde");
        
        pocetnoVreme = System.currentTimeMillis();
        selectSort(y);
        System.out.println("Sortirani niz: ");
        for (int i = 0; i < y.length; i++) {
            System.out.print(y[i] + " ");
        }
        long vremeIz3 = System.currentTimeMillis() - pocetnoVreme;
        System.out.println();
        System.out.println(vremeIz3 / 1000 + " sekunde");    
        
    }
    
    static void bubbleSort(int[] a) {  
      int n = a.length;  
      int temp = 0;  
      for(int i=0; i < n; i++){  
      for(int j=1; j < (n-i); j++){  
        if(a[j-1] > a[j]){  
                                  
          temp = a[j-1];  
          a[j-1] = a[j];  
          a[j] = temp;  
        }  
                          
    }  
  }  

}
  public static void insertSort(int a[]) {  
    int n = a.length;  
    for (int j = 1; j < n; j++) {  
    int key = a[j];  
    int i = j-1;  
    while ( (i > -1) && ( a [i] > key ) ) {  
        a [i+1] = a [i];  
           i--;  
        }  
         a[i+1] = key;  
        }  

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
    
