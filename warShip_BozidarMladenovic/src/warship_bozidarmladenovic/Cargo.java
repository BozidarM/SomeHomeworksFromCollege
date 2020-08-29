/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warship_bozidarmladenovic;

/**
 *
 * @author Bozidar-PC
 */
public abstract class Cargo extends Ship {
    
    private int capacity;

    public Cargo(int capacity, int health, int speed, int shield) {
        super(health, speed, shield);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    
    public void attack(Ship ship){
        // Cargo brod ne napada
        // Znam da ovo nije dobra praksa ,ali je najlaksi nacin da izbegnem da
        // cargo brod ne gadja nikog jer nema damage
    }
    
    
    
}








