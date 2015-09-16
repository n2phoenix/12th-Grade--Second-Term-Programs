import java.util.*;
public class emirp
{
    int n, rev, f;
    emirp (int nn)
    {
        n = nn;
        rev = 0;
        f = 2;
    }
    
    int isPrime (int x)
    {
        if (n == x)
            return 1;
        else if (n % x == 0 || n == 1)
            return 0;
        else
            return isPrime (x + 1);
    }
    
    void isEmirp()
    {
        int x = n;
        while (x != 0)
        {
            rev = (rev * 10) + x % 10;
            x = x / 10;
        }
        
        int a1 = isPrime (f);
        int t = n; //backup
        n = rev;   //Store reversed number as n
        f = 2;     //Reset divisor value
        int a2 = isPrime (f);
        n = t;
        
        if (a1 == 1 && a2 == 1)
        System.out.println (n + " is a emirp number.");
        else
        System.out.println (n + " is not a emirp number.");
    }
}