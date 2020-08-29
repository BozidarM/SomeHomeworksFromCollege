/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package warship_bozidarmladenovic;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class WarShip_BozidarMladenovic {

    
    public static void main(String[] args) {
    System.out.println("Ovo je igra pogadjanja za dvoje, pravila igre su da jedan igrac izabere jednu flotu, \n drugi igrac"
              +  " drugu flotu. Kada oboje odaberete flotu mozete tasterom 1 pokretati borbe dokle god vam ne dosadi,\n zatim"
              +  " tasterom 2 prelgedate rezultat i ko je pobedio, tasterom 3 se izlazi iz aplikacije.\n Tokom pokretanja borbi"
              +  " moze se desiti da je izhod borbe neresen sto znaci da ni jedna flota ne dobija poen. ");
    System.out.println();
        
    Scanner tastatura = new Scanner(System.in);
    int brojac1 = 0;
    int brojac2 = 0;
        
    while (true){
        
    System.out.println("Pogodite koja flota ce pobediti, unesite 1 za flotu 1 ili 2 za flotu 2.");
    System.out.println("Prvi igrac - izaberite flotu: ");
    int igrac1 = tastatura.nextInt(); 
    System.out.println("Drugi igrac - izaberite flotu: ");
    int igrac2 = tastatura.nextInt();
    if (igrac1 != igrac2) {
        while(true){
        System.out.println("1. Unesite 1 za pokretanje bitke");
        System.out.println("2. Unesite 2 za rezultat");
        System.out.println("3. Unesite 3 za izlaz");    
       
        int opcija = tastatura.nextInt();
        
        switch(opcija){
            case 1:     
            CommandShip glavniBrod1 = new CommandShip();
            CommandShip glavniBrod2 = new CommandShip();
        
            SmallShip brod1A = new SmallShip();
            BigShip brod2A = new BigShip();
            SmallCargo brod3A = new SmallCargo();
            BigCargo brod4A = new BigCargo();
       
            SmallShip brod1B = new SmallShip();
            BigShip brod2B = new BigShip();
            SmallCargo brod3B = new SmallCargo();
            BigCargo brod4B = new BigCargo();
       
            glavniBrod1.getFleet().add(glavniBrod1);
            glavniBrod1.getFleet().add(brod1A);
            glavniBrod1.getFleet().add(brod2A);
            glavniBrod1.getFleet().add(brod3A);
            glavniBrod1.getFleet().add(brod4A);
       
            glavniBrod2.getFleet().add(glavniBrod2);
            glavniBrod2.getFleet().add(brod1B);
            glavniBrod2.getFleet().add(brod2B);
            glavniBrod2.getFleet().add(brod3B);
            glavniBrod2.getFleet().add(brod4B);
        
            Random rand = new Random();
            for (int i = 0; i < 10; i++) {
                 int velicinaL1 = glavniBrod1.getFleet().size();
                 int velicinaL2 = glavniBrod2.getFleet().size();
            
                 int r1 = rand.nextInt(velicinaL1);
                 int r2 = rand.nextInt(velicinaL2);
                 glavniBrod1.getFleet().get(r1).attack(glavniBrod2.getFleet().get(r2));
                 glavniBrod2.getFleet().get(r2).attack(glavniBrod1.getFleet().get(r1));
            
                   if (glavniBrod1.getFleet().get(r1).getHealth() <= 0) {
                       glavniBrod1.getFleet().remove(r1);
               }
                  if (glavniBrod2.getFleet().get(r2).getHealth() <= 0) {
                      glavniBrod2.getFleet().remove(r2);
               }
            
             }
                if(glavniBrod1.getFleet().size() > glavniBrod2.getFleet().size()){
                   System.out.println("flota 1 je dobila bitku!");
                   brojac1++;
                }else if(glavniBrod2.getFleet().size() > glavniBrod1.getFleet().size()){
                   System.out.println("flota 2 je dobila bitku!");
                   brojac2++;
                }else{
                   System.out.println("Izjedanceno!");
                }
              break;
        
            case 2:
               System.out.println("Flota 1 je dobila bitku " + brojac1 + " puta");
               System.out.println("Flota 2 je dobila bitku " + brojac2 + " puta");
                if (brojac1 > brojac2) {
                    System.out.println("Pobedila je flota 1!");
                    System.out.println("Igrac koji je izabrao flotu 1 je pobedio");
                }else if(brojac1 == brojac2){
                    System.out.println("Nereseno je! Pokrenite bitku jos jednom.");
                }else{
                    System.out.println("Pobedila je flota 2!");
                     System.out.println("Igrac koji je izbrao flotu 2 je pobedio");
                }
               break;
               
            case 3:
               System.exit(0);
               break;
                  
            default:
                System.out.println("Pogresan unos!! Unesite brojeve 1,2 ili 3");
        }
           
      }
      
   }else{
       System.out.println("Ne mozete izabrati istu flotu!");
       continue;

   }     
  }            
 }
}
