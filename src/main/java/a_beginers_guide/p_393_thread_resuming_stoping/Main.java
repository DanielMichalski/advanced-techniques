package a_beginers_guide.p_393_thread_resuming_stoping;

/**
 * @author Daniel
 */
public class Main {
    public static void main(String[] args) {
        MyThread mt = new MyThread("Watek potomny");

        try {
            Thread.sleep(1000);

            mt.suspend();
            System.out.println("Wstrzymuje watek");
            Thread.sleep(1000);

            mt.resume();
            System.out.println("Wznawiam watek");
            Thread.sleep(1000);

            mt.suspend();
            System.out.println("Wstrzymuje watek");
            Thread.sleep(1000);

            mt.resume();
            System.out.println("Wznawiam watek");
            Thread.sleep(1000);

            mt.stop();
            System.out.println("Zatrzymuje watek");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            mt.getThread().join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Watek glowny konczy dzialanie");
    }
}
