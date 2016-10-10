package rpg.hero;

import rpg.Damage;
import rpg.weapon.Knife;
import rpg.weapon.Weapon;
import rpg.weapon.Weaponable;

import java.util.Random;

/**
 * Created by nmenego on 10/10/16.
 */
public class Thief extends RPGCharacter implements Weaponable {

    private Weapon weapon;
    private static final int DBLATK_RATE = 20;

    public Thief(String name, int hp, boolean stun, int atkDamage, Weapon weapon) {
        super(name, hp, stun, atkDamage);
        this.weapon = weapon;
    }

    @Override
    public Damage attack() {
        Damage damage = weapon.use(getAtkDamage());
        // factor in double attack!
        int currDmgPts = damage.getDamagePoints();
        int dblAtk = doubleAttack(currDmgPts);
        damage.setDamagePoints(dblAtk);

        // get self damage, if any.
        int hp = getHp() - damage.getSelfDamagePoints();
        setHp(hp);

        // return damage object
        return damage;
    }

    private int doubleAttack(int attackPoints) {

        // thief should have a Knife type weapon to DoubleAttack
        if(weapon != null
                && (weapon instanceof Knife)
                && dblAtkCoinToss()) {
            System.out.println("DOUBLE ATTACK!");
            return attackPoints * 2;
        } else {
            // double attack failed.
            return attackPoints;
        }
    }


    private boolean dblAtkCoinToss() {
        Random rand = new Random();
        // random number from 1-100
        int randomNum = rand.nextInt((100 - 1) + 1) + 1;
        return randomNum <= DBLATK_RATE;
    }

    @Override
    public void equip(Weapon weapon) {
        this.weapon = weapon;
    }
}
