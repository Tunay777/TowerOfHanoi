import java.util.Scanner;
public class TowerOfHanoi 
{
    private static int count = 0;
    private static void moveDisks(int n, char fromTwr, char toTwr, char auxTwr) {
        if (n == 1) 
        {
            System.out.println("Move disk " + n + " from " + fromTwr + " to " + toTwr);
            count++;
        }  
        else
        {
            moveDisks(n - 1, fromTwr, auxTwr, toTwr);
            System.out.println("Move disk " + n + " from " + fromTwr + " to " + toTwr);
            count++;
            moveDisks(n - 1, auxTwr, toTwr, fromTwr);
        }
    }
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of disks: ");
        int n = input.nextInt();
        System.out.println("\nThe moves are:");
        moveDisks(n, 'A', 'B', 'C');
        System.out.println("\nThe total number of the moves is " + count + ".");
    }
}