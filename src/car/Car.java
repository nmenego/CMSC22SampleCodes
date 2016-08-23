package car;

/**
 * Created by nmenego on 8/18/16.
 */
public class Car {

    private float speed = 0;
    private boolean isReverse = false;
    private boolean isStarted = false;

    public void start() {
      if(isStarted) {
        // ...
      } else {
        isStarted = true;
        System.err.println("vroom vrooomm");
      }
    }

    public void accelerate() {
      if(isStarted) {
        speed += 10;
        System.out.println("vroooom");
      } else {
        System.err.println("hoy i-start!!!");
      }
    }

    public void doBrake() {
      if(isStarted) {
        speed -= 10;
        if(speed <= 0) {
          stop();
        }
        System.out.println("screeeech");
      } else {
        System.err.println("hoy i-start!!!");
      }
    }

    public void stop() {
      if(isStarted && speed == 0) {
        isStarted = false;
        isReverse = false;
      } else {
        System.err.println("disgrasya");
      }
    }

    public void reverse() {
      if(isStarted) {
        speed += 10;
        System.out.println("tooot tooot");
      } else {
        System.err.println("hoy i-start!!!");
      }
    }

}
