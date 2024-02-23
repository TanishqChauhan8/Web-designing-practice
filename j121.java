import java.util.*;

class j121
{
	public static void main(String ar[])
	{
		int n=0,i=0;
		
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.print("Enter the Size of the Array : ");
			n=sc.nextInt();
			int a[]=new int[n];
			for(int j=0;j<n;j++)
			{
				System.out.print("Enter element at a["+j+"] : ");
				a[j]=sc.nextInt();
			}
		
			System.out.print("Enter the index whose value u want to print : ");
			i=sc.nextInt();
			System.out.println("Value at index "+i+" is "+a[i]);
		}
		
		catch(InputMismatchException e)
		{
			System.out.println("Only enter integer values : ");
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Wrong Index inputed");
		}
	
	}
}	