class dec_bin
{
    void convert (int n)
    {
        if (n > 0)
            convert (n/2);
        System.out.print (n % 2 + " ");
    }
}