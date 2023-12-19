import java.util.*;
class Unique
{
	public static void main(String args[])
	{
		String s1;
		char ch,ch1;
		int i,j,len,flag=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string: ");
		s1=s.nextLine();
		len=s1.length();
		System.out.println("unique characters are: ");
		for(i=0;i<len;i++)
		{
			flag=0;
			for(j=0;j<len;j++)
			{
			 ch=s1.charAt(i);
			 ch1=s1.charAt(j);
			 if(ch==ch1 && i!=j)
			 {
				flag=1;
				break;
			 }
			}
			if(flag==0)
			{
				System.out.println(s1.charAt(i));
			}
		}
	}
}
