public class BinaryArrayIndexSum{
    public static void main(String []args){
        int nums[] = {0,0,0,1,0,0};
        int l = 0, r = 0, rs=0;
        while(l<nums.length)
        {
            if(l<0)
            {

            }
            else
            {
                if(r<nums.length)
                {
                    if(nums[r]==1){
                        rs++;
                    }
                }else
                {
                    l++;
                    r=l+1;
                }
            }
        }

    }
}