package a_beginers_guide.p_385_synchronize_blocks;

/**
 * Author: Daniel
 */
public class SyncDemo {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };

        MyThread thread1 = new MyThread("Watek potomny nr 1", a);
        MyThread thread2 = new MyThread("Watek potomny nr 2", a);

        try {
            thread1.getThread().join();
            thread2.getThread().join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
