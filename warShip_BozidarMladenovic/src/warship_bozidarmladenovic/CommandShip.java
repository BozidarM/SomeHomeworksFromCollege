/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warship_bozidarmladenovic;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bozidar-PC
 */
public class CommandShip extends BattleShip {
    
   
    private List<Ship> fleet = new ArrayList();
    

    public CommandShip() {
        super(150, 1000, 0, 20);
        
    }

    public List<Ship> getFleet() {
        return fleet;
    }

    public void setFleet(List<Ship> fleet) {
        this.fleet = fleet;
    }
 
    
    
}














