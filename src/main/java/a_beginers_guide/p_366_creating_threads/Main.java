package a_beginers_guide.p_366_creating_threads;

/**
 * Author: Daniel
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Watek glowny rozpoczyna działanie.");

        MyThread myRunnable = new MyThread("Wątek potomny 1");

        for (int i = 0; i < 50; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Watek glowny przerywa dzialanie");
            }
        }

        System.out.println("Watek glowny konczy dzialanie");
    }
}
