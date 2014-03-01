package a_beginers_guide.p_379_thread_priority;

/**
 * Author: Daniel
 */
public class PriorityDemo {
    public static void main(String[] args) {
        Priority thread1 = new Priority("Watek o wysokim poziomie");
        Priority thread2 = new Priority("Watek o niskim poziomie");

        thread1.getThread().setPriority(Thread.MAX_PRIORITY);
        thread2.getThread().setPriority(Thread.MIN_PRIORITY);

        thread1.getThread().start();
        thread2.getThread().start();

        try {
            thread1.getThread().join();
            thread2.getThread().join();
        } catch (InterruptedException e) {
            System.out.println("Glowny watek rozpoczyna dzialanie");
        }

        System.out.println(thread1.getThread().getName() + " odliczyl do " + thread1.getCount());
        System.out.println(thread2.getThread().getName() + " odliczyl do " + thread2.getCount());

    }
}
