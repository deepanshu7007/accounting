abstract class baseing
{
    int val;
    baseing(int v)
    {
        val=v;
    }
}
class childing extends baseing
{
    int value;
    childing(int valu){
        super(valu);
    }
}
public class CheckingAbstract {
    public static void main(String[] args)
    {
        baseing b = new childing(10);
        System.out.println(b.val);
    }
}
