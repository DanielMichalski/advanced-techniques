package a_beginers_guide.p_371_extends_threads;

/**
 * Author: Daniel
 */
public class ExtendThread extends Thread {

    public ExtendThread(String threadName){
        super(threadName);
        start();
    }

    @Override
    public void run() {
        System.out.println(getName() + " rozpoczyna działanie.");
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(400);
                System.out.println(getName() + " jest wykonywany. Licznik: " + i);
            }
        } catch (InterruptedException e) {
            System.out.println(getName() + " został przerwany");
        }
        System.out.println(getName() + " kończy swoje działanie");
    }
}
