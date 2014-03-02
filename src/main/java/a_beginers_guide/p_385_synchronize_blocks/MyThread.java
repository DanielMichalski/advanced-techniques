package a_beginers_guide.p_385_synchronize_blocks;

/**
 * Author: Daniel
 */
public class MyThread implements Runnable {
    private Thread thread;
    private int[] a;
    private int answer;

    private static final SumAray sumAray = new SumAray();

    public MyThread(String name, int nums[]){
        thread = new Thread(this, name);
        a = nums;
        thread.start();
    }

    @Override
    public void run() {
        System.out.println(thread.getName() + " rozpoczyna działanie.");

        synchronized (sumAray) {
            answer = sumAray.sumArray(a);
        }

        System.out.println(thread.getName() + " wyliczyl sume rowna " + answer);

        System.out.println(thread.getName() + " konczy dzialanie");
    }

    public Thread getThread() {
        return thread;
    }
}
