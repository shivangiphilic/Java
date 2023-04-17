abstract class Shape
{
    abstract void RectangleArea(int l, int b);
    abstract void SquareArea(int s);
    abstract void CircleArea(int r);
    public static void main(String[] args)
    {}
}
class Area extends Shape
{
    void RectangleArea(int l, int b)
    {
        System.out.println("Area of Rectangle: "+l*b);
    }
    void SquareArea(int s)
    {
        System.out.println("Area of Sqaure: "+s*s);
    }
    void CircleArea(int r)
    {
        System.out.println("Area of Circle: "+3.14*r*r);
    }
    public static void main(String[] args)
    {
        Shape ob1 = new Area();
        ob1.RectangleArea(2,4);
        Shape ob2 = new Area();
        ob1.SquareArea(2);
        Shape ob3 = new Area();
        ob1.CircleArea(2);
    }

}