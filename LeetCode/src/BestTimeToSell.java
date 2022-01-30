public class BestTimeToSell {
    public static void main(String[] args) {

        int max = 0, R = 0, L = 0;
        int nums[] = { 7,6,4,3,1 };
        while (R < nums.length) {
            if (nums[R] - nums[L] < 0) {
                L = R;
            } else {
                if (nums[R] - nums[L] > max) {
                    max = nums[R] - nums[L];
                }
            }
            R += 1;
        }
        System.out.println("The max sum :" + max);
    }
}