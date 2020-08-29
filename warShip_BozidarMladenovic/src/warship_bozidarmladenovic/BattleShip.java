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
public abstract class BattleShip extends Ship {
     
    private int damage;

    public BattleShip(int damage, int health, int speed, int shield) {
        super(health, speed, shield);
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }


    public void setDamage(int damage) {
        this.damage = damage;
    }
    
    
    @Override
    public void attack(Ship ship){
        if (ship.getShield() > 0 && ship.getHealth() > 0) {
            ship.setHealth(ship.getHealth() + ship.getShield());
        }
        ship.getDamage(this.damage);
        
    
    }
}

























