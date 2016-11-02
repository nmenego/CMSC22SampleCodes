package serialization;

import java.io.Serializable;

/**
 * Created by nmenego on 11/2/16.
 */
public class GameCharacter implements Serializable {
    private String name;
    private int level;
    private int hp;
    private Shoe shoe;

    public GameCharacter(String name, int level, int hp, Shoe shoe) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.shoe = shoe;
    }

    @Override
    public String toString() {
        return "GameCharacter{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", hp=" + hp +
                ", shoe=" + shoe +
                '}';
    }
}
