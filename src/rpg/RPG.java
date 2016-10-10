package rpg;

import rpg.hero.Monk;
import rpg.hero.RPGCharacter;
import rpg.hero.Swordsman;
import rpg.hero.Thief;
import rpg.weapon.*;

/**
 * Created by nmenego on 9/29/16.
 */
public class RPG {

    // game...
    public static void main(String[] args) {
        // Kenshin vs. Saitoh
//        RPGCharacter kenshin = new Swordsman("Kenshin", 500, 50, new Sakabatou());
//        RPGCharacter saitoh = new Swordsman("Saitoh", 500, 50, new Broadsword());

        // Thief vs. Monk
        RPGCharacter player1 = new Thief("Procopio", 500, false, 30, new Falchion());
        RPGCharacter player2 = new Monk("SuperMonk", 500, 100);

        // player1 equips new weapon
        if(player1 instanceof Weaponable) {
            // polymorphism
            ((Weaponable) player1).equip(new Damascus());
        }

        while (player1.isAlive() && player2.isAlive()) {
            System.out.printf("%s attack...\n", player1.getName());
            duel(player1, player2);

            System.out.printf("%s attack...\n", player2.getName());
            duel(player2, player1);

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
        Damage dmg = null;
        if(!atkr.isStun()) {
            dmg = atkr.attack();
        } else {
            // recover
            atkr.setStun(false);
            // zero damage inflicted
            //  default constructor will set everything to default values.
            dmg = new Damage();
        }
        System.out.println("ATK: " + dmg.getDamagePoints());
        System.out.println("STUN: " + dmg.isStun());
        System.out.println("KNCKBCK: " + dmg.getSelfDamagePoints());
        dfndr.takeDamage(dmg);
    }
}
