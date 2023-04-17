public class constructor
{
    int x;
    public constructor()
    {
        x = 5;
    }
    public static void main(String args[])
    {
        constructor obj = new constructor();
        System.out.println(obj.x);
    }
}