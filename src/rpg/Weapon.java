package rpg;

import java.util.Random;

/**
 * Created by nmenego on 10/6/16.
 */
public abstract class Weapon {

    protected int baseDamage;
    protected int stunPercentage;
    protected int selfDamagePercentage;

    // returns amount of damage when using this weapon
    // derived classes must compute for the damage
    public Damage use(int heroAtk) {
        Damage dmg = new Damage();
        dmg.setDamage(heroAtk + baseDamage);
        dmg.setStun(stun(stunPercentage));
        boolean selfDamage = knockback(selfDamagePercentage);
        if(selfDamage) {
            dmg.setSelfDamage(baseDamage);
        }
        return dmg;
    }

    // method to check if item use causes stun
    private boolean stun(int chancePercentage) {
        Random rand = new Random();
        // random number from 1-100
        int randomNum = rand.nextInt((100 - 1) + 1) + 1;
        return randomNum <= chancePercentage;
    }

    // method to check if item use causes knockback damage
    private boolean knockback(int chancePercentage) {
        Random rand = new Random();
        // random number from 1-100
        int randomNum = rand.nextInt((100 - 1) + 1) + 1;
        return randomNum <= chancePercentage;
    }

}
