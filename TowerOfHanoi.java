import java.util.*;
public class TowerOfHanoi 
{
    int n;
    String a;
    String c;
    String b;

    public TowerOfHanoi(int n, String a, String c, String b) 
    {
        this.n = n;
        this.a = a;
        this.c = c;
        this.b = b;
    }

    public void solve() 
    {
        System.out.println("Steps for solving " + n + " disk tower of hanoi puzzle: ");
        System.out.println("starting with discs on " + a + " and moving discs to " + c + ":");
        System.out.println();

        // Solve the problem by moving n disks from a to c using b.
        solveTower(n, a, c, b);   
    }

    // Recursive helper method that prints the instructions for
    // moving numDisks from the a to the c using the
    // b.
    public void solveTower(int num, String from, String to, String using) 
    {
        if (num == 1) {
            // Base Case: Move 1 disk...
            System.out.println ("Move disk from " + from + " to " + to + ".");
        }
        else {
            //   Recursive Case: 
            //   Move num-1 disks from from a to b using c.
            solveTower(num - 1, from, using, to);   

            //   Move 1 disk from the a to the c using b.
            solveTower(1, from, to, using);            

            //   Move num-1 disks from b to c using a.
            solveTower(num - 1, using, to, from); 
        }
    }

    public static void main() 
    {
        Scanner in = new Scanner (System.in);
        System.out.println ("Enter number of disks: ");
        int x = Integer.parseInt (in.nextLine());
        TowerOfHanoi tower = new TowerOfHanoi(x, "A", "B", "C");
        tower.solve();                                   
    }
}
