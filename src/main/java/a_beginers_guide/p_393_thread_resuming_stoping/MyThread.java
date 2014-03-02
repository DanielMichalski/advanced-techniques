package a_beginers_guide.p_393_thread_resuming_stoping;

/**
 * @author Daniel
 */
public class MyThread implements Runnable {
    private Thread thread;
    private boolean suspended;
    private boolean stopped;

    public MyThread(String name) {
        thread = new Thread(this, name);
        suspended = false;
        stopped = false;
        thread.start();
    }

    @Override
    public void run() {
        System.out.println(thread.getName() + " rozpoczyna dzialanie.");

        try {
            for (int i = 1; i < 1000; i++) {
                System.out.print(i + " ");
                if ((i % 10) == 0) {
                    System.out.println();
                    Thread.sleep(250);
                }

                synchronized (this) {
                    while (suspended) {
                        wait();
                    }
                    if (stopped) {
                        break;
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(thread.getName() + " konczy dzialanie");
    }

    public synchronized void stop() {
        stopped = true;

        suspended = false;
        notify();
    }

    public synchronized void suspend() {
        suspended = true;
    }

    public synchronized void resume() {
        suspended = false;
        notify();
    }

    public Thread getThread() {
        return thread;
    }
}
