import java.util.*;
public class Power
 {
    public static boolean isPowerOfThree(int num) 
{
        if (num <= 0)
 {
            return false;
        }
        while (num % 3 == 0)
 {
            num /= 3;
        }
        return num == 1;
    }
    public static void main(String[] args) 
{
        int n;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter number: ");
	n=s.nextInt();
        if (isPowerOfThree(n))
 {
            System.out.println(n + " is a power of 3.");
        } 
	else 
	{
            System.out.println(n + " is not a power of 3.");
        }
    }
}
