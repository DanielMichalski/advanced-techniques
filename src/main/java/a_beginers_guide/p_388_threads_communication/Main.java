package a_beginers_guide.p_388_threads_communication;

/**
 * @author Daniel
 */
public class Main {
    public static void main(String[] args) {
        TickTock tt = new TickTock();

        MyThread mt1 = new MyThread(ClockState.TICKED, tt);
        MyThread mt2 = new MyThread(ClockState.TOCKED, tt);

        try {
            mt1.getThread().join();
            mt2.getThread().join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
