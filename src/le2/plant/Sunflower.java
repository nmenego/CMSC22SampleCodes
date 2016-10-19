package le2.plant;

import le2.Producer;

/**
 * Created by nmenego on 10/16/16.
 */
public class Sunflower extends Plant implements Producer {
    public Sunflower() {
        super(30, 0, 50);
    }

    @Override
    public int produce() {
        return 100;
    }
}
