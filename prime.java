class prime
{
    void main (int n, int d)
    {
        int x = n;
        int tf = prim (n, d);
        System.out.println (tf);
    }

    int prim (int n, int d)
    {   
        if (d == 0)
            return 1;
            
        else if (n % d == 0)
            return 0;
        else
            return prim (n, d - 1);
    }
}