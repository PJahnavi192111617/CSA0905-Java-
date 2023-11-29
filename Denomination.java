import java.util.*;
class Denomination {
    public static void main(String args[])
 {
        int d, total = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of denominations: ");
        d = s.nextInt();
        for (int i = 1; i <= d; i++) 
	{
            System.out.println("Enter the denomination" + i + ": ");
            int denomination = s.nextInt();
            System.out.println("Enter the number of notes: ");
            int notes = s.nextInt();
            total += denomination * notes;
        }
        System.out.println("Total: " + total);
    }
}