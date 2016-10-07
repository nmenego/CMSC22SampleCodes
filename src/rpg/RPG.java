package rpg;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Created by nmenego on 9/29/16.
 */
public class RPG {

    // game...
    public static void main(String[] args) {
        RPGCharacter kenshin = new Swordsman("Kenshin", 500, 50, new Sakabatou());
        RPGCharacter saitoh = new Swordsman("Saitoh", 500, 50, new Broadsword());

        while (saitoh.isAlive() && kenshin.isAlive()) {
            System.out.println("kenshin attack...");
            duel(kenshin, saitoh);

            System.out.println("saitoh attack...");
            duel(saitoh, kenshin);

            System.out.println("====");
            sleep(3000);
        }
    }

    public static void printHeroStatus(RPGCharacter atkr, RPGCharacter dfndr) {
        System.out.println(atkr);
        System.out.println(dfndr);
    }

    // pause the game for awhile for dramatic effect!
    public static void sleep(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    public static void duel(RPGCharacter atkr, RPGCharacter dfndr) {
        printHeroStatus(atkr, dfndr);
        Damage dmg = atkr.attack();
        System.out.println("ATK: " + dmg.getDamage());
        System.out.println("STUN: " + dmg.isStun());
        System.out.println("KNCKBCK: " + dmg.getSelfDamage());
        dfndr.takeDamage(dmg);
    }
}
