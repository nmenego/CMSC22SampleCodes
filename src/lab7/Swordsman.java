package lab7;

/**
 * Created by nmenego on 9/29/16.
 */
public class Swordsman extends Hero {

    // because of sword
    private static final int BASE_ATTACK = 5;
    // because of armor
    private static final int ARMOR = 5;

    public Swordsman(String name, int level) {
        // a swordsman will have +ARMOR for HP because of ARMOR
        super(name, level + ARMOR, level);
    }

    public int attack() {
        return BASE_ATTACK + getLevel();
    }

    public int takeDamage(int damage) {
        // reduce damage because of armor!!! oh yeah!
        damage -= ARMOR;
        // set new hp
        return super.takeDamage(damage);
    }
}
