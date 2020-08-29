/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domaci7;

/**
 *
 * @author Bozidar-PC
 */
public class Stek {
    private ElementSteka vrh;   // pokazivaÄ? na vrh steka

   // Konstruktor za formiranje praznog steka
   public Stek() {
      vrh = null;
   }

   // Ispitivanje da li je stek prazan
   public boolean prazanStek() {
      return vrh == null;
   }

   // Dodavanje elementa na vrh steka
   public void push(char k) {

      // Konstruisati novi element steka
      ElementSteka noviElem = new ElementSteka(k);

      if (prazanStek())
         vrh = noviElem;
      else {
         noviElem.sled = vrh;
         vrh = noviElem;
      }
   }

   // Uklanjanje elementa sa vrha steka
   public char pop() {

      // Podrazumeva se da stek nije prazan
      ElementSteka elem = vrh;
      vrh = elem.sled;
      return elem.kljuc;
   }

   // VraÄ‡anje vrednosti elementa na vrhu steka
   public char peek() {

      // Podrazumeva se da stek nije prazan
      return vrh.kljuc;
   }

   // String reprezentacija steka
   public String toString() {

      String s = "";
      ElementSteka elem = vrh;
      while (elem != null) {
         s = s + elem.kljuc;
         elem = elem.sled;
         if (elem != null)
            s = s + ", ";
      }
      return s;
   }
}

class ElementSteka {

   public char kljuc;         // sadrÅ¾aj elementa steka
   public ElementSteka sled; // pokazivaÄ? na sledeÄ‡i element steka

   // Konstruktor
   public ElementSteka(char k) {
      kljuc = k;
      sled = null;
   }
    
}


