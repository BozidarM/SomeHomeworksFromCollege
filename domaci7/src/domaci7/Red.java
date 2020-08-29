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
public class Red {
    private ElementReda prvi, posl;  // pokazivaÄ?i na prvi i poslednji element

   // Konstruktor za formiranje praznog reda
   public Red() {
      prvi = null;
      posl = null;
   }

   // DuÅ¾ina reda
   public int duzina() {
       int n = 0;
       for (ElementReda elem = prvi; elem != null; elem = elem.sled) {
           n = n + 1;
       }
       return n;
   }

   // Ispitivanje da li je red prazan
   public boolean prazanRed() {
      return prvi == null;
   }

   // Dodavanje elementa sa kljuÄ?em k na kraj reda
   public void enqueue(char k) {

      // Konstruisati novi element reda
      ElementReda elem = new ElementReda(k);

      if (prazanRed())
         prvi = elem;
      else
         posl.sled = elem;
      posl = elem;
   }

   // Uklanjanje elementa sa poÄ?etka reda
   public char dequeue() {

      // Podrazumeva se da red nije prazan
   char k = prvi.kljuc;
      if (posl == prvi)
         posl = null;
      prvi = prvi.sled;
   return k;
   }

   // VraÄ‡anje vrednosti elementa sa poÄ?etka reda
   public char peek() {
      // Podrazumeva se da red nije prazan
      return prvi.kljuc;
   }

   // String reprezentacija reda
   public String toString() {

      String s = "";
      ElementReda elem = prvi;
      while (elem != null) {
         s = s + elem.kljuc;
         elem = elem.sled;
         if (elem != null)
            s = s + ", ";
      }
      return s;
   }
}

class ElementReda {

   public char kljuc;        // kljuÄ? elementa reda
   public ElementReda sled; // pokazivaÄ? na sledeÄ‡i element reda

   // Konstruktor
   public ElementReda(char k) {
      kljuc = k;
      sled = null;
   }
    
}


