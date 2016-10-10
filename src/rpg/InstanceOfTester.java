package rpg;

import rpg.weapon.*;

/**
 * Created by nmenego on 10/10/16.
 */
public class InstanceOfTester {
    public static void main(String[] args) {
        Weapon a = new Broadsword();
        Weapon b = new Sakabatou();
        Weapon c = new Damascus();

        System.out.println(a instanceof Sword);
        System.out.println(b instanceof Sword);
        System.out.println(c instanceof Sword);
        System.out.println();
        System.out.println(a instanceof Knife);
        System.out.println(b instanceof Knife);
        System.out.println(c instanceof Knife);
        System.out.println();
        System.out.println(a instanceof Weapon);
        System.out.println(b instanceof Weapon);
        System.out.println(c instanceof Weapon);

        System.out.println(a instanceof Broadsword);
        System.out.println(b instanceof Broadsword);
        System.out.println(c instanceof Broadsword);

    }

}
