import java.util.*;
class mthmaxnthmin{
	public static void main(String args[])
	{
		int n,i,temp,b,c,m,p,j;
		int a[]=new int[100];
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number=");
		n=s.nextInt();
		System.out.println("Elements are=");
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("After sorting=");
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
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("Enter m value=");	
		m= s.nextInt();
		System.out.println("Enter n value=");
		p = s.nextInt();
		System.out.println("mth maximum is="+a[n-m]);
		System.out.println("nth minimum is="+a[p-1]);
		b=a[n-m]+a[p-1];
		c=a[n-m]-a[p-1];
		System.out.println("The sum is="+b);
		System.out.println("The difference is="+c);
	}
}
		