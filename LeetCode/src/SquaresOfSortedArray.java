public class SquaresOfSortedArray {
    public static void main(String [] rags)
    {
        int nums[] = {-7,-3,2,3,11};
        int res[] = new int[nums.length];
        int i=nums.length-1,l=0,r=nums.length-1;
        while(i>=0)
        {
            if(nums[r]*nums[r]>nums[l]*nums[l]){
                res[i]=nums[r]*nums[r];
                r--;
            }else
            {
                res[i]=nums[l]*nums[l];
                l++;
            }
            i--;
        }
        i=0;
        while(i<nums.length)
        {
            System.out.print(" "+res[i]);
            i++;
        }
    }
}
