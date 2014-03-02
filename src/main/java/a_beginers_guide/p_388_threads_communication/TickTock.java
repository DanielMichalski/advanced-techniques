package a_beginers_guide.p_388_threads_communication;

/**
 * @author Daniel
 */
public class TickTock {
    private ClockState state;

    public synchronized void tick(boolean running) {
        if (!running) {
            state = ClockState.TICKED;
            notify();
            return;
        }

        System.out.print("tik ");
        state = ClockState.TICKED;

        notify();
        try {
            while (state != ClockState.TOCKED) {
                wait();
            }
        } catch (InterruptedException e) {
            System.out.println("watek zostal przerwany");
        }
    }

    public synchronized void tock(boolean running) {
        if (!running) {
            state = ClockState.TOCKED;
            notify();
            return;
        }

        System.out.println("tak");

        state = ClockState.TOCKED;

        notify();
        try {
            while (state != ClockState.TICKED) {
                wait();
            }
        } catch (InterruptedException e) {
            System.out.println("Watek zostal przerwany");
        }

    }
}
