import java.util.*;
class towersOfHanoi
{
    static int[] tower1, tower2, tower3;
    static int t1, t2, t3;
    static int n;
    public static void main()
    {
        Scanner in = new Scanner (System.in);
        n = -1;
        while (n < 3)               //Ascertaining a valid number of disks
        {
            System.out.println ("Enter number of disks to shift: ");
            n = Integer.parseInt (in.nextLine());
        }
        tower1 = new int [n];
        tower2 = new int [n];
        tower3 = new int [n];
        
        for (int i = 0; i < n; i++)    //Assign 0 values to towers 2 and 3 and the disks to tower 1
            tower1[i] = i + 1;
            
        for (int i = 0; i < n; i++)    //Print initial values of game start
        {
            System.out.print (tower1[i] + "\t" + tower2[i] + "\t" + tower3[i]);
            System.out.println();
        }
        t1 = n;
        t2 = t3 = 0;
        
        if (n % 2 == 0)
        hanoiIsEven ();
        else
        hanoiIsOdd ();
    }
    
    public static void hanoiIsEven ()
    {
        if (t1 == n && t2 == 0 && t3 == 0)
        {
            
        }
    }
    
    public static void hanoiIsOdd ()
    {
        
    }
    
    public static void change()
    {
        
    }
    
    public static void print ()
    {
        for (int i = 0; i < n; i++)
        {
            System.out.print (tower1[i] + "\t" + tower2[i] + "\t" + tower3[i]);
            System.out.println();
        }
    }
}