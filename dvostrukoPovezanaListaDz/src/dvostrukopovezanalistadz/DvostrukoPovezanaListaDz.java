/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dvostrukopovezanalistadz;


public class DvostrukoPovezanaListaDz {

    
    public static void main(String[] args) {
        
        PovezanaLista duplaLista = new PovezanaLista();
        
        duplaLista.dodaj(78);
        duplaLista.dodaj(8);
        duplaLista.dodaj(24);
        duplaLista.dodaj(15);
        duplaLista.dodaj(12);
        duplaLista.dodaj(5);
        duplaLista.dodaj(45);
        
        System.out.println(duplaLista.toString());
        
        duplaLista.ukloni(24);
        
        System.out.println(duplaLista.toString());
        
    }

}
class PovezanaLista {

    private ElementListe prvi;   // pokazivač na prvi element liste
    private ElementListe posl;   // pokazivač na poslednji element liste
    private int n;               // broj elemenata liste

    
    public PovezanaLista() {
        prvi = null;
        posl = null;
        n = 0;
    }

    // Dužina liste
    public int dužina() {
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

        if (praznaLista()) {
            prvi = posl = noviElem;
        } else {

            noviElem.pret = posl;//potrebno je u dvostruko povezanoj listi promeniti pokazivac na prethodni element da pokazuje na poslednji (ukoliko taj element dodajemo na kraj)
            posl.sled = noviElem;
            posl = noviElem;
        }
        n = n + 1;
    }

    // Ispitivanje da li je dati element u listi
    public boolean nadjen(int k) {

        ElementListe elem;
        for (elem = prvi; elem != null; elem = elem.sled) {
            if (elem.kljuc == k) {
                break;
            }
        }

        return (elem != null);
    }

    // String reprezentacija povezane liste
    @Override
    public String toString() {

        String s = "";
        for (ElementListe elem = prvi; elem != posl; elem = elem.sled) {
            s = s + elem.kljuc + ", ";
        }
        if (posl != null) {
            s = s + posl.kljuc;
        }
        return s;
    }

    public void ukloni(int k) {

        if (praznaLista()) {
            return; //izlazi ako je lista prazna jer nema sta da ukloni
        } else {

            if (prvi.kljuc == k) {

                prvi = prvi.sled;
                prvi.pret.sled = null;
                prvi.pret = null;
                return;
            } else if (posl.kljuc == k) {

                posl.pret.sled = null;
                posl = posl.pret;

                return;
            }

            ElementListe trenutniElement;

            for (trenutniElement = prvi; trenutniElement != posl; trenutniElement = trenutniElement.sled) {

                if (trenutniElement.kljuc == k) {

                    trenutniElement.pret.sled = trenutniElement.sled;

                    trenutniElement.sled.pret = trenutniElement.pret;

                    return;
                }

            }

        }

    }
 
}

class ElementListe {

   public int kljuc;         // sadržaj elementa liste
    public ElementListe sled, pret; // pokazivač na sledeći element liste

    // Konstruktor
    public ElementListe(int k) {
        kljuc = k;
        sled = null;
        pret = null;
    }
}   

