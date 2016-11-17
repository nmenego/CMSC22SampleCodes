package concurrency;

/**
 * Created by nmenego on 11/16/16.
 */
public class ThreadSample {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        // this will call run()
        mt.start();

        // do something else with the current thread...
        for (int i = 0; i < 50; i++)
            System.out.println("i = " + i + ", i * i = " + i * i);
    }
}

class MyThread extends Thread {
    public void run() {
        for (int count = 1, row = 1; row < 20; row++, count++) {
            for (int i = 0; i < count; i++)
                System.out.print('*');
            System.out.print('\n');
        }
    }
}