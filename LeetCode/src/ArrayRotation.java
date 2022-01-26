/*
This is a game changer problem,because approch was unthinkable. 
Approch behind this solution is reverse of an array from position arr.length-k
then we have to reverse the first half from k and then second half
and at last we have to reverse array arr using two pointers approch




Problems:

>This approch is far away from my mind's thought process
>Cause reverse of an array in this solution is like unthinkable for me.

 */

/**
 *
 * @author lazyDrago
 */
public class ArrayRotation {

    public static void main(String[] args) {

        // int nums[] = {-1,-100,3,99};
        int nums[] = {1,2};
        int k = 2;
        k=k%nums.length; // (*)
        int l = nums.length-k, r = nums.length-1, temp = 0;
        
        while (l < r) {
            temp = nums[r];
            nums[r] = nums[l];
            nums[l] = temp;
            l++;
            r--;
        }
        for(int i=0;i<nums.length;i++)
        System.out.println(nums[i]);
        System.out.println("\n\n");
        l=0;
        r = nums.length-1-k;
        while (l < r) {
            temp = nums[r];
            nums[r] = nums[l];
            nums[l] = temp;
            l++;
            r--;
        }
        for(int i=0;i<nums.length;i++)
        System.out.println(nums[i]);
        l=0;r=nums.length-1;
        while(l<r)
        {
            temp = nums[r];
            nums[r] = nums[l];
            nums[l] = temp;
            l++;
            r--;
        }
        System.out.println("\n\n");
        for(int i=0;i<nums.length;i++)
        System.out.print(nums[i]+" ");
    }
}
