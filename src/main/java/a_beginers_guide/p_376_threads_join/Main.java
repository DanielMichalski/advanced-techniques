package a_beginers_guide.p_376_threads_join;

import a_beginers_guide.p_371_extends_threads.ExtendThread;

/**
 * Author: Daniel
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Główny watek rozpoczyna dzialanie.");

        MyThread mt1 = new MyThread("Watek potomny nr 1");
        MyThread mt2 = new MyThread("Watek potomny nr 2");
        MyThread mt3 = new MyThread("Watek potomny nr 3");

        try {
            mt1.getThread().join();
            System.out.println("Watek potomny 1 zakonczyl swoje dzialanie.");
            mt2.getThread().join();
            System.out.println("Watek potomny 2 zakonczyl swoje dzialanie.");
            mt3.getThread().join();
            System.out.println("Watek potomny 3 zakonczyl swoje dzialanie.");
        } catch (InterruptedException e) {
            System.out.println("Watek glowny zostal przerwany");
        }

        System.out.println("Watek glówny konczy dzialanie.");
    }
}
