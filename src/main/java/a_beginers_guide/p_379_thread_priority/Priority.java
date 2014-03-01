package a_beginers_guide.p_379_thread_priority;

/**
 * Author: Daniel
 */
public class Priority implements Runnable {
    private int count;
    private Thread thread;

    private static boolean stop = false;
    private static String currentName;

    public Priority(String name){
        thread = new Thread(this, name);
        count = 0;
        currentName = name;
    }

    @Override
    public void run() {
        System.out.println(thread.getName() + " rozpoczyna dzialanie");
        do {
            count++;

            if (!currentName.equals(thread.getName())) {
                currentName = thread.getName();
                System.out.println(currentName + " jest wykonywany");
            }
        } while (!stop && count < 10000000);
        stop = true;

        System.out.println("\n" + thread.getName() + " konczy dzialanie");
    }

    public int getCount() {
        return count;
    }

    public Thread getThread() {
        return thread;
    }
}
