/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testpoveznalistadz;


public class TestPoveznaListaDz {

    
    public static void main(String[] args) {
         PovezanaLista lista = new PovezanaLista();

        System.out.println(lista.toString());

        lista.dodaj(78);
        lista.dodaj(8);
        lista.dodaj(24);
        lista.dodaj(15);
        lista.dodaj(12);
        lista.dodaj(5);
        lista.dodaj(45);
        
        System.out.println(lista.toString());

        lista.ukloni(24);

        System.out.println(lista.toString());

       
      
   }
}

class PovezanaLista {

   private ElementListe prvi;   // pokazivac na prvi element liste
   private ElementListe posl;   // pokazivac na poslednji element liste
   private int n;               // broj elemenata liste

   // Konstruktor za formiranje prazne liste
   public PovezanaLista() {
      prvi = null;
      posl = null;
      n = 0;
   }

   // Duzina liste
   public int duzina() {
      return n;
   }

   // Ispitivanje da li je lista prazna
   public boolean praznaLista() {
      return prvi == null;
   }

   // Dodavanje elementa na kraj liste
   public void dodaj(int k) {

      // Konstruisati novi element liste
      ElementListe noviElem = new ElementListe(k);

      if (praznaLista())
         prvi = posl = noviElem;
      else {
         posl.sled = noviElem;
         posl = noviElem;
      }
      n = n + 1;
   }
   
   public void ukloni(int k) {
           if (praznaLista()) {
            return; 
        } else {
            ElementListe tElement, pretElement;

            if (prvi.kljuc == k) {

                if (prvi.kljuc == k) {
                    pretElement = prvi;
                    prvi = prvi.sled;
                    pretElement.sled = null;
                    pretElement = null;
                }
            } else {

                for (pretElement = prvi; pretElement != posl; pretElement = pretElement.sled) {

                    tElement = pretElement.sled;

                    if (tElement.kljuc == k && tElement!=posl) {

                        pretElement.sled = tElement.sled;
                        tElement.sled = null;
                        tElement = null;
                      break;
                    }
                    else if(tElement.kljuc == k && tElement==posl){
                    
                        pretElement.sled=null;
                        posl=pretElement;
                        
                        break;     
                }

              }
          }
      }
 }
   // Ispitivanje da li je dati element u listi
   public boolean nadjen(int k) {

      ElementListe elem;
      for (elem = prvi; elem != null; elem = elem.sled) {
         if (elem.kljuc == k)
            break;
      }
      return (elem != null);
   }

   // String reprezentacija povezane liste
   public String toString() {

      String s = "";
      for (ElementListe elem = prvi; elem != posl; elem = elem.sled) {
         s = s + elem.kljuc + ", ";
      }
      if (posl != null)
         s = s + posl.kljuc;
      return s;
   }
}

class ElementListe {

   public int kljuc;         // sadrzj elementa liste
   public ElementListe sled; // pokazivac na sledeci element liste

   // Konstruktor
   public ElementListe(int k) {
      kljuc = k;
      sled = null;
   }
}   


