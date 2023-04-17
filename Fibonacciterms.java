import java.util.Scanner;
public class Fibo
{
    int fibonacci(int n)
    {
        if(n<=1)
            return n;
        else
            return(fibonacci(n-1) + fibonacci(n-2));
    }

    public static void main(String args[])
    {
        int i,n;
        System.out.println("Enter no. of terms: ");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        System.out.println(n+" terms of Fibonacci series are: ");
        Fibo obj = new Fibo();
        for(i=0; i<n; i++)
            System.out.println(obj.fibonacci(i));
    }
}