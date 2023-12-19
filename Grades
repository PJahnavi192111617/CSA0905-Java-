import java.util.*;
class Subjects
{
	int m1,m2,m3,m4;
	void getmarks()
	{
	Scanner s=new Scanner(System.in);
	System.out.println("marks in sub1:");
	m1=s.nextInt();
	System.out.println("marks in sub2:");
	m2=s.nextInt();
	System.out.println("marks in sub3:");
	m3=s.nextInt();
	System.out.println("marks in sub4:");
	m4=s.nextInt();
	}
}
class Total extends Subjects
{
	int total;
	void ctotal()
	{
		total=m1+m2+m3+m4;
		System.out.println("total is "+total);
	}
}
class Average extends Total
{
	double average;
	void caverage()
	{
		average=total/4.0;
		System.out.println("average is :"+average);
	}
}
class Grade extends Average
{
	void cgrade()
	{
		if(average>75)
		{
			System.out.println("grage is distinction ");
		}
		else if(average>=60 && average<75)
		{
			System.out.println("grage is first class ");
		}

		else if(average>=50 && average<60)
		{
			System.out.println("grage is second class ");
		}
		else if(average>=40 && average<50)
		{
			System.out.println("grage is third class ");
		}

		else
		{
			System.out.println("fail");
		}
	}
public static void main(String args[])
{
	Grade obj=new Grade();
	obj.getmarks();
	obj.ctotal();
	obj.caverage();
	obj.cgrade();
}
}
