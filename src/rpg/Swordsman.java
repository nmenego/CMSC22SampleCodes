package rpg;

/**
 * Created by nmenego on 9/29/16.
 */
public class Swordsman extends RPGCharacter {

    private Weapon weapon;

    public Swordsman(String name, int hp, int atkDamage, Weapon weapon) {
        super(name, hp, false, atkDamage);
        this.weapon = weapon;
    }

    @Override
    public Damage attack() {
        Damage damage = new Damage();
        if(isStun()) {
           // 0 damage.
            damage.setDamage(0);
            damage.setStun(false);

            // recover from stun.
            setStun(false);
        } else {
           damage = weapon.use(getAtkDamage());
            // get self damage
            Damage selfDmg = new Damage();
            selfDmg.setDamage(damage.getSelfDamage());
            selfDmg.setStun(false);
            selfDmg.setSelfDamage(0);
            takeDamage(selfDmg);
        }
        return damage;
    }
}
