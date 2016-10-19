package le2.plant;

import le2.Character;

/**
 * Created by nmenego on 10/16/16.
 */
public abstract class Plant extends Character {

    private int sunlightCost;
    public Plant(int hp, int damage, int sunlightCost) {
        super(hp, damage);
        this.sunlightCost = sunlightCost;
    }

    public int getSunlightCost() {
        return sunlightCost;
    }
}
