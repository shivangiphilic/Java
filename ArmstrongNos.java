import java.util.Scanner;
public class Armstrong
{
    int power(int x, int y)
    {
        if (y == 0)
            return 1;
        if (y%2 == 0)
            return power(x,y/2)*power(x,y/2);
        return x*power(x,y/2)*power(x,y/2);
    }

    int order(int x)
    {
        int n = 0;
        while(x != 0)
        {
            n++;
            x = x/10;
        }
        return n;
    }

    boolean isArmstrong(int x)
    {
        int n = order(x);
        int i = x, sum = 0;
        while(i != 0)
        {
            int r = i%10;
            sum += power(r,n);
            i = i/10;
        }
        return (sum == x);
    }

    public static void main(String args[])
    {
        int i;
        System.out.println("Armstrong Numbers from 100 to 10000: ");
        Armstrong obj = new Armstrong();
        for(i=100; i<10001; i++)
        {
            if (obj.isArmstrong(i))
                System.out.println(i);
            else
                continue;
        }
    }
}