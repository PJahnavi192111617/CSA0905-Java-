import java.util.*;
class Sorting
{
	public static void main(String args[])
	{
		int i,j,n,temp;
		int a[]=new int[10];
		Scanner s=new Scanner(System.in);
		System.out.println("enter no.of elements:");
		n=s.nextInt();
		System.out.println("enter the elements:");
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(i=0;i<n-1;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("after sorting: ");
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}
