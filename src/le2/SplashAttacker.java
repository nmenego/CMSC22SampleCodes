package le2;

import le2.zombie.Zombie;

import java.util.List;

/**
 * Created by nmenego on 10/16/16.
 */
public interface SplashAttacker {
    // attacks all characters in the given list
    public void splashAttack(List<Zombie> characterList);
}
