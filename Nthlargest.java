import java.util.*;
class Nthlargest
{
	public static void main(String args[])
	{
		int n,i,j,temp,N;
		int a[] = new int[10];
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the no of elements= ");
		n= s.nextInt();
		for(i=0;i<n;i++)
		{
			a[i] = s.nextInt();
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
		System.out.println("Enter the nth value=");
		N = s.nextInt();
		System.out.println(+a[n-N]);
	}
}