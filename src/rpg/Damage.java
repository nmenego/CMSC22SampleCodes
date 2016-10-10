package rpg;

/**
 * Created by nmenego on 10/6/16.
 */
public class Damage {
    private int damagePoints;
    private boolean stun;
    private int selfDamagePoints;

    public int getDamagePoints() {
        return damagePoints;
    }

    public void setDamagePoints(int damagePoints) {
        this.damagePoints = damagePoints;
    }

    public boolean isStun() {
        return stun;
    }

    public void setStun(boolean stun) {
        this.stun = stun;
    }

    public int getSelfDamagePoints() {
        return selfDamagePoints;
    }

    public void setSelfDamagePoints(int selfDamagePoints) {
        this.selfDamagePoints = selfDamagePoints;
    }
}
