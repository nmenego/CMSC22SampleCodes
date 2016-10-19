package le2.plant;

import le2.SplashAttacker;
import le2.zombie.Zombie;

import java.util.List;

/**
 * Created by nmenego on 10/16/16.
 */
public class Cherrybomb extends Plant implements SplashAttacker {
    private int turnCount;

    public Cherrybomb() {
        super(10, 150, 150);
        turnCount = 2;
    }

    @Override
    public void splashAttack(List<Zombie> zombieList) {
        // if turn count is not 0, decrement turnCount and no damage will be dealt to opponent
        // else loop through zombieList and apply the damage dealt by this class
        // including damage to this class
        // note: the list may have null values! check for nulls before applying damage.
        if (turnCount == 0) {
            for (Zombie chr : zombieList) {
                if (chr != null) {
                    chr.takeDamage(getDamage());
                    this.takeDamage(getDamage());
                }
            }
        } else {
            turnCount--;
        }
    }
}
