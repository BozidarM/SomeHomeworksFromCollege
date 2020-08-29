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
public abstract class  Ship  {
    
    private int health;
    private int speed;
    private int shield;

    public Ship(int health, int speed, int shield) {
        this.health = health;
        this.speed = speed;
        this.shield = shield;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getShield() {
        return shield;
    }

    public void setShield(int shield) {
        this.shield = shield;
    }
    
    
    public void getDamage(int damage){
        if(health > 0){
           health -= damage; 
        }      
          
    }
    protected abstract void attack(Ship ship);
    
}



























