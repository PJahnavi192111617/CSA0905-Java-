import java.util.*;
class Ascending
{
	public static void main(String args[])
	{
		int i,j;
		String s1[]=new String[10];
		String temp;
		Scanner s=new Scanner(System.in);
		System.out.println("enter no.of names ");
		int n=s.nextInt();
		s.nextLine();
		System.out.println("enter the names: ");
		for(i=0;i<n;i++)
		{
			s1[i]=s.nextLine();
		}
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(s1[i].compareTo(s1[j])>0)
				{
					temp=s1[i];
					s1[i]=s1[j];
					s1[j]=temp;
				}
			}
		}
		for(i=0;i<n;i++)
		{
			System.out.println(s1[i]);
		}
	}
}
