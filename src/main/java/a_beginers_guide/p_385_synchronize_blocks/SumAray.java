package a_beginers_guide.p_385_synchronize_blocks;

/**
 * @author Daniel
 */
public class SumAray {
    int sum;

    public int sumArray(int nums[]) {
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
