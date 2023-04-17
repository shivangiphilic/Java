public class constructor
{
    int x;
    public constructor()
    {
        x = 5;
    }
    public constructor(int y)
    {
        x = y;
    }
    public static void main(String args[])
    {
        constructor obj = new constructor(10);
        System.out.println(obj.x);
    }
}