package thread;

import utils.PrintUtils;

/**
 * test Thread create
 * There are two ways to create a thread
 * extend Thread
 * implements Runnable
 */
public class TestThread {

    public static void main(String[] args) {
//        HellowThread hellowThread = new HellowThread();
//        hellowThread.start();

        Hellow2Thread hellow2Thread = new Hellow2Thread();
        Thread thread = new Thread(hellow2Thread);
        thread.start();
    }

}

/**
 * extends Thread
 */
class HellowThread extends Thread {
    @Override
    public void run() {
        PrintUtils.out("extends Thread");
    }
}

/**
 * implements Runnable
 */
class Hellow2Thread implements Runnable {

    @Override
    public void run() {
        PrintUtils.out("implements Runnable");
    }
}


