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
public class BSP {

    Cvor cvor;
    BSP(int vrednost){
        cvor = new Cvor(vrednost);
    }
    public Cvor insert(Cvor cvor, int vrednost){
        if(cvor == null){
            return new Cvor(vrednost);
        }
        // Move to the left if passed value is 
        // less than the current node
        if(vrednost < cvor.kljuc){
            cvor.levo = insert(cvor.levo, vrednost);
        }
        // Move to the right if passed value is 
        // greater than the current node
        else if(vrednost > cvor.kljuc){
            cvor.desno = insert(cvor.desno, vrednost);
        }
        return cvor;
    }
    
    public void sortiranRastuce(Cvor cvor){
        if(cvor != null){
            sortiranRastuce(cvor.levo);
            System.out.print(cvor.kljuc + " ");
            sortiranRastuce(cvor.desno);
        }
    }
    
    public void sortiranOpadajuce(Cvor cvor){
        if(cvor != null){
           sortiranOpadajuce(cvor.desno);
            System.out.print(cvor.kljuc + " ");
            sortiranOpadajuce(cvor.levo);
        }
    }
}






