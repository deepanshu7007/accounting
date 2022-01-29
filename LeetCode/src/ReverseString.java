public class ReverseString {
  public static void main(String []args){
      char s[] = {'h'};
      int mid = (s.length-1)/2,l=0,r=s.length-1;
      char temp='\0';
      while(l<=r){
          temp = s[l];
          s[l] = s[r];
          s[r] = temp;
          l++;
          r--;
      }
      for(char c : s)
      System.out.print(c+",");
  }  
}
