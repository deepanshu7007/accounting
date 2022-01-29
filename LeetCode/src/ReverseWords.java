public class ReverseWords {
    public static void main(String [] args)
   {
       String res="";
       String s = "Hello world this is Deepanshu";
       int l = 0, r = 0,cr = 0; 
       while(r <s.length())
        {
            if(s.charAt(r) == ' '|| r==s.length()-1)
            {
                cr = r;
                // r++;
            }if(cr<=l)
            {
                r++;
            }
            if(l<cr)
            {
                res.concat(String.valueOf(s.charAt(cr)));       
                cr--;
            }
            if(l==cr){
                cr=0;
                l=r;
            }
        }
        System.out.println(res);
    }
}