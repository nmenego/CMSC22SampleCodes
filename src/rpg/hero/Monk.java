package rpg.hero;

import rpg.Damage;

/**
 * Created by nmenego on 10/10/16.
 */
public class Monk extends RPGCharacter {

    public Monk(String name, int hp, int atkDamage) {
        super(name, hp, false, atkDamage);
    }

    @Override
    public Damage attack() {
        Damage dmg = new Damage();
        dmg.setDamagePoints(getAtkDamage());
        return dmg;
    }
}
