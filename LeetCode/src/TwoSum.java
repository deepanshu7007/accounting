public class TwoSum {
    public static void main(String[] args) {
        int res[] = new int[2];
        int nums[] = { 2, 7, 11, 15 };
        int target = 18, l = 0, r = nums.length - 1;
        
        while (l <= r) {
            if ((nums[l] + nums[r]) == target) {
                res[0] = l + 1;
                res[1] = r + 1;
                break;
            }
            if ((nums[l] + nums[r]) < target) {
                l = l + 1;
            } else {
                r = r - 1;
            }
        }
        for (int i = 0; i < res.length; i++)
            System.out.println(res[i]);
    }
}
