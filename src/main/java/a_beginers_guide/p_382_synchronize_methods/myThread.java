package a_beginers_guide.p_382_synchronize_methods;

/**
 * Author: Daniel
 */
public class MyThread implements Runnable {
    private Thread thread;
    private int[] a;

    private static SumAray sumAray = new SumAray();

    public MyThread(String name, int nums[]){
        thread = new Thread(this, name);
        a = nums;
        thread.start();
    }

    @Override
    public void run() {
        System.out.println(thread.getName() + " rozpoczyna działanie.");

        int answer = sumAray.sumArray(a);
        System.out.println(thread.getName() + " wyliczyl sume rowna " + answer);

        System.out.println(thread.getName() + " konczy dzialanie");
    }

    public Thread getThread() {
        return thread;
    }
}
