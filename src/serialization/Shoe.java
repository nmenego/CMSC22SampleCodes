package serialization;

import java.io.Serializable;

/**
 * Created by nmenego on 11/2/16.
 */
public class Shoe implements Serializable {
    private String color;
    private int size;

    public Shoe(String color, int size) {
        this.color = color;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Shoe{" +
                "color='" + color + '\'' +
                ", size=" + size +
                '}';
    }
}
