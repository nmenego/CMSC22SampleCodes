package rpg.hero;

import rpg.Damage;

/**
 * Created by nmenego on 9/29/16.
 */
public abstract class RPGCharacter {

    private String name;
    private int hp;
    private boolean stun;
    private int atkDamage;

    public RPGCharacter(String name, int hp, boolean stun, int atkDamage) {
        this.name = name;
        this.hp = hp;
        this.stun = stun;
        this.atkDamage = atkDamage;
    }

    // implement in subclass
    public abstract Damage attack();

    // checks to see if character is still alive
    public boolean isAlive() {
        return hp > 0 ? true : false;
    }

    // may be overriden in subclass, damage is dependent on hero type
    public void takeDamage(Damage dmg) {
        hp -= dmg.getDamagePoints();
        stun = dmg.isStun();
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public boolean isStun() {
        return stun;
    }

    public void setStun(boolean stun) {
        this.stun = stun;
    }

    public int getAtkDamage() {
        return atkDamage;
    }

    public void setAtkDamage(int atkDamage) {
        this.atkDamage = atkDamage;
    }

    @Override
    public String toString() {
        return "RPGCharacter{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", stun=" + stun +
                ", atkDamage=" + atkDamage +
                '}';
    }
}
