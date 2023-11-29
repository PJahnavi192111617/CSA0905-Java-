import java.util.*;
class Bonus
{
	public static void main(String args[])
	{
		double bonus;
		int salary;
		char grade;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the grade of the employee: ");
		grade=s.next().charAt(0);
		System.out.println("enter the salary of the person :");
		salary=s.nextInt();
		if(grade=='A')
		{
			if(salary<10000)
			{
				bonus=(salary*0.05)+(salary*0.02);
			}
			else
			{
				bonus=(salary*0.05);
			}
		}
		else
		{
			if(salary<10000)
			{
				bonus=(salary*0.1)+(salary*0.02);
			}
			else
			{
				bonus=(salary*0.1);
			}	
		}
		System.out.println("bonus is: "+bonus);
		System.out.println("total to be paid: "+(salary+bonus));
	}
}