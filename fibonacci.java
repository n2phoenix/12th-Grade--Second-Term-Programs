class fibonacci
{
    public int fibonacci(int n)  
    {
        if(n == 1)
            return 1;
        else if (n == 2)
            return 2;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }
}