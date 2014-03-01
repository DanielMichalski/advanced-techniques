package a_beginers_guide.p_382_synchronize_methods;

/**
 * Author: Daniel
 */
public class SumAray {
    int sum;

    public synchronized int sumArray(int nums[]) {
        sum = 0;

        for (int num : nums) {
            sum += num;

            System.out.println(Thread.currentThread().getName() +
                    " wyliczył sume czesciowa rowna " + sum);

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        return sum;
    }
}
