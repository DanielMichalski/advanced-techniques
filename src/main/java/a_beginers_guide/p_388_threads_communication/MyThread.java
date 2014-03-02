package a_beginers_guide.p_388_threads_communication;

/**
 * @author Daniel
 */
public class MyThread implements Runnable {
    private Thread thread;
    private TickTock tt;
    private ClockState clockState;

    public MyThread(ClockState clockState, TickTock tt) {
        this.thread = new Thread(this);
        this.tt = tt;
        this.clockState = clockState;
        this.thread.start();
    }

    @Override
    public void run() {
        if (clockState == ClockState.TICKED) {
            for (int i = 0; i < 5; i++) {
                tt.tick(true);
            }
            tt.tick(false);
        } else {
            for (int i = 0; i < 5; i++) {
                tt.tock(true);
            }
            tt.tock(false);
        }
    }

    public Thread getThread() {
        return thread;
    }
}
