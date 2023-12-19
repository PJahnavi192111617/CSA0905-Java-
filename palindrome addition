import java.util.*;
class Paliadd 
{
    	public static void main(String args[]) 
	{
        	Scanner s=new Scanner(System.in);
        	System.out.println("Enter the number");
        	int n=s.nextInt();
        	int rev=0;
        	int temp=n;
	        while(n>0) 
		{
            		int r=n%10;
            		rev=rev*10+r;
            		n=n/10;
                 }
		while(temp!=rev) 
		{
            		int sum=temp+rev;
            		int srev=0;
            		int tem=sum;
			while (tem>0) 
			{
                		int rem = tem % 10;
                		srev=srev*10+rem;
                		tem = tem/10;
                        }
			if(sum==srev) 
			{
                		System.out.println("The palindrome number is: "+sum);
                		break;
           	 	} 
			else
			{
                		rev=0;
                		temp=sum;
                		n=sum;
				while(sum>0) 
				{
                    			int reme=sum%10;
                    			rev=rev*10+reme;
                    			sum=sum/10;
                		}
            		}
        	}
   	 }
}
