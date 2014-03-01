package a_beginers_guide.p_366_creating_threads;

/**
 * Author: Daniel
 */
public class MyThread implements Runnable {
    private Thread thread;

    public MyThread(String threadName) {
        thread = new Thread(this, threadName);
        thread.start();
    }

    @Override
    public void run() {
        System.out.println(thread.getName() + " rozpoczyna działanie.");
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(400);
                System.out.println(thread.getName() + " jest wykonywany. Licznik: " + i);
            }
        } catch (InterruptedException e) {
            System.out.println(thread.getName() + " został przerwany");
        }
        System.out.println(thread.getName() + " kończy swoje działanie");

    }
}
