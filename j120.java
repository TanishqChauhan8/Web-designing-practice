import java.util.*;

class j120
{
	public static void main(String ar[])
	{
		int n1=0,n2=0,n3=0;
		Scanner sc=new Scanner(System.in);
		
		try
		{
			System.out.println("Enter Num 1 ");
			n1=sc.nextInt();
			System.out.println("Enter Num 2 ");
			n2=sc.nextInt();
			n3=n2/n1;
			
			System.out.println("Difference B/W "+n3);
			
			//throwing custom errors like .. age<18 .. even/odd
			if(n3==2)
				throw (new InputMismatchException());
		}
		catch(InputMismatchException e)
		{
			System.out.println("Do not Input Alphabets "); 
		}
		catch(ArithmeticException e)
		{
			System.out.println("Do not Input Zero"); 
		}		
	}
}