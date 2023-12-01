import java.util.*;
class Practice
{
	public static void main(String args[])
	{
		int n,i,count,composite=0;
		int a[]=new int[10];
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the no of elements=");
		n = s.nextInt();
		System.out.println("Enter element=");
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(i=0;i<n;i++)
		{
			count=0;
			for(int j=1;j<a[i];j++)
			{
				if(a[i]%j==0)
				{
					count++;
				}
			}
			if(count>2)
			{
				composite++;
			}
		}
		System.out.println("No of composite number="+composite);	
		
	}
}
