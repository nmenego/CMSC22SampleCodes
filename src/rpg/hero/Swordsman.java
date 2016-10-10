package rpg.hero;

import rpg.Damage;
import rpg.weapon.Weapon;
import rpg.weapon.Weaponable;

/**
 * Created by nmenego on 9/29/16.
 */
public class Swordsman extends RPGCharacter implements Weaponable {

    private Weapon weapon;

    public Swordsman(String name, int hp, boolean stun, int atkDamage, Weapon weapon) {
        super(name, hp, stun, atkDamage);
        this.weapon = weapon;
    }

    @Override
    public Damage attack() {
        Damage damage = weapon.use(getAtkDamage());
        // get self damage, if any.
        int hp = getHp() - damage.getSelfDamagePoints();
        setHp(hp);
        return damage;
    }

    @Override
    public void equip(Weapon weapon) {
        this.weapon = weapon;
    }
}
