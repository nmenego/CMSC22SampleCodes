package car;

/**
 * Created by nmenego on 8/18/16.
 */
class Car {

    private float speed = 0;
    private boolean isReverse = false;
    private boolean isStarted = false;

    public void start() {
        if (isStarted) {
            // the car is already started
        } else {
            isStarted = true;
        }
    }

    public void accelerate() {
        if (isStarted) {
            speed += 10;
        } else {
            // car is not started yet
        }
    }

    public void doBreak() {
        if (isStarted) {
            speed -= 10;
        } else {
            // car is not started yet
        }
    }

    public void stop() {
        if (isStarted) {
            isStarted = false;
        } else {
            // car is already stopped
        }
    }

    public void reverse() {
        if(isStarted) {
            isReverse = true;
        } else {
            // car is not started yet
        }
    }

}

