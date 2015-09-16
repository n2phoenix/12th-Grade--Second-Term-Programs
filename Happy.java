import java.util.*;
class Happy
{
    static Scanner in = new Scanner (System.in);
    int n;

    Happy()
    {
        n = 0;
    }

    void getnum(int nn)
    {
        n = nn;
    }

    int sum_sq_digits(int x)
    {
        if(x == 0)
            return 0;
        else
        {
            int d = x % 10;
            return (d * d + sum_sq_digits(x / 10));
        }
    }

    void ishappy()
    {
        System.out.println ("Enter a number: ");
        int a = Integer.parseInt (in.nextLine());
        n = a;
        a = sum_sq_digits(a);
        
        while(a > 9)
            a=sum_sq_digits(a);
            
        if(a == 1)
            System.out.println (n + " is a Happy Number");
        else
            System.out.println (n + " is Not a Happy Number");
    }
}