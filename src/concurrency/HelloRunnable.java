package concurrency;

/**
 * Created by nmenego on 11/16/16.
 */
public class HelloRunnable implements Runnable {

    public void run() {
        System.out.println("Hello from a thread!");
    }

    public static void main(String args[]) {
        Thread thread = new Thread(new HelloRunnable());
        thread.start();
    }

}
