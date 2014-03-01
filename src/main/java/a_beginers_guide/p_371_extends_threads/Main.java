package a_beginers_guide.p_371_extends_threads;

import a_beginers_guide.p_366_creating_threads.MyThread;

/**
 * Author: Daniel
 */
public class Main {
    public static void main(String args[]) {
        System.out.println("Główny watek rozpoczyna dzialanie.");

        ExtendThread mt = new ExtendThread("Watek potomny nr 1");

        for (int i = 0; i < 50; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            } catch (InterruptedException exc) {
                System.out.println("Watek glówny został przerwany.");
            }
        }
        System.out.println("Watek glówny konczy dzialanie.");
    }
}
