import java.util.ArrayList;

class Solution {
    public static ArrayList<String> s = new ArrayList<String>();
    static{
        s.add("Deepanshu");
        s.add("Choudhary");
        s.add("Kumar");
    }
    public String get()
    {
        return s.get(0);
    }
}

class StaticKeyword {
    String val="Deepanshu Choudhary";
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(val);
    }
}