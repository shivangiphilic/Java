import java.util.Scanner;
public class Calculator
{
    int add(int x, int y)
    {
        return x+y;
    }
    int subtract(int x, int y)
    {
        return x-y;
    }
    int mult(int x, int y)
    {
        return x*y;
    }
    int divide(int x, int y)
    {
        return x/y;
    }
    int mod(int x, int y)
    {
        return x%y;
    }

    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first number: ");  
        int a = s.nextInt();
        Scanner t = new Scanner(System.in);
        System.out.print("Enter second number: ");  
        int b = t.nextInt();
        Calculator ob = new Calculator();
        System.out.println(ob.add(a,b));
        System.out.println(ob.subtract(a,b));
        System.out.println(ob.mult(a,b));
        System.out.println(ob.divide(a,b));
        System.out.println(ob.mod(a,b));
    }
}