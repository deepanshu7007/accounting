/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author deepanshu
 */
public class BinarySearch {

    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6};
        int l = 0, target = 3;
        int r = nums.length - 1;
        int mid = 0;
        while (l <= r) {
            mid = l + (r - l) / 2;
            if (nums[mid] == target) {
                System.out.println(mid+1);
            }
            if (nums[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        System.out.println("-1");
    }
}
