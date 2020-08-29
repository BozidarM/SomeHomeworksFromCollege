/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domaci10;

/**
 *
 * @author Bozidar-PC
 */
public class Cvor {
    
   public int  kljuc;
   public Cvor levo;
   public Cvor desno;

  
   public Cvor(int kljuc) {
         this.kljuc = kljuc;
         this.levo = null;
         this.desno = null;
   }

   
   public void prikazi() {
      System.out.println(kljuc);
   }
}


